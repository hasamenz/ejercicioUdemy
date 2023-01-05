package tareas.udemy.com.SegundaTarea;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){
        System.out.println("+++ FACTURA SISTEMA HUGO +++");

        String nombreFactura;
        double precio01, precio02, totalPrecios, totalprecioMasImpuesto;

        Scanner scanner = new Scanner(System.in);
        //RECIBIENDO EL NOMBRE DE LA FACTURA
        System.out.println("Ingrese el nombre de la factura:");
        nombreFactura = scanner.nextLine();

        //RECIBIENDO LOS PRECIOS
        System.out.println("Ingrese el precio 01:");
        precio01 = scanner.nextDouble();

        System.out.println("Ingrese el precio 02 :");
        precio02 = scanner.nextDouble();

        //CALCULANDO LA SUMA DE PRECIOS E IMPUESTO
        totalPrecios = (precio01 + precio02);
        totalprecioMasImpuesto = totalPrecios * 0.19;

        //IMPRIME EL NOMBRE DE LA FACTURA
        System.out.println("Nombre de la factura : " +nombreFactura +" \n" +"El monto total bruto de : "+totalPrecios+"\n"+"Impuesto por la compra " +totalprecioMasImpuesto +"\n"+"El monto despues del impuesto es : " +(totalprecioMasImpuesto + totalPrecios));

        





    }
}
