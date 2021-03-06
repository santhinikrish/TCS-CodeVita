/*input: 2 40
output: 13158006689
*/

import java.util.*;
public class Main
{
    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }else if(a%2==0){
            return false;
        }
        for(int i=3;i*i<=a;i+=2){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static long fibo(long a,long b,int count){
        int i=3;
        long c=0;
        while(i<=count){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int k=0;
		int prim[]=new int[100];
		for(int i=a;i<=b;i++){
		    if(isPrime(i)){
		        prim[k++]=i;
		    }
		}
		int res[]=new int[1000];
		int l=0,o=0;
		int m[]=new int[1000];
		for(int i=0;i<k;i++){
		    for(int j=0;j<k;j++){
		        if(i==j){
		            continue;
		        }else{
		             if(prim[j]<10){
		            	m[o++]=prim[i]*10+prim[j];
		             }else{
		        	m[o++]=prim[i]*100+prim[j];
			     }
		        }
		    }
		}
		Set<Integer> s=new TreeSet<Integer>();
		for(int i:m){
            		if(isPrime(i)){
                		s.add(i);
            		}
		}
		ArrayList<Integer> s1=new ArrayList<Integer>(s);
		int c=s1.size();
		long min=s1.get(0),max=s1.get(c-1);
		System.out.print(fibo(min,max,c));
	}
}

			(or)


import java.util.*;
public class Main
{
    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }else if(a%2==0){
            return false;
        }
        for(int i=3;i*i<=a;i+=2){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static long fibo(long a,long b,int count){
        int i=3;
        long c=0;
        while(i<=count){
            c=a+b;
            a=b;
            b=c;i++;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int k=0;
		int prim[]=new int[100];
		for(int i=a;i<=b;i++){
		    if(isPrime(i)){
		        prim[k++]=i;
		    }
		}
		int res[]=new int[1000];
		int l=0,o=0;
		int m[]=new int[1000];
		for(int i=0;i<k;i++){
		    for(int j=0;j<k;j++){
		        if(i==j){
		            continue;
		        }
		        if(prim[j]<10){
		            m[o++]=prim[i]*10+prim[j];
		        }else{
		            m[o++]=prim[i]*100+prim[j];
		        }
		    }
		}
		Set<Integer> s=new HashSet<Integer>();
		int c=0;
		for(int i=0;i<o;i++){
            		if(isPrime(m[i])){
                		res[l++]=m[i];
                		c++;
            		}
		}
		for(int i=0;i<l;i++){
		    for(int j=i+1;j<l;j++){
		        if(res[i]==res[j]){
		            res[j]=-1;
		        }
		    }
		}
		int h[]=new int[1000];
		int f=0;
		for(int i=0;i<l;i++){
		    if(res[i]!=-1){
		        h[f++]=res[i];
		    }
		}
		c=l-(l-f);
		int min=h[0],max=h[f-1];
		System.out.print(fibo(min,max,c));
	}
}
