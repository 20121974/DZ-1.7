public class Main {
    public static void main(String[] args) {
    //DZ 1.7.1
    {String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = firstName + " " + middleName + " " + lastName;
        System.out.printf("ФИО сотрудника — %s", fullName);}

    {
    System.out.println("");
    var firstName = "Ivan";
    var middleName = "Ivanovich";
    var lastName = "Ivanov";

    var fullName = String.format("%s %s %s", firstName, middleName, lastName);
        System.out.printf("ФИО сотрудника — %s", fullName);
    }
    System.out.println("");

    //DZ 1.7.2
    {
    System.out.println("");
    var firstName = "Ivan";
    var middleName = "Ivanovich";
    var lastName = "Ivanov";
    var fullName = String.format("%s %s %s", firstName, middleName, lastName);
    String result = fullName.toUpperCase();
    System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);}
        System.out.println("");

    //DZ 1.7.3
    var fullName = "Иванов Семён Семёнович";
    var split = fullName.split("");
    for (String current : split) {
        if (current.contains("ё")) {
            var text = current.replace("ё", "e");
            System.out.print(text);
        }else {
            System.out.print(current);
        }
    }
    }
}