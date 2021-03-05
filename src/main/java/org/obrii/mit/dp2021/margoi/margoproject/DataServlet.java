package org.obrii.mit.dp2021.margoi.margoproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DataServlet", urlPatterns = {"/"})
public class DataServlet extends HttpServlet {
              FilesCrud dataCrud = new FilesCrud(new File(Config.getFileName()));
              
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            if (Config.getFileName().equals("")) {
                Config.setFileName(this.getServletContext().getRealPath("") + "data.txt");
                dataCrud = new FilesCrud(new File(Config.getFileName()));
            }
                
            if(request.getParameter("search")!=null){
                request.setAttribute("data", dataCrud.searchData(request.getParameter("search")));
            }
            else{
                request.setAttribute("data", dataCrud.readData());
            }
            
            request.getRequestDispatcher("home.jsp").forward(request, response); 
}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        dataCrud.createData(
        new Data(
            Integer.parseInt(request.getParameter("id")),
            request.getParameter("name"),
            Integer.parseInt(request.getParameter("age"))
        )
        );
        doGet(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int myId = Integer.parseInt(request.getParameter("id"));
       dataCrud.updateData(myId,
        new Data(
            Integer.parseInt(request.getParameter("id")),
            request.getParameter("name"),
            Integer.parseInt(request.getParameter("age"))
        ));
       
       doGet(request, response);
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int myId = Integer.parseInt(request.getParameter("id"));
        dataCrud.deleteData(myId);
        doGet(request, response);
    }
}
