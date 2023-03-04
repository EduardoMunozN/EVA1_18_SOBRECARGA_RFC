/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_18_sobrecarga_rfc;

/**
 *
 * @author eduar
 */
public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        String rfc = generarRFC("RUBEN", "MUÑOZ", "NIETO", 04, 12, 21);
        System.out.println(rfc);
    }
    //CALCULAR RFC
    public static String generarRFC(String nombre, String apellidoPat, String apellidoMat, int año, int mes, int dia){
        String ap = apellidoPat.charAt(0)  + "";
        String ap2 = apellidoPat.charAt(1) + "";
        String aM = apellidoMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = ap + ap2 + aM + nom + año + mes + dia + "";
        return rfc;
        }
    //CALCULAR RFC PARA LOS SIGUIENTES DOS CASOS:
    //CALCULAR RFC CON SOLO UN APELLIDO
    //CALCULAR RFC CUANDO FALTEN AMBOS APELLIDOS
    
}
