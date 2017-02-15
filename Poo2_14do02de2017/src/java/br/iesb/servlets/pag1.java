/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

        
/**
 *
 * 
/*
•	Passo 1: Criar uma classe java sem o método main
•	Passo 2: Herdar as propriedades da classe HttpServlet
•	Passo 3: Criar dois métodos com os seguintes nomes 
            (protected void doPost e protected void doGet)
o	Passo 3.1: Nos métodos doPost e doGet acrescentar dois parâmetros 
            (HttpServletRequest request, HttpServletResponse response)
o	Passo 3.2 Nos métodos doPost e doGet lançar as seguintes exceções: 
            IOException, ServletException
•	Passo 4: No corpo do método doGet, chamar o método doPost
•	Passo 5: Cadastrar a servlet (no arquivo web.xml ou ... ?)
*/

@WebServlet(name = "ServMath",
            urlPatterns = "/action/math.do",
            description = "Servet para executar operações matemáticas")
//esta notation acima dispensa o web.xml
public class pag1 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String varHtml = new String();
        
        int num = Integer.parseInt(request.getParameter("fname"));
        
        int idx = 0;
        for (int i=0; i <= num ; i++)
        {
            
            if (i % 2 == 0)
            {
                idx++;
                varHtml = varHtml+""+(i)+","+"";
            }
            if (idx % Math.sqrt(num/2) == 0 && i != 0)
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
