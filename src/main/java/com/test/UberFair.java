package com.test;

public interface UberFair extends TaxiFair{
	default void getFair() {
		  System.out.println("UberFair");
	  }
}
