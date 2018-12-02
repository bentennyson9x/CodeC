/* cho tam giac cac so nguyen duong co m hang, hang thu i co i cot
Tu mot o trong tam giac (i,j) ta co the di chuyen den mot trong cac o dong thu i+1 
la (i+1,j-1) (i+1,j) va (i+1,j+1) thuoc tam giac
Hay tim duong di co tong cac o di qua la lon nhat
tu dinh tam gia (1,1) den mot o bat ky thuoc canh doi dien(m,k) (1<=k<=m)*/
			
//			4
//			5
//			2 3
//			6 1 8
//			9 15 20 1


#include <bits/stdc++.h>

using namespace std;
const int Max = 1000;
const int t[3]={-1,0,1};
int n;
int a[Max][Max];
int d[Max][Max]; // luu gia tri qhd
int p[Max][Max]; // truy vet
void docfile(){
	ifstream in;
	in.open("input1.txt",ios::in);
	in >> n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			in >> a[i][j];
		}
	}
	in.close();
}
int GTLN(int i, int j){
	int tmp =0;
	for(int k=0;k<3;k++){
		int dt = j + t[k];
		if( tmp<d[i][dt] && dt>=1 && dt<=i) {
			tmp = d[i][dt];
		}
	}
	return tmp;
}
void QHD(){
	// hang 1 giu nguyen
	d[1][1] = a[1][1];
	
	// bat dau duyet tu hang 2
	for(int i=2;i<=n;i++){
		for(int j=1;j<=i;j++){
			d[i][j] = a[i][j] + GTLN(i-1,j);
			// luu vet
			for(int k=0; k<3;k++){
				if(GTLN(i-1,j) == d[i-1][j+t[k]]){
					p[i][j] = k;
				}
			}
		}
	}
}
void truyvet(){
	int tmp=0;
	int x, y;
	// tim max dong cuoi
	for(int i=1;i<=n;i++){
		if(tmp< d[n][i]){
			tmp = d[n][i];
			x = n;
			y = i;
		}
	}
	cout<< "("<<x<<","<<y<<") ";
	for(int i=n-1;i>1;i--){
		int tmp =0;
		int ty;
		for(int j=1;j<=i;j++){
			if(tmp < d[i][j] && abs(j-y)<=1){// tim max dong ap cuoi va dieu kien thong nhau
				ty = j;
				tmp = d[i][j];
			}
		}
		y = ty;
		x--;
		cout<< "("<<x<<","<<y<<") ";
	}
	cout<< "("<<"1"<<","<<"1"<<") ";
}
main(){
	docfile();
	QHD();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			cout << d[i][j]<<" ";
		}
		cout << endl;
	}
	truyvet();
}


