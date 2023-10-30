package Dealer_Service.Dealer_ServiceMain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Dealer_Service.Dealer_ServiceMain.model.Dealer;

public interface DealerRepository extends MongoRepository<Dealer, String> {

}
