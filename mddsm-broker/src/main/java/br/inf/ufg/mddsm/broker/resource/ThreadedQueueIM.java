package br.inf.ufg.mddsm.broker.resource;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.broker.im.IntentModelManager;
import br.inf.ufg.mddsm.controller.img.IntentModel;

public class ThreadedQueueIM implements Runnable {
	private final Logger log = LoggerFactory.getLogger(ThreadedQueueIM.class);

	private ExecutorService thread = Executors.newCachedThreadPool();
	//private Effector effector;
	//private Queue<SignalInstance> queue;
	
	//create for test
	private Queue<IntentModel> imQueue;
	private IntentModelManager imManager;

	final static Semaphore s = new Semaphore(1);

	private volatile boolean run = true;

	public ThreadedQueueIM(Queue<IntentModel> queue) {
		log.trace("new ThreadedQueueIM(queue:{})", queue);
		this.imQueue = queue;
		this.imManager = IntentModelManager.getInstance();
		//added to debug
		log.trace("finish ThreadedQueueIM()");
	}

	public void start() {
		log.trace("start()");
		thread.execute(this);
	}
	
	public void enqueue(IntentModel im) {
		log.trace("enqueue(im:{})", im); 
		imQueue.offer(im);
		wake();
	}

	/*public void start(Effector effector) {
		log.trace("start(effector:{})", effector);
		this.effector = effector;
		thread.execute(this);
		//        new Thread(this).start();
	}*/

	public void stop() {
		log.trace("stop()");
		run = false;
		thread.shutdown();

		try {
			// Wait a while for existing tasks to terminate
			if (!thread.awaitTermination(1, TimeUnit.SECONDS)) {
				thread.shutdownNow(); // Cancel currently executing tasks
				// Wait a while for tasks to respond to being cancelled
				if (!thread.awaitTermination(1, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			// (Re-)Cancel if current thread also interrupted
			thread.shutdownNow();
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}
	}

	public void run() {
		log.trace("run()");
		while (run) {
			while (!imQueue.isEmpty()) {
				process(imQueue.poll());
			}
			log.trace("Threaded Queue is Empty!!!");
			doWait();
		}
	}

	private void doWait() {
		log.trace("doWait()");
		try {
			synchronized (this) {
				this.wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	//create for test
	public void process(IntentModel im) {
		log.trace("process(im:{})", im);
		long t1 = System.nanoTime();
		imManager.processIM(im);
		long t2 = System.nanoTime();
		System.out.println("P:("+im.getInit().getName()+")"+TimeUnit.MILLISECONDS.convert(t2-t1, TimeUnit.NANOSECONDS)+"ms");
		
	}

	public void wake() {
		log.trace("wake()");
		synchronized (this) {
			this.notify();
		}
	}
}