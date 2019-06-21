#include<stdio.h>
int main()
{
  int a,b,c;
  scanf(" %d %d %d ",  &a, &b, &c);
  int temp=a+b+c;
  int avg=temp/3;
  printf("%d",avg);
  return 0;
}