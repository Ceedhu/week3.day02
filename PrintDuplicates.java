package week3.day02;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int [] nums= {2,4,6,3,5,3,2,1};
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> onlyunique=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			boolean add=unique.add(nums[i]);
			if(!add)
			{
				onlyunique.add(nums[i]);
			}
		}
			System.out.println(onlyunique);
		
		// TODO Auto-generated method stub

	}

}
