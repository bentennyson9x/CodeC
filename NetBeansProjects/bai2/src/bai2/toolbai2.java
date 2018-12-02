
package bai2;


public class toolbai2 extends PhanSo{
    public void y13(){ // in ra so nghich dao
        for(int i=100;i<=999;i++){
            String s;
            s = String.valueOf(i);
            String dao = new StringBuffer(s).reverse().toString();                              
            System.out.print(" "+s+dao);
//            String string = String.valueOf(i);
//            String reverse = new StringBuffer(string).reverse().toString();
//            System.out.println("\nString before reverse:"+string);
//            System.out.println("String after reverse:"+reverse);
//  https://vietjack.com/bai_tap_java/dao_nguoc_string_trong_java.jsp vi du :)
        }
        System.out.println("");
    }
    
    public  void in(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }
    
    public void y18(int n, int i, int a[]){ // liet ke xau nhi phan do dai n
        for(int k=0;k<=1;k++){
            a[i] = k;
            if(i==n-1){
                in(a,n);
            }
            else{
                y18(n,i+1,a);
            }
        }
    }
    //---------chinh hop chap k cua n-------------
//    public void y19(int a[], int n, int k, int i, int x[]){ // in ra tap con k phan tu ( to hop chap k cua n)
//        if(i==k){
//            in(a,k);
//        }
//        for(int j=1;j<=n;j++){
//            if(x[j]==0){
//                a[i] = j;
//                x[j] = 1;
//                y19(a, n, k, i+1, x);
//                x[j] = 0;
//            }
//        }
//    }
    
    public  void in1(int a[],int n){
        for(int i=1;i<=n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }
    public void y19(int a[], int n, int k, int i){
        if(i==k+1){
            in1(a, k);
        }
        else{
            for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            
            y19(a, n, k, i+1);
        }
        }
        
    }
}
