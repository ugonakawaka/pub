package jakarta_bean_validation.beans;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class User {

	private String email;

	@NotNull
	@Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}