 class Main {
    public static void main(String[] args) {
       System.out.println("Program wypisuje wszystkie liczby Armstronga do 600");
        for (int i = 1; i <= 600; i++) {
            if (LiczbyArmstronga(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean LiczbyArmstronga(int i) {
        int Liczba = i;
        int suma = 0;
        int cyfry = String.valueOf(i).length();

        while (i > 0) {
            int cyfra = i % 10;
            suma += Math.pow(cyfra, cyfry);
           i /= 10;
        }

        return suma == Liczba;
     
    }

  
}