package org.studyeasy.car;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

public class Corolla implements Car {
	@Autowired
	@Qualifier("v8")
	Engine engine;
	@Override
	public void Specs() {
		// TODO Auto-generated method stub
		System.out.println("Sedan from Toyota "+engine.Specs());

	}
	

}
