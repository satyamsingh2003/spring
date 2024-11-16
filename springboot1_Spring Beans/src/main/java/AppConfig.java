import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.car.Corolla;
import org.studyeasy.car.Swift;
import org.studyeasy.specs.V6;
import org.studyeasy.specs.V8;

@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	@Bean("swift")
	public Swift swift(){
		return new Swift();
	}
	@Bean("v6")
	public V6 v6(){
		return new V6(); 
	}
	@Bean("v8")
	public V8 v8() {
		return new V8();
	}
}
