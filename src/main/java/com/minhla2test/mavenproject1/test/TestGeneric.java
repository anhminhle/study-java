/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhla2test.mavenproject1.test;

/**
 *
 * @author Minh
 */
public class TestGeneric<T> {
    Class<T> type;
    public void main(){
        System.out.println("TestGeneric:" + type.getClass().getSimpleName());
    }
}
