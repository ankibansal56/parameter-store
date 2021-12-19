package com.example.awsparamterstorespring; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@RefreshScope
public class UserController {

	//@Value("${message}")
	//private String message;

	//@Value("${logging.level.root}")
	//private String logLevel;

	@Value("${tempmessage}")
	private String tempMessage;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public void allProducts() {
	//	Boolean flag = logLevel.equals("INFO") ? true : false;
		for(int i=0;i<5;i++)
			logger.info("This is Info log level");

		for(int i=0;i<5;i++)
			logger.debug("This is Debug log level");
	
		System.out.println("Dynamic value from store: " + tempMessage);
	//	String str = flag==true ? "INFO" : "DEBUG";
	//	System.out.println("This is " + str + " message");
	}
}

