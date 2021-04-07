
package com.wiley.dst;
import java.util.*;
import java.io.*;
import java.lang.*;

class FindInversionArray
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println("Total inversion count is :"+new Inversion_of_Array().inversionCount(arr, n));
    }
}

class Inversion_of_Array
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    
    static long inversionCount(long arr[], long N)
    {
        long count=0;
       long temp[]=new long[(int)N];
     count=merge(arr,temp,0,N-1);
     return count;
        
    }
            static long merge(long arr[],long temp[], long left, long right)
            {
                long mid,count=0;
               
                if(left<right)
                {
                mid=(left+right)/2;  
                count=merge(arr,temp,left,mid);
                count=count+merge(arr,temp,mid+1,right);
                count=count+merge_sort(arr,temp,left,mid,right);
                }
                return count;
            }
            static long merge_sort(long arr[],long temp[],long left,long mid,long right)
            {
                long count=0;
                long i=left;
                long j=mid+1;
                long k=left;
                while(i<=mid&&j<=right)
                {
                    if(arr[(int)i]<=arr[(int)j])
                    {
                        temp[(int)k++]=arr[(int)i++];
                    }
                    else
                    {
                        temp[(int)k++]=arr[(int)j++];
                        count=count+(mid+1-i);
                    }
                }
                while(i<=mid)
                {
                    temp[(int)k++]=arr[(int)i++];
                }
                while(j<=right)
                {
                 temp[(int)k++]=arr[(int)j++];   
                }
                for( i=left;i<=right;i++)
                {
                    arr[(int)i]=temp[(int)i];
                }
                return count;
            }
            
    
}