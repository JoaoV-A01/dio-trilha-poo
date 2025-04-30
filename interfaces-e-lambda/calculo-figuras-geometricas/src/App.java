import java.util.Scanner;

public class App {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {    

        int option = -1;

        while (option >= 1 && option <= 3) {
            System.out.println("Escolha a forma geometrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("A área do quadrado é: " + createSquare().getArea());
                case 2 -> System.out.println("A área do retangulo é: " + createRectangle().getArea());
                case 3 -> System.out.println("A área do circulo é: " + createCircle().getArea());
                case 4 -> {
                    System.out.println("Saindo..."); 
                    option = 0; 
                    break;
                }
                default -> System.out.println("Opção inválida!");
            }
        }

    }

    private static GeometricForm createSquare() {
        System.out.println("Informe o tamanho dos lados: ");
        var side = scanner.nextDouble();

        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();

        System.out.println("Informe a altura: ");
        var heigth = scanner.nextDouble();

        return new Rectangle(heigth, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();

        return new Circle(radius);
    }
}
