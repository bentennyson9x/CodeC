/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yamaha;
import IMotor.IMotor;
import java.util.*;
import java.*;

/**
 *
 * @author hp
 */
public class Motor implements IMotor{
    String Code;
    String Name;
    double Capacity;
    int num;
    Scanner s = new Scanner(System.in);

    public Motor() {
    }

    public Motor(String Code, String Name, double Capacity, int num) {
        this.Code = Code;
        this.Name = Name;
        this.Capacity = Capacity;
        this.num = num;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double Capacity) {
        this.Capacity = Capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    @Override
    public void InputInfor() {
        System.out.println("Please Enter Code : ");
        setCode(s.nextLine());
        System.out.println("Please Enter Name : ");
        setName(s.nextLine());
        System.out.println("Please Enter Capacity : ");
        setCapacity(Double.parseDouble(s.nextLine()));
        System.out.println("Please Enter Num : ");
        setNum(Integer.parseInt(s.nextLine()));
    }

    @Override
    public void DisplayInfor() {
        System.out.println("Code : "+getCode());
        System.out.println("Name : "+getName());
        System.out.println("Capacity : "+getCapacity());
        System.out.println("Num : "+getNum());
    }

    @Override
    public void ChangeInfor() {
        InputInfor();
    }
    
}
