/*Implemented using Stacks. Time complexity O(n) and space complexity O(n).
import java.util.*;
import java.io.*;

	class Stack 
	{
	private int maxSize;
	private char[] array;
	private int top;
	
	public Stack(int size)
	{
		maxSize = size;
		array = new char[size];
		top=-1;
	}
	
	public void push(char ch)
	{
		if(top!=maxSize-1)
		array[++top]=ch;
	}
	
	public char pop()
	{
		return array[top--];
	}
	
	public char peek()
	{
		return array[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	}
	
	class Reverse
	{
		private String input;
		private String output;
		
		public Reverse(String s)
		{
			this.input=s;
			this.output="";
		}
		
		public String reverseString()
		{
			int stackSize=this.input.length();
			Stack newStack = new Stack(stackSize);
			
			for(int i=0;i<input.length();i++)
			{
			char ch = input.charAt(i);
			newStack.push(ch);
			}
			
			while(!newStack.isEmpty())
			{
				char ch=newStack.pop();
				output+=ch;
			}
			
			return output;
				
		}
	}
	
	public class ReverseString
	{
		public static void main(String[] args) throws IOException
		{
			Scanner reader = new Scanner(System.in);
			String input,output;
			while(true)
			{
			System.out.print("Enter a string: ");
			input = reader.nextLine();
			
			if(input.equals("")) break;
			
			Reverse r = new Reverse(input);
			output=r.reverseString();
			System.out.println("Reversed string: " + output);
			}
									
		}
		
	}
	
	
	
