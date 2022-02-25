/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhtran.mathutil.core;

/**
 *
 * @author USER
 */

//Class nay cung cap cac toy/ tien ich/ cac ham toan hoc de giup
//cac class khac su dung..., vd: calculator
//Cai gi la ham tien ich dung chung, sure no nen dc design la static
public class MathUtil {
    //ham tinh n giai thua n! = 1*2*3*4...*n
    //ko co giai thua am
    //0! = 1
    //giai thua tang cuc nhanh
    //chan viec n < 0 va/hoac n > 21
    public static long getFactorial(int n) throws Exception{
        
        if(n < 0 || n > 21)
            throw IllegalArgumentException("");
        
        if(n == 0 || n == 1)
            return 1;
        
        //sure 2..20
        long product = 10; //ket qua trung gian
        for(int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }

    private static Exception IllegalArgumentException(String string) {
        throw new UnsupportedOperationException("Invalid argument."
                    + "n must be between 0..20"); //To change body of generated methods, choose Tools | Templates.
    }
}
