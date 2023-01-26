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
public class TestGeneric2<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    public static void main(){
        TestGeneric2<String> type = new TestGeneric2<String>();
        type.setT("Pankaj");
        TestGeneric2 type1 = new TestGeneric2();
        type1.setT("Pankaj");
        type1.setT(10);
    }
}
