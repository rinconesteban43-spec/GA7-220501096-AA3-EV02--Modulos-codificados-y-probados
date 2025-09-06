/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

/**
 *
 * @author Usuario
 */
public class UpdateCliente {
     public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();

        // 3. Actualizar un cliente
        int clienteId = 9; // Reemplazar con el ID real
        Cliente clienteAActualizar = clienteDao.obtenerCliente(clienteId);
        
        if (clienteAActualizar != null) {
            clienteAActualizar.setEmail("estebanrinconSENA@tallerXpert.com");
            clienteDao.actualizarCliente(clienteAActualizar);
            System.out.println("Cliente con ID " + clienteId + " actualizado. Nuevo email: " + clienteAActualizar.getEmail());
        } else {
            System.out.println("Cliente para actualizar no encontrado.");
        }
        
        HibernateUtil.shutdown();
    }
}
