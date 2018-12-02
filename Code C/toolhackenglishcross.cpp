// CÓ NH?NG TH? CH? ??N 1 L?N THÔI. VÌ TH? MÀ NÓ TR? NÊN ??C BI?T
#include <bits/stdc++.h>
using namespace std;
int a[10000], b[10000], n, k, stop = 0, stop1 = 0;
string c;

void khoitao() {
    for (int i = 1; i <= k; i++) {
        a[i] = i;
        b[i] = i;
    }
}

void in() {
    for (int i = 1; i <= k; i++)
        {
        	 cout <<c.at(a[b[i]]-1);
		}
		  cout << endl;

}

void sinhhv() {
    int i = k - 1, m = k;
    while (i > 0 && b[i] > b[i + 1]) i--;
    while (b[m] < b[i]) m--;
    if (i == 0) stop1 = 1;
    swap(b[m], b[i]);
    m = k;
    i++;
    while (i < m) {
        swap(b[i], b[m]);
        i++;
        m--;
    }
}

void sinh() {
    int i = k;
    while (a[i] == n - k + i&&i>0) i--;
    if (i == 0) stop = 1;
    else a[i]++;
    int p = a[i];
    while (i <= k) a[i++] = p++;
}

void next() {
    while (stop == 0) {
        while (stop1 == 0) {
            in();
            sinhhv();
        }
        stop1 = 0;
        for (int i = 0; i <= k; i++) b[i] = i;
        sinh();
    }

}

main() {
    string choice;
    do{
        fflush(stdin);
        cout<<"Nhap so tu: ";
    cin >> n;
    cout<<"Nhap so chu hien thi: ";
    cin>> k;
    cout<<"Nhap tu cua ban: ";
    fflush(stdin);
    getline(cin,c);
    khoitao();
    next();
    cout<<"Ban muon thu lai khong ( ok || no )"<<endl;
    fflush(stdin);
    getline(cin,choice);
    stop=0;
    stop1=0;
    }while(choice=="ok");
} 
