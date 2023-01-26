/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhla2test.mavenproject1.main;

import com.minhla2test.mavenproject1.test.TestClass1;
import com.minhla2test.mavenproject1.test.TestGeneric;
import com.minhla2test.mavenproject1.test.TestGeneric2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Minh
 */

public class MainClass {
    public static void init(){
        
    }
    public static void test(){
        TestGeneric2.main();
//        List<TestGeneric<?>> l = new ArrayList(Arrays.asList(new TestGeneric()));
//        l.get(0).main();
//        TestClass1 t = new TestClass1();
//        t.main(null);
    }
    public static void main(String[] args){
        init();
        test();
        
    }
}
