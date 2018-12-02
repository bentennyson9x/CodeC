#include <bits/stdc++.h>
using namespace std;
string line;
string data;
int currentPointer ;
int mCount=0;
int factoryFindCodeOfStr(){
	string findThisString = "start:dataFrame1807:stop";
        currentPointer= data.find(findThisString,currentPointer);
	while (currentPointer!=-1){
		currentPointer = data.find(findThisString,currentPointer+1);
		mCount++;
	}
}
int factoryDisplayData(){
	cout<<"Data : \n";
	cout<<data<<endl;
}
int factoryDisplayResult(){
	cout<<"Result : ";
	cout<<mCount<<endl;
}
int factoryGlobalDisplay(bool choiceData, bool choiceResult){
	if (choiceData==true) 	factoryDisplayData();
	if (choiceResult==true) 	factoryDisplayResult();
}
int factoryReadFile(){
	fstream f;
	f.open("sample.txt", ios::in);
	while (!f.eof())
	{
		getline(f, line);
		data += line;
	}
	f.close();
}
int GlobalFactory(bool choiceFactoryReadFile,bool choiceFactoryFind, bool choiceFactoryDisplayResult, bool choiceFactoryDisplayData){
	if (choiceFactoryReadFile==true) factoryReadFile();
	if (choiceFactoryFind==true) factoryFindCodeOfStr();
	if (choiceFactoryDisplayData==true) factoryGlobalDisplay(true,false);
	if (choiceFactoryDisplayResult==true) factoryGlobalDisplay(false,true);	
}
int main (){
GlobalFactory(true,true,true,true);
return 0;
}

