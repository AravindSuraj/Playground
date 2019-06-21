#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int temp=0;
  temp=n;
  while(temp>100)
  {
    temp=temp/10;
  }
  temp=temp%10;
  printf("%d",temp);
	return 0;
}