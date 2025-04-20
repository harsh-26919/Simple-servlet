package com.harsh;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet
{
    public void service(HttpServletRequest req , HttpServletResponse resp) throws IOException {

//        HttpSession session = req.getSession();
//        int k=(int)session.getAttribute("sum");// used for Http session
//        int k=Integer.parseInt(req.getParameter("k"));//used for URL rewriting
          Cookie cookie[] = req.getCookies();
          int k =0;
          for(Cookie c:cookie)
          {
              if(c.getName().equals("sum"))
              {
                  k=Integer.parseInt(c.getValue());
                  break;
              }
          }
        k=k*k;

        PrintWriter out = resp.getWriter();
        out.println("Square of sum is : "+k+" "+"Wallah!!");
    }
}
