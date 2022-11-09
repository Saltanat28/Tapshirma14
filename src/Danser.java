public class Danser extends  Person{
    private String groupName;


    public Danser(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dansing(){
        System.out.println("She is dansing");

    }
    public String toString(){
        return " Name:"+super.getName() +"\n Profession:"+super.getDesignation()+"\n works in - "+groupName;

    }

}

