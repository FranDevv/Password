import java.util.Random;

/**
 * Password
 */

/* 21/05 */
public class Password {

    // Constantes
    private final static int LONGITUD_DEF = 8;
    private Random rnd = new Random();

    // Atributos
    private int longitud;
    private String pass;

    // Constructores

    // @param
    public Password(int longitud) {
        this.longitud = longitud;
        GenerarPass();
    }

    // Constructor Default
    public Password() {
        this(LONGITUD_DEF);
    }

    // Metodos
    public boolean EsFuerte(String pass) {
        if (pass.isEmpty()) {
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
            }
        }
        return false;
    }

    public String GenerarPass() {

        String contra = "";
        for (int i = 0; i < getLongitud(); i++) {

            if (i < 2) {
                contra += rnd.nextInt(10);
            } else {
                // saco el valor int equivalente al alfabeto Ascii
                // int minusAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
                 int mayusAscii=(int)Math.floor(Math.random()*(90-65)+65);
                contra += (char) mayusAscii; // char + String si se puede lol (logico)
            }
        }
        pass = contra;
        return pass;
    }

    // Getters && Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPass() {
        return pass;
    }
}