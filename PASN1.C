#include <stdio.h>
int main(){
 char *str[20],ch;
 int n,pos[20],k=0,i,j;
 clrscr();
 printf("enter no.of strings:");
 scanf("%d",&n);
 for(i=0;i<n;i++)
   scanf("%s",(str+i)); 
 printf("enter input character:");
 fflush(stdin);
 scanf("%c",&ch);
 for(i=0;i<n;i++)
   for(j=0;j<strlen(str+i);j++)
      if(*(*(str + i)+j)==ch)
       pos[k++] = j;
 printf("positions of char in all strings:");
 for(i=0;i<k;i++)
   printf("%d,",pos[i]);
   getch();
   return 0;
}