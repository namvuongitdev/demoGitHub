/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Grade {
 
    private String maSV;
    private String hoTen;
    private float TiengAnh;
    private float tinHoc;
    private float DCTC;
   


    public Grade() {
    }

    public Grade(String maSV, String hoTen, float TiengAnh, float tinHoc, float DCTC ) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.TiengAnh = TiengAnh;
        this.tinHoc = tinHoc;
        this.DCTC = DCTC;
     
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getDCTC() {
        return DCTC;
    }

    public void setDCTC(float DCTC) {
        this.DCTC = DCTC;
    }
    
    public float DiemTb(){
    return (this.TiengAnh + this.tinHoc + this.DCTC)/3;
    }

 


    

    

   
    

   
    
}
