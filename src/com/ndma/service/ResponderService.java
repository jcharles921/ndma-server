package com.ndma.service;

import com.ndma.model.Responder;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ResponderService extends Remote {
    
    public void saveResponder(Responder responder) throws RemoteException;
    
    public void updateResponder(Responder responder) throws RemoteException;
    
    public void deleteResponder(Responder responder) throws RemoteException;
    
    public Responder findResponderById(Integer responderId) throws RemoteException;
    
    public List<Responder> listResponders() throws RemoteException;
}
