#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int temp=n%100;
  int ans=temp/10;
  printf("%d",ans);
  return 0;
}