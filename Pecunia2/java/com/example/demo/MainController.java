package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	Integer amt;
String usid;
Integer bal;
String type;
@CrossOrigin

	public void balance (@RequestBody Transactions tsr )
	
	{
		 usid = tsr.getUserid();
		 amt = tsr.getAmount(); 
		 type = tsr.getType();
		 
	}


	public void accoun(@RequestBody Account acc) {
		
		 bal = acc.getAcc_Bal();
		 if(type=="DR") {
			 
			 Integer newbal = bal - amt;
		 acc.setAcc_Bal(newbal);
		  
		
		 }
		 else if(type == "CR") {
			 
			 Integer newbal = bal + amt;
			 acc.setAcc_Bal(newbal);
		 }
		 
		 
	}
	
		
			
			
		}	
	
	
	

	
