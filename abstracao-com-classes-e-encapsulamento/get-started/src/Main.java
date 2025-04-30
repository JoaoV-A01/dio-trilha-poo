
public class Main {
    public static void main(String[] args) throws Exception {

        // Exemplo de uso de classe Record em Java
        var person = new PersonRecord("John", 20);

        System.out.println(person);
        System.out.println(person.name());

        /* Exemplo de uso de getters e setters em Java         
        var male = new Person("Jonh", 23);

        var famele = new Person("Cammy", 22);

        System.out.println("Male name: " + male.getName() + ", age : " + male.getAge());
        System.out.println("Famele name: " + famele.getName() + ", age : " + famele.getAge());
        
        male.setName("John Xander Feria");
        male.setAge(24);

        famele.setName("Cammy Xander Feria");
        famele.setAge(23);

        System.out.println("Male name: " + male.getName() + ", age : " + male.getAge());
        System.out.println("Famele name: " + famele.getName() + ", age : " + famele.getAge());
        */
    }
}
