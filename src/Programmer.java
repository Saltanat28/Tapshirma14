public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("" +
                "He is coding");
    }

    public String toString() {
        return " Name:"+super.getName() +"\n Profession:"+super.getDesignation()+"\n works in - "+companyName;

    }
}
