/**
 * Password
 */

 /* 21/05 */
public class Password {

    // Constantes
    private final static int LONGITUD_DEF = 8;

    // Atributos
    private int longitud;
    private String pass;

    // Constructores

    // @param
    public Password(int longitud) {
        this.longitud = longitud;
    }

    public Password() {
        this(LONGITUD_DEF);
    }

    // Metodos
    public boolean EsFuerte(String pass) {
        int conMayus = 0;
        int conMinus = 0;
        int conNum = 0;

        // voy char por char contando que es lo que contiene
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) {
                conMayus++;
            } else if (pass.charAt(i) >= 97 && pass.charAt(i) <= 122) {
                conMinus++;
            } else {
                conNum++;
            }
        }

        // Valido si es fuerte
        if (conMayus >= 2 && conMinus >= 1 && conNum >= 5) {
            return true;
        } else {
            return false;
        }
    }
    /* contiunar.... */
}