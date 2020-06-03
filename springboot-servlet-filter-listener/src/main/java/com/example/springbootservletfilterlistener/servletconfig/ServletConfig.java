package com.example.springbootservletfilterlistener.servletconfig;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import com.example.springbootservletfilterlistener.filter.InitFilter;
import com.example.springbootservletfilterlistener.listener.InitListener;
import com.example.springbootservletfilterlistener.servlet.InitServlet;

@Component
public class ServletConfig implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        //
        ServletRegistration.Dynamic initServlet = servletContext.addServlet("initServlet", InitServlet.class);
        initServlet.addMapping("/initServlet/*");
        initServlet.setInitParameter("name", "you");
        //
        FilterRegistration.Dynamic initFilter = servletContext.addFilter("initFilter", InitFilter.class);
        initFilter.addMappingForUrlPatterns(null, true, "/filter/*");
        //
        servletContext.addListener(InitListener.class);
    }

}