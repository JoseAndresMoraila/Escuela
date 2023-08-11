#include <stdio.h>
#include <string.h>
#include <ctype.h>

void LeerArchivos() {
    FILE* ArchivoOrigenLeer;
    int Vocales = 0, Consonantes = 0, Digitos = 0;
    char Leyendo[200]; // Es lo que pusimos de capacidad del mensaje en CrearArchivos
    char NombreArchivoBuscarPonerle[30];
    printf("Ingresa el nombre del archivo que quieres leer para saber cuantas vocales, consonantes y digitos tiene: ");
    fgets(NombreArchivoBuscarPonerle, sizeof(NombreArchivoBuscarPonerle), stdin);
    if(NombreArchivoBuscarPonerle[strlen(NombreArchivoBuscarPonerle)-1]=='\n'){
        NombreArchivoBuscarPonerle[strlen(NombreArchivoBuscarPonerle)-1]='\0';
    }
    char NombreBuscar[35];
    sprintf(NombreBuscar, "%s.txt", NombreArchivoBuscarPonerle);//Concatenamos para añadirle .txt
    ArchivoOrigenLeer = fopen(NombreBuscar, "rt");
    if (ArchivoOrigenLeer == NULL) {
        printf("No se encontró el archivo con ese nombre\n");
        printf("\n");
    }
    else {
        printf("Se encontró el archivo...\n");
        printf("Lo que hay en el archivo es:\n");
        printf("\"");
        while (fgets(Leyendo, sizeof(Leyendo), ArchivoOrigenLeer)) {
            printf("%s", Leyendo); // Aquí se imprime el texto
            //A partir de aquí se hace un for para recorrer caracter por caracter de la cadena para comprobar si tiene vocal, consonante o dígito
            for (int i = 0; Leyendo[i] != '\0'; i++) {//Se compara hasta que el caracter de la cadena no sea igual a nulo, es decir que no sea el final
                char c = tolower(Leyendo[i]); // Convertir el carácter a minúscula para comparaciones
                if (isalpha(c)) {//Verifica si es una letra, en el caso que lo sea, entra en otro if para difeenciar entre vocales y consonantes
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        Vocales++;
                    }
                    else {
                        Consonantes++;
                    }
                }
                else if (isdigit(c)) {
                    Digitos++;
                }
            }
        }
        printf("\"");
        printf("\n");

        printf("Cantidad de vocales: %d\n", Vocales);
        printf("Cantidad de consonantes: %d\n", Consonantes);
        printf("Cantidad de dígitos: %d\n", Digitos);
        printf("\n");
        fclose(ArchivoOrigenLeer);
    }
}


void CrearArchivos() {
    FILE* ArchivoOrigen;
    char MensajeOrigen[200] = ""; // Reiniciar a una cadena vacía si queremos volver a usar la función
    char Linea[200];

    printf("Escribe lo que quieres poner en el archivo origen (presiona Enter dos veces para finalizar):\n");

    while (fgets(Linea, sizeof(Linea), stdin)) {/*
            fgets sirve para entrada de datos, por lo que se hace es que en el primer parametro se guadará en Linea, seguido del tamaño de caracteres que
            tiene Linea y el tercer parametro será por entrada del teclado es decir lo escribiremos nosotros.
            */
        if (strcmp(Linea, "\n") == 0) {// Compara si lo que pusimos en Linea es decir en un renglon es unicamente un salto de linea
            break;//Eso quiere decir que ya termianos de escribir y se saldrá para no poner mas texto
            //Hay que recordar que en Linea se guarda unicamente lo que pngamos en el renglón y no es el texto completo
        }
        strcat(MensajeOrigen, Linea);//Se concatena en MensajeOrigen lo que se puso en Linea por cada Enter que presionemos: Esta funsion admite solo dos parametros
    }

    if (MensajeOrigen[strlen(MensajeOrigen) - 1] == '\n') {//Compara si el ultimo espacio de la cadena es igual a un salto de linea
        MensajeOrigen[strlen(MensajeOrigen) - 1] = '\0';//Se indica que el final es terminación de una cadena en el caso que sea un salto de linea
    }

    printf("Lo que pusiste fue:\n\"%s\"\nY se pondrá en el archivo.\n", MensajeOrigen);

    char NombreaPonerle[30];
    printf("Pero antes dime el nombre que le quieres poner a tu archivo: ");
    fgets(NombreaPonerle, sizeof(NombreaPonerle), stdin);
    if(NombreaPonerle[strlen(NombreaPonerle)-1]=='\n'){
        NombreaPonerle[strlen(NombreaPonerle)-1]='\0';
    }

    char NombreArchivo[35];
    sprintf(NombreArchivo, "%s.txt", NombreaPonerle); /* Concatenamos para añadirle .txt al nombre del archivo
    es deci en NombreArchivo se guardará lo que se puso en %s.txt y despues otro parametro que es el nombre que le queremos poner.
    Esta funcion admite varios parametros
    */

    ArchivoOrigen = fopen(NombreArchivo, "wt");
    if (ArchivoOrigen == NULL) {
        printf("No se pudo abrir el archivo");
        return;
    }

    fprintf(ArchivoOrigen, "%s", MensajeOrigen);
    fclose(ArchivoOrigen);
}

int main() {
    int Eleccion;

    do {
        printf("0.- Salir\n1.- Crear\n2.- Leer\nHola, ¿Quieres crear un archivo de texto o leer un archivo? ");
        scanf("%d", &Eleccion);
        getchar();//Como scanf deja un salto de linea entonces lo pondremos para que lo consuma

        if (Eleccion == 1) {
            CrearArchivos();
        }
        else if(Eleccion==2){
            LeerArchivos();
        }
    } while (Eleccion != 0);

    return 0;
}
