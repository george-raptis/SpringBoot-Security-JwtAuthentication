package com.georgeraptis.crm.controller;

import com.georgeraptis.crm.domain.Response;
import com.georgeraptis.crm.model.User;
import com.georgeraptis.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreLoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/register")
    public ResponseEntity<Response> registration(@RequestBody User user) {
        User dbUser = userService.save(user);
        if (dbUser != null) {
            return new ResponseEntity<Response>(new Response("User is saved successfully"), HttpStatus.OK);
        }
        return null;
    }
}
