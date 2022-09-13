/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.QuanLyDiemRepository;
import model.Grade;

/**
 *
 * @author Admin
 */
public class GradeService {

    QuanLyDiemRepository quanLyDiemRepository;

    public GradeService() {
        quanLyDiemRepository = new QuanLyDiemRepository();
    }

    public List<Grade> getAll() {
        try {
            return quanLyDiemRepository.getAll();
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean insert(Grade gr) {
        boolean insert = this.quanLyDiemRepository.insert(gr);
        return insert;
    }

    public boolean delete(String maSV) {
        boolean delete = this.quanLyDiemRepository.delete(maSV);
        return delete;
    }
    public List<Grade> Seach(String maSV){
        try {
            return this.quanLyDiemRepository.Seach(maSV);
        } catch (Exception ex) {
            return null;
        }
    }
    public boolean  update(Grade gr ){
    boolean isUpdate = this.quanLyDiemRepository.update(gr);
    return isUpdate;
    
    }
    
   

}
