package com.mcnz.ws.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.logging.Logger;

@WebServlet(name = "StartupServlet", loadOnStartup = 1)
public class StartupServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(StartupServlet.class.getName());

    @Override
    public void init() throws ServletException {

        LOGGER.info("StartupServlet initialized.");
    }
}
