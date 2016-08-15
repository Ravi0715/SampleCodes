#include<stdio.h>
#include<conio.h>
void main()
{
	int i,v=0,j,k,n;
	clrscr();
	printf("Enter n:");
	scanf("%d",&n);
	for(i=1;i<=(2*n)-1;i++)
	{
		v=i>n?n-i%n:i;
		for(j=1;j<=n-v;j++)
			printf(" ");
		for(j=1;j<=(2*v)-1;j++)
			printf("1");
		printf("\n");
	}
	getch();
}