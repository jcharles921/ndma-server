package com.ndma.service.implementation;

import com.ndma.dao.ResponderDao;
import com.ndma.model.Responder;
import com.ndma.service.ResponderService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ResponderServiceImpl extends UnicastRemoteObject implements ResponderService {

    public ResponderServiceImpl() throws RemoteException {
    }

    @Override
    public void saveResponder(Responder responder) throws RemoteException {
        ResponderDao dao = new ResponderDao();
        dao.registerResponder(responder);
    }

    @Override
    public void updateResponder(Responder responder) throws RemoteException {
        ResponderDao dao = new ResponderDao();
        dao.updateResponder(responder);
    }

    @Override
    public void deleteResponder(Responder responder) throws RemoteException {
        ResponderDao dao = new ResponderDao();
        dao.deleteResponder(responder);
    }

    @Override
    public Responder findResponderById(Integer responderId) throws RemoteException {
        ResponderDao dao = new ResponderDao();
        return dao.findResponderById(responderId);
    }

    @Override
    public List<Responder> listResponders() throws RemoteException {
        ResponderDao dao = new ResponderDao();
        return dao.retrieveAllResponders();
    }
}
