package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.UserProfile;
import com.ndma.utils.HibernateUtil;

public class UserDao {

    public UserProfile registerUser(UserProfile userProfile) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(userProfile);
            transaction.commit();
            return userProfile;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public UserProfile updateUser(UserProfile userProfile) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(userProfile);
            transaction.commit();
            return userProfile;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public UserProfile deleteUser(UserProfile userProfile) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(userProfile);
            transaction.commit();
            return userProfile;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public UserProfile findUserById(Integer userId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(UserProfile.class, userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<UserProfile> retrieveAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT u FROM UserProfile u", UserProfile.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
