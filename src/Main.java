public class Main {
    public static void main(String[] args){
        int numeroif = 0;
        if (numeroif > 0) {
            System.out.println("numeroif es positivo");
        }
        else if (numeroif < 0) {
            System.out.println("numeroif es negativo");
        }
        else {
            System.out.println("numeroif es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
        int numDowhile = 0;
        do {
            numDowhile = numDowhile + 1;
            System.out.println(numDowhile);
        }
        while (numDowhile == 0);
        for (int numeroFor = 0; numeroFor < 3; numeroFor ++) {
            System.out.println(numeroFor);
        }
        String estacion = "primavera";
        switch (estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otono":
                System.out.println("Es otono");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Esa no es una estacion");
        }
    }
}
