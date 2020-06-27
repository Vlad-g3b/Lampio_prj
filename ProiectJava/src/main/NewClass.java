/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;

/**
 *
 * @author sined
 */
public class NewClass {
    public static void main(String[] args){
          String directory = System.getProperty("user.home");
        String fileName = "lampa.txt";
        String absolutePath = directory + File.separator + fileName;
        System.out.println(absolutePath);
   try(FileWriter fileWriter = new FileWriter(absolutePath)) {
    String fileContent = "This is a sample text.";
    fileWriter.write(fileContent);
} catch (IOException e) {
    // exception handling
}

// read the content from file
try(FileReader fileReader = new FileReader(absolutePath)) {
    int ch = fileReader.read();
    while(ch != -1) {
        System.out.print((char)ch);
        ch = fileReader.read();
    }
} catch (FileNotFoundException e) {
    // exception handling
} catch (IOException e) {
    // exception handling
} }
    
}
