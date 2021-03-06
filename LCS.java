/*
Given two string a and b, return the length of their longest common subsequence.

A subsequence of a string is a new string generated from the original string with some characters(can be none)
deleted without changing the relative order of the remaining characters. (eg "ace" is a subsequence of "abce" while
"aec" is not). A common subsequence of two string is a subsequence that is common to both strings.

Input format:
Two spaced string input

Inout constraints:
1<=a.length<=1000
i<=b.length<=1000
The input strings consist of lowercase english characters only.

Output format:
One single integer denoting the length of the longesr common subsequence

Sample input:
abcde ace

output:
3

*/


import java.util.*;
public class Main
{
    public static int max(int x,int y){
        return x>y?x:y;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int l1=a.length();
		int l2=b.length();
		int s[][]=new int[l2+1][l1+1];
		for(int i=0;i<=l2;i++){
		    for(int j=0;j<=l1;j++){
		        s[i][j]=0;
		    }
		}
		for(int i=1;i<=l2;i++){
		    for(int j=1;j<=l1;j++){
		        if(b.charAt(i-1)==a.charAt(j-1))
		            s[i][j]=s[i-1][j-1]+1;
		        else
		            s[i][j]=max(s[i-1][j],s[i][j-1]);
		    }
		}
		System.out.print(s[l2][l1]);
	}
}
