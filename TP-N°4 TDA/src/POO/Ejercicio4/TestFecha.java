package POO.Ejercicio4;

import java.util.Scanner;

public class TestFecha {
    public static void main(String[] args) {

        int dias,dia,mes,anio,DiasTotales;
        boolean valorFecha,valorBisiesto;

        valorFecha=false;

        Scanner sc= new Scanner(System.in);

        Fecha miFecha = new Fecha();
        Fecha miFecha2 = new Fecha();

        do{
            System.out.println("Ingrese fecha");

            System.out.println();

            System.out.println("Ingrese dia");
            dia=sc.nextInt();
            System.out.println("Ingrese mes");
            mes=sc.nextInt();
            System.out.println("Ingrese año");
            anio=sc.nextInt();

            if((dia<=31 && dia>=1) && (mes<=12 && mes>=1)&& (anio>1)){
                valorFecha=true;
            }

        }while(!valorFecha);

        miFecha.Fecha(dia, mes, anio);

        dias = miFecha.diasTranscurridos(dia, mes, anio);
        System.out.println("Dias transcurridos:"+dias);

        valorBisiesto=miFecha.esBisiesto(anio);
        System.out.println("Es bisiesto:"+valorBisiesto);

        do{
            System.out.println("Ingrese fecha");

            System.out.println();

            System.out.println("Ingrese dia");
            dia=sc.nextInt();
            System.out.println("Ingrese mes");
            mes=sc.nextInt();
            System.out.println("Ingrese año");
            anio=sc.nextInt();

            if((dia<=31 && dia>=1) && (mes<=12 && mes>=1)&& (anio>1)){
                valorFecha=true;
            }

        }while(!valorFecha);
        
        miFecha2.Fecha(dia, mes, anio);

        if(miFecha.esFechaAnterio(miFecha2.getDia(),miFecha2.getMes(),miFecha2.getAnio())){
            System.out.println(miFecha2.toString()+":es anterior a:"+miFecha.toString());
        }else{
            System.out.println(miFecha.toString()+":es anterior a:"+miFecha2.toString());
        }


        System.out.println("Ingrese dias para agregar");
        DiasTotales=sc.nextInt();
        miFecha.calcularFecha(dia, mes, anio, DiasTotales);

        System.out.println(miFecha.toString());
        
    }

    
}
