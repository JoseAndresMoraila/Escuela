#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

int Elegir(){
    int Numero;
    printf("CONVERSOR\n0.- Salir\n1.- De mayusculas a minusculas\n2.- De minusculas a mayusculas\n3.- Limpiar consola\n¿Cual quieres hacer? ");
    scanf("%d", &Numero);
    getchar();
    printf("\n");
    return Numero;
}

void ConvertToMinusculas() {
    FILE* ArchivoParaLeer;
    FILE* ArchivoToMinusculas;
    char Leyendo[200] = "";
    char TextoMinusculo[200]="";

    char BuscarArchivo[30];
    printf("Pon el nombre del archivo del cual quieres convertir todo a minúsculas: ");
    fgets(BuscarArchivo, sizeof(BuscarArchivo), stdin);
    if (BuscarArchivo[strlen(BuscarArchivo) - 1] == '\n') {
        BuscarArchivo[strlen(BuscarArchivo) - 1] = '\0';
    }

    char BuscarArchivoTXT[35];
    sprintf(BuscarArchivoTXT, "%s.txt", BuscarArchivo);
    ArchivoParaLeer = fopen(BuscarArchivoTXT, "rt");
    if (ArchivoParaLeer == NULL) {
        printf("No se encontró un archivo con ese nombre\n");
        printf("\n");
        return;
    }

    char NombreNuevoArchivo[46];
    sprintf(NombreNuevoArchivo, "%s_Minuscula.txt", BuscarArchivo);
    ArchivoToMinusculas = fopen(NombreNuevoArchivo, "wt");
    if (ArchivoToMinusculas == NULL) {
        printf("No se pudo crear el archivo");
        fclose(ArchivoParaLeer);
        return;
    }

    printf("Lo que dice es:\n\"");
    while (fgets(Leyendo, sizeof(Leyendo), ArchivoParaLeer)) {//fgets lee lineas de texto o renglones hasya que ya no haya más
        printf("%s", Leyendo);//Imprime el primer renglón en la primera vuelta y el segundo en la siguiente
        if(TextoMinusculo[strlen(TextoMinusculo)-1]=='\n'){
                TextoMinusculo[strlen(TextoMinusculo)-1]='\0';
        }
        int i = 0;
        while (Leyendo[i] != '\0') {
            TextoMinusculo[i] = tolower(Leyendo[i]);//Convierte el primer renglón a minusuculas y el segundo en la siguiente
            i++;
        }
        fputs(TextoMinusculo, ArchivoToMinusculas);//Agrega el primer renglón al nuevo archivoy el segundo en la siguiente
    }
    printf("\"");

    printf("\nY se acaba de convertir todo en minúsculas en un archivo nuevo\n");
    printf("\n");

    fclose(ArchivoToMinusculas);
    fclose(ArchivoParaLeer);
}

void ConvertToMayusculas(){

    FILE* ArchivoParaLeer;
    FILE* ArchivoToMinusculas;
    char Leyendo[200] = "";
    char TextoMayusculo[200]="";

    char BuscarArchivo[30];
    printf("Pon el nombre del archivo del cual quieres convertir todo a mayusculas: ");
    fgets(BuscarArchivo, sizeof(BuscarArchivo), stdin);
    if (BuscarArchivo[strlen(BuscarArchivo) - 1] == '\n') {
        BuscarArchivo[strlen(BuscarArchivo) - 1] = '\0';
    }

    char BuscarArchivoTXT[35];
    sprintf(BuscarArchivoTXT, "%s.txt", BuscarArchivo);
    ArchivoParaLeer = fopen(BuscarArchivoTXT, "rt");
    if (ArchivoParaLeer == NULL) {
        printf("No se encontró un archivo con ese nombre\n");
        printf("\n");
        return;
    }

    char NombreNuevoArchivo[46];
    sprintf(NombreNuevoArchivo, "%s_Mayuscula.txt", BuscarArchivo);
    ArchivoToMinusculas = fopen(NombreNuevoArchivo, "wt");
    if (ArchivoToMinusculas == NULL) {
        printf("No se pudo crear el archivo");
        fclose(ArchivoParaLeer);
        return;
    }

    printf("Lo que dice es:\n\"");
    while (fgets(Leyendo, sizeof(Leyendo), ArchivoParaLeer)) {//fgets lee lineas de texto o renglones hasya que ya no haya más
        printf("%s", Leyendo);//Imprime el primer renglón en la primera vuelta y el segundo en la siguiente
        if(TextoMayusculo[strlen(TextoMayusculo)-1]=='\n'){
                TextoMayusculo[strlen(TextoMayusculo)-1]='\0';
        }
        int i = 0;
        while (Leyendo[i] != '\0') {
            TextoMayusculo[i] = toupper(Leyendo[i]);//Convierte el primer renglón a minusuculas y el segundo en la siguiente
            i++;
        }
        fputs(TextoMayusculo, ArchivoToMinusculas);//Agrega el primer renglón al nuevo archivoy el segundo en la siguiente
    }
    printf("\"");

    printf("\nY se acaba de convertir todo en mayusculas en un archivo nuevo\n");
    printf("\n");

    fclose(ArchivoToMinusculas);
    fclose(ArchivoParaLeer);
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
            ConvertToMinusculas(); break;
        case 2:
            ConvertToMayusculas(); break;
        case 3:
            LimpiarConsola(); break;
        }
    }while(Eleccion!=0);

return 0;
}
