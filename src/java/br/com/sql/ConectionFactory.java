/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fisherman
 */
public class ConectionFactory {

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            //local do banco                              //usuario  //senha
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUDatabase", "postgres", "123"); //retorna um Connection

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
