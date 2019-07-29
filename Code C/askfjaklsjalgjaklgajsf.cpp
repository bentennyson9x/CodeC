#include <bits/stdc++.h>
using namespace std;
int main(){
int n;
cin>>n;
float sum=1;
for (int i=2;i<=n;i++){
sum+=(float)1/i;
}
cout<<sum<<endl;
}

