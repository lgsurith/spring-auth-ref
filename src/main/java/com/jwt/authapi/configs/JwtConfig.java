package com.jwt.authapi.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.jwt")
public class JwtConfig {
    private String secretKey;
    private long expirationTime;

    public String getSecretKey(){
        return secretKey;
    }

    public void setSecretKey(String secretKey){
        this.secretKey = secretKey;
    } 

    public long getExpirationTime(){
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime){
        this.expirationTime = expirationTime;
    }
}
