/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhtran.mathutil.test;

import static com.thinhtran.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

// neu muon xai ham static , co 2 cach:
//C1: goi class.ten ham static() truyen thong
//          nho import package... ten class chua ham static
//vd: MathUtil.getFactorial(int i);

//C2: ko them goi class cham, goi ten ham minh muon
//vd: getFactorial(int i);

/**
 *
 * @author USER
 */
public class MathUtilTest {
    
    //Test case #1: getF() with valid argument
    //n = 0, expected = 1; actual: doan xem!!!
    @Test 
    //@Test bien 1 ham bat ky trong 1 class bat ky thanh main()
    //viec no bien thanh Main() le thuoc vao thu vien o Line 9
    public void testFactorialGivenValidArgumentReturnsWell() throws Exception{
        long expected = 1; //expected it is 1 if caculate 0
        long actual = getFactorial(0);
        
        assertEquals(expected, actual);
        //~trong main() kieu cu, ta in ra ket qua expected va actual
        //kiem tra = mat
        //ben Junit, tung ra 2 mau: Xanh: 2 thang khop nhau
        //                          Do: 2 thang ko khop nhau
    }
    
    @Test
    //Test case #2: getF() with valid argument
    //n = 6, expected = 720; actual: doan xem!!!!
    public void testFactorialGivenValidArgumentN6ReturnsWell() throws Exception{
        long expected = 720; //expected it is 1 if caculate 0
        long actual = getFactorial(6);
        
        assertEquals(expected, actual);
    }
    
    //Ngoai le (Exception) thi se ra sao?
    //Ngoai le khong phai la 1 value ma la 1 tinh huong
    //La 1 su bat thuong, co kha nang xay ra
    //KO la value nen ko dung de so sanh theo kieu assertEquals()
    //Chi co the so sanh dc = cach xem xem ngoai le co XUAT HIEN hay ko
    
    //CAC EXCEPTION KHONG = NHAU
    @Test(expected = UnsupportedOperationException.class)
    //Test case #3: getF() with Invalid argument
    //n = -5, expected = EXCEPTION
    public void testFactorialGivenInvalidArgumentThrowsException() throws Exception{
        
        getFactorial(-5);
        
    }
}
