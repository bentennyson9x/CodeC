#include <bits/stdc++.h>
using namespace std;
int a[100][100];
int m,n;
int dx[]={0,1,0,-1};
int dy[]={1,0,-1,0};
static bool xet[100][100];
void docfile(){
	fstream in;
	in.open("DFS_tim_so_bai_co.txt",ios::in);
	in>>m>>n;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			in>>a[i][j];
		}
	}
	}

int DFS( int x , int y ){
	xet[x][y]= true;

	for (int i=0;i<4;i++){
			int tx = x + dx[i];
			int ty = y + dy[i];
			if(a[tx][ty]==1&&xet[tx][ty]==false&&tx>=0&&ty>=0&&tx<m&&ty<n){
			DFS(tx,ty);		
		}
	}
}
int main (){
	docfile();
	int count=0;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (a[i][j]==1&&xet[i][j]==false){
				DFS(i,j);
				count++;
			}
		}
	}
	cout<<count<<endl;
return 0;
}

