import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(nums,inputIndex)) {
			inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		
		JOptionPane.showMessageDialog(null,
				"Current data, num["+inputIndex+"] is "+currentData(nums,inputIndex)+"\n"+
				(inputIndex!=0
				?"Previous data, nums["+(inputIndex-1)+"] is "+prevData(nums, inputIndex)
				:"No previous data")+
				"\n"+
				(inputIndex!=nums.length-1
				?"Next data, nums["+(inputIndex+1)+"] is "+nextData(nums, inputIndex)
				:"No next data")
				);
	}
	
	public static boolean checkIndex(int[] nums,int index) {
		return (((index<0)||(index>nums.length-1))?true:false);
	}
	
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}

}
