#include<bits/stdc++.h>
#include<iomanip>
using namespace std;
static float a[100],d;
int Init()
	{
	cin>>d;
	for (int i=0; i<=d; i++)
		{
		cin>>a[i];
		}
	}
double Solve (double x)
	{
	double s=0;
	for (int i=0; i<=d; i++)
		{
		s+=a[i]*pow(x,i);
		}
	return s;
	}
int BinarySearch ()
	{
	double left=-1000000, right=1000000, mid=(left+right)/2, mark=0;
	while(Solve(left)!=0)
		{
		if (Solve(left)*Solve(right)<0)
			{
			mark=left;
			left = mid ;
			}
		else if (Solve(left)*Solve(right)>0)
			{
			left=mark;
			right=mid;
			}
		mid =(left+right)/2;
		}
	return left*1000;
	}
int main()
	{
	Init();
//BinarySearch();
	cout<<BinarySearch()<<endl;

	}

