/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelipatan3dan5;
import java.util.Scanner;



/**
 *
 * @author USER
 */
public class Kelipatan3dan5Revisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a ;
        Scanner keyboard =  new Scanner(System.in);
        
        System.out.println("Masukan Angka ");
        a = keyboard.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if (i%3==0) {
                System.out.println("kelipatan 3 Angka "+i);
           
                
            }else  if (i%5==0) {
                System.out.println("Kelipatan 5 Angka  "+i);
            }
            
            else{
                System.out.println(" ");
            }
            
           
        }
       
    }
    
}
