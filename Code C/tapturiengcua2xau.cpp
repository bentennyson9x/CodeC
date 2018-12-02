#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
/*
2
abc ab ab ab abdc
ab abc
aaa xyz ab zzz abc dd dd abc
xyz dd ttt sas cdc
*/
void tachTu(vector<string> &a,string s){
	for(int i=0;i<s.length();i++){
		string x="";
		int j;
		if(i==0 or s[i]!=' '){
			for(j=i;j<s.length();j++){
				if(s[j]!=' ') x=x+s[j];
				else break;
			}
		a.push_back(x);
		i=j-1;
		}
	}
}
void show(vector<string>a,vector<string> b){
	vector<string> kq;
	for(int i=0;i<a.size();i++){
		bool ok=true;
		for(int j=0;j<kq.size();j++) if(kq[j]==a[i]) ok=false;
		for(int j=0;j<b.size();j++)
			if(a[i]==b[j]) {
				ok=false;
				break;
			}  
		if(ok) kq.push_back(a[i]);
	}
	sort(kq.begin(),kq.end());
	for(int i=0;i<kq.size();i++) cout<<kq[i]<<" ";
	cout<<endl;
}
int main(){
	int t;
	cin>>t;
	cin.ignore();
	while(t--){
		string a,b;
		vector<string> x;
		vector<string> y;
		getline(cin,a);
		getline(cin,b);
		tachTu(x,a);
		tachTu(y,b);
		show(x,y);
	}
	//for(int i=0;i<x.size();i++) cout<<x[i]<<" ";
}
