import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//---------------------------------------------------------
        Inicio inicio = new Inicio();
        Primera primera = new Primera();
        Segunda segunda = new Segunda();
        Tercera tercera = new Tercera();
        Cuarta cuarta = new Cuarta();                       // escenas
        Quinta quinta = new Quinta();
        Sexta sexta = new Sexta();
        Final fin = new Final();
        Creditos creditos = new Creditos();
//--------------------------------------------------------
        int puntos = 0;
        char seleccion1 = ' ';
        inicio.escenaInicio(seleccion1);
        seleccion1 = scanner.nextLine().charAt(0);
//--------------------------------------------------------
        switch (seleccion1) {
            case 'a':
                String nombreJugador = "";
                char menures1 = ' ';
                char menures2 = ' ';
                char respuesta1 = ' ';
                char respuesta2 = ' ';
                char respuesta3 = ' ';
                char respuesta4 = ' ';
                char respuesta5 = ' ';

                inicio.escenaNombre(nombreJugador);
                nombreJugador = scanner.nextLine();
                inicio.escenaHistoria1(nombreJugador, menures1);
                menures1 = scanner.nextLine().charAt(0);
                inicio.escenaHistoria2(menures2);
                menures2 = scanner.nextLine().charAt(0);
                //-----------------------------------------------------------
                primera.pregunta(puntos, nombreJugador, respuesta1);
                respuesta1 = scanner.nextLine().charAt(0);
                if (respuesta1 == 'a') {
                    puntos += 10;
                    primera.correcta(puntos, nombreJugador, menures1);
                    menures1 = scanner.nextLine().charAt(0);
                } else {
                    primera.incorrecta(puntos, nombreJugador, menures2);
                    menures2 = scanner.nextLine().charAt(0);
                }
                //-----------------------------------------------------------
                segunda.pregunta(puntos, nombreJugador, respuesta2);
                respuesta2 = scanner.nextLine().charAt(0);
                if (respuesta2 == 'b') {
                    puntos += 10;
                    segunda.correcta(puntos, nombreJugador, menures1);
                    menures1 = scanner.nextLine().charAt(0);
                } else {
                    segunda.incorrecta(puntos, nombreJugador, menures2);
                    menures2 = scanner.nextLine().charAt(0);
                }
                //-----------------------------------------------------------
                tercera.pregunta(puntos, nombreJugador, respuesta3);
                respuesta3 = scanner.nextLine().charAt(0);
                if (respuesta3 == 'b') {
                    puntos += 10;
                    tercera.correcta(puntos, nombreJugador, menures1);
                    menures1 = scanner.nextLine().charAt(0);
                } else {
                    tercera.incorrecta(puntos, nombreJugador, menures2);
                    menures2 = scanner.nextLine().charAt(0);
                }
                //-----------------------------------------------------------
                cuarta.pregunta(puntos, nombreJugador, respuesta4);
                respuesta4 = scanner.nextLine().charAt(0);
                if (respuesta4 == 'b') {
                    puntos += 10;
                    cuarta.correcta(puntos, nombreJugador, menures1);
                    menures1 = scanner.nextLine().charAt(0);
                } else {
                    cuarta.incorrecta(puntos, nombreJugador, menures2);
                    menures2 = scanner.nextLine().charAt(0);
                }
                //-----------------------------------------------------------
                quinta.pregunta(puntos, nombreJugador, respuesta5);
                respuesta5 = scanner.nextLine().charAt(0);
                if (respuesta5 == 'b') {
                    puntos += 10;
                    quinta.correcta(puntos, nombreJugador, menures1);
                    menures1 = scanner.nextLine().charAt(0);
                } else {
                    quinta.incorrecta(puntos, nombreJugador, menures2);
                    menures2 = scanner.nextLine().charAt(0);
                }
                //-----------------------------------------------------------
                System.out.println("Tu puntuación final es: " + puntos);
                if (puntos >= 30){ sexta.ganaste(puntos);}else{
                    sexta.perdiste(puntos);
                }

                //-----------------------------------------------------------
            break;
            case 'b': // Caso para el "adios "
                fin.escenaFinal();
                break;
            case 'c': //caso para los creditos
                creditos.escenaCreditos();
                break;
            default:
                System.out.println("Ingresaste un opcion Invalida");
        }
    }
}