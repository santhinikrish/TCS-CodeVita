digit pairs
/*Given N three-digit numbers, your task is to find bit score of all N numbers and then print the number of pairs possible based on these calculated bit score.

1. Rule for calculating bit score from three digit number:

From the 3-digit number,

· extract largest digit and multiply by 11 then

· extract smallest digit multiply by 7 then

· add both the result for getting bit pairs.

Note: - Bit score should be of 2-digits, if above results in a 3-digit bit score, simply ignore most significant digit.

Consider following examples:

Say, number is 286

Largest digit is 8 and smallest digit is 2

So, 8*11+2*7 =102 so ignore most significant bit , So bit score = 02.

Say, Number is 123

Largest digit is 3 and smallest digit is 1

So, 3*11+7*1=40, so bit score is 40.

2. Rules for making pairs from above calculated bit scores

Condition for making pairs are

· Both bit scores should be in either odd position or even position to be eligible to form a pair.

· Pairs can be only made if most significant digit are same and at most two pair can be made for a given significant digit.

Constraints
N<=500

Input Format
First line contains an integer N, denoting the count of numbers.

Second line contains N 3-digit integers delimited by space

Output
One integer value denoting the number of bit pairs.

Timeout
1

Explanation
Example 1

Input

8 234 567 321 345 123 110 767 111

Output

3

Explanation

After getting the most and least significant digits of the numbers and applying the formula given in Rule 1 we get the bit scores of the numbers as:

58 12 40 76 40 11 19 18

No. of pair possible are 3:

40 appears twice at odd-indices 3 and 5 respectively. Hence, this is one pair.

12, 11, 18 are at even-indices. Hence, two pairs are possible from these three-bit scores.

Hence total pairs possible is 3
*/
#include<stdio.h>
int bitsc(int n){
  int run,a,b,c,sma,lar;
  a=n%10;
  n/=10;
  b=n%10;
  n/=10;
  c=n%10;
  n/=10;
  lar=(a>b)?a:b;
  lar=(c>lar)?c:lar;
  sma=(a<b)?a:b;
  sma=(c<sma)?c:sma;
  run=lar*11+sma*7;
  run=run%100;
  return run;
}
int pairs(int a[],int n){
  int b[10],p=0,ans;
  int i,j;
  for(i=0;i<10;i++){
    b[i]=0;
  }
  for(i=0;i<n;i+=2){
    ans=a[i]/10;
    for(j=i+2;j<n;j+=2){
      if(ans==a[j]/10){
        if(b[ans]<2){
          b[ans]++;
        }
      }
    }
  }
  for(i=1;i<n;i+=2){
    ans=a[i]/10;
    for(j=i+2;j<n;j+=2){
      if(ans==a[j]/10){
        if(b[ans]<2){
          b[ans]++;
        }
      }
    }
  }
  for(i=0;i<10;i++){
	p+=b[i];
  }
  return p;
}
int main(){
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int b[n];
  for(int i=0;i<n;i++){
    b[i]=bitsc(a[i]);
  }
  int p=pairs(b,n);
  printf("%d",p);
}
