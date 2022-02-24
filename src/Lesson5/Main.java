package Lesson5;


class Person {
    public static String name;
    static String position;
    static String email;
    static String phone;
    static int salary;
    static int age;



    public Person(String name, String position, String email, String phone, int salary, int age, String s, String position1, String email1, String phone1, int i, int age1) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Василькова П.", "Бугалтер", " vasilcova@mail.com", "89211234576", 40000, 25, name, position, email, phone, salary, age);
        persArray[1] = new Person("Петров В.", "Технолог", " petrov@mail.com", "89211234579", 50000, 39, name, position, email, phone, salary, age);
        persArray[2] = new Person("Рогов Г.", "Директор", " rogov@mail.com", "89211294576", 80000, 25, name, position, email, phone, salary, age);
        persArray[3] = new Person("Паравозов С.", "Менеджер", " paravozov@mail.com", "892112345746", 30000, 30, name, position, email, phone, salary, age);
        persArray[4] = new Person("Мулатов Н.", "Отдел кадров", " vmylatov@mail.com", "89211234576", 65000, 55, name, position, email, phone, salary, age);
        for (Person person : persArray)
            if (age > 40) person.print();
    }


    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(name, position, email, phone, salary, age);

    }

}



















