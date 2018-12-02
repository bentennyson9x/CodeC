#include <bits/stdc++.h>
#define oo 32676
using namespace std;
const int NMAX=100;
int a[NMAX][NMAX],n;
void Bellman_Ford(int u){
    for(int v=1;v<=n;v++){ // tim duong di ngan nhat tu dinh u den cac dinh con lai
        if(u!=v){
            int d[NMAX]; // d[v] la do dai duong di ngan nhat tu dinh u den v
            int truoc[NMAX];
            for(int i=1;i<=n;i++){
                d[i]=a[u][i]; //gan duong di ngan nhat tu u den i tam thoi la a[u][i]
                truoc[i]=u;
            }
            d[u]=0;
            int k=1;
            while(k<=n-2){ //Bellman_Ford can toi da n-2 vong lap, neu qua n-2 vong lap => ton tai chu trinh am
                for(int i=1;i<=n;i++){ // lap tren tap dinh i khac dinh goc de xem khoang cach tu dinh i den dinh goc co can thong 
                    if(i!=u){// qua thang dinh i hay khong. neu co thi cap nhat lai gia tri cho thang dang xet
                        for(int j=1;j<=n;j++){
                            if(d[j]>d[i]+a[i][j]){
                                d[j]=d[i]+a[i][j];
                                truoc[j]=i;
                            }
                        }
                    }
                }
                k++;
            }
            cout<<"Duong di ngan nhat tu dinh "<<u<<" den dinh "<<v<<" la: ";
            vector <int> duongdi;
            duongdi.push_back(v);
            int x=truoc[v];
            while(x!=u){
                duongdi.push_back(x);
                x=truoc[x];
            }
            duongdi.push_back(u);
            reverse(duongdi.begin(),duongdi.end());
            for(int i=0;i<duongdi.size();i++){
                if(i!=duongdi.size()-1) cout<<duongdi[i]<<"->";
                else cout<<duongdi[i];
            }
            cout<<". Do dai duong di: "<<d[v]<<endl;
        }
    }
}
int main(){
    fstream in;
    in.open("bellmalford.txt", ios::in);
    in>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            in>>a[i][j];
            if(a[i][j]==0) a[i][j]=oo;
        }
    }
    Bellman_Ford(1);
    return 0;
}