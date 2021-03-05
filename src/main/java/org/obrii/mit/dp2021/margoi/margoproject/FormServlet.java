package org.obrii.mit.dp2021.margoi.margoproject;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FormServlet", urlPatterns = {"/Forma"})
public class FormServlet extends HttpServlet {
    
    DataServlet dataServlet = new DataServlet();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      dataServlet.doDelete(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dataServlet.doPut(request,response);
    }

}
