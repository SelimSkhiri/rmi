/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample.reg;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aicha
 */
public class ServeurDeNom {

    public static void main(String[] args) {
        try {
            final Registry reg = LocateRegistry
                    .createRegistry(3333);

            // nchallah  moumia
            Object o = new Object();
            synchronized (o) {
                o.wait();
            }

        } catch (Exception ex) {
            Logger.getLogger(ServeurDeNom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
