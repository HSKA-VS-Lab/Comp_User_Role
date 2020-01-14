package de.hska.iwi.vslab.Comp_User_Role.Controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import de.hska.iwi.vslab.Comp_User_Role.ConsumingREST.User;
import de.hska.iwi.vslab.Comp_User_Role.Services.UserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableCircuitBreaker
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    private static final Logger log = LoggerFactory.getLogger(UserRoleController.class);

    @PostMapping(path="/comp_user_role/user", consumes = "application/json")
    @HystrixCommand(fallbackMethod = "defaultFallback")
    public void register(@RequestBody(required = true) User request) {
        log.info("register(firstname, lastname, username, password) was called");
        userRoleService.register(request.getFirstname(), request.getLastname(), request.getUsername(), request.getPassword());
    }

    public void defaultFallback(Throwable throwable) {
        System.out.printf("DefaultFallback, exception=%s%n", throwable);
    }
}
