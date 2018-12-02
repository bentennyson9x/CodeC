/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yamaha;

/**
 *
 * @author hp
 */
public class Serius extends Motor implements Comparable<Serius>{
    int Waranty;

    public Serius() {
    }

    public Serius(int Waranty) {
        this.Waranty = Waranty;
    }

    public Serius(String Code, String Name, double Capacity, int num) {
        super(Code, Name, Capacity, num);
    }

    public Serius(int Waranty, String Code, String Name, double Capacity, int num) {
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
    public void ChangeInfor() {
        InputInfor();
    }

    @Override
    public void DisplayInfor() {
        super.DisplayInfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Waranty : "+getWaranty());
    }

    @Override
    public void InputInfor() {
        super.InputInfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Please Enter Waranty : ");
        setWaranty(Integer.parseInt(s.nextLine()));
    }

    @Override
    public int compareTo(Serius o) {
        if (this.getWaranty()>o.getWaranty()) return 1;
        else if (this.getWaranty()<o.getWaranty()) return -1;
        return 0;
    }
    
}
