#include<bits/stdc++.h>

using namespace std;

/*
 * 
 */
int result[100][100];
 int testNumber;
 int stepOfTest;
int IntersectionSort(int a[], int n){
        for (int i=0;i<n;i++){
                for (int j=i;j<n;j++){
                        if (a[i]>a[j]) swap(a[i],a[j]);
                }
        }
}
void Display (){
        for (stepOfTest=0;stepOfTest<testNumber;stepOfTest++){
                cout<<result[stepOfTest][1]<<endl;
        }
        
}
int main(int argc, char** argv)
{
        
        int distanceMin;
        int a[100];
       
        cin>>testNumber;
        for (stepOfTest=0;stepOfTest<testNumber;stepOfTest++){
                int n;
                cin>>n;
                for (int i=0;i<n;i++){
                        cin>>a[i];
                }
                IntersectionSort(a,n);
                distanceMin=abs(a[n-1]-a[0])*2;
                result[stepOfTest][1]=distanceMin;
                Display();
        }
        
        return 0;
}
       