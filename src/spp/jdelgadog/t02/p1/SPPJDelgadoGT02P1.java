/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.t02.p1;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGT02P1 {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    double sue, pago;
    int cate, he,n;
        System.out.println("Bienvenido al calculador de pago");
        System.out.println("Introduzca la categoría");
        cate=kb.nextInt();
        System.out.println("");
        if(cate>=1&&cate<=8){
           if(cate==1){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=30;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==2){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=38;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==3){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=50;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==4){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=70;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==5){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=80;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==6){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=92;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==7){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=106;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }else if(cate==8){
               sue=mensajePedirSueldo();
               n=mensajePedirHorasExtras();
               he=119;
               pago=sue+n*he;
               System.out.println("Usted debe pagar "+pago);
           }
               }else{
            System.out.println("Categoría inválida");    
        }
    }
    static double mensajePedirSueldo(){
        Scanner kb=new Scanner(System.in);
        double sue;
        System.out.println("Introduzca el sueldo");
        sue=kb.nextDouble();
        return sue;
    }
    static int mensajePedirHorasExtras(){
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Introduzca las horas extra");
        n=kb.nextInt();
        return n;
    }
}

