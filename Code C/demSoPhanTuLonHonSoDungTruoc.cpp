#include<bits/stdc++.h>
using namespace std;
static int a[100];
int n;
int Check(){
	int count=1;
	for (int i=1;i<n;i++){
		if (a[i]>=a[i-1]) count++;
	}
	return count;
}
int main()
{ int TestNumber;
cin>>TestNumber;
for (int stepOfTest=0;stepOfTest<TestNumber;stepOfTest++){
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>a[i];
		
	}
	cout<<Check()<<endl;
}

}

