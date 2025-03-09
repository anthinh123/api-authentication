package com.example.basicauthenticaion;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("basicAuthen")
public class BasicAuthController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestHeader HttpHeaders headers) {
        if (headers.containsKey(HttpHeaders.AUTHORIZATION)) {
            String authorizationHeader = headers.getFirst(HttpHeaders.AUTHORIZATION);
            if (authorizationHeader.startsWith("Basic ")) {
                return new ResponseEntity<>("Authentication passed", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
    }

//    @PostMapping("/login")
//    public String login(@RequestBody LoginRequest loginRequest) {
//        System.out.println("thinhav login triggered");
//        Authentication authenticationRequest =
//                UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.getUserName(), loginRequest.getPassword());
//        Authentication authenticationResponse =
//                this.authenticationManager.authenticate(authenticationRequest);
//        if (authenticationResponse.isAuthenticated()) {
//            return "Login Success";
//        } else {
//            return "Cannot login";
//        }
//    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

