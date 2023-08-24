package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {

    /** instance Scanner */
    Scanner teclado = new Scanner(System.in);


    public void RegisterTeacher() {


        /** Instance Teacher */
        Teacher objTeacher = new Teacher();

        /** Collect data Teacher */
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        System.out.println("Hello Teacher, what is your name: ");
        objTeacher.name = teclado.next();
        System.out.println("How old are you: ");
        objTeacher.age = teclado.nextInt();
        System.out.println("What is your e-mail: ");
        objTeacher.email = teclado.next();
        System.out.println("Tell me your phone number: ");
        objTeacher.phoneNumber = teclado.nextInt();
        System.out.println("What is you specialist: ");
        objTeacher.specialist = teclado.next();
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        /** Print Teacher */

        System.out.println("Teacher's name is: " + objTeacher.name);
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your e-mail is: " + objTeacher.email);
        System.out.println("Your whatsApp: " + objTeacher.phoneNumber);
        System.out.println("Your Specialist: " + objTeacher.specialist);
    }

    public void ResgisterStudent() {

        /** Instance Student */
        Student objStudent = new Student();

        /** Collect data Student */
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        System.out.println("Hello Student, what is your name: ");
        objStudent.name = teclado.next();
        System.out.println("How old are you: ");
        objStudent.age = teclado.nextInt();
        System.out.println("What is your e-mail: ");
        objStudent.email = teclado.next();
        System.out.println("Note One: ");
        objStudent.note1 = teclado.nextFloat();
        System.out.println("Note Two: ");
        objStudent.note2 = teclado.nextFloat();
        System.out.println("What is the frequency of " + objStudent.name + ": ");
        objStudent.frequency = teclado.nextInt();

        /** Print Student */

        System.out.println("Name: " + objStudent.name);
        System.out.println("Your age is: " + objStudent.age);
        System.out.println("Your e-mail is: " + objStudent.email);
        System.out.println("Note One of " + objStudent.name + ": " + objStudent.note1);
        System.out.println("Note Two of " + objStudent.name + ": " + objStudent.note2);
        System.out.println("Your frequency: " + objStudent.frequency);
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");


    }

    public void BothRegister(){
        ResgisterStudent();
        RegisterTeacher();
    }
}
