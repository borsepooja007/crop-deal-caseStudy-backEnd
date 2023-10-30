package Farmer_Service.Farmer_ServiceMain.Resource;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Farmer_Service.Farmer_ServiceMain.customMethods.FarmerCustom;
import Farmer_Service.Farmer_ServiceMain.model.Crop;
import Farmer_Service.Farmer_ServiceMain.model.Farmer;
import Farmer_Service.Farmer_ServiceMain.repository.FarmerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class FarmerController {

	@Autowired
	private RestTemplate restTemp;

	@Autowired
	private FarmerRepository farmerRepo;

	@Autowired
	FarmerCustom farmercustom;

	@PostMapping("/addfarmer")
	public String addfarmer(@RequestBody Farmer farmer) {
		farmerRepo.save(farmer);
		return "Added farmer with id " + farmer.getId();// addFarmer
	}

	@GetMapping("/findfarmer")
	public List<Farmer> gatfarmer() {
		return farmerRepo.findAll();
	}

	// get book base on id
	@GetMapping("/findfarmer/{id}")
	public Optional<Farmer> getfarmer(@PathVariable String id) {
		return farmerRepo.findById(id);
	}

	@PutMapping("/farmer/update/{id}")
	public void updateFarmer(@RequestBody Farmer farmer, @PathVariable("id") String id) {
		farmercustom.updateFarmer(id, farmer);

	}

	@DeleteMapping("/deletefarmer/{id}")
	public String deleteFarmer(@PathVariable String id) {
		farmerRepo.deleteById(id);
		return "farmer deleted havin id " + id;
	}

	@GetMapping("/farmer/get/crop")
	public List<Object> getCropatFarmer() {
		Object[] crop = restTemp.getForObject("http://crop-service/api/findcrop", Object[].class);
		return Arrays.asList(crop);
	}

	@GetMapping("/farmer/get/crop/{id}")
	public List<Crop> getCropatFarmerbyID(@PathVariable("id") String id) {
		Crop crop = restTemp.getForObject("http://crop-service/api/findcrop/" + id, Crop.class);
		return Arrays.asList(crop);
	}

	@RequestMapping(value = "/farmer/delete/crop/{_id}", method = RequestMethod.DELETE)
	public String deleteCropById(@PathVariable("_id") String _id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Crop> entity = new HttpEntity<Crop>(headers);
		return restTemp.exchange("http://crop-service/api/deletecrop/" + _id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

	@RequestMapping(value = "/farmer/add/crop", method = RequestMethod.POST)
	public String addCropatFarmer(@RequestBody Crop crop) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Crop> entity = new HttpEntity<Crop>(crop, headers);
		return restTemp.exchange("http://crop-service/api/addcrop", HttpMethod.POST, entity, String.class).getBody();

	}

}
