package com.me.httpcore.testget;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpRequest;

public class GetReq {

	public static void main(String[] args)
	{
		HttpRequest request = new BasicHttpRequest("GET", "http://stackoverflow.com/",
			    HttpVersion.HTTP_1_1);
		System.out.println(request.getRequestLine().getUri());
	}
}
