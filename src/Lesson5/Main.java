package Ksenia2;

class Main {

    public void main(String[] args) {
        Employee[] Employee = new Employee[5];
        Employee[0] = new Employee("Василькова П.", "Бугалтер", " vasilcova@mail.com", "89211234576", 40000, 25);
        Employee[1] = new Employee("Петров В.", "Технолог", " petrov@mail.com", "89211234579", 50000, 39);
        Employee[2] = new Employee("Рогов Г.", "Директор", " rogov@mail.com", "89211294576", 80000, 25);
        Employee[3] = new Employee("Паравозов С.", "Менеджер", " paravozov@mail.com", "892112345746", 30000, 30);
        Employee[4] = new Employee("Мулатов Н.", "Отдел кадров", " vmylatov@mail.com", "89211234576", 65000, 55);
        for (Employee employee : Employee)
            if (employee.getAge() > 40)
                System.out.println(Employee);
    }

    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
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
























