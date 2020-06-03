package com.example.springbootservletfilterlistener.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("InitListener.contextInitialized method was called by servlet container!!");
    }
}
