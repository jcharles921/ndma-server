package com.ndma.service;

import com.ndma.model.DataSource;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DataSourceService extends Remote {
    
    public void saveDataSource(DataSource dataSource) throws RemoteException;
    
    public void updateDataSource(DataSource dataSource) throws RemoteException;
    
    public void deleteDataSource(DataSource dataSource) throws RemoteException;
    
    public DataSource findDataSourceById(Integer dataSourceId) throws RemoteException;
    
    public List<DataSource> listDataSources() throws RemoteException;
}
