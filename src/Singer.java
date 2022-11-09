public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println("She is  sing song ");
    }
    public void playingGitar(){
        System.out.println(" and  play in gitar");
    }


    public String toString(){
        return " Name:"+super.getName() +"\n Profession:"+super.getDesignation()+"\n works in - "+bandName;

    }
}
