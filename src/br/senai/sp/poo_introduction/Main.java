package br.senai.sp.poo_introduction;

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

        int escolha;

        System.out.println("O que deseja fazer ? \n1 - Cadastrar Professor \n2 - Cadastar Aluno \n3 - Cadastrar Ambos");
        System.out.print("Sua escolha : ");
        escolha = teclado.nextInt();

        if(escolha == 1) {
            objRegister.RegisterTeacher();
        } else if (escolha == 2){
            objRegister.ResgisterStudent();
        } else if (escolha == 3) {
            objRegister.BothRegister();

        } else {
            System.out.println("Escolha inválida!");
        }
    }
}
