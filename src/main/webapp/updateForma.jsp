<%-- 
    Document   : updateForma
    Created on : 01.03.2021, 13:03:37
    Author     : ПК
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>data</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/reset.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
    
    </head>
     <body id="forma__main">
        <h1>Margo Lab 3 update page</h1>
        
        <form action= "<%=request.getContextPath()%>/Forma" method="post" style="color:white ; font-family: 'Open Sans', sans-serif;">
            <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
         Name:    <input type="text" name="name" value="<%=request.getParameter("name")%>">
          Age:    <input type="text" placeholder="int" name="age" value="<%=request.getParameter("age")%>">
            <input type="submit" value="Updata Data">
        </form>
    </body>
</html>
