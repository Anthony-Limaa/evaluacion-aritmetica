package org.example;

import org.example.Pilas.PilaLineal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void palindromo(){
        PilaLineal pila = new PilaLineal();
        String palabra = "oso";
        String palabraInvertida="";

        //Creamos la pila con la palabra
        for(int i = 0; i< palabra.length();i++){
            try{

                pila.insertar(palabra.charAt(i));
            }catch (Exception ex){
              System.out.println("Problema al insertar: "+ex.getMessage());
            }
        }

        //Se comprueba si es palindromo
        while(!pila.pilaVacia()){
            try{
                palabraInvertida += pila.quitar();

            }catch (Exception ex){
                System.out.println("Error comprobado.");
            }
        }

        if (palabraInvertida.equals(palabra)){
            System.out.println("Simón, es un palíndromo");
        } else{
            System.out.println("nel, no lo es");
        }

    }


    public static void main(String[] args) {
//
//        PilaLineal pil = new PilaLineal();
//
//        try{
//            pil.insertar("Hola");
//            pil.insertar("Mundo");
//            pil.insertar("Esta");
//            pil.insertar("Es una");
//            pil.insertar("Pila");
//
//            while(!pil.pilaVacia()){
//                System.out.println("Elemento saliente: "+pil.quitar());
//            }
//
//        } catch(Exception ex){
//            System.out.println("ups, hay un problema"+ex.getMessage());
//        }

        palindromo();
   }
}