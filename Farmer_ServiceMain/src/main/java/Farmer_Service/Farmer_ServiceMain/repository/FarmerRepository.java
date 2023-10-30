package Farmer_Service.Farmer_ServiceMain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Farmer_Service.Farmer_ServiceMain.model.Farmer;

public interface FarmerRepository extends MongoRepository<Farmer, String> {

}
