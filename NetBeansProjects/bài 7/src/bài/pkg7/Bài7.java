/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg7;
import java.time.DayOfWeek;
import java.time.LocalDate;
/**
 *
 * @author hp
 */
public class Bài7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek dow = date.getDayOfWeek();
        int value = dow.getValue();
        System.out.printf("Mon \tTue \tWed \tThu \tFri \tSat \tSun");
        System.out.println("");
        for (int i = 1; i < value; i++) {
            System.out.print("\t");
        }
        while (date.getMonthValue() == month) {
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.printf("%s\t", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println("");
            }
        
        }
            System.out.println("");

       
        
    }
    
}
