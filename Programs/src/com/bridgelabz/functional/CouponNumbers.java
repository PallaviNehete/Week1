/*	Coupon Numbers
	Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
	I/P -> N Distinct Coupon Number
	Logic -> repeatedly choose a random number and check whether it's a new one.
	O/P -> total random number needed to have all distinct numbers.
	Functions => Write Class Static Functions to generate random number and to process distinct coupons.
*/

package com.bridgelabz.functional;
public class CouponNumbers
{
	public static void main(String[] args) 
	{
		char ch[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		int max=100000000;
		int r=(int)(Math.random()*max);
		StringBuffer s=new StringBuffer();
		while(r>0)
		{
			s.append(ch[r % ch.length]);
			r=r/ch.length;
		}
		String couponNo=s.toString();
		System.out.println("Coupon Number is: "+couponNo);
	}
}
