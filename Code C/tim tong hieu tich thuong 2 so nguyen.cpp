#include<bits/stdc++.h>
using namespace std;
int main()
{ int a, b;
cin>>a>>b;
if (b==0) cout<<"0";
else
// printf ("%d %d %d %0.2f %d",a+b,a-b,a*b,(float)a/b,a%b);
cout<<a+b<<" "<<a-b<<" "<<a*b<<" "<<fixed<<setprecision(2)<<(float)a/b<<" "<<a%b;

}

