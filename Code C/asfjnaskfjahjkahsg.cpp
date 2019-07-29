#include <bits/stdc++.h>
using namespace std;
int main(){ 
float DiemSV[50]; 
for (int i=0;i<50;i++){
	DiemSV[i]=(rand() / (float)RAND_MAX * 10); 
	cout<<"Diem sinh vien thu"<<i+1<< " la "<<DiemSV[i]<<endl; 
} 
float max=0;
for (int i=0;i<50;i++){
if (DiemSV[i]>max){
	max=DiemSV[i];
}
}
cout<<"Diem sinh vien lon nhat la"<<max<<endl; 

}

