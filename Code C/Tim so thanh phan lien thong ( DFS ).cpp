#include <bits/stdc++.h>
using namespace std;
// cho 1 ma tran, neu do thi lien thong thi so thanh phan lien thong la 1
// neu 1 do thi khong lien thong co the phan ra thanh g do thi lien thong
int a[10000][10000];// ma tran chua cac dinh lien thong 
int n; // so dinh
bool xet[1000000];
int Init(){
	fstream in;
	in.open("DFSThanhPhanLienThong.txt",ios::in);
	in>>n;
	for (int i=1;i<=n;i++){
		xet[i]=true;
		for (int j=1;j<=n;j++ ){
			in>>a[i][j];
		}
	}
	for (int i=1;i<=n;i++){
		for (int j=1;j<=n;j++){
			cout<<a[i][j]<<"  ";
		}
		cout<<endl;
	}
}
int DFS( int u ){
	xet[u]=false;
	cout<<u<<" ";
	for (int i=1;i<=n;i++){
		if (a[u][i]==1&&xet[i]==true){
			xet[i] =false;
			DFS(i);
		}
	}
}
int main (){
Init();
DFS(1);
//int solt=0;
//for (int i=1;i<=n;i++){
//	if (xet[i]==true){
//		DFS(i);
//		solt++;
//	}
//}

//cout<<solt<<endl;
return 0;
}

