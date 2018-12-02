#include<bits/stdc++.h>

using namespace std;

struct Edge{
	int u, v;
	int c;
};
int n, m;
int par[100];
Edge edge[100];

void docfile(){
	fstream in;
	in.open("inkruskal.txt",ios::in);
	in >> n >> m;
	for(int i=1; i<=m; i++){
		in >> edge[i].u >> edge[i].v >> edge[i].c;
	}
}
void sapxep(){
	for(int i=1; i<=m; i++){
		for(int j=i+1; j<=m; j++){
			if(edge[i].c > edge[j].c){
				swap(edge[i],edge[j]);
//				swap(edge[i].u,edge[j].u);
//				swap(edge[i].v,edge[j].v);
//				swap(edge[i].c,edge[j].c);
			}
		}
	}
}
int root(int v){
	if(par[v]<0){
		return v;
	}
	else{
		return	par[v] = root(par[v]);
	}
}
int merge(int x, int y){
	x = root(x);
	y = root(y);
	if( x == y) return -1;
	if(par[y] < par[x]){
		swap(x,y);
	}
	par[x] += par[y];
	par[y] = x; 
	return 1;
}
int kruskal(){
	int dt = 0;
	for(int i=1; i<=m; i++){
		if(merge(edge[i].u,edge[i].v)>0){
			dt += edge[i].c;
		}
			for(int j=1; j<=i; j++){
		root(j);
	}
		
	}
	return dt;
}
main(){
	for(int i=1; i<=10; i++) par[i] =-1;
	docfile();
	sapxep();
	cout << kruskal()<<endl;

	for(int i=1; i<=m; i++){
		cout << edge[i].u << edge[i].v <<" gia tri "<< edge[i].c << endl;
	}
		for(int j=1; j<=m; j++){
		cout <<par[j]<< endl;
	}
	
}
