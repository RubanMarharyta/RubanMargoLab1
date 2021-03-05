package org.obrii.mit.dp2021.margoi.margoproject;

import java.util.List;

public interface DataCrudInterface {
    public List<Data> searchData(String s);
    public void updateData(int id, Data data);
    public void deleteData(int id);
    public void createData(Data addingData);
    public List<Data> readData();
    public void writeData(List<Data> data);
}
