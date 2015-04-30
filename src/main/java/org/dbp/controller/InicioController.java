package org.dbp.controller;

import javax.servlet.http.HttpServletRequest;

import org.dbp.conf.aop.log.DbpLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inicio")
public class InicioController {

	private static Logger logger = LoggerFactory.getLogger(InicioController.class);
	@DbpLog
	@RequestMapping
	public String inicio(){
		logger.info("Metodo {}","inicio");
		return "inicio";
	}
	

	
	@RequestMapping("excepcion/{param}")
	public String excepcion(HttpServletRequest  request,@PathVariable(value="param") String param) throws Exception{
		throw new Exception("Error de prueba");
	}
	
}
