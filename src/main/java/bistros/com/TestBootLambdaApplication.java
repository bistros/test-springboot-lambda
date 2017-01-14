package bistros.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestBootLambdaApplication {

	ApplicationContext applicationContext;

	public synchronized ApplicationContext getApplicationContext(){
		if ( applicationContext == null ){
			applicationContext = SpringApplication.run(TestBootLambdaApplication.class);
		}
		return applicationContext;
	}

}
