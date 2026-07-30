package com.web;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * loadOnStartup:
 * < 0 : Create the Servlet when it is accessed for the first time (lazy loading).
 * >= 0: Create and initialize the Servlet when the server starts (eager loading).
 * Smaller values have higher loading priority.
 */
@WebServlet(value = "/demo2", loadOnStartup = 1)
public class ServletDemo2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        /**
         * initialize
         * 1. when to call: the first time Servlet is visited,
         * 2. times of called: once

         */
        System.out.println("Init...");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        /**
         *  Called by the Servlet container to process each client request.
         * This method is invoked once for every request sent to the Servlet.
         *
         */
        System.out.println("Hello Servlet!");
    }

    @Override
    public void destroy() {
        /**
         * Called by the Servlet container before the Servlet is destroyed.
         *
         * When is it called?
         * 1. The web application is undeployed or stopped.
         * 2. The server is shutting down.
         *
         * How many times is it called?
         * - Only once.
         */
        System.out.println("destroying...");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


}
