/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phishing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Phishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    private static int countOccurrences(String text, String term){
    int count=0;
    int index=text.indexOf(term);
    while(index !=-1){
    count ++;
    index= text.indexOf(term,index+1);
    }
        return count;
}
            
    }
   

