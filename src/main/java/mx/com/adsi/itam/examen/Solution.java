package mx.com.adsi.itam.segundaparte;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Clase utilizada para el segundo parcial de ADSI @ITAM
 * @author Pablo López Quiles
 */
public class Solution {

    /**
     * Metodo para sabbbbbbber si puede una cadena ser creada a partir de repeticiones de una subcadena suya
     *
     * @param s String para comparar
     */
    /* el approach fue iterar sobre cada subcadena y ver cuantas veces 
    * aparecia en la cadena original, utilizando las longitudes se descartaron subcaenas que no se deberian
    * checar debido a que formarian  strings mas grandes, es decir, solo se toman divisores de la longitud original
    */
    public boolean problema(String s){
        //approach iterar sobre todas las subcadenas
        int tamOriginal = s.length();
        int tamSubC=1;
        String subC;
        boolean flag = false;
        while(tamSubC<tamOriginal && !flag){
            //si no es mutliplo del tamañp de la subcadena tomada no puede ser formado por esta
            if(tamOriginal%tamSubC!=0){
                tamSubC++;
                continue;
            }
            //creamos el substring que queremos checar
            subC= s.substring(0,tamSubC);
            int contador = 0;
            //checamos cuantas veces existe en la cadena grande 
            //utilizando el susbtring como un Pattern de Java
            Pattern pattern = Pattern.compile(subC);
            Matcher matcher = pattern.matcher(s);
            while(matcher.find())
                contador++;
            //si aparece exactamente las veces que puede caber entonces
            //si se puede formar la cadena con un subpatron
            if (contador==(tamOriginal/tamSubC))
                flag = true;
            
            tamSubC++;
        }
        
        return flag;
 
    }
    

}