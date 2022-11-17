/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample.client;

import com.mycompany.rmiexample.shared.Calc;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aicha
 */
public class Client {
    public static void main(String[] args) {
        try {
            //recuperation du name server
            Registry reg=LocateRegistry.getRegistry("localhost",3333);
            //recuperation du stub
            Calc stub=(Calc)reg.lookup("Toz");
            
            final int r = stub.add(1,2);
            System.out.println(r);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
