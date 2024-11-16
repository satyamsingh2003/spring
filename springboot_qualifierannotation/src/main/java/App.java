//import org.studyeasy.car.Corolla;
//import org.studyeasy.car.Swift;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car swift = new Swift();
//		swift.Specs();
//		Car corolla = new Corolla();
//		corolla.Specs();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("corolla",Car.class);
//		Car myCar = context.getBean(Car.class); //if you have only 1 component 
		myCar.Specs();
		context.close();
		
	}

}
