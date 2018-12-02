#include<bits/stdc++.h>
using namespace std;
int main()
{ 
static int n,f,l;
cin>>n;
if (n<10) cout<<n<<" "<<n;
else {
	f=n%10;
while (n>0){
	l=n%10;
	n/=10;
}
cout<<l<<" "<<f;
}
}

