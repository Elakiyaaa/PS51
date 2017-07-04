package PS11;

import java.util.Scanner;

public class PS51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE ARRAY SIZE");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int temp=0,i;
		System.out.println("ENTER THE NUMBER");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		System.out.println("ASCENDING ORDER");
		for(i=0;i<n;i++){
		System.out.println(a[i]);
		}
		System.out.println("SECOND NUMBER");
			System.out.println(a[1]);

		}
}
