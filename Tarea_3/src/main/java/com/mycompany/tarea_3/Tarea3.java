/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tarea3 {; 
    boolean exit;
    private static String[][] comisiones = new String [3][6];
    
    public void correrMenu(){
        imprimirEncabezado();
        while(!exit){
            imprimirMenu();
            int eleccion = getInput();
            realizarAccion(eleccion);
        }
    }
    public void imprimirEncabezado(){
        System.out.println("+-------------------------+");
        System.out.println("      Bienvenido a         ");
        System.out.println("     la Aplicacion         ");
        System.out.println("+-------------------------+");
        
    }
    public void imprimirMenu(){
        System.out.println("\nPorfavor hacer una seleccion: ");
        System.out.println("1) Ingresar informacion");
        System.out.println("2) Consultas");
        System.out.println("3) Editar");
        System.out.println("4) Busquedas");
        System.out.println("5) Mostrar matriz");
        System.out.println("0) Salir");
    }
    private int getInput(){
        Scanner kb = new Scanner(System.in); 
        int eleccion = -1;
        while(eleccion < 0 || eleccion > 5){
            try {
                eleccion = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
               System.out.println("Seleccion Invalida. Intente de nuevo.");
            }
        }
        return eleccion;
    }
    
     private void realizarAccion(int eleccion){
        switch(eleccion){
            case 0:
                exit = true;
                System.out.println("Gracias! tenga un buen dia..");
                break;
            case 1:
                ingresoDatos();
                break;
            case 2:
                consulta();
                break;
            case 3:
                editar();
                break;
            case 4:
                busqueda();
                break;
            case 5:
                imprimirDecorado();
                break;
            default:
                System.out.println("Un error inexplicable ha ocurrido.");
        }
    }
     
    public static void consulta(){
       int arr[] = {Integer.parseInt(comisiones[0][TOTAL]), Integer.parseInt(comisiones[1][TOTAL]), Integer.parseInt(comisiones[2][TOTAL])};
        int max = Arrays.stream(arr).max().getAsInt();
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][TOTAL]) != max){
                
            }else{
                System.out.println("El mayor Total pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][TOTAL]);
            }
        }
        int arrE[] = {Integer.parseInt(comisiones[0][ENERO]), Integer.parseInt(comisiones[1][ENERO]), Integer.parseInt(comisiones[2][ENERO])};
        int maxE = Arrays.stream(arrE).max().getAsInt();
        int minE = Arrays.stream(arrE).min().getAsInt();
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][ENERO]) != maxE){
                
            }else{
                System.out.println("El mayor Total de Enero pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][ENERO]);
            }
        }
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][ENERO]) != minE){
                
            }else{
                System.out.println("El menor Total de Enero pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][ENERO]);
            }
        }
        int arrF[] = {Integer.parseInt(comisiones[0][FEBRERO]), Integer.parseInt(comisiones[1][FEBRERO]), Integer.parseInt(comisiones[2][FEBRERO])};
        int maxF = Arrays.stream(arrF).max().getAsInt();
        int minF = Arrays.stream(arrF).min().getAsInt();
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][FEBRERO]) != maxF){
                
            }else{
                System.out.println("El mayor Total de Febrero pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][FEBRERO]);
            }
        }
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][FEBRERO]) != minF){
                
            }else{
                System.out.println("El menor Total de Febrero pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][FEBRERO]);
            }
        }
        int arrM[] = {Integer.parseInt(comisiones[0][MARZO]), Integer.parseInt(comisiones[1][MARZO]), Integer.parseInt(comisiones[2][MARZO])};
        int maxM = Arrays.stream(arrM).max().getAsInt();
        int minM = Arrays.stream(arrM).min().getAsInt();
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][MARZO]) != maxM){
                
            }else{
                System.out.println("El mayor Total de Marzo pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][MARZO]);
            }
        }
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][MARZO]) != minM){
                
            }else{
                System.out.println("El menor Total de Marzo pertenece a: "+comisiones[x][NOMBRE]+" con un total de: "+comisiones[x][MARZO]);
            }
        }
    }
    public static void busqueda(){
        Scanner teclado = new Scanner(System.in);
        
        String buscar;
        System.out.println("Introduzca una cantidad para su busqueda: ");
        buscar = teclado.nextLine();
        int y = Integer.parseInt(buscar);
        
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][ENERO]) != y){
                
            }else{
                System.out.println("La persona que realizo dicha venta es: "+comisiones[x][NOMBRE]+" en el mes de Enero");
            }
        }
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][FEBRERO]) != y){
                
            }else{
                System.out.println("La persona que realizo dicha venta es: "+comisiones[x][NOMBRE]+" en el mes de Febrero");
            }
        }
        for (int x = 0; x < comisiones.length; x++){
            if (Integer.parseInt(comisiones[x][MARZO]) != y){
                
            }else{
                System.out.println("La persona que realizo dicha venta es: "+comisiones[x][NOMBRE]+" en el mes de Marzo");
            }
        }
        
    }
    public static void editar(){
        Scanner teclado = new Scanner(System.in);
        
        int y;
        int x;
        int z;
        System.out.println("Introduce la fila que deseas modificar: ");
        x = Integer.parseInt(teclado.nextLine());
        System.out.println("Dado el mes, introduce el numero correspondiente de el que quieres modificar:  ");
        y = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la nueva cantidad: ");
        z = Integer.parseInt(teclado.nextLine());
        String A = Integer.toString(z);
        comisiones[x][y] = A;
        
        calcular();
        calcularColumnas();
    }
     
    public static void calcular(){
       int z = Integer.parseInt(comisiones[0][ENERO])+Integer.parseInt(comisiones[0][FEBRERO])+Integer.parseInt(comisiones[0][MARZO]);
       int p = z/comisiones.length;
       String d = Integer.toString(z);
       String t = Integer.toString(p);
       comisiones[0][TOTAL] = d;
       comisiones[0][PROMEDIO] = t;
       z = Integer.parseInt(comisiones[1][ENERO])+Integer.parseInt(comisiones[1][FEBRERO])+Integer.parseInt(comisiones[1][MARZO]);
       p = z/comisiones.length;
       d = Integer.toString(z);
       t = Integer.toString(p);
       comisiones[1][TOTAL] = d;
       comisiones[1][PROMEDIO] = t;
       z = Integer.parseInt(comisiones[2][ENERO])+Integer.parseInt(comisiones[2][FEBRERO])+Integer.parseInt(comisiones[2][MARZO]);
       p = z/comisiones.length;
       d = Integer.toString(z);
       t = Integer.toString(p);
       comisiones[2][TOTAL] = d;
       comisiones[2][PROMEDIO] = t;
       
    }
    public static void calcularColumnas(){
        int z = 0;
        for (int x = 0; x < comisiones.length; x++ ){
            z = z + Integer.parseInt(comisiones[x][ENERO]);
        }
        System.out.println("Sumatoria de Enero: "+z);
        z = 0;
        for (int x = 0; x < comisiones.length; x++ ){
            z = z + Integer.parseInt(comisiones[x][FEBRERO]);
        }
        System.out.println("Sumatoria de Febrero: "+z);
        z = 0;
        for (int x = 0; x < comisiones.length; x++ ){
            z = z + Integer.parseInt(comisiones[x][MARZO]);
        }
        System.out.println("Sumatoria de Marzo: "+z);
    }
    
    public static void imprimirDecorado(){
        calcular();
        calcularColumnas();
        for (int x=0; x<comisiones.length; x++){
            System.out.print("|");
            for(int y=0; y<comisiones[x].length; y++){
                System.out.print(comisiones[x][y]);
                if(y!=comisiones[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    private static final int NOMBRE = 0;
    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int TOTAL = 4;
    private static final int PROMEDIO = 5;
    
    public static void cargaInformacion(int fila){
        Scanner t = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre "+(fila+1));
        comisiones[fila][NOMBRE] = t.nextLine();
         System.out.println("Ingrese Enero ");
        comisiones[fila][ENERO] = t.nextLine();
         System.out.println("Ingrese Febrero ");
        comisiones[fila][FEBRERO] = t.nextLine();
         System.out.println("Ingrese Marzo ");
        comisiones[fila][MARZO] = t.nextLine();
    }
    
    public static void ingresoDatos(){
        for (int i = 0; i < 3; i++) {
            cargaInformacion(i);
    }
}    
    public static void main(String[] args){
        Tarea3 menu = new Tarea3();
        menu.correrMenu();
        
    } 
}
