#include<bits/stdc++.h>

using namespace std;

/*
 * 
 */
int result[100][100];// ket qua
 int testNumber;// so bo test
 int stepOfTest;// buoc test
int IntersectionSort(int a[], int n){
        for (int i=0;i<n;i++){
                for (int j=i;j<n;j++){
                        if (a[i]>a[j]) swap(a[i],a[j]);
                }
        }
}
void Display (){
        for (stepOfTest=0;stepOfTest<testNumber;stepOfTest++){
                cout<<result[stepOfTest][0]<<endl;
        }
    
}
int main(int argc, char** argv)
{
        
        int distanceMin;// khoang cach toi uu
        int locationStore[100];// vi tri cac cua hang
       	cout<<"Nhap so bo Test: ";
        cin>>testNumber;
        for (stepOfTest=0;stepOfTest<testNumber;stepOfTest++){
                int n;
                cout<<"Nhap so cua hang";
                cin>>n;// so cac cua hang muon den
                for (int i=0;i<n;i++){
                	cout<<"Nhap vao vi tri cua hang thu " <<i+1<<endl;
                        cin>>locationStore[i];
                }
                IntersectionSort(locationStore,n);
                distanceMin=abs(locationStore[n-1]-locationStore[0])*2;
                result[stepOfTest][0]=distanceMin;       
        }
          Display();
        return 0;
}
       
