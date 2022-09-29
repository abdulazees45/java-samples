package com.java.samples.relational;

public class RelationalOperator {

    int a, b;
    public boolean equalto(int a, int b) {
  	  this.a=a;
  	  this.b=b;
  	  return a==b;
    }
    
    public boolean greater(int a, int b) {
  	  this.a=a;
  	  this.b=b;
  	  return a>b;
    }
    
    public boolean less(int a, int b) {
  	  this.a=a;
  	  this.b=b;
  	  return a<b;
    }
}
