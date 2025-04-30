
import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);
    private final static BathMachine bathMachine = new BathMachine();
    public static void main(String[] args) {

        scanner.useDelimiter("\\n");
        
        var option = -1;

        do { 
            System.out.println("\n --- Escolha uma das opções abaixo: ---");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> bathMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInBathMachine();
                case 8 -> bathMachine.removePet();
                case 9 -> bathMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente.");
            }

        } while (true);
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina...");
        bathMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina...");
        bathMachine.addShampoo();
    }

    public static void verifyWater() {
        var amount = bathMachine.getWater();
        System.out.println("A máquina está com: " + amount + " litro(s) de água.");
    }

    public static void verifyShampoo() {
        var amount = bathMachine.getShampoo();
        System.out.println("A máquina está com: " + amount + " litro(s) de shampoo.");
    }

    public static void checkIfHasPetInMachine() {
        var hasPet = bathMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInBathMachine() {
        var name = "";

        while (name.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        bathMachine.setPet(pet);
    }
}
