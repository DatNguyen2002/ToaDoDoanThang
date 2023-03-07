/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_and_inheritance;

import static java.lang.StrictMath.sqrt;

/**
 *
 * @author thnn31
 */
public class DoanThang extends Diem{
    private Diem B;
    
    public void nhapDiem()
    {
        System.out.print("Nhap toa do diem A\n");
        super.NhapToaDo();
        
        System.out.print("Nhap toa do diem B\n");
        B = new Diem();
        B.NhapToaDo();
    }
    
    public void inDiem()
    {
        System.out.print("Toa to diem A: ");
        super.InToaDo();
        System.out.print("Toa to diem B: ");
        B.InToaDo();
        
        System.out.print("Do dai Doan Thang Duoc Tao tu hai Doan Thang:"+ TinhDoDai());
    }
    
    public float TinhDoDai()
    {
        float xC = B.x - super.x;
        float yC = B.y - super.y;
        return (float) sqrt(xC * xC + yC * yC);

    }
}
