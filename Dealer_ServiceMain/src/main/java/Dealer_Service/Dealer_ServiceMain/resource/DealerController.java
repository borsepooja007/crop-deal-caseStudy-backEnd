package Dealer_Service.Dealer_ServiceMain.resource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Dealer_Service.Dealer_ServiceMain.model.Dealer;
import Dealer_Service.Dealer_ServiceMain.repository.DealerRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api")
public class DealerController {

	@Autowired
	private DealerRepository DealerRepo;

	@Autowired
	private RestTemplate restTemp;

	@PostMapping("/adddealer")
	public String adddealer(@RequestBody Dealer dealer) {
		DealerRepo.save(dealer);
		return "Added dealer with id " + dealer.getId();// AddDealer
	}

	@GetMapping("/finddealer")
	public List<Dealer> getdealer() {
		return DealerRepo.findAll();
	}

	@GetMapping("/finddealer/{id}")
	public Optional<Dealer> getdealer(@PathVariable String id) {
		return DealerRepo.findById(id);
	}

	@DeleteMapping("/deletedealer/{id}")
	public String deleteDealer(@PathVariable String id) {
		DealerRepo.deleteById(id);
		return "dealer deleted having id " + id;
	}

	@GetMapping("/dealer/get/crop")
	public List<Object> getCropatDealer() {
		Object[] crop = restTemp.getForObject("http://crop-service/api/findcrop", Object[].class);
		return Arrays.asList(crop);
	}

}
