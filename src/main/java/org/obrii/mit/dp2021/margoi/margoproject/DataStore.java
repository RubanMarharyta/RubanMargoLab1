package org.obrii.mit.dp2021.margoi.margoproject;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
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
import org.obrii.mit.dp2021.margoi.margoproject.Data;
import org.obrii.mit.dp2021.margoi.margoproject.BDconnection;
import org.obrii.mit.dp2021.margoi.margoproject.BaseInteractions;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DataStore {
    List<Data> data = new ArrayList<>();
    
    public DataStore() throws SQLException{
            Connection connection = BDconnection.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");            
            while( resultSet.next()){
            data.add(new Data(parseInt(resultSet.getString(1))  ,resultSet.getString(2),parseInt(resultSet.getString(3))));
            }
    }
    
    public List<Data> getData(){
    return data;
    }
    
    public List<Data> sortingData(List<Data> dataBase, String s){       
        List<Data> newData = new ArrayList<>();
        for (Data d : dataBase) {            
            if(d.getName().contains(s)){
                newData.add(d);}                           
        }
        return newData;
    }                      
}
