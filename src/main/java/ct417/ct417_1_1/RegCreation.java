/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1_1;

import ct417.ct417_1.Reg_System;
import ct417.ct417_1.Student;



/**
 *
 * @author David Williams
 */
public class RegCreation {
    Reg_System RegSys = new Reg_System();
    
    Student s1 = new Student("fname1", "lname1", "dob1", 1111111, 20, "courses1");
    Student s2 = new Student("fname2", "lname2", "dob2", 2222222, 20, "courses2");
    Student s3 = new Student("fname3", "lname3", "dob3", 3333333, 20, "courses3");
    Student s4 = new Student("fname4", "lname4", "dob4", 4444444, 20, "courses4");
    Student s5 = new Student("fname5", "lname5", "dob5", 5555555, 20, "courses5");
    
    String name1 = s1.getName();
    String uname1 = s1.getUserName();
}
