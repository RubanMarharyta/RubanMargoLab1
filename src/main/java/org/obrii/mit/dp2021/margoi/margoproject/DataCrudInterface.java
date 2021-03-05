package org.obrii.mit.dp2021.margoi.margoproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import org.obrii.mit.dp2021.margoi.margoproject.Data;

/**
 *
 * @author NEVM PC
 */
public interface DataCrudInterface {
public List<Data> searchData(String s);
  //  void createData(Data data);

  // void deleteData(int id);

  //  List<Data> readData();

 //   void updateData(int id, Data data);
 //  void writeData(List<Data> data);
   
   
   public void updateData(int id, Data data);
 
    public void deleteData(int id);


public void createData(Data addingData);


 public List<Data> readData();
 public void writeData(List<Data> data);

public void stData();



//    void createData(Data addingData);

   // List<Data> readData();

   // void updateData(int id, Data data);

   // void deleteData(int id);

  //  void writeData(List<Data> data);
}
