public record PersonRecord(String name, int age) {

    public PersonRecord {
        
    }

    public PersonRecord(String name) {
        this(name, 0);
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age; 
    }
}