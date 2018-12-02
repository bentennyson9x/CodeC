#include <bits/stdc++.h>
using namespace std;
queue <int > q;
bool xet[100];
int n;
int a[100][100];
int s=1;
int ok=0;
 int dem=0;
int Init(){
	memset(xet,false,100);
		fstream in;
	in.open("DFSThanhPhanLienThong.txt",ios::in);
	in>>n;
	for (int i=1;i<=n;i++){
		for (int j=1;j<=n;j++ ){
			in>>a[i][j];
		}
	}
}
int BFS( int u ){
    int temp;
    q.push(u);
    xet[u] = true;
    while(q.empty()!=1 ){
        temp = q.front();
        q.pop();
        for (int i=1;i<=n;i++){
            if (xet[i]==false&&a[temp][i]==1){
                xet[i]=true;
                q.push(i);
                //cout<<"\n"<<i<<" .. "<<endl;
            }
        }
        if (q.empty()&&s==n) {
        	ok=1;
        	break;
		}
          cout<<" "<<temp;
       
    }
    s=temp+1;
}
int main (){
Init();
while (s<=n){
    if (q.empty()){
        BFS(s);
         if (ok==1) break;
        dem++;
       
        cout<<"\n";
    }
}
        cout<<" so thanh phan lien thong :  "<<dem<<"\n "<<endl;
return 0;
}
