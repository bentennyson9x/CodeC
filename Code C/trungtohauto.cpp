#include <bits/stdc++.h>
using namespace std;
// chuyen bieu thuc trung to sang hau to, phien ban day du va mo rong ( advanced ).
// dung string str de luu bieu thuc trung to dau vao,
// nhom cac phan tu cua toan hang lai thanh toan hang da du ( nhieu con so ).
// xu li va xuat ra man hinh/ ghi ra file.
int uT( char c ){ // tra ve muc do uu tien cua cac toan tu
	if( c == '(') return 0;
	if( c == '+' || c == '-' ) return 1;
	if( c == '*' || c == '/' || c == '%' ) return 2;
	if( c == '^' ) return 3;
}

void hauTo(){ // chuyen bthuc trung to sang hau to.
	stack<char> s;
	string str, str1 = "";
	int i = 0;
	getline(cin, str);
	while( i < str.length() ){
		char c = str.at(i);
		if( c != ' ' ){
			if( c - '0' >= 0 && c - '0' <= 9 || isalpha(c) ) str1 += c;
			else{
				cout<< str1;
				str1 = "";
				if( c == '(') s.push(c);
				else{
					if( c == ')') {
						while( s.top()!= '('){
							cout<< s.top();
							s.pop();
						}
						if(s.top() == '(' ) s.pop();
					}
					else{
						while( !s.empty() && uT(c) <= uT(s.top())){
							cout<< s.top();
							s.pop();
						}
						s.push(c);
					}
				}
			}
		}
		i++;
	}
	if( str1 != "" ) cout<< str1;
	while(!s.empty()){
		if(s.top()!= '(') cout<< s.top();
		s.pop();
	}
}

int main(){
	hauTo();
	return 0;
}

