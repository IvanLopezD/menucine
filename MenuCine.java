package menucine;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuCine{

   

    public static void main(String[] args) {
          int menu = 0;
   int suma = 0;
   int boletosadultos = 0, boletosninos = 0;
   int boletoadulto = 80, boleto_nino = 49;
   int palomitasgrandes = 0, palomitasmediana = 0, palomitaschicas = 0;
   int palomitasG = 70, palomitasM = 60, palomitasC = 50;
   int refrescogrande = 0, refrescomediano = 0, refrescochico = 0;
   int refresco_grande = 50, refresco_mediano = 45, refresco_chico = 35;
   int combopareja = 20, comboamigos = 20, combohotdog = 20, combonacho = 20, combodulce = 20;
   int comboP =50, combo_amigos = 20, combo_hotdog = 20, combo_nacho = 20, combo_dulce = 20;
   Scanner entrada = new Scanner(System.in);

   
   System.out.println("Eliga una opcion");
   System.out.println("1.-Boletos");
   System.out.println("2.-Dulceria");
   System.out.println("3.-Combos");
   System.out.println("4.-Peliculas que recomendamos");
   System.out.println("5.-Estrenos");
   System.out.println("6.-Facebook");
   System.out.println("7.-Ubicacion");
   System.out.println("8.-Cine");
   System.out.println("9.-Salir");
   menu = entrada.nextInt();


   switch(menu){


    case 1: System.out.println("Cuantos boletos de adultos quiere? ");
            boletosadultos = entrada.nextInt();
            System.out.println("Cuantos boletos de niño quiere? ");
            boletosninos = entrada.nextInt();
            suma = (boletosadultos*boletoadulto) + (boletosninos*boleto_nino);
            System.out.println("A pagar: $" + suma);
            break;

    case 2: System.out.println("Cuantas palomitas grandes desea?");
            palomitasgrandes = entrada.nextInt();
            System.out.println("Cuantas palomitas medianas desea?");
            palomitasmediana = entrada.nextInt();
            System.out.println("Cuantas palomitas chicas desea?");
            palomitaschicas = entrada.nextInt();
            System.out.println("Cuantos refrescos grandes deseas? ");
            refrescogrande = entrada.nextInt();
            System.out.println("Cuantos refrescos medianos deseas? ");
            refrescomediano = entrada.nextInt();
            System.out.println("Cuantos refrescos chicos deseas? ");
            refrescochico = entrada.nextInt();
            suma = (palomitasgrandes*palomitasG) + (palomitasmediana*palomitasM) + (palomitaschicas*palomitasC) + (refrescogrande*refresco_grande) + (refrescomediano*refresco_mediano) + (refrescochico*refresco_chico);
            System.out.println("salio " + suma);
            System.out.println("A pagar: $" + suma);
            break;

    case 3: System.out.println("Cuantos combos pareja desea?");
            combopareja = entrada.nextInt();
            System.out.println("Cuantos combo amigos quiere?");
            comboamigos = entrada.nextInt();
            System.out.println("Cuantos combo nachos desea?");
            combonacho = entrada.nextInt();
            System.out.println("Cuantos Hotdogs desea?");
            combohotdog = entrada.nextInt();
            System.out.println("Cuantos dulces desea?");
            combodulce = entrada.nextInt();
            suma = (combopareja*comboP) + (comboamigos*combo_amigos) + (combonacho*combo_nacho) + (combohotdog*combo_hotdog) + (combodulce*combo_dulce);
            break;

    case 4: System.out.println("*Recomendaciones*");
            System.out.println("-Vacas Vaqueras");
            System.out.println("-Megamente");
            System.out.println("-Buscando a Nemo");
            System.out.println("-Spider man");
            System.out.println("-Batman");
            System.out.println("-Avengers");
            break;

    case 5: System.out.println("*Estrenos*");
            System.out.println("-Paw Patrol");
            System.out.println("-Enredados");
            System.out.println("-Harry Potter");
            System.out.println("-La bella y la bestia");
            System.out.println("-Onward");
            System.out.println("-Avengers");
            break;

    case 6: System.out.println("El Siguiente link te llevara a nuestra pagina de Facebook: www.facebook.com/cinemat");
            break;

    

    case 7: System.out.println("Lindavista");
            System.out.println("Ticoman");
            System.out.println("Plaza Lindavista");
            System.out.println("Buenavista");
            break;

    case 8: System.out.println("Cines");
             System.out.println("Parque Lindavista");
             System.out.println("Avenida Ticoman");
             System.out.println("Torres Lindavista");
             System.out.println("Forum Buenavista");
             break;

    default: System.out.println("Terminaste");
             break;
   }

 }
}
    
    

