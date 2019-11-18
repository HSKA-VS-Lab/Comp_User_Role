package de.hska.iwi.vslab.Comp_User_Role.ConsumingREST;

import org.springframework.web.client.RestTemplate;

public class ConsumeCoreRole {
    

    private String urlCoreProduct = "http://localhost:8084/role";
    
    RestTemplate restTemplate = new RestTemplate();

    public int getRoleIdForUser() {
        Role role = restTemplate.getForObject(urlCoreProduct + "/user", Role.class);
        return role.getId();
    }


}