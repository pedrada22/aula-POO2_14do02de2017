/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

        
/**
 *
 * @author 1614290061
 */
public class indexController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String varHtml = new String();
        
        int num = Integer.parseInt(request.getParameter("fname"));
        
        int idx = 0;
        for (int i=0; i <= num ; i++)
        {
            
            if (i % 2 == 0)
            {
                varHtml = varHtml+""+(i)+","+"";
            }
            if (i % Math.sqrt(num) == 0 && i != 0)
            {
                varHtml = varHtml+"<br>";
            }
        }
        
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("POst Titulo da parada...");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print(varHtml);
        out.print("</body>");
        out.print("</html>");
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String varHtml = new String();
        
        varHtml = "<form method=POST>\n" +
        "  URL: <input type=\"text\" name=\"fname\"><br>\n" +
        "  <input type=\"submit\" value=\"Submit\">\n" +
        "</form>";
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("Titulo da parada...");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print(varHtml);
        out.print("</body>");
        out.print("</html>");
        
                
                
    }
}
