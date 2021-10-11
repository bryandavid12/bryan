import java.util.Scanner;

public class ejemplo1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double edad =0;
        String  puede ="";
        System.out.print("Ingresa tu edad: ");
        edad = in.nextDouble();
        in.nextLine();
        
        in.nextLine();
        puede ="";
        if (edad>=0&& edad<=17){
      puede="usted NO puede votar :";
    }
        else if (edad>=18 && edad<=1000){
      puede="Usted SI puede votar ";
    }
        System.out.println("Valor de bono: " + puede);
    }

}