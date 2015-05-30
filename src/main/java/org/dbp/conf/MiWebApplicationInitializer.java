package org.dbp.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.commons.lang3.StringUtils;
import org.dbp.conf.profiles.ProfilesAplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
public class MiWebApplicationInitializer implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		String entornoActivo=System.getProperty("spring.profiles.active");
		if(StringUtils.isBlank(entornoActivo)){
			entornoActivo=ProfilesAplication.dev;
		}
		servletContext.setInitParameter("spring.profiles.active",entornoActivo);		
	}

}
