package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.DisasterEvent;
import com.ndma.utils.HibernateUtil;

public class DisasterEventDao {

    public DisasterEvent registerDisasterEvent(DisasterEvent disasterEvent) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(disasterEvent);
            transaction.commit();
            return disasterEvent;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DisasterEvent updateDisasterEvent(DisasterEvent disasterEvent) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(disasterEvent);
            transaction.commit();
            return disasterEvent;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DisasterEvent deleteDisasterEvent(DisasterEvent disasterEvent) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(disasterEvent);
            transaction.commit();
            return disasterEvent;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DisasterEvent findDisasterEventById(Integer eventId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(DisasterEvent.class, eventId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<DisasterEvent> retrieveAllDisasterEvents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT de FROM DisasterEvent de", DisasterEvent.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
