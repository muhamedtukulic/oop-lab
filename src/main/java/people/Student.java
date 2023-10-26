package people;

public class Student extends Person {
    private int credits= 0;
    public Student(String name, String adress) {
        super(name, adress);

    }

    public String credits(){
        return "credits " + credits;
    }

    public int study(){
        credits++;
        return credits;
    }
    @Override
    public String toString(){
        return super.toString()+ "\n" + "credits "+credits;
    }

}
