/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhla2test.mavenproject1.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh
 */
public class TestClass1 {
    private Path path = null;
    private WatchService watchService = null;
    
    private void init(){
        path = Paths.get("D:\\Projects\\Java Projects\\mavenproject1");
        try{
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, 
                    StandardWatchEventKinds.ENTRY_DELETE, 
                    StandardWatchEventKinds.ENTRY_MODIFY);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private void doRounds(){
        WatchKey key = null;
        while (true){
            try{
                key = watchService.take();
                for (WatchEvent<?> event : key.pollEvents()){
                    Kind<?> kind = event.kind();
                    System.out.println(event.context().toString());
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(TestClass1.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean reset = key.reset();
            if (!reset) break;
        }
    }
    public void main(String[] args){
        init();
        doRounds();
    }
}
