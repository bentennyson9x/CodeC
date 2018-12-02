/*DE BAI:
Dat nuoc co n thanh pho voi khoang cach giua cac TP duoc cho trong ma tran 2 chieu a[i,j]=0: khong co ket noi, a[i,j]>0: khoang cach tu TP i den TP j
Hay giup Tp do lap ke hoach xay dung tuyen duong sat ket noi cac tp sao cho tong chieu dai la nho nhat*/
#include<bits/stdc++.h>
using namespace std;
int n, a[100][100], cx[100];

void docfile() {
    ifstream ifs("input4.txt", ios::in);
    ifs>>n;
    cout << n << endl;
    for (int i = 1; i <= n; i++) {
        cx[i] = 0;
        for (int j = 1; j <= n; j++) {
            ifs >> a[i][j];
            if (a[i][j] == 0) a[i][j] = 50000;
            cout << setw(20) << a[i][j];
        }
        cout << endl;
    }
}
int S = 0;

void prim() {
    cx[1] = 1;
    int sc = 0, xx, yy;
    while (sc < n - 1) {
        int Min = 10000;
        for (int i = 1; i <= n; i++) {
            if (cx[i] == 1) {
                for (int j = 1; j <= n; j++) {
                    if (cx[j] == 0 && a[i][j] < Min) {
                        Min = a[i][j];
                        xx = i;
                        yy = j;
                    }
                }
            }
        }
        S += Min;
        sc++;
        cx[yy] = 1;
        cout << "(" << xx << "," << yy << ") -";
    }
}

int main() {
    docfile();
    cout << "TUYEN DUONG SAT KET NOI CAC TP LA:\n";
    prim();
    cout << " CO DO DAI DUONG DI LA: " << S << endl;
}