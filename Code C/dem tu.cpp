#include <bits/stdc++.h>
using namespace std;
int main (){
	char a[1000];
	char b[1000][1000];
	gets(a);
	strlwr(a);
	int sotu=0;
	char *p = strtok(a," ");
	while (p!='\0'){
		strcpy(b[sotu],p);
		sotu++;
		p=strtok(NULL," ");
	}
	int max=0,dem=0;
	for (int i=0;i<sotu;i++){
		for (int j=i;j<sotu;j++){
			if (strcmp(b[i],b[j])==0){
				dem++;
			}
		}	
		if (dem>max) {
			max = dem;	
		}
			dem=0;
	}
	dem=0;
		for (int i=0;i<=sotu;i++){
		for (int j=i;j<=sotu;j++){
			if (strcmp(b[i],b[j])==0){
				dem++;
			}
		}
		if (dem==max) {
			cout<<b[i]<<" ";
			
		}
		dem=0;
	}
	cout<<max<<endl;
	
	

return 0;
}

