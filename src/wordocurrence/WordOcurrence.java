/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordocurrence;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author taarb
 */
public class WordOcurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message: ");
        
        String message = scan.nextLine().toLowerCase();
        
        String[] myArray = message.split(" ");
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String word : myArray) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" +
            entry.getValue());
            
        }
    }
    
}
