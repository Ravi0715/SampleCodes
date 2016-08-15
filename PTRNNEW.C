#include<stdio.h>
#include<conio.h>
void main()
{
	int i,v=0,j,k,n,sum=0;
	int a[10][10];
	clrscr();
	printf("Enter matrices:\n");
	for(i=1;i<=7;i++)
	{
		for(j=1;j<=7;j++)
			scanf("%d",&a[i][j]);
	}
	n=(7/2)+1;
	for(i=1;i<=(2*n)-1;i++)
	{
		v=i>n?n-i%n:i;
		/*for(j=1;j<=n-v;j++)
			printf(" ");*/
		for(j=1;j<=(2*v)-1;j++)
			//printf("%d",a[i][j]);
			sum+=a[i][j];
		//printf("\n");
	}
	printf("Total rhombus sum: %d \n",sum);
	getch();
}