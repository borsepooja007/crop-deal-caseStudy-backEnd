package Admin_Service.Admin_serviceMain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Admin_Service.Admin_serviceMain.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
