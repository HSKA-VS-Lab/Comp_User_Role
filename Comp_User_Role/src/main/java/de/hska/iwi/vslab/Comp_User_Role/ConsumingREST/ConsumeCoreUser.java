package de.hska.iwi.vslab.Comp_User_Role.ConsumingREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;


public class ConsumeCoreUser {

    //private String urlCoreUser = "http://localhost:8083/user";

    private static final Logger log = LoggerFactory.getLogger(ConsumeCoreUser.class);
    RestTemplate restTemplate = new RestTemplate();


    public void addUser(String firstname, String lastname, String username, String password, int roleId) {
        try {
            UrlBuilder urlBuilder = new UrlBuilder();
            log.info("URL:" + urlBuilder.getUserUrl());
            User user = new User(firstname, lastname, username, password, roleId);
            restTemplate.postForLocation(urlBuilder.getUserUrl(), user);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    public User[] getUsers() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder();
            log.info("URL:" + urlBuilder.getUserUrl());
            return restTemplate.getForObject(urlBuilder.getUserUrl(), User[].class);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

}