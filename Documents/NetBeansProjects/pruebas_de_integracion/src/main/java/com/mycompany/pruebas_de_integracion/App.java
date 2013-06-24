package com.mycompany.pruebas_de_integracion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
//Codificado por sAfOrAs
//Almacena en otra variable la multiplicación por 5 y división por 7 de una variable.
//Codificado por sAfOrAs
 
public class DSCMultiDiv
{
 
    double Multiplica(double var)
    {
        double multi;
        multi=var*5;
        return multi;
    }
 
    double Divide(double var)
    {
        double div;
        div=var/7;
        return div;
    }
 
    public static void main(String[] args)
    {
        double j=0;
        DSCMultiDiv variable = new DSCMultiDiv();
 
        if (args.length==0)
        {
            System.out.println("Debe ingresar un argumento.");
        }
        else
        {
            for(int i=0;i<args.length;i++)
            {
 
                j=Double.parseDouble(args[i]);
 
                double multip=variable.Multiplica(j);
                double divi=variable.Divide(j);
                /*La siguiente porción de código solo muestra los valores almacenados, por salida estandar*/
                System.out.println(j+" / 7 = "+divi);
                System.out.println(j+" x 5 = "+multip);
            }
        }
    }
}


 import java.util.Scanner;   
  public class nombre_archivo    
      {            
         public static void main (String [] args)          
           {              
           Scanner lector = new Scanner(System.in);        
  
            int a; //declaramos las variables             
            int b; //declaramos las variables              
            int c; //declaramos las variables             
  
  /********ahora empezamos con el codigo(las operaciones)********/
  
                 System.out.print("Ingrese A= ");      /* aqui estamos mostrando un mensaje                                                                                    para informar que sebe ingresar un dato*/
 
                 a = lector.nextInt();  
  
                 System.out.print("Ingrese B= ");               
                  b = lector.nextInt();                /* aqui vemos el metodo de ingreso de datos                                                                                              Scanner funcionado*/

                       c = a + b;            

                System.out.println("la suma A+B= ["+c+"]");         
  }

 }
