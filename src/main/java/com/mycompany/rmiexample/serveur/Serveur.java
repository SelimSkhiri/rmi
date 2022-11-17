/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample.serveur;

import com.mycompany.rmiexample.reg.ServeurDeNom;
import com.mycompany.rmiexample.serveur.CalcImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aicha
 */
public class Serveur {

    public static void main(String[] args) {

        try {
            CalcImpl cc = new CalcImpl();
            Registry reg = LocateRegistry.getRegistry("localhost",3333);
            reg.bind("Toz", cc);

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
