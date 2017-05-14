import java.util.LinkedList;
import java.util.List;

public class Solution
{
	public List<String> letterCombinations(String digits)
	{
		
		char[] zero = { '0' };
		char[] one = { '1' };
		char[] two = { 'a', 'b', 'c' };
		char[] three = { 'd', 'e', 'f' };
		char[] four = { 'g', 'h', 'i' };
		char[] five = { 'j', 'k', 'l' };
		char[] six = { 'm', 'n', 'o' };
		char[] seven = { 'p', 'q', 'r', 's' };
		char[] eight = { 't', 'u', 'v' };
		char[] nine = { 'w', 'x', 'y', 'z' };
		char[][] letters = { zero, one, two, three, four, five, six, seven, eight, nine };
		int[] nums = new int[digits.length()];
		for (int i = 0; i < nums.length; i++)
		{
			nums[i]=digits.charAt(i)-'0';
		}
		LinkedList<String> list=new LinkedList<>();
		if(digits.length()==0||digits==null)
		{
			return list;
		}
		list.add("");
		//using FIFO queue
		for (int i = 0; i < nums.length; i++)
		{
			while (list.peek().length()==i)
			{
				String temp=list.poll();
				for (int j = 0; j < letters[nums[i]].length; j++)
				{
					list.add(temp+letters[nums[i]][j]);
				}
			}
		}
		return list;
	}
		
}