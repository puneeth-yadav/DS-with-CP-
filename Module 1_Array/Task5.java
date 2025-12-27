class Person {

    String name;
    int age;

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void practice() {
        System.out.println(" my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person p = new Person("Puneeth", 20);
        p.practice();
    }
}
