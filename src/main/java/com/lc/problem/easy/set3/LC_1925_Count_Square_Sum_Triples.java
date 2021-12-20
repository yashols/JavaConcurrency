package com.lc.problem.easy.set3;

public class LC_1925_Count_Square_Sum_Triples {

	
	public static void main(String args[]) {
		LC_1925_Count_Square_Sum_Triples obj = new LC_1925_Count_Square_Sum_Triples();
		obj.countTriples(5);
	}
	
	public int countTriples(int n) {
        int response = 0;
        for(int i=2; i<=n; ++i) {
            for(int j=i+1; j<=n; ++j) {
                if((i*i) + (j*j) <= n) {
                    response++;
                    System.out.println(i + " " + j);
                }
            }    
        }
        return response;
    }
	
}
