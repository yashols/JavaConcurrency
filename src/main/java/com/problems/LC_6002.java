package com.problems;

import java.util.ArrayList;

public class LC_6002 {

	public static void main(String[] args) {
		LC_6002 obj = new LC_6002(5);
		obj.fix(3);
		obj.fix(1);
		obj.flip();
		System.out.println(obj.all());
		obj.unfix(0);
		obj.flip();
		System.out.println(obj.one());
		obj.unfix(0);
		System.out.println(obj.count());
		System.out.println(obj.toString());
	}
	
	private int[] bits;
    
    public LC_6002(int size) {
        bits = new int[size];
        for(int i=0; i<size; ++i) {
        	bits[i] = 0;
        }
    }
    
    public void fix(int idx) {
        bits[idx] = 1;
    }
    
    public void unfix(int idx) {
    	bits[idx] = 0;
    }
    
    public void flip() {
        int b = 0;
        while(b < bits.length) {
            if(bits[b] == 0) {
                bits[b] = 1;
            } else {
                bits[b] = 0;
            }
            ++b;
        }
    }
    
    public boolean all() {
        int b = 0;
        while(b < bits.length) {
            if(bits[b] == 0) {
               return false;
            }
            ++b;
        }
        return true;
    }
    
    public boolean one() {
        int b = 0;
        while(b < bits.length) {
            if(bits[b] == 1) {
               return true;
            }
            ++b;
        }
        return false;
    }
    
    public int count() {
        int b = 0;
        int count = 0;
        while(b < bits.length) {
            if(bits[b] == 1) {
               ++count;
            }
            ++b;
        }
        return count;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer(bits.length);
        int b = 0;
        while(b < bits.length) {
            sb.append(bits[b]);
            ++b;
        }
        return sb.toString();
    }
	
}
