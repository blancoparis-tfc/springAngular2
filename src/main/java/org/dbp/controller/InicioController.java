package org.dbp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inicio")
public class InicioController {

	private static Logger logger = LoggerFactory.getLogger(InicioController.class);
	
	@RequestMapping
	public String inicio(){
		logger.info("Metodo {}","inicio");
		return "inicio";
	}
	
}
