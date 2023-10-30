package Farmer_Service.Farmer_ServiceMain.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Farmer_Resource {
	@GetMapping("/farmer")
	public String farmers() {
		return "Farmer list";
	}

}
