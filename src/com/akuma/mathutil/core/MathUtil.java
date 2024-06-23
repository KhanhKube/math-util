/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akuma.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtil {
    
    // trong class nay cung cap cho ai do nhieu ham xu li toan hoc
    // clone class Math cua JDK
    // khi thiet ke dung cac ham xu li tien ich cho nguoi khac xai thi la static
    // ham thu vien xai chung cho ai do , ko can luu lai trang thai/gia tri 
    // chon thiet ke lam static
    
    //ham tinh giai thua!!!
    //n! = 1.2.3.4...n
    //ko co gia thua la so am
    //0! -1! = 1 quy uoc
    //giai thua ham do thi doc dung , tang nhanh ve gia tri
    //20 giai thua 18 con so 0 , vua kip du cho kieu long cua Java 
    //21 giai thua tran kieu long
    //bai nay quy uoc tinh n! trong khoang 0...20
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument . N must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; // ket thuc cuoc choi som neu nhan dau vao dac biet
        
        long product = 1; // tich nhan don , thuat toan heo dat , oc buu nhoi thit
        
        for (int i = 2; i <= n; i++) 
            product *= i; // product = product * i;
        
        return product;
    }
}
