#include<bits/stdc++.h>

using namespace std;
string result [100];
main(){
	int n; // so bo test
	cin >> n;
	for(int j=0;j<n;j++){
		int kt = -1;
		string s;
		fflush(stdin);
		getline(cin,s);
		if(s.length()==1) result[j]="YES" ;
		else{
			if(s[0]-'0'<s[1]-'0'){
				kt = 1;// dk ktra day tang dan
				for(int i=1; i<s.length()-1; i++){
					if(s[i] - '0' > s[i+1]- '0'){
						result[j]="NO";
						kt = 0;
						break;
					}
				}
				if(kt == 1) result[j]= "YES";
			} 
			else {
				kt = 0; // dk ktra day giam dan
				for(int i=1; i<s.length()-1; i++){
					if(s[i] - '0' < s[i+1]- '0'){
						result[j]= "NO";
						kt = 1;
						break;
					}
				}
				if(kt == 0) result[j]= "YES";
			}
			
		}
	}
	for (int j=0;j<n;j++){
		cout<<result[j]<<endl;
	}		
}
