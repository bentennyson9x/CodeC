#include <bits/stdc++.h>
using namespace std;
int a[10000][10000];// ma tran chua cac dinh lien thong 
int m,n; // so dinh
bool xet[10000][10000];
int dx[]={0,1,0,-1};
int dy[]={1,0,-1,0};
queue <int > qx;
queue <int > qy;
int s=1;
int Init(){
	fstream in;
	in.open("DFS_tim_so_bai_co.txt",ios::in);
	in>>m>>n;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			in>>a[i][j];
		}
	}
}
int BFS(int x, int y){
	int tempx,tempy;
    qx.push(x);
    qy.push(y);
    xet[x][y] = true;
    while(qx.empty()!=1){
    	int tmx = qx.front();
    	int tmy = qy.front();
        qx.pop();
        qy.pop();
        for (int i=0;i<4;i++){
        int	tx=tmx+dx[i];
        int	ty=tmy+dy[i];
            if ( a[tx][ty]==1 && xet[tx][ty]==false && tx>=0&&tx<m&&ty>=0&&ty<n ){
            	qx.push(tx);
            	qy.push(ty);
            	xet[tx][ty]=true;
			}
        }
    }
}
int main (){
	Init();
int count=0;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (a[i][j]==1&&xet[i][j]==false){
				BFS(i,j);
				count++;
			}
		}
	}
	cout<<count<<endl;
return 0;
}

