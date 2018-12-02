#include <bits/stdc++.h>

using namespace std;

int n, a[100][100];
int cx[100][100];
int dx[]={0,1,0,-1};
int dy[]={1,0,-1,0};
int dt;
int dem=0;
int tx, ty;
int dtmax =0 ;
int ht[100][100];
void doc(){
	fstream fs;
	fs.open("DFS_tim_so_bai_co.txt",ios::in);
	if(fs!=NULL){
		fs>> n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				fs>> a[i][j];
			}
		}
	fs.close();
	} 
	else{
		cout << "khong doc duoc file";
	}	
}

void dfs(int u, int v){
	cx[u][v]=1;
	for(int i=0;i<4;i++){
		tx = u + dx[i];
		ty = v + dy[i];
		if(tx>=1 && tx <=n && ty >=1 && ty <=n && cx[tx][ty]==0 && a[tx][ty]){
			dfs(tx, ty);
		}
	}
	
}
main(){
	doc();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			cx[i][j]= 0;
		}
	}
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(cx[i][j]==0 && a[i][j]){
				dem++;
				dfs(i,j);
				
			}
		}
	}
	cout <<"so bai co: "<<dem<<endl;
	
	
}

