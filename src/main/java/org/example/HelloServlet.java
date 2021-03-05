// Reflecting the directory structure where the file lives
package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // Very simple - just return some plain text
        //PrintWriter writer = response.getWriter();
        //writer.print("Hello World");1
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Sample Java Application");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>This is DEMO Java Servlet Application!!");
        out.print("</p>");
        out.print("</body>");
        out.print("</html>");
    }
}
