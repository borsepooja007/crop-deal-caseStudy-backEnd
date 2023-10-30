package Payment_Service.Payment_ServiceMain.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class payment_resource {

	@GetMapping("/payment")
	public String payment() {
		return "payment service";
	}
}
