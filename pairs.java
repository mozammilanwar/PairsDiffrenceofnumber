import java.util.*;
import java.lang.*;
import java.io.*;

public class pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
    int s=sc.nextInt();
    int r[]= new int[n];
    for(int i=0;i<n;i++)
    {
      r[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(r[i]-r[j]==s || r[j]-r[i]==s)
        {
          count++;
        }
      }
    }
    System.out.println(count);
    
	}
}