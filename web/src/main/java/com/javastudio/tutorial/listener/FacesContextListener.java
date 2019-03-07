package com.javastudio.tutorial.listener;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;
import java.util.logging.Logger;

public class FacesContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /*
        try {
            //Registering the JSF Servlet
            Dynamic facesServlet = sce.getServletContext().addServlet("FacesServlet", FacesServlet.class);
            //Specifying the Servlet Mapping
            facesServlet.addMapping("*.xhtml");
            //Setting Priority, 0 or higher for eager, if negative then it's lazy
            facesServlet.setLoadOnStartup(1);

            Logger.getGlobal().info("Servlet Context has been initialized");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
