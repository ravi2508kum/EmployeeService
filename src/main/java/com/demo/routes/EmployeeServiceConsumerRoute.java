package com.demo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.demo.beans.EmployeeProcessor;

@Component
public class EmployeeServiceConsumerRoute extends RouteBuilder{
	
	@Value("${rest.endpoint.path}")
	private String restpath;
	
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from(restpath)		 
		  .routeId(getClass().getName())
		  .process(new EmployeeProcessor())
		  .log("sending employee response:: ${body}");
		  
		
	}

	

}
