/*
 * Copyright (C) Gabriel Moura, 2024
 * Todos os direitos reservados.
 */

import java.util.Scanner;

// Definição de Matérias
class Materia {
    String nome;
    String professor;

    Materia(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }
}

// Definição de Turnos
class Turno {
    Materia[] materias = new Materia[7]; // Um array de 7 matérias, uma para cada dia da semana
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição de Matérias
        String MAT = "Matemática";
        String EDF = "Educação Física";
        String CIE = "Ciências";
        String GEO = "Geografia";
        String POR = "Português";
        String ING = "Inglês";
        String ART = "Artes";

        // Definição de Professores
        String prof_MatManha = "Prof. Carlos";
        String prof_EDFManha = "Prof. Ana";
        String prof_CIEManha = "Prof. Pedro";
        String prof_GEOManha = "Prof. Marta";
        String prof_PORManha = "Prof. Joana";
        String prof_INGManha = "Prof. Miguel";
        String prof_ARTManha = "Prof. Sofia";

        String prof_MatTarde = "Prof. André";
        String prof_EDFTarde = "Prof. Renata";
        String prof_CIETarde = "Prof. Lucas";
        String prof_GEOTarde = "Prof. Júlia";
        String prof_PORTarde = "Prof. Renato";
        String prof_INGTarde = "Prof. Paula";
        String prof_ARTTarde = "Prof. Gabriel";

        // Definição dos Turnos
        Turno turnoManha = new Turno();
        turnoManha.materias[0] = new Materia(MAT, prof_MatManha);
        turnoManha.materias[1] = new Materia(EDF, prof_EDFManha);
        turnoManha.materias[2] = new Materia(CIE, prof_CIEManha);
        turnoManha.materias[3] = new Materia(GEO, prof_GEOManha);
        turnoManha.materias[4] = new Materia(POR, prof_PORManha);
        turnoManha.materias[5] = new Materia(ING, prof_INGManha);
        turnoManha.materias[6] = new Materia(ART, prof_ARTManha);

        Turno turnoTarde = new Turno();
        turnoTarde.materias[0] = new Materia(MAT, prof_MatTarde);
        turnoTarde.materias[1] = new Materia(EDF, prof_EDFTarde);
        turnoTarde.materias[2] = new Materia(CIE, prof_CIETarde);
        turnoTarde.materias[3] = new Materia(GEO, prof_GEOTarde);
        turnoTarde.materias[4] = new Materia(POR, prof_PORTarde);
        turnoTarde.materias[5] = new Materia(ING, prof_INGTarde);
        turnoTarde.materias[6] = new Materia(ART, prof_ARTTarde);

        int turno, dia;

        System.out.print("Selecione o turno (1 - Manhã, 2 - Tarde): ");
        turno = scanner.nextInt();

        if (turno != 1 && turno != 2) {
            System.out.println("Turno inválido.");
            return;
        }

        System.out.print("Selecione o dia da semana (1 - Segunda, 2 - Terça, ..., 7 - Domingo): ");
        dia = scanner.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Dia da semana inválido.");
            return;
        }

        // Exibindo o resultado
        System.out.println();
        if (turno == 1) {
            System.out.println("Turno da Manhã:");
            System.out.println(turnoManha.materias[dia - 1].nome + ": " + turnoManha.materias[dia - 1].professor);
        } else {
            System.out.println("Turno da Tarde:");
            System.out.println(turnoTarde.materias[dia - 1].nome + ": " + turnoTarde.materias[dia - 1].professor);
        }
    }
}
