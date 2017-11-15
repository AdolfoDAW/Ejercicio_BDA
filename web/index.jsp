<%@page import="es.fpmislata.prueba.ConnectionImplDataSource"%>
<%@page import="es.fpmislata.prueba.ConnectionFactory"%>
<%@page import="es.fpmislata.prueba.Estadisticas" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%
    ConnectionFactory connectionFactory = new ConnectionImplDataSource();
    Estadisticas estadisticas = new Estadisticas(connectionFactory);
%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Estadísticas FP</title>
        <meta http equiv="Content-Type" content="text/html"  charset="UTF-8">

    </head>
    <body>
        <h1>Hello World!</h1>
        <p><%=estadisticas.getOfertas()%> ofertas,
            <%=estadisticas.getTitulados()%> titulados,
            <%=estadisticas.getCentros()%> centros           
        </p>
    </body>
</html>
