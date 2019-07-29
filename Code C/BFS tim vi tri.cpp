#include <bits/stdc++.h>
using namespace std;
int a[10000][10000];// ma tran chua cac dinh lien thong 
int m,n; // so dinh
bool xet[10000][10000];
int dx[]={0,1};
int dy[]={1,0};
queue <int > qx;
queue <int > qy;
int s=1;
int x,y;
int trace[10000];
vector <int> duongdi;
int Init(){
	fstream in;
	in.open("matrantimvitritraithang.txt",ios::in);
	in>>m>>n;
	in>>x>>y;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			in>>a[i][j];
		}
	}
}
int Trace(int x, int y, int x_pre, int y_pre){
	int ok=0;
	int count_pre=0,count_curr=0;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (i==x_pre&&j==y_pre) {
				ok=1;
				break;
			}
			count_pre++;
		}
		if(ok==1) break;
	}
	ok=0;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (i==x&&j==y) {
				ok=1;
				break;
			}
			count_curr++;	
		}
		if(ok==1) break;
	}
//	cout<<"x : "<<x<<" y : "<<y<<" x_pre :"<<x_pre<<" y_pre : "<<y_pre<<" count_cur : "<<count_curr<<" count_pre : "<<count_pre<<endl;
	trace[count_curr]=count_pre;
}
int PosMaxtrix(int x, int y){
	int count=0;
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (i==x&&j==y) return count;
			else count++;
		}
	}
	return 0;
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
        if(a[tmx][tmy]==2) {
        	cout<<" Da tim thay dinh co gia tri 2"<<endl;
        	int x = PosMaxtrix(tmx,tmy);
            duongdi.push_back(x+1);
        	while (x!=PosMaxtrix(x,y)){
        		x=trace[x];
        		duongdi.push_back(x+1);
			}
			reverse(duongdi.begin(),duongdi.end());
			 for(int i=0;i<duongdi.size();i++){
                if(i!=duongdi.size()-1) cout<<" Dinh : "<<duongdi[i]<<" ->";
                else cout<<" Dinh : "<<duongdi[i];
            }
			cout<<endl;
        	return 1;
		}
        for (int i=0;i<2;i++){
        int	tx=tmx+dx[i];
        int	ty=tmy+dy[i];
            if ( a[tx][ty]==1 || a[tx][ty]==2 && xet[tx][ty]==false && tx>=0&&tx<m&&ty>=0&&ty<n ){
            	qx.push(tx);
            	qy.push(ty);
            	xet[tx][ty]=true;
            	Trace(tx,ty,tmx,tmy);
			}
        }
    }
    cout<<"Khong tim thay"<<endl;
}
int main (){
	Init();
	BFS(x,y);
return 0;
}

