/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.margoi.margoproject;

import java.sql.Connection;
import java.sql.DriverManager;


public class BDconnection {
    
    public static Connection connect(){
        Connection c = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://obrii.org:5432/db2021mit21s14","s14","4663");
            
        }
        catch(Exception e){
            e.printStackTrace();       
        }
        return c;
    }
}
