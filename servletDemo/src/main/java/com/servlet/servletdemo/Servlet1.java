package com.servlet.servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet1", value = "/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        Cookie c1=new Cookie("age","10");// 状态Cookie 重启即清除
        Cookie c2=new Cookie("gender", "男");//持久化Cookie 让浏览器保留1分钟
        //c2.setMaxAge(60);// 秒钟    持久化Cookie 让浏览器保留1分钟
        response.addCookie(c1);
        response.addCookie(c2);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("servlet1 的响应");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
