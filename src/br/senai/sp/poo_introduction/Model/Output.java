package br.senai.sp.poo_introduction.Model;

public class Output {

    public void PrintTeacher(Teacher objTeacher){


        /** Print Teacher */

        System.out.println("Teacher's name is: " + objTeacher.name);
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your e-mail is: " + objTeacher.email);
        System.out.println("Your whatsApp: " + objTeacher.phoneNumber);
        System.out.println("Your Specialist: " + objTeacher.specialist);

    }

    public void PrintStudent(Student objStudent){

        /** Print Student */

        System.out.println("Name: " + objStudent.name);
        System.out.println("Your age is: " + objStudent.age);
        System.out.println("Your e-mail is: " + objStudent.email);
        System.out.println("Note One of " + objStudent.name + ": " + objStudent.note1);
        System.out.println("Note Two of " + objStudent.name + ": " + objStudent.note2);
        System.out.println("Your frequency: " + objStudent.frequency);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

    }

}
