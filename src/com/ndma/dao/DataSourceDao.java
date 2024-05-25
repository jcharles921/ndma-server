package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.DataSource;
import com.ndma.utils.HibernateUtil;

public class DataSourceDao {

    public DataSource registerDataSource(DataSource dataSource) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(dataSource);
            transaction.commit();
            return dataSource;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DataSource updateDataSource(DataSource dataSource) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(dataSource);
            transaction.commit();
            return dataSource;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DataSource deleteDataSource(DataSource dataSource) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(dataSource);
            transaction.commit();
            return dataSource;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DataSource findDataSourceById(Integer dataSourceId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(DataSource.class, dataSourceId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<DataSource> retrieveAllDataSources() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT ds FROM DataSource ds", DataSource.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
