package Login_Service.Login_serviceMain.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login_Resource {

	@GetMapping("/login")
	public String dealer() {
		return "Logged In";// LoginService
	}
}
