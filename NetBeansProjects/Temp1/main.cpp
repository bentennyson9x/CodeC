#include <bits/stdc++.h>
using namespace std;
int values[] = { 88, 56, 100, 2, 25 };

int main(int argc, char** argv) {
      int n;

   printf("Truoc khi sap xep, list co dang: \n");
   for( n = 0 ; n < 5; n++ ) 
   {
      printf("%d ", values[n]);
   }

   sort (values+0,values+5);
   printf("\nSau khi sap xep, list co dang: \n");
   for( n = 0 ; n < 5; n++ ) 
   {   
      printf("%d ", values[n]);
   }
  
   return(0);
}

