package jakarta_bean_validation.services;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserService {

	public void createUser(@Email String email, @NotNull String name) {
		
	}
}