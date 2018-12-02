#include<bits/stdc++.h>
using namespace std;
 int chiPhi = 0;
int numberOfCity;
 int MinChiPhi = 100000000;
static int X[100];
static bool Test[100];
static int GiaTienTungThanhPho[100][100];
 int cmin=0;

//int TinhToan(int k)
//	{
//	chiPhi = 0;
//	for (int i = 1; i <= k; i++)
//		{
//		if (i == numberOfCity)
//			{
//			chiPhi += GiaTienTungThanhPho[X[i]][1];
//			}
//		else
//			{
//			chiPhi += GiaTienTungThanhPho[X[i]][X[i + 1]];
//			}
//		}
//
//	return chiPhi;
//	}
//void Display()
//	{
//	for (int i=1; i<=numberOfCity; i++)
//		{
//		cout<<X[i];
//		}
//	cout<<endl;
//	}

int Try(int i)
	{
	for (int j = 1; j <= numberOfCity; j++)
		{
		if (Test[j] == false)
			{
			X[i] = j;
			if (X[1] == 2)
				{
				return 0;
				}
			Test[j] = true;
			chiPhi+=GiaTienTungThanhPho[X[i-1]][j];
			if (i==numberOfCity)
				{
				//	Display();
				if (chiPhi+GiaTienTungThanhPho[j][1]<MinChiPhi)
					MinChiPhi=chiPhi+GiaTienTungThanhPho[j][1];
				}
			else if (MinChiPhi>chiPhi+(numberOfCity-i+1)*cmin)
				{
				Try(i+1);
				}
			chiPhi-=GiaTienTungThanhPho[X[i-1]][j];
			Test[j]= false;
			}
		}
	return 0;
	}

main()
	{
//	for (int i=0; i<15; i++)
//		{
//		Test[i]=true;
//		}
	cin>>numberOfCity;
	for (int i = 1; i <= numberOfCity; i++)
		{
		for (int j = 1; j <= numberOfCity; j++)
			{
			cin>>GiaTienTungThanhPho[i][j];
			if (i==1&&j==2)
				{
				cmin=GiaTienTungThanhPho[i][j];
				}
			if (cmin>GiaTienTungThanhPho[i][j]&&GiaTienTungThanhPho[i][j]!=0) cmin=GiaTienTungThanhPho[i][j];
			}
		}
	Try(1);
	cout<<MinChiPhi;
	}

