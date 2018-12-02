#include <bits/stdc++.h>
using namespace std;
string line;
string data;
int currentPointer ;
int count;
int  readFile(){
	fstream f;
	f.open("sample.txt", ios::in);
	while (!f.eof())
	{
		getline(f, line);
		data += line;
	}
	f.close();
	cout << data;
}
int findCodeOfStr(){
	string findThisString = "start:dataFrame1807:stop";
	
        currentPointer= data.find(findThisString,currentPointer);
        if (currentPointer!=data.npos) count++;
	while (currentPointer!=data.npos){
		currentPointer = data.find(findThisString,currentPointer+1);
		count++;
	}
	cout<<count<<endl;
}
int main (){
readFile();

	
return 0;
}
