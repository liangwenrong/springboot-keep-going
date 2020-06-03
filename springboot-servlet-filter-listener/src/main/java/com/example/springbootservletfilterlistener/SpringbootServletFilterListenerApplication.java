package com.example.springbootservletfilterlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.springbootservletfilterlistener.filter.BeanFilter;
import com.example.springbootservletfilterlistener.listener.BeanListener;
import com.example.springbootservletfilterlistener.servlet.BeanServlet;

@ServletComponentScan
@SpringBootApplication
public class SpringbootServletFilterListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServletFilterListenerApplication.class, args);
    }

    @Bean
    public ServletListenerRegistrationBean<BeanListener> getBeanListener() {
        ServletListenerRegistrationBean<BeanListener> bean = new ServletListenerRegistrationBean<>();
        bean.setListener(new BeanListener());
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<BeanFilter> registerFilter() {
        FilterRegistrationBean<BeanFilter> bean = new FilterRegistrationBean<BeanFilter>();
        bean.setFilter(new BeanFilter());
        bean.setName("beanFilter");
        bean.addUrlPatterns("/filter/*");
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public ServletRegistrationBean<BeanServlet> registerServlet() {
        ServletRegistrationBean<BeanServlet> bean = new ServletRegistrationBean<BeanServlet>(
                new BeanServlet(), "/beanServlet/*");
        bean.setName("beanServlet");
        bean.setLoadOnStartup(1);
        return bean;
    }
}
