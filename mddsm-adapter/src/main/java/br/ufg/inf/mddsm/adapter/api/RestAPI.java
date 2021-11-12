package br.ufg.inf.mddsm.adapter.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class RestAPI extends CommAPI{

	private static int HTTP_COD_SUCCESS = 200;
	private URL url;
	//private JSONObject data;
	
	
	public void setup(String urlStr) {
		try {
			url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();		 
			
			if(con.getResponseCode()!= HTTP_COD_SUCCESS) {
				throw new RuntimeException("HTTP error code: "+con.getResponseCode());
			}
			
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Accept", "application/json");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
