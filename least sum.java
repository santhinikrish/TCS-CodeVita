/*
You are given an array of positive numbers. find a minimum number which is not present in the list which cannot be represented as the combination of numbers in the array.
INPUT:
4
1 2 5 6
OUTPUT:
4
*/
import java.util.*;
public class Main
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int ans=1;
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
	Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
        if(ans>=a[i])
        {
            ans+=a[i];
        }
        else
        {
          break;
        }
    }
    System.out.print(ans);
}
}

        (or)

n=int(input())
a=list(map(int,input().split()))
a.sort()
ans=1
for i in a:
    if ans>=i:
        ans+=i
    else:
        break
print(ans)
