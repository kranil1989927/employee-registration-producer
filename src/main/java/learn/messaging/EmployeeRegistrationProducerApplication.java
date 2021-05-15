package learn.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SuppressWarnings("deprecation")
@EnableBinding(Sink.class)
@SpringBootApplication
public class EmployeeRegistrationProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationProducerApplication.class, args);
	}

	@StreamListener(target = Sink.INPUT)
	public void processRegisterEmployees(String employee) {
		System.out.println("Employees Registered by Client " + employee);
	}
}
