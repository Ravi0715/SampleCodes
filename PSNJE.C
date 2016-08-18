#include<stdio.h>
#include<conio.h>
void main()
{
	char a[10][10],ch;
	int n,i,j;
	clrscr();
	printf("Enter no. of strings\n");
	scanf("%d",&n);
	printf("Enter strings\n");
	for(i=0;i<n;i++)
		scanf("%s",&a[i]);
	printf("Enter character\n");
	fflush(stdin);
	scanf("%c",&ch);
	for(i=0;i<n;i++)
	{
		for(j=0;j<strlen(a[i]);j++)
		{
			if(a[i][j]==ch)
				printf("String %d,Position %d\n",(i+1),(j+1));
		}
	}
	getch();
}