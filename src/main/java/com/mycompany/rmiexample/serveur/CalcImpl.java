/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample.serveur;

import com.mycompany.rmiexample.shared.Calc;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author aicha
 */
public class CalcImpl extends UnicastRemoteObject implements Calc {

    public CalcImpl() throws RemoteException {
    }
    
    public int add(int a, int b) {
        System.out.println("je suis ici");
        return a + b;
    }
}
