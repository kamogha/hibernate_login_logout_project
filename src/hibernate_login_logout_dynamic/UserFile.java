package hibernate_login_logout_dynamic;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class UserFile {
	@Id
	private String Username;
	private String Password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
