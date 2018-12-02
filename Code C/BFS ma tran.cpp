#include<bits/stdc++.h>

using namespace std;
int vs[100];
int a[100][100], n,q[100];
void bfs(int u){
	int v, cq,dq;
	dq = cq = 1;// cq la tap dinh ke voi dinh v
	q[cq] = u; vs[u]= 1; // tham dinh u
	while(dq<=cq){
		v = q[dq] ;
		dq++;
		cout <<" "<< v;
		for(int i=1;i<=n;i++){ // tim cac dinh ke voi dinh v
			if(!vs[i] and a[v][i]){
				cq++;
				q[cq] = i;
				vs[i] = 1;
			}
		}
	}
}
main(){
	fstream in;
	in.open("DFSThanhPhanLienThong.txt",ios::in);
	in>>n;
	for (int i=1;i<=n;i++){
		for (int j=1;j<=n;j++ ){
			in>>a[i][j];
		}
	}
	bfs(9);
}

