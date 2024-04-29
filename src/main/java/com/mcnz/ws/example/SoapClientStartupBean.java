package com.mcnz.ws.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SoapClientStartupBean {

	private static final Logger LOGGER = Logger.getLogger(SoapClientStartupBean.class.getName());

	@PostConstruct
	public void init() {
		try {
			LOGGER.info("SoapClientStartupBean has started!");


		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "An error occurred in SoapClientStartupBean: " + e.getMessage(), e);
		}
	}
}
