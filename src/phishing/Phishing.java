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
        // TODO code application logic here
        Map<String, Integer> phishingTerms= createPhishingTerms();
        String filename="src\\phishing\\phishing.txt";
        int totalPoint=0;
        try(BufferedReader br= new BufferedReader(new FileReader(filename))){
        String line;
        while((line= br.readLine())!= null){
        for(String term: phishingTerms.keySet()){
           int occurrences= countOccurrences(line, term);
           if(occurrences>0){
           int points= phishingTerms.get(term)*occurrences;
           totalPoint+=points;
               System.out.println(term+"- Ocurrencias: " + occurrences+"- puntaje"+points);
           }
        }
           
        }
        }catch(IOException e){
        e.printStackTrace();
        }
        
        
        }
     private static Map<String, Integer> createPhishingTerms(){
    Map<String, Integer> phishingTerms= new HashMap();
    phishingTerms.put("Verificación de seguridad",2);
    phishingTerms.put("Su cuenta ha sido seleccionada",3);
    phishingTerms.put("Oferta exclusiva para usted",2);
    phishingTerms.put("¡Su cuenta ha sido bloqueada!",3);
    phishingTerms.put("Actualización de la cuenta requerida",2);
    phishingTerms.put("Descuento increíble por tiempo limitado",2);
    phishingTerms.put("Acceso no autorizado detectado",2);
    phishingTerms.put("Gane dinero desde casa sin esfuerzo",3);
    phishingTerms.put("Alerta de seguridad importanted",2);
    phishingTerms.put("Ha sido elegido para una oferta especial",3);
    phishingTerms.put("Actualice su información de pago",2);
    phishingTerms.put("Verificar su identidad de inmediato",2);
    phishingTerms.put("Premio garantizado para los primeros 100 usuarios",2);
    phishingTerms.put("Su cuenta ha sido comprometida",2);
    phishingTerms.put("Su cuenta ha sido suspendida temporalmente",2);
    phishingTerms.put("¡Felicidades, eres el ganador del premio mayor!",3);
    phishingTerms.put("Atención: se ha detectado una actividad sospechosa",2);
    phishingTerms.put("Actualización de seguridad requerida",2);
     phishingTerms.put("¡Enhorabuena, eres nuestro cliente VIP!",3);
     phishingTerms.put("Información importante sobre su cuenta",2);
     phishingTerms.put("IConfirmación de transacción no reconocida",3);
     phishingTerms.put("Problemas con su cuenta, restablezca su acceso",2);
     phishingTerms.put("Oportunidad única: gane un viaje de ensueño",2);
     phishingTerms.put("¡Ha ganado un iPhone X gratis!",3);
     phishingTerms.put("Verifique su cuenta para evitar el cierre",3);
     phishingTerms.put("Actualice su información inmediatamente",2);
     
     
    return phishingTerms;
    }
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
   

