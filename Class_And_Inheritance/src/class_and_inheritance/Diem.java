/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_and_inheritance;

import java.util.Scanner;

/**
 *
 * @author thnn31
 */
public class Diem {
    float x;
    float y;
    
    public void NhapToaDo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = sc.nextFloat();
        System.out.print("Nhap y: ");
        y = sc.nextFloat();
        
    }
    
    public void InToaDo()
    {
        System.out.println("(" + x+ "'" +y+")");
    }
}
