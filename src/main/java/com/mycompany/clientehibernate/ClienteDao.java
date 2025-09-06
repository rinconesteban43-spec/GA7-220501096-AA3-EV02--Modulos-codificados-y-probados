/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ClienteDao {

    // Método para guardar un nuevo cliente (Create)
    public void guardarCliente(Cliente cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Inicia la transacción
            transaction = session.beginTransaction();
            // Guarda el objeto Cliente
            session.persist(cliente);
            // Confirma la transacción
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método para obtener un cliente por ID (Read)
    public Cliente obtenerCliente(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Cliente.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para actualizar un cliente (Update)
    public void actualizarCliente(Cliente cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Inicia la transacción
            transaction = session.beginTransaction();
            // Actualiza el objeto Cliente
            session.merge(cliente);
            // Confirma la transacción
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método para eliminar un cliente (Delete)
    public void eliminarCliente(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Inicia la transacción
            transaction = session.beginTransaction();
            // Obtiene el cliente a eliminar
            Cliente cliente = session.get(Cliente.class, id);
            if (cliente != null) {
                session.remove(cliente);
                System.out.println("Cliente con ID " + id + " eliminado.");
            }
            // Confirma la transacción
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método adicional para leer todos los clientes
    public List<Cliente> obtenerTodosLosClientes() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Cliente", Cliente.class).list();
        }
    }
}
