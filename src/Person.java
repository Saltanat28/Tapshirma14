public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
       this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        designation = designation;
    }

    public void learn(){
        System.out.println("learn ");
    }
    public void walk(){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println("eat");
    }
}
