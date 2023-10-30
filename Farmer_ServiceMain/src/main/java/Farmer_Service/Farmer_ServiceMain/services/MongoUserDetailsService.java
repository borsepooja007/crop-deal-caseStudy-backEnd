//package Farmer_Service.Farmer_ServiceMain.services;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import Farmer_Service.Farmer_ServiceMain.model.Farmer;
//import Farmer_Service.Farmer_ServiceMain.repository.FarmerRepository;
//
//@Component
//@Service
//public class MongoUserDetailsService implements UserDetailsService {
//	@Autowired
//	private FarmerRepository farmerRepos;
//
//	@Override
//	public UserDetails loadUserByUsername(String farmerEmail) throws UsernameNotFoundException {
//		Farmer farmer = farmerRepos.findByfarmerEmail(farmerEmail);
//
//		if (farmer == null) {
//			throw new UsernameNotFoundException("User Not found");
//		}
//
//		List<SimpleGrantedAuthority> authority = Arrays.asList(new SimpleGrantedAuthority("farmer"));
//
//		return (UserDetails) new Farmer(farmer.getFarmeremail(), farmer.getPassword(), null);
//	}
//
//}
