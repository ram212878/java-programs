/** This is a knapsack problem to find the items in the knapsack
It is Using Dyanamic Programming
*@author Ram Babu Kumar Rai
*/


import java.util.*;
public class CPLKnapsack {       
    static int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
  
    static void printknapSack(int W, int wt[],int val[], int n)  { 
        int i, w; 
        int K[][] = new int[n+1][W+1];   
        for (i = 0; i <= n; i++) { 
            for (w = 0; w <= W; w++) { 
                if (i == 0 || w == 0) 
                    K[i][w] = 0;
                else if (wt[i - 1] <= w) 
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]); 
                else
                    K[i][w] = K[i - 1][w]; 
            } 
        }   
        int res = K[n][W];   
        w = W; 
        ArrayList <Integer> li=new ArrayList <Integer>();
        for (i = n; i > 0 && res > 0; i--) { 
  
            if (res == K[i - 1][w]) 
                continue; 
            else { 
                li.add(wt[i-1]);
                res = res - val[i - 1]; 
                w = w - wt[i - 1]; 
            } 
        } 
        Integer[] numArray=li.toArray(new Integer[li.size()]);
        int len=numArray.length;
        for( i=len-1;i>=0;i--)
            System.out.print(numArray[i]+" ");
    } 
  
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int val[] = new int[n]; 
        int wt[] = new int[n]; 
        for(int i=0;i<n;i++) {
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }
        printknapSack(c, wt, val, n); 
    } 
}
