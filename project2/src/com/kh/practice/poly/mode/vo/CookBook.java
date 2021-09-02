package com.kh.practice.poly.mode.vo;

public class CookBook extends Book{
	private boolean coupon;
	
	public CookBook() {}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	public boolean getCoupon() {
		return this.coupon;
	}

	@Override
	public String toString() {
		return "CookBook [" + super.toString() + ", coupon=" + coupon + "]";
	}
	
	
	
}
