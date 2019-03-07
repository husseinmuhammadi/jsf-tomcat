package com.javastudio.tutorial.bean;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.NavigationCase;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@javax.enterprise.context.RequestScoped
@Named
public class GreetingController implements Serializable {

    private static final long serialVersionUID = 749443492231633008L;

    private String greeting = "Hello world!";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getAbsoluteUrl() {
        FacesContext context = FacesContext.getCurrentInstance();

        ConfigurableNavigationHandler navigationHandler = ((ConfigurableNavigationHandler) context.getApplication().getNavigationHandler());
        NavigationCase navigationCase = navigationHandler.getNavigationCase(context, null, null);
        String toViewId = navigationCase.getToViewId(context);

        String uri = context.getApplication().getViewHandler().getBookmarkableURL(context, toViewId, null, false);

        StringBuilder urlParametersString = new StringBuilder();

        String absoluteUrl = ((HttpServletRequest) context.getExternalContext().getRequest()).getRequestURL().toString().
                replace(((HttpServletRequest) context.getExternalContext().getRequest()).getRequestURI(), "") + uri +
                (urlParametersString.length() > 0 ? "?" + urlParametersString.toString() : "");

        return absoluteUrl;
    }
}
