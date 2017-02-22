/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.servlet;

import br.iesb.modelo.Alimento;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1614290061
 */

@WebServlet(name="AlimentoAction",
urlPatterns="/action/alimento.do")
public class AlimentoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        ArrayList<Alimento> lista = new ArrayList<Alimento>();
        lista.add(new Alimento("Pão integral", 100, 50));
        lista.add(new Alimento("Pão integral", 100, 50));
        lista.add(new Alimento("Pão integral", 100, 50));
        lista.add(new Alimento("Pão integral", 100, 50));
        lista.add(new Alimento("Pão integral", 100, 50));
        
        
        request.setAttribute("lista", lista);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/paginaListagem.jsp");
        dispatcher.forward(request, response);
                
        
        
    }
}
