package controller;

import java.awt.PageAttributes.MediaType;
import java.util.logging.Logger;

import org.hibernate.jpa.internal.util.LogHelper;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class AppController {
	
	 org.slf4j.Logger logger = LoggerFactory.getLogger(AppController.class);

	
	ResponseEntity customer;
	
	
	@RequestMapping(value="/{id}/customer",
            method=RequestMethod.GET,
            produces={MediaType.APPLICATION_JSON_VALUE, 
                    MediaType.APPLICATION_XML_VALUE})
            
	public ResponseEntity Add(@PathVariable("cid") Integer cid) {
		
		logger.info("1");
		
		return customer;
		
		
		
	}
}
