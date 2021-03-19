<%-- 
    Document   : index
    Created on : 05.03.2021, 14:30:19
    Author     : ПК
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="<%=request.getContextPath()%>/reset.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/css.css">
            <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
            <title>index</title>
    </head>
        <body>
           <main id="main">
            <div class="index__but">
            <h1>Hello!</h1>
            <form action="<%=request.getContextPath()%>/Data" method="get">
                    <input  type="submit" value="go files"> 
                    </form>
</div>
                    <div class="index__but">
                <form action="<%=request.getContextPath()%>/DataBase" method="get">
                    <input  type="submit" value="go database"> 
                    </form>
                </div></main>
        </body>
    </html>
