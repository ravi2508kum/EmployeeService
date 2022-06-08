package com.demo.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


public class EmployeeProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String response;
		int empId= Integer.parseInt( exchange.getIn().getHeader("id").toString());
		if(empId==1) {
			response= "employee found: EmpId:1 , FirstName:John , LastName:Louis";
			
		}else {
			response="employee details not found";
		}
		exchange.getIn().setBody(response);
	}

}
