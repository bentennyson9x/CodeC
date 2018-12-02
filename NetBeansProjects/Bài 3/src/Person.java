
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Person{
    String Name;
    String Addr;
    int Age;

    public Person(String Name, String Addr, int Age) {
        this.Name = Name;
        this.Addr = Addr;
        this.Age = Age;
    }

    public Person() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
        public boolean equals( Object obj ){
            return (obj instanceof Person ) ? (this.getName()==((Person)obj).getName()):false;
        }
    public static void main(String[] args) {
        Person a= new Person("Khoi Nguyen", "Dinh Cong", 19);
        Person b = new Person("Hoang Khoi", "Dinh Cong", 9);
        List<Person> listPersons= new ArrayList<Person>();
        listPersons.add(a);
        listPersons.add(b);
        Person c = listPersons.get(1);
         listPersons.remove(new Person("Khoi Nguye","Dinh Cong", 21));
        System.out.println(""+c.getName()+" "+c.getAddr()+" "+c.getAge());
        for (Person i: listPersons){
            System.out.println(""+i.getName()+" "+i.getAddr()+" "+i.getAge());
        }
       
          
    }
}
