/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

/**
 *
 * @author Usuario
 */
public class DeleteCliente {
      public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();

        // 4. Eliminar un cliente
        int clienteId = 9; // Reemplazar con el ID real
        clienteDao.eliminarCliente(clienteId);
        
        // Opcional: Intenta leer de nuevo para confirmar que fue eliminado
        Cliente clienteEliminado = clienteDao.obtenerCliente(clienteId);
        if (clienteEliminado == null) {
            System.out.println("Confirmación: Cliente con ID " + clienteId + " ya no existe en la base de datos.");
        }
        
        HibernateUtil.shutdown();
    }
}
