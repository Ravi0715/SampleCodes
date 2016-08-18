#include<stdio.h>
#include<conio.h>
void main()
{
	int n,i,j;
	char *p[10];
	char *pArr;
	char ch='\0';
	clrscr();
	printf("Enter size:\n");
	scanf("%d",&n);
	printf("Enter Strings\n");
	for(i=0;i<n;i++)
		scanf("%s",p[i]);
	printf("Enter character:\n");
	fflush(stdin);
	scanf("%c",&ch);
	for(i=0;i<n;i++)
	{
		pArr=p[i];
		j=0;
		while(*pArr!='\0')
		{
				if(ch==*(pArr++))
					printf(" string %d: %d,",i+1,j+1);
				j++;
		}
	}
	getch();
}