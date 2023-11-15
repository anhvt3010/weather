package com.technokid.WeatherDesktopApp.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.technokid.WeatherDesktopApp.Utility.Utility;

public class WeatherAPI {

	private String host;
//	private Utility utility;
	private String charset;
	private String content_type;

	public WeatherAPI() {
		host = "https://api.openweathermap.org/data/2.5/";
		charset = "UTF-8";
		content_type = "application/x-www-form-urlencode";
//		utility = new Utility();
	}
	public WeatherV2 fetchWeatherData(String location) {
		String url = host + "weather?lat=52.2394&lon=15.9304&appid=bbd8613e5755016aab641d12712f10d9";
		System.out.println(url);
		WeatherV2 weather = null;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("content-type", content_type)
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		System.out.println(request.toString());
		HttpResponse<String> response;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			if (!response.body().toLowerCase().contains("location not found")) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				JsonElement jsonElement = JsonParser.parseString(response.body().toString());
				System.out.println(jsonElement);
				String pretty = gson.toJson(jsonElement);
				System.out.println(pretty);

				ObjectMapper objectMapper = new ObjectMapper();
				weather = objectMapper.readValue(jsonElement.toString(), WeatherV2.class);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return weather;
	}

	public String getLocation() {
		String url = host + "currentlocation";
		content_type = "text/plain";
		String location = null;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("content-type", content_type)
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		System.out.println(request.toString());
		HttpResponse<String> response;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			location = response.body();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return location;
	}

	public static void main(String[] args) {
		WeatherAPI api = new WeatherAPI();
		System.out.println(api.fetchWeatherData("Shirur Kasar"));
	}
}
