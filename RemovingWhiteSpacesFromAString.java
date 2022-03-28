/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removing.white.spaces.from.a.string;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class RemovingWhiteSpacesFromAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //get input from the user
        //Scanner in = new Scanner(System.in);
        //System.out.print("Input String: ");
        //String input = in.nextLine();
        
        //given input
        String input = "Annyeong ha se yo o o sa sa ge yo ";
        
        String rslt = input.replaceAll("\\s", "");
        System.out.println("String without spaces: "+ rslt);
        
    }
    
}
