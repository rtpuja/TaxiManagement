package com.test;

public interface OlaFair extends TaxiFair {
  default void getFair() {
	  System.out.println("Olafair");
  }
}
