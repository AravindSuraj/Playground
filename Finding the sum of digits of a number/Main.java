#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
  int sum=0;
    int temp=0,rem=0;
  temp=n;
    while(temp>0)
    {
    rem=temp%10;
      sum=sum+rem;
      temp=temp/10;
    }
      printf("%d",sum);
	return 0;
}