/*
input: 3 5
1 2 -3
-2 3 -5
output: -31
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n,k;
	    n=sc.nextInt();
	    k=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        b[i]=sc.nextInt();
	    }
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=(a[i]*b[i]);
	    }
	    int min=1000;
	    int fin=0;
	    for(int i=0;i<n;i++){
	        int inc=(a[i]+k*2)*b[i];
	        int dec=(a[i]-k*2)*b[i];
	        int ans=(inc<dec)?inc:dec;
	        int c=sum-(a[i]*b[i]);
	        int f=c+ans;
	        fin=(f<min)?f:min;
	    }
	    System.out.print(fin);
	}
}
