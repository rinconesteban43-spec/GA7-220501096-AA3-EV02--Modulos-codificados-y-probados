/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

public class CrearCliente {

    public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();

        // Crear un nuevo cliente
        Cliente nuevoCliente = new Cliente("Esteban", "Rincon", "Esteban.rincon@example.com", "123456789", "Calle Falsa 123", "password123");
        clienteDao.guardarCliente(nuevoCliente);
        
        System.out.println("Cliente guardado exitosamente.");
        System.out.println("ID del cliente creado: " + nuevoCliente.getIdUsuario());
        
        HibernateUtil.shutdown();
    }
}
