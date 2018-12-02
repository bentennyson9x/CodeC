#include<bits/stdc++.h>
using namespace std;
static int a[100][100];
static int result [100][100];
int Display(int n, int m)
	{
	for (int i=0; i<n; i++)
		{
		for (int j=0; j<m; j++)
			{
			cout<<result[i][j]<<" ";
			}
		cout<<endl;
		}
	}
int main()
	{
	static int m[100],n[100];
	int TestNumber;
	cin>>TestNumber;
	for (int step=0; step<TestNumber; step++)
		{
		cin>>n[step]>>m[step];
		for (int i=0; i<n[step]; i++)
			{
			for (int j=0; j<m[step]; j++)
				{
				cin>>a[i][j];
				}
			}
		int sum=0;
		int max=0;
		for (int i=0; i<n[step]; i++)
			{
			for (int j=0; j<m[step]; j++)
				{
				sum += a[i][j];
				}
			if (sum>max)
				{
				max=sum;
				}
			sum=0;
			}
		sum=0;
		for (int i=0; i<n[step]; i++)
			{
			for (int j=0; j<m[step]; j++)
				{
				sum+=a[i][j];
				}
			if (sum==max)
				{
				for (int h=i; h<n[step]; h++)
					{
					for (int k=0; k<m[step]; k++ )
						{
						a[h][k]=a[h+1][k];
						}
					}
				}
			sum=0;
			}
		sum=0;
		max=0;
		for (int i=0; i<m[step]; i++)
			{
			for (int j=0; j<n[step]-1; j++)
				{
				sum += a[j][i];
				}
			if (sum>max)
				{

				max=sum;
				}
			sum=0;
			}
		sum=0;
		for (int i=0; i<m[step]; i++)
			{
			for (int j=0; j<n[step]-1; j++)
				{
				sum+=a[j][i];
				}
			if (sum==max)
				{
				for (int h=i; h<m[step]; h++)
					{

					for (int k=0; k<n[step]-1; k++ )
						{
						a[k][h]=a[k][h+1];
						}
					}
				}
			sum=0;
			}
		for(int i=0; i<n[step]-1; i++)
			{
			for(int j=0; j<m[step]-1; j++)
				{
				result[i][j]=a[i][j];
				}
			}
		}
		for (int step=0;step<TestNumber;step++){
			cout<<"Test "<<step<<" : "<<endl;
			Display(n[step]-1,m[step]-1);
		}
	
	}

