package com.example.springbootservletfilterlistener.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BeanListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("BeanListener.contextInitialized method was called by servlet container!!");
    }
}
