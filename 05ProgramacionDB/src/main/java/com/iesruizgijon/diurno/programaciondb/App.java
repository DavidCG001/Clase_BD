/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.iesruizgijon.diurno.programaciondb;

import java.sql.SQLException;

/**
 *
 * @author david
 */
public class App {

    public static void main(String[] args) throws SQLException {

        final String USER = "root";
        final String PASS = "123qweASD_";
        final String nameDB = "northwind";
        final String URL = "jdbc:mysql://localhost:3306/";

        BaseDatos bd = new BaseDatos(nameDB, USER, PASS);

        bd.conecta();
        String[] resultado = bd.describe("orders");
        bd.desconecta();

        for (String columna : resultado) {
            System.out.println(columna);
        }
        
    }
}
