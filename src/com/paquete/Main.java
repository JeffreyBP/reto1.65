package com.paquete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        float vector[] = new float[7];
        int itera, limite=7, suma=0, cont_vig=0 ;
        float promedio=0, max=0;
        String N_riesgo="", Ent_accion="";

        for(itera=0; itera<limite; itera++){
            vector[itera]=lector.nextFloat();
            suma += vector[itera];
            if (0 <= vector[itera] && vector[itera]<=5) {
                cont_vig++;
            }if(max<= vector[itera] ){
                max= vector[itera];
            }
        }
        promedio = suma/limite;
        if (0<=promedio && promedio<=5){
            N_riesgo = "SIN RIESGO";
            Ent_accion="Continuar el control y la vigilancia";
        }else if (5.1<=promedio && promedio<=14){
            N_riesgo = "BAJO";
        }else if(14.1<=promedio && promedio<=35){
            N_riesgo = "MEDIO";
        }else if(35.1<=promedio && promedio<=80){
            N_riesgo = "ALTO";
        }else if(80.1<=promedio && promedio<=100){
            N_riesgo = "INVIABLE SANITARIAMENTE";
        }
        System.out.println(Ent_accion+"\t"+N_riesgo+"\t"+cont_vig+"\t"+max );


        /*
        System.out.println("Primera impresion" );
        System.out.print("segunda impresión");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Leyendo datos usando readLine
        String name = reader.readLine();

        // Imprimir la línea de lectura
        System.out.println(name);

	 */
    }
}
