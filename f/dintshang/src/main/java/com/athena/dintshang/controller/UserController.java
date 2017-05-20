package com.athena.dintshang.controller;

import com.athena.dintshang.domain.User;
import com.athena.dintshang.domain.UserDTO;
import com.athena.dintshang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by siphokazi on 2017/05/20.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService = new UserService();


    @RequestMapping(value = "/registerUser" , method = RequestMethod.POST)
    public ResponseEntity<UserDTO> createUser(User user){
        System.out.println("registering user");
        UserDTO result = userService.createUser(user);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);

    }

}
