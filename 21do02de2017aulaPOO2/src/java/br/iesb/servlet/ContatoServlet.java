/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.servlet;

import br.iesb.modelo.Contato;
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

@WebServlet(name="ContatoAction",urlPatterns="/action/contato")
public class ContatoServlet extends HttpServlet
{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        ArrayList<Contato> lista = new ArrayList<>();
        lista.add(new Contato("nome", "email1@teste.com.br", "asa-sul 614 iesb","macho"));
        lista.add(new Contato("nome2", "email2@teste.com.br", "asa-sul 614 iesb","fema"));
        lista.add(new Contato("nome3", "email3@teste.com.br", "asa-sul 614 iesb","fema"));
        lista.add(new Contato("nome4", "email4@teste.com.br", "asa-sul 614 iesb","macho"));
        lista.add(new Contato("nome5", "email5@teste.com.br", "asa-sul 614 iesb","indefinido"));
        lista.add(new Contato("nome", "email1@teste.com.br", "asa-sul 614 iesb","macho"));
        lista.add(new Contato("nome2", "email2@teste.com.br", "asa-sul 614 iesb","fema"));
        lista.add(new Contato("nome3", "email3@teste.com.br", "asa-sul 614 iesb","fema"));
        lista.add(new Contato("nome4", "email4@teste.com.br", "asa-sul 614 iesb","macho"));
        lista.add(new Contato("nome5", "email5@teste.com.br", "asa-sul 614 iesb","indefinido"));
        
        request.setAttribute("lista", lista);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/paginaListagem2.jsp");
        dispatcher.forward(request, response);
                
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        doPost(request,response);
    }
}
