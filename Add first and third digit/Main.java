#include<stdio.h>
int main()
{
  int n,f,t,o;
  scanf("%d",&n);
  f=n/100;
  t=n%10;
  o=f+t;
  printf("%d",o);
  
  return 0;
}