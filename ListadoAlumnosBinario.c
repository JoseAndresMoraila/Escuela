#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int Elegir(){
    int Numero;
    printf("LISTADO PARCIALES\n0.- Salir\n1.- Guardar alumno\n2.- Ver listado\n3.- Ver a reprobados\n4.- Ver a aprobados\n5.- Limpiar consola\n¿Cual quieres hacer? ");
    scanf("%d", &Numero);
    getchar();
    printf("\n");
    return Numero;
}

typedef struct {
    char Nombre[35];
    int PrimerParcial;
    int SegundoParcial;
    int TercerParcial;
    float Promedio;
} InfoAlumnos; //Definimos InfoAlumnos como un tipo de dato

void GuardarAlumnos() {
    FILE* ArchivoGuardar;
    char NombreArchivo[30];

    printf("Primero pon que nombre le quieres poner al archivo (Si ya existe se agregará contenido): ");
    fgets(NombreArchivo, sizeof(NombreArchivo), stdin);
    if (NombreArchivo[strlen(NombreArchivo) - 1] == '\n') {
        NombreArchivo[strlen(NombreArchivo) - 1] = '\0';
    }

    char NombreGuardarBIN[35];
    sprintf(NombreGuardarBIN, "%s.bin", NombreArchivo);

    int CuantosAlumnos;
    printf("¿Cuantos alumnos quieres guardar? ");
    scanf("%d", &CuantosAlumnos);
    getchar();

    InfoAlumnos Alumno;//Creamos una variable Alumno de tipo estrucura con datos que le pusmos que debe llevar
    ArchivoGuardar = fopen(NombreGuardarBIN, "ab"); // Abrir el archivo en modo escritura binaria y si ya existe añade contenido

    if (ArchivoGuardar == NULL) {
        printf("Error al abrir el archivo\n");
        return;
    }

    for (int Itirenador = 0; Itirenador < CuantosAlumnos; Itirenador++) {

        printf("Escribe el nombre del alumno %d: ", Itirenador + 1);
        fgets(Alumno.Nombre, sizeof(Alumno.Nombre), stdin);
        if (Alumno.Nombre[strlen(Alumno.Nombre) - 1] == '\n') {
            Alumno.Nombre[strlen(Alumno.Nombre) - 1] = '\0';
        }

        printf("Ahora la calificación del parcial 1: ");
        scanf("%d", &Alumno.PrimerParcial);
        printf("Ahora la calificación del parcial 2: ");
        scanf("%d", &Alumno.SegundoParcial);
        printf("Ahora la calificación del parcial 3: ");
        scanf("%d", &Alumno.TercerParcial);
        getchar();
        Alumno.Promedio=(Alumno.PrimerParcial+Alumno.SegundoParcial+Alumno.TercerParcial)/3.0;

        fwrite(&Alumno, sizeof(InfoAlumnos), 1, ArchivoGuardar); // Escribir la estructura en el archivo
        //En el primer parametro ponemos de que variable queremos mandar la informacion, en el segundo sifeof ponemos que tipo de dato es, en el tercer cuantas varaibles o datos y luego el archivo donde se gaudará
    }

    fclose(ArchivoGuardar); // Cerrar el archivo
}


void LeerAlumnos(){
    FILE* ArchivoAbrir;
    int Aprobados=0, Reprobados=0;
    char NombreArchivo[30];
    printf("Pon el nombre del archivo que quieres leer: ");
    fgets(NombreArchivo, sizeof(NombreArchivo), stdin);
    if (NombreArchivo[strlen(NombreArchivo) - 1] == '\n') {
        NombreArchivo[strlen(NombreArchivo) - 1] = '\0';
    }
    char NombreArchivoBIN[35];
    sprintf(NombreArchivoBIN, "%s.bin", NombreArchivo);
    ArchivoAbrir=fopen(NombreArchivoBIN, "rb");
    if(ArchivoAbrir==NULL){
        printf("No se encontró un archivo binario con ese nombre.");
        return;
    }
    InfoAlumnos Alumno;
    while (fread(&Alumno, sizeof(InfoAlumnos), 1, ArchivoAbrir) == 1) {
        // Mostrar los datos del alumno. Lo mismo que write pero a la inversa
        printf("Nombre: %s\n", Alumno.Nombre);
        printf("Parcial 1: %d\n", Alumno.PrimerParcial);
        printf("Parcial 2: %d\n", Alumno.SegundoParcial);
        printf("Parcial 3: %d\n", Alumno.TercerParcial);
        printf("Promedio: %.1f\n", Alumno.Promedio);
        printf("-------------------------\n");
        if(Alumno.Promedio<=5.9){
                Reprobados++;
        }
        else{
            Aprobados++;
        }
    }
    printf("Aprobados: %d\n", Aprobados);
    printf("Reprobados: %d\n", Reprobados);
    printf("\n");
    fclose(ArchivoAbrir);

}

