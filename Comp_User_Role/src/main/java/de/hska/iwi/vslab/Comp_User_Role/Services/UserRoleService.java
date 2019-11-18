package de.hska.iwi.vslab.Comp_User_Role.Services;

import org.springframework.stereotype.Service;

import de.hska.iwi.vslab.Comp_User_Role.ConsumingREST.ConsumeCoreRole;
import de.hska.iwi.vslab.Comp_User_Role.ConsumingREST.ConsumeCoreUser;

/**
 * The implementation of the service.
 */
@Service
public class UserRoleService {

    public void register(String firstname, String lastname, String username, String password) {
        ConsumeCoreRole coreRole = new ConsumeCoreRole();
        ConsumeCoreUser coreUser = new ConsumeCoreUser();
        coreUser.addUser(firstname, lastname, username, password, coreRole.getRoleIdForUser());
    }

    
}
