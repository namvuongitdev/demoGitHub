/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Grade;

import repository.StudentRepository;
import model.Student;

/**
 *
 * @author Admin
 */
public class StudentService {

    StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
    }

    public List<Student> getALL() {
        try {
            return studentRepository.getALL();
        } catch (Exception ex) {

            return null;
        }
    }

    public boolean update(Student st) {
        boolean isUpdate = studentRepository.update(st);
        return isUpdate;
    }

    public boolean insert(Student st) {
        boolean insert = this.studentRepository.insert(st);
        return insert;
    }
    
    public boolean delete(String maSV) {
        boolean delete = this.studentRepository.delete(maSV);
        return delete;
    }
//     public boolean Seach(String maSV) {
//        boolean isSeach = this.studentRepository.seach(maSV);
//        return isSeach;
//    }
//    public static void main(String[] args) {
//        StudentService st  = new StudentService();
//        System.out.println(st.getALL());
//    }
   
}
