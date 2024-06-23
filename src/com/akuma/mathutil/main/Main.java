/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akuma.mathutil.main;

import com.akuma.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        // thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay ko 
        // ta phai dua ra cac tinh huong su dung ham trong thuc te
        // vi du dua vao -5 coi tinh duoc khong 
        //               0 coi tinh duoc may
        //               20 coi tinh duoc may
        //TEST CASE : mot tinh huong ham/app/man hinh/tinh nang duoc dua vao sd
        //gia lap hanh vi xai cua ai do
        
        //TEST CASE : LA 1 TINH HUONG SU DUNG , XAI APP (HAM) MA NO BAO HAM
        // DATA DAU VAO CU THE NAO DO
        //INPUT: DATA DAU VAO CU THE NAO DO
        //OUTPUT DAU RA UNG DUNG VOI XU LI CUA HAM/CHUC NANG CUA APP, DI NHIEN DUNG DAU VAO DE XU LI
        //KI VONG : MONG HAM SE TRA VE VALUE NAO DO UNG VOI INPUT O TRN
        // SO SANH DE XEM KET QUA CO NHU KI VONG KHONG
        long expected = 120;// ta ki vong ham tra ve 120 tinh 5!
        int n = 5;          // input 
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+ expected +" (expected)");
        System.out.println("5! = " + actual +" actual ");
    }
}
