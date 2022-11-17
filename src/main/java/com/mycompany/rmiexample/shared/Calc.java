/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author aicha
 */
public interface Calc extends Remote {

    int add(int a, int b) throws RemoteException;
}
