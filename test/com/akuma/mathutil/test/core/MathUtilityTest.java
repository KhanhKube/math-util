/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.akuma.mathutil.test.core;

import com.akuma.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author admin
 */
public class MathUtilityTest {
    //đây là class sẽ sử dụng các hàm của thư viện/framwork JUnit
    //để kiểm thử/kiểm tra code chính  - hàm tínhGiaiThua()bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //có nhiều quy tắc đặt tên hàm kiểm thử 
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử 
    //tình huống xài hàm theo kiểu thành công và thất bại!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công , trả về ngon
    //ta sẽ xài hàm kiểu well - đưa ra 5! , 6!, hok chơi đưa -! , 30!
    
    
    //Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau sẽ kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;//test thử tình huống đầu vào, mày phải chạy đúng
        long expected = 1;//hy vọng 0! = 1
        
        //long actual = ;//gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs . actual dùng xanh xanh đỏ đỏ , framwork
        Assert.assertEquals(expected, actual);

        //gộp thêm vài case thành công/đưa đầu vào ngon !!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));// tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));// tui muốn 2! == 2 
        Assert.assertEquals(6, MathUtil.getFactorial(3));// tui muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));// tui muốn 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));// tui muốn 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));// tui muốn 6! == 720
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko
        //nếu giống nhau -> thảy màu xanh đèn đường - đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu không giống nhau -> thảy màu đỏ đèn đường 
        //                  hàm ý expected và actual ko giống nhau
    } 
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0...20] -> tính đúng đc n! - done 
    //2. đưa data vào cà chớn , âm , > 20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    // TA KÌ VỌNG NGOẠI LỆ KHI N < 0 || N > 20 
    // rất mong ngoại lệ xuất hiện với n cà chớn này
    
    // nếu hàm nhận vào n < 0 hoặc hàm ném ra ngoại lệ
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
    // sure , HÀM CHẠY SAI THIẾT KẾ , SAI KÌ VỌNG , MÀU ĐỎ
    
    
    //Test case: 
    //input : -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường , ngoại lệ , ngoại dự tính , dự liệu
    //là những thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường - cách chúng có xuất hiện hay không
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value!!!
    
    
    //MÀU ĐỎ , DO HÀM ĐÚNG LÀ CÓ NGOẠI LỆ THẬT SỰ
    //         NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //         KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//    MathUtil.getFactorial(-5);// hàm @Test chạy, hay hàm getF() chạy
//                                // sẽ ném về ngoại lệ NumberFor...
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
    }
    
     // cách khác để bắt ngoại lệ xuất hiện , viết tự nhiên hơn
    
}
