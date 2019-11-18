package de.hska.iwi.vslab.Comp_User_Role.Controllers;

import de.hska.iwi.vslab.Comp_User_Role.Services.UserRoleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    private static final Logger log = LoggerFactory.getLogger(UserRoleController.class);

    /**
     * Checks if categoryId actually exists, if yes then the product is added.
     */
    @PostMapping("/comp_user_role/user")
    public void register(@RequestBody String firstname, String lastname, String username, String password) {
        log.info("register(firstname, lastname, username, password) was called");
        userRoleService.register(firstname, lastname, username, password);
    }

}
