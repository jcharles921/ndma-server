package com.ndma.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ndma.model.Role;
import com.ndma.utils.HibernateUtil;

public class RoleDao {

    public Role registerRole(Role role) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(role);
            transaction.commit();
            return role;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Role updateRole(Role role) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(role);
            transaction.commit();
            return role;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Role deleteRole(Role role) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(role);
            transaction.commit();
            return role;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Role findRoleById(Integer roleId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Role.class, roleId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Role> retrieveAllRoles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT r FROM Role r", Role.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
