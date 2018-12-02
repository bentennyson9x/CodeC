
package bai2;
    import java.util.*;

public class Bai2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        toolbai2 tool = new toolbai2();
        while(true){
            System.out.println("13. Liet ke so thuan nghich. ");
            System.out.println("14. Thao tac voi phan so. ");
            System.out.println("15. Chuan hoa van ban. ");
            System.out.println("18. In xau nhi phan co do dai N. ");
            System.out.println("19.In ra to hop chap K cua N. ");
            System.out.print("Nhap lua chon cua ban: ");
            int lc;
            lc = in.nextInt();
            if(lc==0) break;
            switch(lc){
                case 13:{
                    tool.y13();
                    break;
                }
                case 14:{
                    PhanSo a = new PhanSo();
                    PhanSo b = new PhanSo();
                    System.out.print("Nhap tu so: ");
                    a.setTu(in.nextInt());
                    System.out.print("Nhap mau so: ");
                    a.setMau(in.nextInt());
                    System.out.print("Nhap tu so: ");
                    b.setTu(in.nextInt());
                    System.out.print("Nhap mau so: ");
                    b.setMau(in.nextInt());
                    System.out.print("Tong");
                    tool.view(tool.Sum(a, b));
                    System.out.print("Hieu");
                    tool.view(tool.Sub(a, b));
                    System.out.print("Tich");
                    tool.view(tool.Tich(a, b));
                    System.out.print("Thuong");
                    tool.view(tool.Thuong(a, b));
                    break;
                }              
                case 15:{
                    Paragraph x = new Paragraph();
                    String line="";
                    in.nextLine();
                    line = in.nextLine();
                    System.out.println(""+x.normalText(line));
                    break;
                }
                case 18:{
                    int n = 0 ;        
                    in.nextLine(); // nuot dau Enter
                    System.out.print("Nhap N: ");
//                    n = in.nextInt();
                    n = Integer.parseInt(in.nextLine());    
                    int a[] = new int[n];
                    tool.y18(n,0,a);
                    break;
                }
                //------------chinh hop chap k cua n------------
//                case 19:{
//                    int n = 0;
//                    int k=0;
//                    in.nextLine(); // nuot dau Enter
//                    System.out.print("Nhap N: ");
//                    n = Integer.parseInt(in.nextLine());  
//                    System.out.print("Nhap K: ");
//                    k = Integer.parseInt(in.nextLine());
//                    int a[] = new int[n];
//                    int x[] = new int[100]; // mang danh dau
//                    tool.y19(a, n, k, 0, x);
//                    break;
//                }
                case 19:{
                    int n, k;
                    in.nextLine();
                    System.out.print("Nhap N: ");
                    n = Integer.parseInt(in.nextLine());  
                    System.out.print("Nhap K: ");
                    k = Integer.parseInt(in.nextLine());
                    int a[] = new int[2000];
//                    a[0] =0;
                    tool.y19(a, n, k, 1);
                    break;
                }
                default:{
                    System.out.println("Khong co chuc nang nay nhap lai de. ");
                    break;
                }
            }
        }
    }
   
//   public static void main(String[] args){
//      int i =100;
//      String string = String.valueOf(i);
//      String reverse = new StringBuffer(string).
//      reverse().toString();
//      System.out.println("\nString before reverse:"+string);
//      System.out.println("String after reverse:"+reverse);
//   }

    
}
