#include <bits/stdc++.h>
using namespace std;
int a[100],n,stop=0,smax=0;
int init(){
	cout<<"Enter n: ";
	cin>>n;
	for(int i=1;i<=n;i++){
		a[i]=i;
	}
}
int display(){
	for(int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int generateArray(){
	int i=n-1;
	while(i>=0&&a[i]==1){
		a[i]=0;
		i--;
	}
	if(i==-1) stop=1;
	else a[i]=1;
}
int generatePermunation(){
	    int i=n-1;     
		while(i>0&&a[i]>a[i+1])     i--;    
		 if(i==0) stop=1; 
		else 
			{   int k=n;   
				while(a[i]>a[k])   
				 k--;      
				 swap(a[k],a[i]);    
				 int c=n,r=i+1; 
				while(r<c)  
						 {   
							swap(a[c],a[r]);    
						 r++;c--;  
					       } 
					} 
}
int main(){
	init();
	while(stop!=1){
		display();
	//	generateArray();
		generatePermunation();
	}
}

