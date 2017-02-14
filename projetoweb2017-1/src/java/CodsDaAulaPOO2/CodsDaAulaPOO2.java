package aplicacao;

import java.util.Calendar;
import java.util.Date;

public class OlaMundo {
    public static void main(String[] args) {
        Date hoje = Calendar.getInstance().getTime();
        System.out.println("Olá Mundo!");
        System.out.println(hoje);
    }
}


package aplicacao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletOlaMundo extends HttpServlet{
    //dos métodos doPost / doGet
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws IOException, ServletException{
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        Date hoje = Calendar.getInstance().getTime();
        out.print("<table border=1 align='center'>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Olá Mundo!");
        out.print("</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>");
        out.print(hoje);
        out.print("</td>");
        out.print("</tr>");        
        out.print("</table>");
    }
    




package br.iesb.modelo;
public class Produto {
    private String descricao;
    private int estoque;
    private double valorUnitario;

    public Produto() {
    }

    public Produto(String descricao, int estoque, double valorUnitario) {
        this.descricao = descricao;
        this.estoque = estoque;
        this.valorUnitario = valorUnitario;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}



package br.iesb.servlets;

import br.iesb.modelo.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletProduto extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        lista.add(new Produto("Arroz", 1000, 200.00));
        lista.add(new Produto("Feijão", 2000, 100.00));
        lista.add(new Produto("Milho", 3000, 250.00));
        lista.add(new Produto("Soja", 5000, 300.00));
        
        out.print("<html>");
        out.print("<table border='1' align='center'>");
        out.print("<tr>");
        out.print("<th>Descrição</th><th>Estoque</th><th>Valor Unitário</th>");
        out.print("</tr>");
        
        for(Produto prod : lista){  //for each
            out.print("<tr>");
            out.print("<td>" + prod.getDescricao() + "</td>");
            out.print("<td>" + prod.getEstoque() + "</td>");
            out.print("<td> R$" + prod.getValorUnitario() + "</td>");
            out.print("</tr>");
        }
        
        out.print("</table>");
        out.print("</html>");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        doPost(request, response);
    }
}


