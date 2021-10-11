package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaOrMaster
{
	public String findVisaOrMaster(long num)
	{
		int n = Integer.parseInt(String.valueOf(num).substring(0, 4));
		int sum = 0;
		while(n>0)
		{
			sum = sum + (n%10);
			n = n/10;
		}
		System.out.println("Sum of first 4 digits of the card number : "+sum);
		if(sum==16)
		{
			System.out.println("The crad type is : VISA");
			return "VISA";
		}
		else
		{
			System.out.println("The crad type is : MASTER");
			return "MASTER";
		}
	}
	@Test
	public void testCase1()
	{
		long num = 7234123412341234l;
		Assert.assertEquals(findVisaOrMaster(num), "VISA");
	}
	
	@Test
	public void testCase2()
	{
		long num = 1234123412341234l;
		Assert.assertEquals(findVisaOrMaster(num), "MASTER");
	}

}
