<%-- 
    Document   : Forma.jsp
    Created on : 01.03.2021, 13:03:37
    Author     : ПК
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/reset.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
    </head>
    <body id="forma__main">
        <h1>Margo Lab 3 update page</h1>
        
        <form action= "<%=request.getContextPath()%>/Data" method="post" style="color:white; font-family: 'Open Sans', sans-serif;">
            <input type="hidden" name="id" value="0">
        Name:       <input type="text" name="name">
         Age:    <input type="text" placeholder="int" name="age">
            <input type="submit" value="Create Data">
        </form>
    </body>
</html>
