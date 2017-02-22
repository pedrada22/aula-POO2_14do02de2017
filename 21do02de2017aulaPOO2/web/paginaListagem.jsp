<%-- 
    Document   : paginaListagem
    Created on : 21/02/2017, 20:14:23
    Author     : 1614290061
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.iesb.modelo.Alimento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Alimento> lista = (ArrayList<Alimento>) request.getAttribute("lista");
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alimentos Relatorio</title>
    </head>
    <body>
        <table border="1" align="center">
            <tr>
                <th>Nome</th>
                <th>KCal</th>
                <th>Lipideos</th>
            </tr>
            <%
                for (Alimento al : lista)
                {%>
                    <tr>
                        <td><%al.getNome();%></td>
                        <td><%al.getLipideos();%></td>
                        <td><%al.getkCal();%></td>
                    </tr>
                
                <%}
            %>
            
        </table>
    </body>
</html>
