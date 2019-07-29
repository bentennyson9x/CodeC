#include <bits/stdc++.h>
using namespace std;
void traodoi(int& x, int& y);
 
int main ()
{
   // Khai bao bien cuc bo:
   int a = 100;
   int b = 200;
 
   cout << "Truoc khi trao doi, gia tri cua a la: " << a << endl;
   cout << "Truoc khi trao doi, gia tri cua b la: " << b << endl;
 
   /* goi mot ham de trao doi cac gia tri.*/
   traodoi(a, b);
 
   cout << "Sau khi trao doi, gia tri cua a la: " << a << endl;
   cout << "Sau khi trao doi, gia tri cua b la: " << b << endl;
 
   return 0;
}
 
// phan dinh nghia ham de trao doi cac gia tri.
void traodoi(int &x, int &y)
{
   int temp;
   temp = x; /* luu tru gia tri tai dia chi x */
   x = y;    /* dat gia tri y vao trong x */
   y = temp; /* dat gia tri x vao trong y */
  
   return;
}
