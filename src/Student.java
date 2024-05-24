import java.util.Arrays;

public class Student {
    private String name;//properties
    public String surname;
    public int birthYear;
    public long phoNo;
    public int[] luckyNumbers;
//    public Occupation darboviete;
    public Student(){//constructors

    }

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int birthYear, long phoNo){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this. phoNo = phoNo;
    }

     public void introduce(){
         System.out.println("Sveiki, aš esu " + this.name + " " + this.surname + ".");
     }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", phoNo=" + phoNo +
                ", luckyNumbers=" + Arrays.toString(luckyNumbers) +
                '}';
    }
}