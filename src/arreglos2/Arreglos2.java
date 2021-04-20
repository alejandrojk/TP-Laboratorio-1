/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos2;

/**
 *
 * @author Usuario
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        String frase = "La vida es bella";
        //char caracteres[] = new char[frase.length()];
        char car[] = frase.toCharArray();
        for(i = 0; i < car.length;i++)
        {
            System.out.println("De String a Arreglo de char  "+car[i]);
        }
    }
    
}
