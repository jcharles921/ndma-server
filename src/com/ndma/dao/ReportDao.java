package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.Report;
import com.ndma.utils.HibernateUtil;

public class ReportDao {

    public Report registerReport(Report report) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(report);
            transaction.commit();
            return report;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Report updateReport(Report report) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(report);
            transaction.commit();
            return report;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Report deleteReport(Report report) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(report);
            transaction.commit();
            return report;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Report findReportById(Integer reportId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Report.class, reportId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Report> retrieveAllReports() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT r FROM Report r", Report.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
