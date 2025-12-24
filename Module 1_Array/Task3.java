code
  class Student {
    String name;
    int age;

    void creatingStudent() {
        System.out.println("Student is created successfully.");
    }

    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.creatingStudent();
        obj.name = "Puneeth";
        obj.age = 20;
        obj.getName();
        obj.getAge();
    }
}
