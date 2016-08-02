package org.tasks;


import java.util.Scanner;
public class ArrayOperations {
	static int array[] = new int[20],number; 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice,num,location;
		System.out.println("Enter size of array:");
		number = sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<number;i++)
			array[i] = sc.nextInt(); 
		
		while(true){
			System.out.println("\nSelect Your option:");
			System.out.println("1.insert at start\n2.insert at location\n3.insert at last\n");
			System.out.println("4.delete at start\n5.delete at location\n6.delete at last\n7.search\n8.display array elements\n9.exit");
			choice= sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter element to add at start:");
					num = sc.nextInt();
					location=0;
					insert_arr(location,num);
					System.out.println("Element inserted..");
					break;
				case 2:
					System.out.println("Enter element and location:");
					num = sc.nextInt(); 
					location = sc.nextInt();
					insert_arr(location,num);
					System.out.println("Element inserted..");
					break;
				case 3:
					System.out.println("Enter element to add at last:");
					num = sc.nextInt();
					for(int i=0;i<array.length;i++)
						if(array[i]==0){
							array[i]=num;
							break;
						}
					System.out.println("Element inserted..");
					break;
				case 4:
					location = 0;
					delete_arr(location);
					System.out.println("Element deleted..");
					break;
				case 5:
					System.out.println("Enter location:");
					location = sc.nextInt();
					delete_arr(location);
					System.out.println("Element deleted..");
					break;
				case 6:
					int p;
					for(p=0;p<array.length-1;p++)
						if(array[p]==0){
							location = p;
							array[p-1]=0;
							break;
						}
					System.out.println("Element deleted..");
					break;
				case 7:
					System.out.println("Enter element to search:");
					num = sc.nextInt();
					int cnt=0,i;
					for(i=0;i<number;i++)
						if(array[i] == num){
							cnt =1;
							break;
						}
					if(cnt==1){
						System.out.println("Element is found at location :"+i);
					}
					else
						System.out.println("Element not found..");
					break;
				case 8:
					System.out.println("Array elements are:\n");
					for(int j=0;j<array.length;j++)
					{
						if(array[j]==0)
							break;
						System.out.print(array[j]+"  ");
					}
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("You have chosen the wrong option...choose b/w 1-7");
			}
		}
	}
	public static void insert_arr(int loc, int num) {
		for(int i=array.length-1;i>loc;i--)
			array[i] = array[i-1];
		array[loc] = num;
	}
	public static void delete_arr(int loc) {
		for(int i=loc;i<array.length-1;i++)
			array[i]=array[i+1];
	}
}