package com.athena.dintshang.service;

import com.athena.dintshang.domain.User;
import com.athena.dintshang.domain.UserDTO;
import com.athena.dintshang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by siphokazi on 2017/05/20.
 */
@Service
public class UserService {

    /*@Autowired
    UserRepository userRepository;*/

    public User createUser(User usr){
        /*UserDTO result = toDTO(userRepository.save(usr));
        return result;*/

        return usr;
    }

   /* public UserDTO toDTO(User user){
        UserDTO result = new UserDTO();
        result.setId(user.getId());
        result.setCellNumber(user.getCellNumber());
        result.setEmail(user.getEmail());
        result.setName(user.getName());
        result.setRoleId(user.getRoleId());
        return result;
    }*/

}
