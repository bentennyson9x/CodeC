#include <bits/stdc++.h>
using namespace std;
int a[100][100], d[100], vs[100], p[100];
const int Max = 1000;
int start, end1; // khai bao dinh dau cuoi

int Infile() {
    fstream in;
    in.open("input-Dijsk.txt", ios::in);
    for (int i = 1; i <= 7; i++) {
        for (int j = 1; j <= 7; j++) {
            in >> a[i][j];
        }
    }
}
//dijktra lap tren tap dinh, tim ra dinh co duong di den dinh goc nho nhat
//roi cap nhat lai cho cac dinh con lai neu duong di den cac duong con lai dai hon 
int Dijsktra() {
    for (int i = 1; i <= 7; i++) {
        if (i != start) {
            d[i] = a[start][i];
            p[i] = start;
            vs[i] = 0;

        }
    } // khởi tạo
    while (true) {
        int dmin = Max;
        int u;
        for (int i = 1; i <= 7; i++) {
            if (d[i] < dmin && vs[i] == 0) {
                dmin = d[i];
                u = i;
            }
        }
        if (dmin == Max)return 0;//
        else {//
            vs[u] = 1;//
            for (int i = 1; i <= 7; i++) {// 
                if (vs[i] == 0 && d[i] > d[u] + a[u][i]) {// neu a->b < a->c->b thi cap nhat lai 1 lan
                    p[i] = u;//
                    d[i] = d[u] + a[u][i];//

                }//
            }//
        }

    }
}
int main(int argc, char** argv) {
    Infile();
    cin >>start>>end1;
    Dijsktra();
    cout <<d[end1]<<endl;
    int tmp =end1;
    cout << end1 <<" ";
    while(p[tmp]!=start){
        cout << p[tmp]<< " ";
        tmp = p[tmp];
    }
    cout << start<<endl;
    return 0;
}

