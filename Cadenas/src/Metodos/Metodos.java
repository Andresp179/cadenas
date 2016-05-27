
package Metodos;


public class Metodos {

    public static String Voltear(String a, String b) {
        String retorno = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            retorno = retorno + a.charAt(i);

        }
        return retorno;

    }

}
