#include <iostream> 
#include <iomanip>
 #define MAX 100 
 int X[MAX], n, k, dem=0; bool OK = true;
  using namespace std;
   void Init(void){ //thi?t l?p t?p con d?u ti�n 
   cout<<"\n Nh?p n, k:"; cin>>n>>k;   for(int i=1; i<=k; i++)  //t?p con d?u ti�n l� 1, 2, .., k
    X[i] = i; 
	}
	void Result(void){ //dua ra t?p con hi?n t?i 
	 cout<<"\n K?t qu? "<<++dem<<":"; 
	   for(int i=1; i<=k; i++) //dua ra X[] =( x1, x2, .., xk)       
	    cout<<X[i]<<setw(3);
		 }
		  void Next_Combination(void){ //sinh t?p con k ph?n t? t? t?p con b?t k?  
		   int i = k; //duy?t t? v? tr� b�n ph?i nh?t c?a t?p con 
		     while(i>0 && X[i]== n-k+i) //t�m i sao cho xi ? n-k+i      
			   i--;    if (i>0){//n?u chua ph?i l� t?p con cu?i c�ng  
			     X[i]= X[i]+1; //thay d?i gi� tr? t?i v?  tr� i: xi = xi +1;    
				  for(int j=i+1; j<=k; j++) //c�c v? tr� j t? i+1,.., k      
				     X[j] = X[i] + j - i; // du?c thay d?i l� xj = xi +j - i;  
					  }       else OK = false; //ta k?t th�c duy?t
					   } 
					   int main(void){    
					   Init(); //kh?i t?o c?u h�nh d?u ti�n  
					    while(OK){ //l?p trong khi c?u h�nh chua ph?i cu?i c�ng 
						   Result(); //dua ra c?u h�nh hi?n t?i  
						     Next_Combination(); //sinh ra c?u h�nh k? ti?p   
							 } 
							 } 
