package br.senai.sp.poo_introduction;

import br.senai.sp.poo_introduction.Model.Output;
import br.senai.sp.poo_introduction.Model.Register;
import br.senai.sp.poo_introduction.Model.Student;
import br.senai.sp.poo_introduction.Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Instance Scanner*/
        Scanner teclado = new Scanner(System.in);

        /** Instance Register */
        Register objRegister = new Register();

        int selection;

        System.out.println("What do you want to do ? \n1 - Register Teacher \n2 - Register Student \n3 - Register Both");
        System.out.print("Your choice: ");
        selection = teclado.nextInt();

        if(selection == 1) {
            objRegister.RegisterTeacher();
        } else if (selection == 2){
            objRegister.ResgisterStudent();
        } else if (selection == 3) {
            objRegister.BothRegister();

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
