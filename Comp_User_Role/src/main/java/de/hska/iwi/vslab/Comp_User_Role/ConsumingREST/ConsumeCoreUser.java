package de.hska.iwi.vslab.Comp_User_Role.ConsumingREST;

import org.springframework.web.client.RestTemplate;


public class ConsumeCoreUser {

    private String urlCoreUser = "http://localhost:8083/user";
    
    RestTemplate restTemplate = new RestTemplate();


    public void addUser(String firstname, String lastname, String username, String password, int roleId) {
        User user = new User(firstname, lastname, username, password, roleId);
        restTemplate.postForLocation(urlCoreUser, user);
    }

    public User[] getUsers() {
        return restTemplate.getForObject(urlCoreUser, User[].class);
    }

}