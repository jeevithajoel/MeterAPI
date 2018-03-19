package com.mf;

import com.mf.Meter;
import com.mf.MeterRead;

public class MeterAPIDemo {

	public static void main(String[] args) {
		MeterRead meterReadAPI = new MeterRead();
		 try{
				String url ="http://localhost:8080/WebExample/json";
				String jsonString = meterReadAPI.accept(url);
				//System.out.println(jsonString);
				Meter meter = meterReadAPI.validate(jsonString);
				String newJsonString = meterReadAPI.present(meter);
				System.out.println("Im here");
				System.out.println(newJsonString);
		 }catch (Exception ex) {
			 	System.out.println(ex.toString());
		 } 
	}

}
