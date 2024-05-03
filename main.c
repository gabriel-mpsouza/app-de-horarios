#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <locale.h>
#include <unistd.h>

/* Definição de Matérias */

typedef struct {
    const char* nome;
    const char* professor;
} Materia;

/* Definição de Turnos */

typedef struct {
    Materia materias[7]; // Um array de 7 matérias, uma para cada dia da semana
} Turno;

int main(void) 
{
    setlocale(LC_ALL, "Portuguese");

    /* Definição de Matérias */
    const char* MAT = "Matemática";
    const char* EDF = "Educação Física";
    const char* CIE = "Ciências";
    const char* GEO = "Geografia";
    const char* POR = "Português";
    const char* ING = "Inglês";
    const char* ART = "Artes";

    /* Definição de Professores */
    const char* prof_MatManha = "Prof. Carlos";
    const char* prof_EDFManha = "Prof. Ana";
    const char* prof_CIEManha = "Prof. Pedro";
    const char* prof_GEOManha = "Prof. Marta";
    const char* prof_PORManha = "Prof. Joana";
    const char* prof_INGManha = "Prof. Miguel";
    const char* prof_ARTManha = "Prof. Sofia";

    const char* prof_MatTarde = "Prof. André";
    const char* prof_EDFTarde = "Prof. Renata";
    const char* prof_CIETarde = "Prof. Lucas";
    const char* prof_GEOTarde = "Prof. Júlia";
    const char* prof_PORTarde = "Prof. Renato";
    const char* prof_INGTarde = "Prof. Paula";
    const char* prof_ARTTarde = "Prof. Gabriel";

    /* Definição dos Turnos */
    Turno turnoManha;
    turnoManha.materias[0] = (Materia){MAT, prof_MatManha};
    turnoManha.materias[1] = (Materia){EDF, prof_EDFManha};
    turnoManha.materias[2] = (Materia){CIE, prof_CIEManha};
    turnoManha.materias[3] = (Materia){GEO, prof_GEOManha};
    turnoManha.materias[4] = (Materia){POR, prof_PORManha};
    turnoManha.materias[5] = (Materia){ING, prof_INGManha};
    turnoManha.materias[6] = (Materia){ART, prof_ARTManha};

    Turno turnoTarde;
    turnoTarde.materias[0] = (Materia){MAT, prof_MatTarde};
    turnoTarde.materias[1] = (Materia){EDF, prof_EDFTarde};
    turnoTarde.materias[2] = (Materia){CIE, prof_CIETarde};
    turnoTarde.materias[3] = (Materia){GEO, prof_GEOTarde};
    turnoTarde.materias[4] = (Materia){POR, prof_PORTarde};
    turnoTarde.materias[5] = (Materia){ING, prof_INGTarde};
    turnoTarde.materias[6] = (Materia){ART, prof_ARTTarde};

    int turno, dia;

    printf("Selecione o turno (1 - Manhã, 2 - Tarde): ");
    scanf("%d", &turno);

    if (turno != 1 && turno != 2) {
        printf("Turno inválido.\n");
        return 1;
    }

    printf("Selecione o dia da semana (1 - Segunda, 2 - Terça, ..., 7 - Domingo): ");
    scanf("%d", &dia);

    if (dia < 1 || dia > 7) {
        printf("Dia da semana inválido.\n");
        return 1;
    }

    // Exibindo o resultado
    printf("\n");

    if (turno == 1) {
        printf("Turno da Manhã:\n");
        printf("%s: %s\n", turnoManha.materias[dia - 1].nome, turnoManha.materias[dia - 1].professor);
    } else {
        printf("Turno da Tarde:\n");
        printf("%s: %s\n", turnoTarde.materias[dia - 1].nome, turnoTarde.materias[dia - 1].professor);
    }

    return 0;
}
