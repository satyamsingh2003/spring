package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;
@Component
public class V6 implements Engine {

	@Override
	public String Specs() {
		return "V6 Engine";
	}

}
