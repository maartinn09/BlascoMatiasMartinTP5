/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarreglo;

/**
 *
 * @author M
 */
public class Arreglo 
{
    public static void sumarLista(int numeros[])
    {
        double prom=0,suma=0;
        for(int i=0;i<numeros.length;i++)
        {
            suma+=numeros[i];
            prom=suma/numeros.length;
        }
        System.out.println("Suma de numeros "+suma);
        System.out.println("Promedio de "+prom);
    }
    
    public static void buscarMayor(int numerosuni[][])
    {
        int mayor=numerosuni[0][0];
        System.out.println("La matriz es: ");
        for(int[] fila:numerosuni)
        {
            for(int j=0;j<numerosuni.length;j++)
            {
                System.out.print(fila[j]);
            }
            System.out.println("");
        }
        //Encontrar el mayor
        for(int[] fila:numerosuni)
        {
            for(int j=0;j<numerosuni.length;j++)
            {
                if(fila[j]>mayor)
                {
                    mayor=fila[j];
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor);
    }
    
    public static void cuentaVocales(String palabra)
    {
       int contador=0;
       for(int i=0;i<palabra.length();i++)
       {
           if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u'))
           { 
                contador++;
           }
       }
        System.out.println("La palabra contiene "+contador+" vocales");
    }
    
    public static void contarCaracteres(String p, char caracter)
    {
        int posicion, contador = 0;
        posicion = p.indexOf(caracter);
        while (posicion != -1)
        { 
            contador++;
            posicion = p.indexOf(caracter, posicion + 1);
        }
        System.out.println("El caracter se repite "+contador+" veces");
   }
}

