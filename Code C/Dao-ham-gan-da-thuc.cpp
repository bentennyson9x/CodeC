#include<iostream>
#include<string>
using namespace std;
struct daThuc{
	int n; // bac cua daThuc
	float *heso;
};
void nhap(daThuc &a){
	cout << "Nhap so mu cua da thuc ";
	cin >> a.n;
	a.heso= new float;
	for(int i=0;i<=a.n;i++){
		cout << "Nhap he so cua x^"<<i<<": ";
		cin >> a.heso[i];
	}
}
void xuat(daThuc a){
	cout <<endl;
	for(int i=0;i<=a.n;i++){	
		if(a.heso[i]==0){
			continue;
		}
		else{
			if(i==a.n){
				if(i==0) cout <<a.heso[i];
				else if(i==1) cout <<a.heso[i]<<"x";
				else cout <<a.heso[i]<<"x^"<<i;
			}
			else{
				if(i==0) cout <<a.heso[i]<<"+";
				else if(i==1) cout <<a.heso[i]<<"x"<<"+";
				else cout <<a.heso[i]<<"x^"<<i<<"+";
			}	
		}			
	}
}
int mu(int x,int i){// tinh luy thua
	if(i==0) return 1;
	else{
		return(x*mu(x,i-1));
	}	
} 
int tinh(daThuc a){ // tinh da thuc voi X0
	cout <<endl<< "nhap gia tri cua x0 can tinh: ";
	int x; cin >> x;
	int sum=0;
	for(int i=0;i<=a.n;i++){
		sum+= a.heso[i]*mu(x,i);
	}
	return sum;
}

int daoHam(int heso,int i){
	int tmp=0;
	return tmp+=heso*i;
}
void daoHamdathuc(daThuc &a,daThuc &temp){
	for(int i=0;i<=a.n;i++){ // 4x^3+3x^2+3x+1        12x^2+6x+3
		a.heso[i] = daoHam(a.heso[i],i);// a[0]=0 a[1]=3 a[2]=6 a[3]=12
	}
	temp.n = a.n-1; //bac cua da thuc temp = bac cua da thuc a-1
	temp.heso= new float[temp.n+1];// cap phat dong bo nho 
	for(int i=0;i<=temp.n;i++){
		temp.heso[i] = a.heso[i+1];
	}
}

void cong(daThuc a,daThuc b,daThuc &p){
	if(a.n<b.n){
		p.n = b.n; // bac bang bac cua da thuc co bac cao hon
		p.heso= new float[p.n+1];
		for(int i=0;i<=p.n;i++){
			if(i<=a.n){
				p.heso[i] = a.heso[i] + b.heso[i];
			}
			else{
				p.heso[i] = b.heso[i];
			}
		}
	}
	else{
		p.n = a.n; // bac bang bac cua da thuc co bac cao hon
		p.heso= new float[p.n+1];
		for(int i=0;i<=p.n;i++){
			if(i<=b.n){
				p.heso[i] = a.heso[i] + b.heso[i];
			}
			else{
				p.heso[i] = a.heso[i];
			}
		}
	}
}
daThuc tru(daThuc a,daThuc b){
	daThuc p;
	if(a.n<b.n){
		p.n = b.n; // bac bang bac cua da thuc co bac cao hon
		p.heso= new float;
		for(int i=0;i<=p.n;i++){
			if(i<=a.n){
				p.heso[i] = a.heso[i] - b.heso[i];
			}
			else{
				p.heso[i] = -b.heso[i];
			}
		}
		return p;
	}
	else{
		p.n = a.n; // bac bang bac cua da thuc co bac cao hon
		p.heso= new float[p.n+1];
		for(int i=0;i<=p.n;i++){
			if(i<=b.n){
				p.heso[i] = a.heso[i] - b.heso[i];
			}
			else{
				p.heso[i] = a.heso[i];
			}
		}
		return p;
	}
}
void tich(daThuc a, daThuc b, daThuc &c ){
	c.n = b.n + a.n; // bac cua da thuc Tich la tong cua bac a + b
	c.heso = new float[c.n+1];
	for(int i=0;i<=c.n;i++) c.heso[i]=0;
	for(int i=0;i<=b.n;i++){
		for(int j=0;j<=a.n;j++){
			c.heso[i+j] += b.heso[i] * a.heso[j];
			cout << c.heso[i+j]<< endl;
		}
	}
}
daThuc nhanso(daThuc &a,float k){
	for(int i=0;i<=a.n;i++){
		a.heso[i] = a.heso[i] * k ;
	}
	return a;
}
int findBac(daThuc a){
	for(int i=a.n; i>=0 ;i--){
		if(a.heso[i] != 0){
			return i;
		}
	}
	return 0;
}
daThuc chia(daThuc a, daThuc b){
	// daThuc c de luu thuong
	daThuc tmp, c = a;// luu hieu
	
	tmp.heso = new float;
	
	
	int mu = a.n; 
	while(mu >= b.n){	
		
		float hs =c.heso[mu] / b.heso[b.n];
		
		tmp = nhanso(b,hs);
		xuat(tmp); break;
		c = tru(c,tmp);
//		xuat(c); break;
		mu = findBac(c);

 	}
//	return c;
}

main(){
//	int lc;
//	while(lc){
//		cout << "1.Nhap da thuc a. "<< endl;
//		cout << "2.Nhap da thuc b. "<< endl;
//		cout << "3.Tinh a + b. "<< endl;
//		cout << "4.Tinh a voi x0. "<< endl;
//		cout << "5.Dao ham a."
//		cout << "6.Thoat."<< endl;
//	}
 	daThuc a,b,p;
 	nhap(a);

 	nhap(b);
 	chia(a,b);
// 	xuat(chia(a,b));
// 	xuat(tru(a,b));
	
// 	daThuc tmp = a;
//	tru(a,b,p);
//	tich(a,b,p);
// 	xuat(a);
// 	cout << tinh(a); // tinh da thuc a voi x0
//	int l;
//	cout<<endl<<"Nhap so lan muon dao ham L<=N: ";
//	cin >> l;
//	for(int i=0;i<l;i++){
//	daoHamdathuc(tmp,p);
//	tmp=p;
//	}
//	xuat(p);// da thuc sau khi da dao ham L lan

}

