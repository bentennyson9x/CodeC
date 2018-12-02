/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author MyPC
 */
public class Paragraph {
    public String normalText(String line) {
     String out = "";     // khai bao string out                        
     line = line.toLowerCase(); // viet thuong het
     line = line.replaceAll("\\s+", " "); // replace nhieu dau cach thanh 1 dau cach
     line = line.replaceAll(" \\.", "\\."); // replace space "." thanh "."
     line = line.replaceAll("\\.", "\\. "); // replace "." thanh "." space
     line = line.replaceAll(" \\,", "\\,"); 
     line = line.replaceAll("\\,", "\\, ");
     line = line.replaceAll("\\s+", " "); // replace nhieu dau cach thanh 1 dau cach
     line = line.trim(); // xoa dau cach o 2 dau doan
     out=line;
     boolean isCap = true; // viet hoa chu dau luon
     char c;
     StringBuilder strb = new StringBuilder("");
    for (int i = 0; i < out.length()-1; i++) {
        c = out.charAt(i);
        if (c == '.') {
        isCap = true;
        }
        if (isCap && Character.isAlphabetic(c)) {
           c = Character.toUpperCase(c); // ki tu sau dau "." viet hoa len
           isCap = false;
        }
        strb.append(c); // them ki tu c vao chuoi strb
    }
    out = strb.toString(); // cover to string
    if (out.charAt(out.length()-1) != '.') {
        out = out + "."; // neu cuoi doan chua co dau "." thi them "."
    }
    return out;
    }
    
}
