package com.ndma.service;

import com.ndma.model.Role;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RoleService extends Remote {
    
    public void saveRole(Role role) throws RemoteException;
    
    public void updateRole(Role role) throws RemoteException;
    
    public void deleteRole(Role role) throws RemoteException;
    
    public Role findRoleById(Integer roleId) throws RemoteException;
    
    public List<Role> listRoles() throws RemoteException;
}
