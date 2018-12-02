/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuly.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author hp
 */
public class XulyFile{
    public void GhiFile() throws FileNotFoundException, IOException{
       File file= new File("text.txt");
       if(file.exists()) file.delete();
       else {
           System.out.println("File not exists. Create new File!!");
       }
        FileOutputStream fos= new FileOutputStream("text.txt", true);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("Hello");
        pw.close();
        fos.flush();
        fos.close();
    }
    public void DocFile() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("Text.txt");
        BufferedReader br = new BufferedReader(fr);
        String line ;
        while ((line = br.readLine())!=null) {            
            System.out.println(""+line);
        }
        br.close();
        fr.close();
    }
}
