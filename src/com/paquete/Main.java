package com.paquete;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //declaracion de elementos
        String entradaTexto= "0", N_riesgo="", Ent_accion="";
        int  cont_vig=0 ,cont=0;
        float suma= 0, promedio= 0, max= 0;

        entradaTexto = scanner.nextLine();
        String[] textonumerico = entradaTexto.split(" ");
        cont=textonumerico.length;
        int vector [] = new int [cont];

        for(int iterate=0;iterate<cont;iterate++){
            vector [iterate] = Integer.parseInt(textonumerico[iterate]);
            suma += vector[iterate];
            if (0 <= vector[iterate] && vector[iterate]<=5) {
                cont_vig++;
            }if(max<= vector[iterate] ){
                max= vector[iterate];
            }
        }
        promedio = suma / cont;
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

    }
}
