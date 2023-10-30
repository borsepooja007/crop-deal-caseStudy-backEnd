package Dealer_Service.Dealer_ServiceMain.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dealer_Resource {
	@GetMapping("/dealer")
	public String dealer() {
		return "deler list";
	}

}
