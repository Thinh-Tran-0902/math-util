/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhtran.mathutil.test;

import static com.thinhtran.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author USER
 */

@RunWith(value = Parameterized.class) //Annotation
public class MathUtilDDTTest {
    
    //ta can test ham getF() ben code chinh chay dung ko
    //ta phai dua data vao, xem ket qua tra ve
    //so sanh va ket luan ham dung sai
    //3 viec: chuan bi data, dua data va ham vao, ket luan dung sai
    //nhu MathUtilTest, nhung
    
    //0! -> 1
    //1! -> 1
    //2! -> 2     day la bo data test
    //3! -> 6     luu vao table SQLServer, Excel, .CSV
    //5! -> 120
    // =>> mang 2 chieu [6][2]
       
    //hoc cach viet code tach dam data ra khoi cac cau lenh
    //getF(), ko mixed. Tat ca cac framework Unitest cua moi
    //NNLT de lam dc dieu nay
    
    //ham tra ve mang 2 chieu kieu Object
    //vi cac framework choi voi Object, mang so nguyen
    //phai hieu la Object, tuc la choi voi Wrapper Class neu mang so...
    //Wrapper Class: Integer (int), Long (long), Character (char)
    
    //bao voi JVM JUNIT day la data nguon!!!! dung de map vao assert
    @Parameterized.Parameters
    public static Object[][] initData(){
        //int a[] = {2, 4, 6, 8};
        //int a[4] = {2, 4, 6, 8};
        return new Integer[][]{
                                    {0, 1},
                                    {1, 10}, //co tinh sai
                                    {2, 2},
                                    {3,6},
                                    {6,620}, //co tinh sai
                                };
    }
    
    //can trich data tung mang con ra de dc cac cap value input/expected
    @Parameterized.Parameter(value = 0) //map vao cot 0
    public int input;
    
    @Parameterized.Parameter(value = 1) //map vao cot 1
    public int expected;
    
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() throws Exception{
        
        //long actual = getFactorial(input);
        
        assertEquals(expected, getFactorial(input));
    }
    
}

//DDT tach data test ra. Sau do lay tung mieng data
//lap vao/map vao trong cho goi ham, cho assert()
//tach va nhoi vao -> lam hoai nhu vay cho cac bo data
//phai thong qua ten bien/moi
//DDT con dc goi la: THAM SO 
