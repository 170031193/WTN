package com.wipro.FlowControlStatements;

public class Ex_3 {
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No Values");
		}
		else
		{
			for(String i:args)
			{
				System.out.print(i+ " ");
			}
		}
	}
}