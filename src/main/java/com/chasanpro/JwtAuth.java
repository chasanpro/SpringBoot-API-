package com.chasanpro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

public class JwtAuth {
 @Configuration
public class JwtConfig {

    @Value("${security.jwt.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration-time}")
    private int expirationTime;

    @Value("${security.jwt.prefix}")
    private String prefix;

    @Value("${security.jwt.header}")
    private String header;

    public String getSecretKey() {
        return secretKey;
    }

    public int getExpirationTime() {
        return expirationTime;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getHeader() {
        return header;
    }
}

 
}
