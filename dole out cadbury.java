/*
You are a teacher in reputed school. During Celebration Day you were assigned a task to distribute Cadbury such that maximum children get the chocolate. You have a box full of Cadbury with different width and height. You can only distribute largest square shape Cadbury. So if you have a Cadbury of length 10 and width 5, then you need to break Cadbury in 5X5 square and distribute to first child and then remaining 5X5 to next in queue

Constraints
0<P<Q<1501

0<R<S<1501

Input Format
First line contains an integer P that denotes minimum length of Cadbury in the box

Second line contains an integer Q that denotes maximum length of Cadbury in the box

Third line contains an integer R that denotes minimum width of Cadbury in the box

Fourth line contains an integer S that denotes maximum width of Cadbury in the box

Output
Print total number of children who will get chocolate.

Timeout
1

Explanation
Example 1

Input

5

7

3

4

Output

24

Explanation

Length is in between 5 to 7 and width is in between 3 to 4.

So we have 5X3,5X4,6X3,6X4,7X3,7X4 type of Cadbury in the box.

If we take 5X3 :

First, we can give 3X3 square Cadbury to 1st child .Then we are left with 3X2. Now largest square is 2X2 which will be given to next child. Next, we are left with two  1X1 part of Cadbury which will be given to another two children.

And so on
*/

using namespace std;
int n(int row,int c)
{
  int count=0;
  int total=row*c;
  while(row && c)
  {
    count++;
    if(row>c)
      row=row-c;
    else
      c=c-row;
  }
  return count;
}

int main()
{
  int sum=0;
  int minlen,maxlen,minw,maxw;
  cin>>minlen>>maxlen>>minw>>maxw;
  if(0<minlen<1501 && 0<maxlen<1501 && 0<minw<1501 && 0<maxw<1501)
  {
    for(int i=minlen;i<=maxlen;i++)
    {
      for(int j=minw;j<=maxw;j++)
      {
        sum=sum+n(i,j);
      }
    }
  }
  cout<<sum;
  return 0;
}

    (or)

import java.util.Scanner;
class Dole_Out_Cadbury {
    static int count_of_chocolates = 0;
    static void recursion(int i, int j) {
        count_of_chocolates += 1;
        if (i > j) recursion(i - j, j);
        if (i < j) recursion(i, j - i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length_start = sc.nextInt(), length_end = sc.nextInt(), breadth_start = sc.nextInt(), breadth_end = sc.nextInt();
        for (int i = length_start; i <= length_end; i++)
            for (int j = breadth_start; j <= breadth_end; j++)
                recursion(i, j);
        System.out.print(count_of_chocolates);
    }
}
