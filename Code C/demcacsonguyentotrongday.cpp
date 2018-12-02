#include<bits/stdc++.h>

using namespace std;

/*
 * 
 */
 int a[100];
 int b[100];
 static int result [100][100];
        int n;
        int testNumber;
int CheckPrimeNumber( int a ){
        if (a==1) return 0;
        for (int i=2;i<a;i++ ){
                if (a%i==0) return 0;
        }
        return 1;
}
int main(int argc, char** argv)
{
        cin>>testNumber;
        cin>>n;
int countResult=0;
        for (int j=1;j<=testNumber;j++){
                countResult=0;
                           for (int i=0;i<n;i++){
                cin>>a[i];
        }
        for (int i=0;i<n;i++){
                if (CheckPrimeNumber(a[i])) {
                        b[countResult]=a[i];
                        countResult ++ ;
                } 
        }
                           for (int i=0;i<countResult;i++){
                                   for(int h=i;h<countResult;h++){
                                           if (b[i]>b[h]) swap(b[i],b[h]);
                                   }
                           }
           for (int i=0;i<countResult;i++){
                   result[j][b[i]]++;
           }        
        }
        for (int j=1;j<=testNumber;j++){
                 cout<<"Test "<<j<<" : "<<endl;
                 for (int i=0;i<countResult;i++){
                                   if (b[i]!=b[i+1])  cout<<b[i]<<" xuat hien "<< result[j] [b[i]]<<" lan"<<endl;
                           }
        }
        return 0;
}
 
