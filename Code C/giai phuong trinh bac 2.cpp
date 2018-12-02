#include<bits/stdc++.h>
using namespace std;
int main()
{ int a,b,c;
cin>>a>>b>>c;
float delta=b*b-4*a*c;
if (delta<0) cout<<"NO";
else if (delta ==0 ) cout<<fixed<<setprecision(2)<<(float)(-b)/(2*a);
else if (delta>0) cout <<fixed<<setprecision(2)<<(-b+sqrt(delta))/(2*a)<<" "<<fixed<<setprecision(2)<<(-b-sqrt(delta))/(2*a);
}

