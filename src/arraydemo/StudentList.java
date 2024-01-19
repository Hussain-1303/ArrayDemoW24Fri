/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author blessedguy
 */
public class StudentList {
    
    public static void main(String args[]) {
        
        Student[] studentList = new Student[3];
        
        Student s1 = new Student(1, "ronak");
        
        studentList[0] = s1;
        studentList[1] = new Student(2, "Sheth");
        studentList[2] = new Student(3, "LolBit");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getsName());
        }
    }
    
}
