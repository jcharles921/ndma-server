package com.ndma.service;

import com.ndma.model.Report;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ReportService extends Remote {
    
    public void saveReport(Report report) throws RemoteException;
    
    public void updateReport(Report report) throws RemoteException;
    
    public void deleteReport(Report report) throws RemoteException;
    
    public Report findReportById(Integer reportId) throws RemoteException;
    
    public List<Report> listReports() throws RemoteException;
}
