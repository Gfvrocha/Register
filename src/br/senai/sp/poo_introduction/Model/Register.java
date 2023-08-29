package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {

    /** Instance Student */
    Student objStudent = new Student();
    /** Instance Teacher */
    Teacher objTeacher = new Teacher();


    /** instance Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instance Output */
    Output objOutput = new Output();

    boolean flag = true;


    public void RegisterTeacher() {

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

        if (flag){
            objOutput.PrintTeacher(objTeacher);
        }
    }

    public void ResgisterStudent() {

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

        if(flag){
            objOutput.PrintStudent(objStudent);
        }

    }

    public void BothRegister(){
        flag = false;


        ResgisterStudent();
        RegisterTeacher();

        objOutput.PrintTeacher(objTeacher);
        objOutput.PrintStudent(objStudent);

    }
}
