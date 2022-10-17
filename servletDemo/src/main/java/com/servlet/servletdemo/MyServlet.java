package com.servlet.servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(value = "/myservlets")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// 动态生成数据

        // 判断数据
        String message="Success";


        // 作出响应
        //resp.getWriter().write(message);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Servlet1");
        dispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
