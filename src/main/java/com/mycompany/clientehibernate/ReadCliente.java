/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

public class ReadCliente {
    public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();
        
        // 2. Leer un cliente por ID
        int clienteId = 4; // Reemplazar con el ID real
        Cliente clienteLeido = clienteDao.obtenerCliente(clienteId);
        
        if (clienteLeido != null) {
            System.out.println("Cliente encontrado: " + clienteLeido.getNombre() + " " + clienteLeido.getApellido());
            System.out.println("Email: " + clienteLeido.getEmail());
        } else {
            System.out.println("Cliente no encontrado con ID: " + clienteId);
        }
        
        HibernateUtil.shutdown();
    }
}
