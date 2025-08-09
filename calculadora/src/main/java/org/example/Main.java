package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean seguirCalculando = true;

            System.out.println("🧮 ¡Bienvenido a tu calculadora en Java!");
            System.out.println("Puedes hacer operaciones básicas (+, -, *, /) y también calcular raíces cuadradas (sqrt).");

            while (seguirCalculando) {
                try {

                    System.out.print("\n👉 Ingresa el primer número: ");
                    double numero1 = Double.parseDouble(scanner.nextLine());


                    System.out.print("🔣 ¿Qué operación quieres hacer? (+, -, *, /, sqrt): ");
                    String operacion = scanner.nextLine().trim();

                    double resultado;

                    if (operacion.equalsIgnoreCase("sqrt")) {
                        if (numero1 < 0) {
                            System.out.println("⚠️ No se puede calcular la raíz cuadrada de un número negativo.");
                            continue;
                        }
                        resultado = Math.sqrt(numero1);
                        System.out.println("✅ Resultado: √" + numero1 + " = " + resultado);
                    } else {

                        System.out.print("👉 Ingresa el segundo número: ");
                        double numero2 = Double.parseDouble(scanner.nextLine());


                        switch (operacion) {
                            case "+":
                                resultado = numero1 + numero2;
                                break;
                            case "-":
                                resultado = numero1 - numero2;
                                break;
                            case "*":
                                resultado = numero1 * numero2;
                                break;
                            case "/":
                                if (numero2 == 0) {
                                    System.out.println("⚠️ No puedes dividir por cero. Intenta otra operación.");
                                    continue;
                                }
                                resultado = numero1 / numero2;
                                break;
                            default:
                                System.out.println("❌ Operación no reconocida. Usa +, -, *, / o sqrt.");
                                continue;
                        }


                        System.out.println("✅ Resultado: " + numero1 + " " + operacion + " " + numero2 + " = " + resultado);
                    }


                    System.out.print("\n¿Quieres hacer otra operación? (s/n): ");
                    seguirCalculando = scanner.nextLine().trim().equalsIgnoreCase("s");

                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Entrada inválida. Asegúrate de escribir números válidos.");
                }
            }

            System.out.println("\n👋 Gracias por usar la calculadora. ¡Hasta la próxima!");
            scanner.close();
        }
    }

