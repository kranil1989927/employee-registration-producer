package learn.messaging.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

@SuppressWarnings("deprecation")
public interface EmployeeRegistrationSource {

	@Output("employeeRegistrationChannel")
	MessageChannel employeeRegistration();
}
