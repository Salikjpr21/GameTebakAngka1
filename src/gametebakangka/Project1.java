/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author salik5
 */
public class Project1 {
    int bilanganAcak, angkaTebakan;
    void bilanganAbstrak(){
       Random bilanganRandom = new Random();
       this.bilanganAcak = bilanganRandom.nextInt(101);
       Scanner input = new Scanner(System.in);
       
       do{ 
           System.out.print("masukkkan Angka : ");
           this.angkaTebakan = input.nextInt();
           if (angkaTebakan < bilanganAcak){
               System.out.println("oh bilanganmu terlalu kescil Boy, silahkan coba lagi...");
           } else if(angkaTebakan > bilanganAcak){
               System.out.println("waduh...bilanganmu terlalu besar Kawan, silahkan coba lagi!");
           } else{
               System.out.println("Mantapp...Tebakanmu tepat sekali Boy, Selamat");
               break;
           }
           
       }while(this.angkaTebakan != this.bilanganAcak);
    }
}
