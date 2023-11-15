package com.technokid.WeatherDesktopApp.API;

import com.technokid.WeatherDesktopApp.dtos.*;
import com.technokid.WeatherDesktopApp.dtos.Weather;

import java.util.List;

public class WeatherV2 {
	private Coord coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private String visibility;
	private Wind wind;
	private Clouds clouds;
	private Long dt;
	private Sys sys;
	private Long timezone;
	private Long id;
	private String name;
	private Long cod;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public Long getTimezone() {
		return timezone;
	}

	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}
}
