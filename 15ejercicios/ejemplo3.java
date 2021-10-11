import java.util.Scanner; 

public class regalos{

static Scanner sc = new Scanner(System.in);

static void ejemplo3(){
  //Definir Variables
  double monto=0;
  String regalo="";
 
  System.out.println("Ingrese el monto que dispone:");  
  monto=sc.nextDouble();
  
  if(monto>=1 && monto<=10){
    regalo="\nTarjeta";    
  } else if(monto>=11 && monto<=100){
    regalo="\nChocolate\nTarjeta";
  }else if(monto>=101 && monto<=250){
    regalo="\nFlores\nChocolate\nTarjeta";
  }else if(monto>250){
    regalo="\nFlores\nChocolate\nTarjeta";
  }else if(monto>250){
    regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
  }else{
    regalo="Ninguno";
  }
 
  System.out.println("Ud. puede elegir los siguientes: "+ regalo);
}

public static void main(String[] args) {
ejemplo3();
}
}