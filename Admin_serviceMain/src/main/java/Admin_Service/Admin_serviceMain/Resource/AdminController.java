package Admin_Service.Admin_serviceMain.Resource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Admin_Service.Admin_serviceMain.model.Admin;
import Admin_Service.Admin_serviceMain.model.Crop;
import Admin_Service.Admin_serviceMain.model.Dealer;
import Admin_Service.Admin_serviceMain.model.Farmer;
import Admin_Service.Admin_serviceMain.repository.AdminRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private RestTemplate restTemp;

	@GetMapping("/admin/get/farmer")
	public List<Object> getFarmeratAdmin() {
		Object[] farmer = restTemp.getForObject("http://farmer-service/api/findfarmer", Object[].class);
		return Arrays.asList(farmer);
	}

	@GetMapping("/admin/get/farmer/{id}")
	public List<Farmer> getFarmeratAdminbyID(@PathVariable("id") String id) {
		Farmer farmer = restTemp.getForObject("http://farmer-service/api/findfarmer/" + id, Farmer.class);
		return Arrays.asList(farmer);
	}

	@RequestMapping(value = "/admin/delete/farmer/{_id}", method = RequestMethod.DELETE)
	public String deleteFarmerById(@PathVariable("_id") String _id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Farmer> entity = new HttpEntity<Farmer>(headers);
		return restTemp
				.exchange("http://farmer-service/api/deletefarmer/" + _id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

	@GetMapping("/admin/get/dealer/{id}")
	public List<Dealer> getDealeratAdminbyID(@PathVariable("id") String id) {
		Dealer dealer = restTemp.getForObject("http://dealer-service/api/finddealer/" + id, Dealer.class);
		return Arrays.asList(dealer);
	}

	@GetMapping("/admin/get/dealer")
	public List<Object> gatDealerAdmin() {
		Object[] dealer = restTemp.getForObject("http://dealer-service/api/finddealer", Object[].class);
		return Arrays.asList(dealer);
	}

	@RequestMapping(value = "/admin/delete/dealer/{_id}", method = RequestMethod.DELETE)
	public String deleteDealerById(@PathVariable("_id") String _id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Dealer> entity = new HttpEntity<Dealer>(headers);
		return restTemp
				.exchange("http://dealer-service/api/deletedealer/" + _id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

	@GetMapping("/admin/get/crop")
	public List<Object> getCropatAdmin() {
		Object[] crop = restTemp.getForObject("http://crop-service/api/findcrop", Object[].class);
		return Arrays.asList(crop);
	}

	@GetMapping("/admin/get/crop/{id}")
	public List<Crop> getCropatAdminbyID(@PathVariable("id") String id) {
		Crop crop = restTemp.getForObject("http://crop-service/api/findcrop/" + id, Crop.class);
		return Arrays.asList(crop);
	}

	@RequestMapping(value = "/admin/delete/crop/{_id}", method = RequestMethod.DELETE)
	public String deleteCropById(@PathVariable("_id") String _id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Crop> entity = new HttpEntity<Crop>(headers);
		return "Crop Deleated" + restTemp
				.exchange("http://crop-service/api/deletecrop/" + _id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

	@Autowired
	private AdminRepository AdminRepo;

	@PostMapping("/addadmin")
	public String addadmin(@RequestBody Admin admin) {
		AdminRepo.save(admin);
		return "Added admin with id " + admin.getId();
	}

	@GetMapping("/findadmin")
	public List<Admin> getdealer() {
		return AdminRepo.findAll();
	}

	@GetMapping("/findadmin/{id}")
	public Optional<Admin> getdealer(@PathVariable String id) {
		return AdminRepo.findById(id);
	}

	@DeleteMapping("/deleteadmin/{id}")
	public String deleteDealer(@PathVariable String id) {
		AdminRepo.deleteById(id);
		return "dealer deleted having id " + id;//deleteAdminById
	}
}
