import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean flag=false;
		for(i=2;i<=n/10;++i)
		{
			if(n%i==0)
			{
				 flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
		
			}
	
