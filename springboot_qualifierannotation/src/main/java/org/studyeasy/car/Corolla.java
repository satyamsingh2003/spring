package org.studyeasy.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
//@Component(value="sat")
@Component 
public class Corolla implements Car {

//	Engine engine = new Engine();
//	@Autowired(required = false)
//	@Autowired
	Engine engine;
//	@Autowired
	public Corolla(Engine engine) {
		engine.type="V6";
		this.engine = engine;
	}
	@Autowired
 	public void setEngine(Engine engine) {
 		engine.type="V10";
		this.engine = engine;
	}
	@Override
	public void Specs() {
		// TODO Auto-generated method stub
		System.out.println("Sedan from Toyota "+engine.type);

	}
	

}
