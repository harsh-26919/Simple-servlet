package com.harsh;


import org.jetbrains.annotations.NotNull;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet
{

    public void service(@NotNull HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;
//        PrintWriter out = resp.getWriter(); // for sending data to client
//        out.println("Sum is : "+k);
           //URL Rewriting and RequestDispatcher and SendRedirect
//        req.setAttribute("sum",i+j);// for storing data in request scope and making it available to Sqservlet
//        RequestDispatcher rd = req.getRequestDispatcher("sq"); // for forwarding the request to another servlet(SqServlet)
//        rd.forward(req,resp);// for forwarding the request to another servlet(SqServlet) using RequestDispatcher
//          resp.sendRedirect("sq?k="+k);//URL rewriting

        //HttpSession
//        HttpSession session = req.getSession();
//        session.setAttribute("sum",k);
        //cookie method
//        Cookie cookie = new Cookie("sum",k+"");
//        resp.addCookie(cookie);
//        resp.sendRedirect("sq");
    }
}
