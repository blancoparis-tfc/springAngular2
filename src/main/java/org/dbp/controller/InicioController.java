package org.dbp.controller;

import javax.servlet.http.HttpServletRequest;

import org.dbp.conf.aop.log.DbpLog;
import org.dbp.controller.json.EjemploJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@DbpLog
	@RequestMapping("ejemploJson")
	public @ResponseBody EjemploJson ejemploJson(){
		EjemploJson valdev=new EjemploJson();
		valdev.setNumero(1L);
		valdev.setCadena("cadena");
		return valdev;
	}
}
