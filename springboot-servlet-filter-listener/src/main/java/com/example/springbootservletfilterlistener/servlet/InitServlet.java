package com.example.springbootservletfilterlistener.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("InitServlet.doGet");
        resp.getWriter().println("great,you access InitServlet doGet method ");
    }
}
