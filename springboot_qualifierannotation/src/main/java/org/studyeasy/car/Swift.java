package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
@Component
public class Swift implements Car {

	@Override
	public void Specs() {
		// TODO Auto-generated method stub
		System.out.println("Hatchback from Suzuki");
	}

}
