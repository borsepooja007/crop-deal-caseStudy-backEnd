package Admin_Service.Admin_serviceMain.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin_Resource {

	@GetMapping("/admin")
	public String dealer() {
		return "Admin list";
	}

}
