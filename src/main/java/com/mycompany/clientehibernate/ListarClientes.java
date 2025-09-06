/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientehibernate;

import java.util.List;

public class ListarClientes {

    public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();

        System.out.println("--- Listando todos los clientes ---");
        List<Cliente> clientes = clienteDao.obtenerTodosLosClientes();
        
        if (clientes.isEmpty()) {
            System.out.println("No se encontraron clientes en la base de datos.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getIdUsuario());
                System.out.println("Nombre: " + cliente.getNombre() + " " + cliente.getApellido());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("------------------------------------");
            }
        }
        
        HibernateUtil.shutdown();
    }
}