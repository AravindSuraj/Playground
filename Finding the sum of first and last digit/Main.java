#include <stdio.h>
int main() {
	int sum=0;
    int n,fd,ld;
    scanf("%d",&n);
    ld=n%10;
    int temp=n;
    while(temp>0)
    {
      temp=temp/10;
      if(temp>0 && temp<=9)
        fd=temp;
    }
    sum=ld+fd;
    printf("%d",sum);
  
	return 0;
}