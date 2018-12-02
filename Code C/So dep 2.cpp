#include<bits/stdc++.h>
using namespace std;
int KTCCSLSNT(int n  ){
	n=n-48;
	if (n==1) return 0;
	for (int i=2;i<n;i++){
		if (n%i==0) return 0;
	}
	return 1;
}
int KTSTN(char n[]){
	char temp[100000];
	for (int i=0;i<strlen(n);i++){
		if (KTCCSLSNT(n[i])) temp[i]=n[strlen(n)-i-1];
		else return 0;
	}
	if(strcmp(temp,n)==0) return 1;
	return 0;
}
int main()
{ 
string result[100];
int TestNumber;
cin>>TestNumber;
char n[100000];
for (int step=0;step<TestNumber;step++){
	fflush(stdin);
	gets(n);
	if (KTSTN(n)) result[step] = "YES";
	else result[step]="NO";
}
for(int step=0;step<TestNumber;step++){
	cout<<result[step]<<endl;
}


}

