package com.company;
import java.util.Scanner;
public class Calculador {
    private int Cuenta;
    private  int Cantidad;
    private int Opcion;

    public void InicioMenu(){

      do {
          InicioMenu1();
          Scanner sc = new Scanner(System.in);
          Opcion = sc.nextInt();
          ComprobarOpcion(Opcion);
      }while(Opcion!=4);
    }
    private void ComprobarOpcion(int Opcion){
        switch (Opcion){
            case 1:
                Ingreso();
                Cuenta=Cuenta+Cantidad;
                break;
            case 2:
                Sacar();
                Cuenta=Cuenta-Cantidad;
                break;
            case 3:
                System.out.println("El total de su cuenta es: "+Cuenta);
                break;
            case 4:
                System.out.println("Gracias por dejar que tu banco te robe.");
                break;
            default:
                System.out.println("La opcion introducida no es valida");
        }
    }
    private void InicioMenu1(){
        System.out.println("==============MENU===============");
        System.out.println("1.Ingresar");
        System.out.println("2.Sacar");
        System.out.println("3.Ver Total");
        System.out.println("4.Salir");
        System.out.println("=================================");
        System.out.print("Eliga una Opcion:");
        }

    private void Ingreso(){
        System.out.print("Introduzca cantidad:");
        Scanner sc=new Scanner(System.in);
        Cantidad=sc.nextInt();
        }
    private void Sacar(){
        System.out.print("Introduzca cantidad:");
        Scanner sc=new Scanner(System.in);
        Cantidad=sc.nextInt();
    }


}
