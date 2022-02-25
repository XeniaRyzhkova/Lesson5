package Lesson5;

public class Main {


    public void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Василькова П.", "Бугалтер", " vasilcova@mail.com", "89211234576", 40000, 25);
        persArray[1] = new Person("Петров В.", "Технолог", " petrov@mail.com", "89211234579", 50000, 39);
        persArray[2] = new Person("Рогов Г.", "Директор", " rogov@mail.com", "89211294576", 80000, 25);
        persArray[3] = new Person("Паравозов С.", "Менеджер", " paravozov@mail.com", "892112345746", 30000, 30);
        persArray[4] = new Person("Мулатов Н.", "Отдел кадров", " vmylatov@mail.com", "89211234576", 65000, 55);
        for (Person person : persArray)
            if (person.getAge()>40)
                System.out.println(persArray);
    }
}

    class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
        
        @Override
        public String toString() {
            return String.format(name, position, email, phone, salary, age);

        }

    }























