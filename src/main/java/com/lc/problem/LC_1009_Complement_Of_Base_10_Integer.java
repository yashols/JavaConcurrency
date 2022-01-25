package com.lc.problem;

public class LC_1009_Complement_Of_Base_10_Integer {

    public static void main(String[] args) {
        LC_1009_Complement_Of_Base_10_Integer obj = new LC_1009_Complement_Of_Base_10_Integer();
        int result = obj.bitwiseComplement(5);
        System.out.println(result);
    }

    public int bitwiseComplement(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        }
        int power = 0;
        while (n != 0) {
            int remainder = n % 2;
            n = n / 2;
            if (remainder == 0) {
                result = result + (int) Math.pow(2, power);
            }
            ++power;
        }

        return result;
    }

}
