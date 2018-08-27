package com.pathmasri.test;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class TestJson {

	public static void main(String[] args) throws UnirestException {
		
		String searchQueryApi = "http://localhost:8080/notificationapp-1/devices";

		JsonNode body = Unirest.get(searchQueryApi)
		                        .asJson()
		                        .getBody();
		System.out.println(body);         // gives the full json response
	}

}
