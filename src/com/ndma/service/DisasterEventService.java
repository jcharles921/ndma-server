package com.ndma.service;

import com.ndma.model.DisasterEvent;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DisasterEventService extends Remote {
    
    public void saveDisasterEvent(DisasterEvent disasterEvent) throws RemoteException;
    
    public void updateDisasterEvent(DisasterEvent disasterEvent) throws RemoteException;
    
    public void deleteDisasterEvent(DisasterEvent disasterEvent) throws RemoteException;
    
    public DisasterEvent findDisasterEventById(Integer eventId) throws RemoteException;
    
    public List<DisasterEvent> listDisasterEvents() throws RemoteException;
}
