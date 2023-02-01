package basics;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
System.out.println("enter the number of rows");
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
System.out.println("enter the number of coloumns");
int col=sc.nextInt();
int[][] a=new int[row][col];
System.out.println("enter"+ row*col+ " elements");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		a[i][j]=sc.nextInt();
	}
}
int[][] b=new int[row][col];
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		b[i][j]=a[i][j];
	}
}
for(int i=0;i<b.length;i++) {
	for(int j=0;j<b[i].length;j++) {
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
	}

}