void VerReprobados(){
FILE* ArchivoAbrir;
    int Mensaje=0;
    char NombreArchivo[30];
    printf("Pon el nombre del archivo que quieres leer para ver a reprobados: ");
    fgets(NombreArchivo, sizeof(NombreArchivo), stdin);
    if (NombreArchivo[strlen(NombreArchivo) - 1] == '\n') {
        NombreArchivo[strlen(NombreArchivo) - 1] = '\0';
    }
    char NombreArchivoBIN[35];
    sprintf(NombreArchivoBIN, "%s.bin", NombreArchivo);
    ArchivoAbrir=fopen(NombreArchivoBIN, "rb");
    if(ArchivoAbrir==NULL){
        printf("No se encontró un archivo binario con ese nombre.");
        return;
    }
    InfoAlumnos Alumno;
    while (fread(&Alumno, sizeof(InfoAlumnos), 1, ArchivoAbrir) == 1) {
            if(Alumno.Promedio<=5.9){
            // Mostrar los datos del alumno
            printf("Nombre: %s\n", Alumno.Nombre);
            printf("Parcial 1: %d\n", Alumno.PrimerParcial);
            printf("Parcial 2: %d\n", Alumno.SegundoParcial);
            printf("Parcial 3: %d\n", Alumno.TercerParcial);
            printf("Promedio: %.1f\n", Alumno.Promedio);
            printf("-------------------------\n");
            Mensaje=1;
        }
    }
    if(Mensaje==0){
        printf("No hay ningún reprobado\n");
    }
    printf("\n");
    fclose(ArchivoAbrir);
}

void VerAprobados(){
FILE* ArchivoAbrir;
    char NombreArchivo[30];
    int Mensaje=0;
    printf("Pon el nombre del archivo que quieres leer para ver aprobados: ");
    fgets(NombreArchivo, sizeof(NombreArchivo), stdin);
    if (NombreArchivo[strlen(NombreArchivo) - 1] == '\n') {
        NombreArchivo[strlen(NombreArchivo) - 1] = '\0';
    }
    char NombreArchivoBIN[35];
    sprintf(NombreArchivoBIN, "%s.bin", NombreArchivo);
    ArchivoAbrir=fopen(NombreArchivoBIN, "rb");
    if(ArchivoAbrir==NULL){
        printf("No se encontró un archivo binario con ese nombre.");
        return;
    }
    InfoAlumnos Alumno;
    while (fread(&Alumno, sizeof(InfoAlumnos), 1, ArchivoAbrir) == 1) {
            if(Alumno.Promedio>=6.0){
            // Mostrar los datos del alumno
            printf("Nombre: %s\n", Alumno.Nombre);
            printf("Parcial 1: %d\n", Alumno.PrimerParcial);
            printf("Parcial 2: %d\n", Alumno.SegundoParcial);
            printf("Parcial 3: %d\n", Alumno.TercerParcial);
            printf("Promedio: %.1f\n", Alumno.Promedio);
            printf("-------------------------\n");
            Mensaje=1;
        }
    }
    if(Mensaje==0){
        printf("No hay ningún aprobado\n");
    }
    printf("\n");
    fclose(ArchivoAbrir);
}

void LimpiarConsola(){
    system("cls");
}

int main(){

int Eleccion;
    do{
        Eleccion=Elegir();
        switch(Eleccion){
        case 1:
            GuardarAlumnos(); break;
        case 2:
            LeerAlumnos(); break;
        case 3:
            VerReprobados(); break;
        case 4:
            VerAprobados(); break;
        case 5:
            LimpiarConsola(); break;
        }
    }while(Eleccion!=0);

return 0;
}
