/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yamaha;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Jupiter extends Motor implements Comparable<Jupiter>{
    int Waranty;

    public Jupiter() {
    }

    public Jupiter(int Waranty) {
        this.Waranty = Waranty;
    }

    public Jupiter(String Code, String Name, double Capacity, int num) {
        super(Code, Name, Capacity, num);
    }

    public Jupiter(int Waranty, String Code, String Name, double Capacity, int num) {
        super(Code, Name, Capacity, num);
        this.Waranty = Waranty;
    }

    public int getWaranty() {
        return Waranty;
    }

    public void setWaranty(int Waranty) {
        this.Waranty = Waranty;
    }

    @Override
    public void InputInfor() {
        super.InputInfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Please Enter Waranty : ");
        setWaranty( Integer.parseInt(s.nextLine()));
    }

    @Override
    public void DisplayInfor() {
        super.DisplayInfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Waranty : "+getWaranty());
    }

    @Override
    public void ChangeInfor() {
        InputInfor();
    }

    @Override
    public int compareTo(Jupiter o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (this.getWaranty()>o.getWaranty()) return 1;
        else if (this.getWaranty()<o.getWaranty()) return -1;
        return 0;
    }

}
