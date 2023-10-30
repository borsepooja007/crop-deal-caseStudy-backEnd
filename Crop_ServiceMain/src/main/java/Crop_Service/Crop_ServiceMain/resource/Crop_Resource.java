package Crop_Service.Crop_ServiceMain.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Crop_Resource {
	@GetMapping("/crop")
	public String dealer() {
		return "crop list";
	}

}
