#include <iostream> 
#include <iomanip>
 #define MAX 100 
 int X[MAX], n, k, dem=0; bool OK = true;
  using namespace std;
   void Init(void){ //thi?t l?p t?p con d?u tiên 
   cout<<"\n Nh?p n, k:"; cin>>n>>k;   for(int i=1; i<=k; i++)  //t?p con d?u tiên là 1, 2, .., k
    X[i] = i; 
	}
	void Result(void){ //dua ra t?p con hi?n t?i 
	 cout<<"\n K?t qu? "<<++dem<<":"; 
	   for(int i=1; i<=k; i++) //dua ra X[] =( x1, x2, .., xk)       
	    cout<<X[i]<<setw(3);
		 }
		  void Next_Combination(void){ //sinh t?p con k ph?n t? t? t?p con b?t k?  
		   int i = k; //duy?t t? v? trí bên ph?i nh?t c?a t?p con 
		     while(i>0 && X[i]== n-k+i) //tìm i sao cho xi ? n-k+i      
			   i--;    if (i>0){//n?u chua ph?i là t?p con cu?i cùng  
			     X[i]= X[i]+1; //thay d?i giá tr? t?i v?  trí i: xi = xi +1;    
				  for(int j=i+1; j<=k; j++) //các v? trí j t? i+1,.., k      
				     X[j] = X[i] + j - i; // du?c thay d?i là xj = xi +j - i;  
					  }       else OK = false; //ta k?t thúc duy?t
					   } 
					   int main(void){    
					   Init(); //kh?i t?o c?u hình d?u tiên  
					    while(OK){ //l?p trong khi c?u hình chua ph?i cu?i cùng 
						   Result(); //dua ra c?u hình hi?n t?i  
						     Next_Combination(); //sinh ra c?u hình k? ti?p   
							 } 
							 } 
