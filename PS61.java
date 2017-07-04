package PS11;

import java.util.Scanner;

public class PS61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("ENTER THE ARRAY SIZE");
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				int a[]=new int[n];
				System.out.println("ENTER THE X VALUE");
				int x=s.nextInt();
				int sum=0,i,j;
				System.out.println("ENTER THE NUMBER");
				for(i=0;i<n;i++){
					a[i]=s.nextInt();
				}
				for(i=0;i<n;i++){
					for(j=i+1;j<n;j++){
						sum=a[i]+a[j];
						if(sum==x)
						{
							System.out.println(a[i]+","+a[j]);
						}
					}
				}
				
	}

}
