import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student studentas = new Student();
        studentas.birthYear = 1990;
     //   studentas.name = "Naglis";
        studentas.surname = "Mockevičius";
        studentas.phoNo = 63500985;
        studentas.luckyNumbers = new int[]{5,8,10,14};
        System.out.println(studentas);
        studentas.setName("Naglis");
        System.out.println(studentas.getName());


        Student studentas2 = new Student("Dovile","Jurgaityte",1994,65287465);
        Student studentas3 = new Student("Jurgis","Jokubauskas");

        studentas.getName();
        studentas2.getName();
        studentas3.getName();

        studentas.introduce();
        studentas2.introduce();
        studentas3.introduce();
//        employee.paySalary();
        System.out.println("---------------------------------------");
        ArrayList<Student> students = new ArrayList<>();
        students.add(studentas);
        students.add(studentas2);
        students.add(studentas3);

        for (Student mokinys: students  ){
            mokinys.introduce();
        }


//        Car fainaMasina = new Car();
//        fainaMasina.nudazyti("raudona");
//
//        Car darbineMasina = new Car();
//        darbineMasina.nudazyti("pilka");
    }

}