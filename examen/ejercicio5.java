 static void Ejercicio5B(){   
    //Realice un algoritmo que le permita probar uno de los 4 primeros algoritmos que ha diseñado anteriormente aplicando una estructura condicional múltiple o algo similar, o las estructuras que se requiera usar.
  //Declaracion de variables
  int opcionesA=0;
  //Datos de entrada
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar 1=Problema1(Notas),2=Problema2(Bono),3=Problema3(Tipo De Vacuna),4=Problema4(Operacion Aritmética Entre dos valores):";
  System.out.println(msg);
  opcionesA=sc.nextInt();  
  //Proceso
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: Problem1(); break;
        case 2: Problem2(); break;
        case 3: Problem3(); break;
        case 4: Problem4(); break;
        default:
          System.out.println("El Algoritmo no existe!");
      }   
  //Datos de salida    
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=sc.nextInt();        
  }

 }
 public static void main(String[] args) {
  Problem5();
   }
 
}