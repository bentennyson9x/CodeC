#include <bits/stdc++.h>
using namespace std;
int v[100],c[100];
int result;
int tempResult[100];
int n;
int count=0;
int xet(int v, int c){
	tempResult[count]= v-c;
	count++;
	tempResult[count]= v+c;
	count++;
}

int main (){
	
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>v[i]>>c[i];
	}
	for (int i=0;i<n;i++){
		xet(v[i],c[i]);
	}

return 0;
}

