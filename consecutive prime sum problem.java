/*input: 20
output: 2
*/

import java.util.*;
public class Main
{
    public static boolean isprime(int a){
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=2,count=0;
		for(int i=3;i<=n;i++){
		    if(isprime(i)){
		        sum+=i;
		        if(isprime(sum)&& sum<=n){
		            count++;
		        }
		    }
		}
		System.out.print(count);
	}
}

for prime:
    public static int isprime(int a){
        int c=0;
        if(a==2||a==3){
            return 1;
        }
        if(a%6==1||a%6==5){
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    c++;
                    break;
                }
            }
        }
        else{
            return 0;
        }if(c==0){
            return 1;
        }else{
            return 0;
        }
    }
