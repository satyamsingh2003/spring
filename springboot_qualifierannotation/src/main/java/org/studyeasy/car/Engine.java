package org.studyeasy.car;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String type = "v8";
}

//we can't make a parameterized constructor as bean will call default constructor 
	//we can make constructor in Calling class
