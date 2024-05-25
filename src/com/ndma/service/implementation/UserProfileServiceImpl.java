package com.ndma.service.implementation;

import com.ndma.dao.UserDao;
import com.ndma.model.UserProfile;
import com.ndma.service.UserProfileService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserProfileServiceImpl extends UnicastRemoteObject implements UserProfileService {

    public UserProfileServiceImpl() throws RemoteException {
    }

    @Override
    public void saveUserProfile(UserProfile userProfile) throws RemoteException {
        UserDao dao = new UserDao();
        dao.registerUser(userProfile);
    }

    @Override
    public void updateUserProfile(UserProfile userProfile) throws RemoteException {
        UserDao dao = new UserDao();
        dao.updateUser(userProfile);
    }

    @Override
    public void deleteUserProfile(UserProfile userProfile) throws RemoteException {
        UserDao dao = new UserDao();
        dao.deleteUser(userProfile);
    }

    @Override
    public UserProfile findUserProfileById(Integer userId) throws RemoteException {
        UserDao dao = new UserDao();
        return dao.findUserById(userId);
    }

    @Override
    public List<UserProfile> listUserProfiles() throws RemoteException {
        UserDao dao = new UserDao();
        return dao.retrieveAllUsers();
    }
}
