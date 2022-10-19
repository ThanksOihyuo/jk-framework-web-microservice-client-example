package com.app.person;

import com.jk.core.config.JKConfig;
import com.jk.services.client.JKServiceClient;

public class ServiceClient extends JKServiceClient<Person> {
	@Override
	public String getBase() {
		return JKConfig.getDefaultInstance().getProperty("services.example.url");
	}

	public String callSayHello() {
		return callJsonAsString("/hello");
	}
	
	public String callSayHelloWithName(String name) {
		return callJsonAsString("/hello/"+name);
	}
	
	public String callSayHelloWithObject(Person p) {
		return callJsonWithPost("/hello", p);	
	}
	
}
