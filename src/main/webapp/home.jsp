<%-- 
    Document   : home.jsp
    Created on : 01.03.2021, 12:15:55
    Author     : ПК
--%>

<%@page import="org.obrii.mit.dp2021.margoi.margoproject.Data"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="<%=request.getContextPath()%>/reset.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
        
        <title>home</title>
    </head>
    <body id="home__main">
        <h1>Margo Lab 3 main page</h1>
        <form action= "<%=request.getContextPath()%>/Data" method="get" id="sr__home">
            <input type="text" name="search">
            <input type="submit" value="search data">
        </form>
        
        <%
        List<Data> dataList = (List<Data>) request.getAttribute("data");
        %>
        
       
        
        <%for(Data data:dataList){%>
        
        
        
        
        
        
        
        <div class="user">
        <p> Id:  <%=data.getId() %>  Name: <%=data.getName()%>  Age: <%=data.getAge()%></p>

        <form action="updateForma.jsp" methd="post">
            <input type="hidden" name="id" value="<%=data.getId() %>">
            <input type="hidden" name="name" value="<%=data.getName()%>">
            <input type="hidden" placeholder="integer" name="age" value="<%=data.getAge()%>">
            
            
            <input type="submit" value="update data">
        </form>
            <form action="<%=request.getContextPath()%>/Forma" methd="get">
            <input type="hidden" name="id" value="<%=data.getId() %>">

            <input type="submit" value="delete data">
            </form>
        
        </div>
        <%}%>
        <form action="Forma.jsp" id="add__home">
            <input type="submit" value="add data">
        </form>
        
        
        
    </body>
</html>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
      
