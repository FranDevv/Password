
/**
 * Password
 */

/* 21/05 */
public class Password {

    // Constantes
    private final static int LONGITUD_DEF = 10;

    // Atributos
    private int longitud;
    private String pass;

    // Constructores

    // @param
    public Password(int longitud) {
        this.longitud = longitud;
        pass = GenerarPass(); //para que no se inicie en 'null'
    }

    // Constructor Default
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
                conMayus += 1;
            } else if (pass.charAt(i) >= 97 && pass.charAt(i) <= 122) {
                conMinus += 1;
            } else {
                conNum += 1;
            }
        }
        // Valido si es fuerte
        if (conMayus >= 2 && conMinus >= 1 && conNum >= 5) {
            return true;
        }
        return false;
    }
        

    public String GenerarPass() {
        String contra = "";
        for (int i = 0; i < getLongitud(); i++) {

            // este switch agrega carater por caracter dependiendo del numero de la key
            switch ((int) Math.floor(Math.random() * (3 - 1 + 1) + 1)) {
                case 1:
                    contra += Mayus();
                    break;

                case 2:
                    contra += Minus();
                    break;
                case 3:
                    contra += Num();
                    break;
            }
        }
        return contra;
    }

    // funciones para devolver cada caracter diferente y luego concatenarlos

    /* Esta formula (num1 - num2) + num2 incluye los numeros */
    private char Mayus() {
        return (char) Math.floor(Math.random() * (90 - 65) + 65);
    }

    private char Minus() {
        return (char) Math.floor(Math.random() * (122 - 97) + 97);
    }

    private int Num() {
        return (int) Math.floor(Math.random() * 10);
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