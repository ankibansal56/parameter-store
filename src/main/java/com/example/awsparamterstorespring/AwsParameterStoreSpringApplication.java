package com.example.awsparamterstorespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsParameterStoreSpringApplication {

    public static void main(String[] args) {
	    System.setProperty("aws.accessKeyId", "userAccessKey");
  	    System.setProperty("aws.secretKey", "userSecretKey");
    	    SpringApplication.run(AwsParameterStoreSpringApplication.class, args);
    }
}
