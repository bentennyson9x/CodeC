package vehical;

/**
 *
 * @author Lab06
 */
public class SinhVien implements Comparable<SinhVien> {

    String Name;
    int Age;

    public SinhVien() {
    }

    public SinhVien(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public int compareTo(SinhVien o) {
         return (this.Age>o.getAge())? 1: (this.Age==o.getAge())? 0: -1; 
    }
    
}