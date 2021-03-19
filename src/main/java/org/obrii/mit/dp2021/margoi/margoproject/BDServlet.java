/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.margoi.margoproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.margoi.margoproject.Data;
import org.obrii.mit.dp2021.margoi.margoproject.BDconnection;
import org.obrii.mit.dp2021.margoi.margoproject.BaseInteractions;
import org.obrii.mit.dp2021.margoi.margoproject.DataStore;
//import org.obrii.mit.dp2021.nevmerzhytskyi.files.Config;
//import org.obrii.mit.dp2021.nevmerzhytskyi.files.FilesCrud;


@WebServlet(name = "BDServlet", urlPatterns = {"/DataBase"})
public class BDServlet extends HttpServlet {
    String  formType1 = "update"; 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        HttpSession session  = request.getSession();
        session.setAttribute("formType1", formType1);
        System.out.println(request.getParameter("search"));
        if(request.getParameter("search")!=null){
            DataStore data;
            try {
                data = new DataStore();
                request.setAttribute("data", data.sortingData(data.getData(), request.getParameter("search")));
            } 
            catch (SQLException ex) {
                Logger.getLogger(BDServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                DataStore data = new DataStore();
                request.setAttribute("data",data.getData() );
                // request.getRequestDispatcher("home.jsp").forward(request, response); 
            } 
            catch (SQLException ex) {
                request.setAttribute("data", new ArrayList<Data>());
                //request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        }
        request.getRequestDispatcher("home_1.jsp").forward(request, response); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s14","s14","4663");
                formType1="create";
                baseI.addData("('"+request.getParameter("name")+"','"+Integer.parseInt(request.getParameter("age"))+"')","users(name, age)");
                doGet(request, response);
    }

    
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                int myId = Integer.parseInt(request.getParameter("id"));
                formType1="update";
                BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s14","s14","4663");
                baseI.updataData(request.getParameter("name"), "name",myId);
                baseI.updataData(request.getParameter("age"),"age",myId);
                doGet(request, response);
            }
    
      @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s14","s14","4663");    
                int myId = Integer.parseInt(request.getParameter("id"));
                baseI.deleteData(myId);
                doGet(request, response);
            }
    
        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
