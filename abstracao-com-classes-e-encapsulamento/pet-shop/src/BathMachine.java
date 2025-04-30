public class BathMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + " está limpo.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água está no máximo.");
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 20) {
            System.out.println("A capacidade de shampoo está no máximo.");
        }

        shampoo += 2;
    }

    public Integer getWater() {
        return water;
    }
    public Integer getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar pet é necessaria limpa-la.");
        }
        if (this.pet != null) {
            System.out.println("O Pet " + this.pet.getNome() + " está na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na máquina");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + pet.getNome() + " foi tirado da máquina.");
        this.pet = null;
    }

    public void cleanMachine() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
