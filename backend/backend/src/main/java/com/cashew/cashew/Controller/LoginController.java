package com.cashew.cashew.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cashew.cashew.DTO.TokenResponseDTO;
import com.cashew.cashew.Model.User;
import com.cashew.cashew.Repository.UserRepository;
import com.cashew.cashew.security.TokenService;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    private boolean isNull(Object obj) {
        return obj == null;
    }

    @PostMapping("/api/v1/auth/create-user")
    Object registerNewUser(@RequestBody User newUser) {

        var userResponse = userRepository.registerNewUser(newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getCpf());

        if(isNull(userResponse)){
            return null;
        } else {

            Long userID = userResponse.getUserID();

            var encrypt = TokenService.EncryptToken(userID);

            TokenResponseDTO response = new TokenResponseDTO(encrypt);

            return response;

        }
    }


}
