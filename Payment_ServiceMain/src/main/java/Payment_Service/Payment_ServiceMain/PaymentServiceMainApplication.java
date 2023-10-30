package Payment_Service.Payment_ServiceMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import PaytmDetailPojo.PaytmDetailPojo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PaymentServiceMainApplication {

	@Bean
	public PaytmDetailPojo getpaytmdetailpojo() {
		return new PaytmDetailPojo();
	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceMainApplication.class, args);
	}

}
