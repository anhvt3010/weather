package com.technokid.WeatherDesktopApp.Utility;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Utility {

	public String encode(String url) {
		try {
            return URLEncoder.encode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "Issue while encoding" + e.getMessage();
		}
	}
}
