// CÓ NH?NG TH? CH? ??N 1 L?N THÔI. VÌ TH? MÀ NÓ TR? NÊN ??C BI?T //
#include <bits/stdc++.h>
#include <vector>
using namespace std;
long long n;
vector < long long > a;
long long dem = 0;
int Try(long long s, long long b) {
    if (s > n) {
        return 0;
    }
    for (int j = 0; j <= 1; j++) {       
        long long temp = s; // luu lai gia tri cua s
        s = s + j;
        if (s==0||s>n) continue;
        dem++;
       // cout<<s<<" "<<dem<<" "<<endl;
       Try(s*10,b);
        s=temp;// cap nhat lai s
    }	
}
int main(int argc, char** argv) {
    cin>>n;
    Try(0,n);
    cout<<dem<<endl;
    return 0;
}


