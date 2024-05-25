package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.Responder;
import com.ndma.utils.HibernateUtil;

public class ResponderDao {

    public Responder registerResponder(Responder responder) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(responder);
            transaction.commit();
            return responder;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Responder updateResponder(Responder responder) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(responder);
            transaction.commit();
            return responder;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Responder deleteResponder(Responder responder) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(responder);
            transaction.commit();
            return responder;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Responder findResponderById(Integer responderId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Responder.class, responderId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Responder> retrieveAllResponders() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT r FROM Responder r", Responder.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
