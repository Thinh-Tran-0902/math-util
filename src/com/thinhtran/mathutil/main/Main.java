/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhtran.mathutil.main;

import com.thinhtran.mathutil.core.MathUtil;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        //ta se kiem thu = cach goi ham
        //nhin ket qua cua ham tra ve (ACTUAL) so sanh voi cai ta hi vong
        //no se tra ve (EXPECTED)
        //vd: 5! = 120
        // thuc te ham fetFi(5) no tra ve ?
        // chay moi biet
        //cuoi cung so sanh ACTUAL vs EXPECTED
        //de dam bao ham dung ta chia cac truong hop
        //cac tinh huong ham se duoc xai
        //dua cho ham, chay ham, output, ket luan
        //MOI BO DATA DUA VAO, MOI DATA CU THE DE TEST HAM CHO 1 MUC DICH
        //NAO DO, TA GOI LA TEST CASE - TINH HUONG CASE
        //n == 5, goi ham GetF() => test case
        //n == -5, goi ham GetF() => test case
        
        //Test case #1: check getF() with valid argument////////////////////////
        //n == 0, expected = 1; actual: doan xem??
        
        long expected = 1; //hy vong
        
        long actual = MathUtil.getFactorial(0); //doan xem
        
        //compare
        System.out.println("0! -> expected: " + expected
                            + "; actual: " + actual);
        
        //Test case #2: check getF() with valid argument////////////////////////
        //n = 6, expected = 1; actual: doan xem??
        
        expected = 720; //hy vong
        
        actual = MathUtil.getFactorial(6); //doan xem
        
        //compare
        System.out.println("6! -> expected: " + expected
                            + "; actual: " + actual);
        
        //Test case #3: check getF() with valid argument////////////////////////
        //n = -5, expected = 1; actual: doan xem??
        
        //thay ngoai le mung roi nuoc mat
        
        //long expected = exception se xuat hien; //hy vong
        
        System.out.println("Check if an exception is thrown by using invalid argument");
        MathUtil.getFactorial(-5); //doan xem
        
        //compare
        System.out.println("-5! -> expected: " + expected
                            + "; actual: " + actual);
    }
}
