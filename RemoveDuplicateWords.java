package week3.day02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;



public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] input=text.split(" ");
		Set<String> words=new LinkedHashSet<String>();
		for(int i=0;i<input.length;i++)
		{
			//System.out.print(input[i]);
			words.add(input[i]);
		}
		List<String> uniquewords=new ArrayList<String>();
		uniquewords.addAll(words);
		System.out.println("After removing duplicates the given text becomes :");
		for (String unique : uniquewords) {
			System.out.print(unique+" ");
		}
		
		
		// TODO Auto-generated method stub

	}
}


