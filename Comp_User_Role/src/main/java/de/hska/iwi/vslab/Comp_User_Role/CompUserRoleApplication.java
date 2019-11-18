package de.hska.iwi.vslab.Comp_User_Role;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import de.hska.iwi.vslab.Comp_User_Role.ConsumingREST.ConsumeCoreUser;
import de.hska.iwi.vslab.Comp_User_Role.ConsumingREST.User;
import de.hska.iwi.vslab.Comp_User_Role.Services.UserRoleService;

@EnableEurekaClient
@SpringBootApplication
public class CompUserRoleApplication {

	private static final Logger log = LoggerFactory.getLogger(CompUserRoleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CompUserRoleApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			log.info("Demo starting:");

			log.info("Adding User Bobby Singer, username=bobby, password=singer");
			UserRoleService service = new UserRoleService();
			service.register("Bobby", "Singer", "bobby", "singer");

			ConsumeCoreUser coreUser = new ConsumeCoreUser();
			User[] users = coreUser.getUsers();
			log.info("Listing registered users.");
			for (User user : users) {
				log.info(user.toString());
			}

			log.info("Demo finishing.");
		};
	}*/

}
