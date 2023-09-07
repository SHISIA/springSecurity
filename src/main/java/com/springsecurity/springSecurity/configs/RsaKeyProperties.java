package com.springsecurity.springSecurity.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix="rsa")
@PropertySource("file:src/main/resources/application.properties")
public record RsaKeyProperties(RSAPublicKey publicKey,RSAPrivateKey privateKey){
}
