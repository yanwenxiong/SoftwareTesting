package judgeTriangle;

import java.util.Arrays;
import java.util.Vector;

public class Judge {
	public String judge(double[] list){
		Arrays.sort(list);
		double max = list[2];
		double mid = list[1];
		double min = list[0];
		System.out.println(max + " " + mid + " " + min);
		if(min + mid <= max){
			return "not a triangle";
		}
		else{
			if(max == mid && mid == min){
				return "equilateral";
			}
			else if(max == mid || mid == min){
				return "isosceles";
			}
		}
		return "scalene";
	}
	
}
