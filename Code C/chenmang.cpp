
#include<bits/stdc++.h>

using namespace std;

/*
 * 
 */
int TestNumber;
static int result[100][100];
static int a[100],b[100];
int n,m;
int p;
void Insert(){
      for (int i=p;i<m+p;i++){
      	a[i]=b[i-p];
	  }
}
void Spacing(){
	  for(int i=0;i<m+n;i++){
            if (i==p){
                    int j=i+m-1+(n-p);
                            for (int h=n-1;h>=i;h--){
                                    a[j]=a[h];
                                    j--;
                            }
                            break;
                    
            }
    }
}
int main(int argc, char** argv)
{
        cin>>TestNumber;
        for (int stepOfTest=0;stepOfTest<TestNumber;stepOfTest++){
                cin>>n>>m>>p;
                for (int i=0;i<n;i++){
                        cin>>a[i];
                }
                for (int i=0;i<m;i++){
                        cin>>b[i];
                }
                Spacing();
               	Insert();
                for (int i=0;i<m+n;i++){
                	result[stepOfTest][i]=a[i];
				}
        }
        for (int stepOfTest=0;stepOfTest<TestNumber;stepOfTest++){
        	cout<<"Test "<<stepOfTest<<":"<<endl;
      		for (int i=0;i<m+n;i++){
      			cout<<result[stepOfTest][i]<<" "; 
			  }
		  cout<<endl;
		}
        return 0;
}

