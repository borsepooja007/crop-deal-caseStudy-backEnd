package Crop_Service.Crop_ServiceMain.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Crop_Service.Crop_ServiceMain.model.Crop;
import Crop_Service.Crop_ServiceMain.repository.CropRepository;

@RestController
@RequestMapping("/api")
public class CropController {

	@Autowired
	private CropRepository cropRepo;

	@PostMapping("/addcrop")
	public String addfarmer(@RequestBody Crop crop) {
		cropRepo.save(crop);
		return "Added crop with id " + crop.getId();
	}

	@GetMapping("/findcrop")
	public List<Crop> getcrop() {
		return cropRepo.findAll();// findCrop
	}

	@GetMapping("/findcrop/{id}")
	public Optional<Crop> getcrop(@PathVariable String id) {
		return cropRepo.findById(id);
	}

	@DeleteMapping("/deletecrop/{id}")
	public String deletecrop(@PathVariable String id) {
		cropRepo.deleteById(id);
		return "crop deleted havin id " + id;
	}

}
