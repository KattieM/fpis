package com.rest.fpis.service.impl;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.fpis.dao.EmployeeRepository;
import com.rest.fpis.domain.EmployeeEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TokenHandler {
    private String key = "NaPREDneJavATEHnoloGije";

    @Autowired
    private EmployeeRepository userDao;

    private static final Logger log = LoggerFactory.getLogger(TokenHandler.class);


    public EmployeeEntity processToken(String token) throws JsonParseException, JsonMappingException, IOException {
        Claims userToken = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        String user = userToken.getSubject();
        if (user != null) {
            //System.out.println("found SUser: " + email);
            return userDao.findByUsername(user);
        }
        return null;
    }

    public String createToken(EmployeeEntity user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return Jwts.builder().setSubject(user.getUsername())
                .signWith(SignatureAlgorithm.HS512, key).compact();
    }

}
