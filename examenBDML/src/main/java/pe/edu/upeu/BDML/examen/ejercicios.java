import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {                              
            if (n % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == n) {                           
            System.out.println("Perfecto");
        } else {
          System.out.println("No es perfecto");
          

        }
    }


 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     double descuento, monto_de_pago, monto_del_descuento, precio_del_producto;
     String nombre_del_producto;
     String tecla_repetir;
     do {
       System.out.print("Ingresa la categoria del vehiculo: ");
        nombre_del_producto = in.nextLine();
        System.out.print("Ingresa la cantidad de impuesto: ");
        descuento = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor del vehiculo: ");
          precio_del_producto = in.nextDouble();
          in.nextLine();
          in.nextLine();
          monto_del_descuento=descuento*precio_del_producto/100;
          monto_de_pago=precio_del_producto-monto_del_descuento;
          System.out.println("categoria del vehiculo: " + nombre_del_producto);
          System.out.println("Valor de monto de pago: " + monto_de_pago);
          System.out.println("Valor de monto del descuento: " + monto_del_descuento);
          System.out.println();
          do {
            System.out.print("\u00BFDeseas repetir el proceso? (S/N): ");
             tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }


 public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();
 
        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 20; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
    
    
     static int [] vec = {31, 14, 8, 22, 64};

    void ordenar (int [] v, int cant) {
        if (cant > 1) {
            for (int f = 0 ; f < cant - 1 ; f++)
                if (v [f] > v [f + 1]) {
                    int aux = v [f];
                    v [f] = v [f + 1];
                    v [f + 1] = aux;
                }
            ordenar (v, cant - 1);
        }
    }

    void imprimir () {
        for (int f = 0 ; f < vec.length ; f++)
            System.out.print (vec [f] + "  ");
        System.out.println("\n");
    }


    public static void main (String [] ar)  {
        ejercicios r = new ejercicios();
        r.imprimir ();
        r.ordenar (vec, vec.length);
        r.imprimir ();
    }
}





 