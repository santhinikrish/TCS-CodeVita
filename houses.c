/*
Problem Statement
Assume we have a 100 houses and 100 thieves.Initially all houses are locked stage.All thieves are go and check every houses from their order.

Example 1st theif come ,he will check 1,2,3,4,......upto 100 th house.If house was locked stage he will open (or) house was opened stage,he will locked.

Then 2nd theif come ,he will check 2,4,6,8,......upto 100 th house.same operation will repeated from 1st  thief.If house was locked stage he will open (or) house was opened stage,he will locked.

Then 3rd theif come ,he will check 3,6,9,12,,......upto 100 th house and 4th thief come and check 4,8,12,16,...upto 100 th house.

This same operation will repeated untill all thieves are check every houses from their order.

After completed all thieves ,we should calculate how many houses are opened stage and locked stage?

Note :

Number of houses = Number of thieves

Input Format
An integer

Constraints
1<=N<100000

Output Format
An integer

Sample Input
50
Sample Output
Opened houses = 7
Locked houses = 43
*/

#include<stdio.h>
#include<math.h>
int main(){
    long long int n;
    scanf("%lld",&n);
    long long int m=(long long int)sqrt(n);
    printf("Opened houses = %lld\n",m);
    printf("Locked houses = %lld",n-m);
}
