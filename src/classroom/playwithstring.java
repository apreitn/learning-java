package classroom;

public class playwithstring {
    public static void main(String[] args) {
        String name = "Arina";
        String surname = "Petrova";

        // concatenation
        String myText = "My name is: " + name + " " + surname;
        System.out.println(myText);

        System.out.println("My name is: " + name + " " + surname);

        //interpolation
        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(String.format("My name is: %s %s", name, surname));

        String FirstName = "Arina";
        String LastName = "Petrova";
        String text = FirstName + " " + LastName;
        System.out.println(text);

        int my_age;
        my_age = 19;
        String city = "Riga";
        String text1 = FirstName + " " + LastName + " " + "is" + " " + my_age + " " + "years old and lives in" + " " + city;
        System.out.println(text1);

        String interpolationn = String.format("%s %s is %d years old and lives in %s", FirstName, LastName, my_age, city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", FirstName, LastName, my_age, city));
    }
}
