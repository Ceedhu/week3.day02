package week3.day02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int [] nums= {2,4,6,3,5,2,1};
		
		Set<Integer> unique= new LinkedHashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			unique.add(nums[i]);
		}
		System.out.println(unique);
		// TODO Auto-generated method stub

	}

}
