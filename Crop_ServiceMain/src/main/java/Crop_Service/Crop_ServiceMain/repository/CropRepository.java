package Crop_Service.Crop_ServiceMain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Crop_Service.Crop_ServiceMain.model.Crop;

public interface CropRepository extends MongoRepository<Crop, String> {

}
