package com.ndma.service;

import com.ndma.model.UserProfile;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserProfileService extends Remote {
    
    public void saveUserProfile(UserProfile userProfile) throws RemoteException;
    
    public void updateUserProfile(UserProfile userProfile) throws RemoteException;
    
    public void deleteUserProfile(UserProfile userProfile) throws RemoteException;
    
    public UserProfile findUserProfileById(Integer userId) throws RemoteException;
    
    public List<UserProfile> listUserProfiles() throws RemoteException;
}
