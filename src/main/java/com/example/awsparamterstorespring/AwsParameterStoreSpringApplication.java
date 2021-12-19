package com.example.awsparamterstorespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsParameterStoreSpringApplication {

    public static void main(String[] args) {
	    System.setProperty("aws.accessKeyId", "AKIAU2SCVJ4JITPHRCGP");
  	    System.setProperty("aws.secretKey", "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");
    	    SpringApplication.run(AwsParameterStoreSpringApplication.class, args);
    }
}
