import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {


            System.out.println("**** Aplicacion Calculadora ****");

            //Menu
            System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Division
                    5.Salir
                    """);
            System.out.println("Operacion a realizar?");
            try {

                var operacion = Integer.parseInt(consola.nextLine());


                //revisar opciones del menu

                if (operacion >= 1 && operacion <= 4) {


                    System.out.println("Proporciona valor operando1: ");
                    var operando1 = Integer.parseInt(consola.nextLine()); //netxLine devuelve String , hay que parsearlo a entero

                    System.out.println("Proporciona valor operando2");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;
                    switch (operacion) {
                        case 1 -> {
                            resultado = operando1 + operando2;
                            System.out.println("resultado suma: " + resultado);
                        }
                        case 2 -> {
                            resultado = operando1 - operando2;
                            System.out.println("resultado resta: " + resultado);
                        }
                        case 3 -> {
                            resultado = operando1 * operando2;
                            System.out.println("resultado multiplicacion: " + resultado);
                        }
                        case 4 -> {
                            resultado = operando1 / operando2;
                            System.out.println("resultado division: " +
                                    "" + resultado);


                        }
                        default -> {
                            System.out.println("opcion erronea: " + operacion);
                        }

                    }
                } else if (operacion == 5) {
                    System.out.println("hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);

                }

            } catch (Exception e){
                System.out.println("ocurrio un error:" + e.getMessage());
            }

        } //fin while
    }//fin main
}

