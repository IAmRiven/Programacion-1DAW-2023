public class desafio3_5 {
    public static void main(String[] args) {
        System.out.println("Imprimiento tablas de multiplicar:");
        for (int a = 1; a <= 10; a++) {
            System.out.println("************");
            System.out.println("Tabla del "+a);
            System.out.println("************");
            for (int b = 1; b <= 10; b++) {
                System.out.println(a+" x "+b+" = "+a * +b);
            }
        }
    }
}
