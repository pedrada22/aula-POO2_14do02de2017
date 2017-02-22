<%-- 
    Document   : paginaListagem
    Created on : 21/02/2017, 20:14:23
    Author     : 1614290061
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.iesb.modelo.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Contato> rsp = (ArrayList<Contato>) request.getAttribute("lista");
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contatos Relatorio</title>
    </head>
    <body>
        <table border="2" align="center" >
            <tr>
                <th>Nome</th>
                <th>Email</th>
                <th>Endereco</th>
                <th>Sexo</th>
            </tr>
            <%
                for (Contato al : rsp)
                {%>
                    <tr>
                        <td><%=al.getNome() %></td>
                        <td><%=al.getEmail() %></td>
                        <td><%=al.getEndereco() %></td>
                        <td><%=al.getSexo() %></td>

                    </tr>
                
                <%}
            %>
            
        </table>
    </body>
</html>
