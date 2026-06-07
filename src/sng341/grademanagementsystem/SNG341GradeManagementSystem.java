/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sng341.grademanagementsystem;

/**
 *
 * @author uguregecelik
 */
public class SNG341GradeManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenuFrame F1 = new MainMenuFrame();
        StudentFrame F2 = new StudentFrame();
        TeacherFrame F3 = new TeacherFrame();
        CourseFrame F4 = new CourseFrame();
        GradesFrame F5 = new GradesFrame();
        F1.setVisible(true);
    }
    
}
