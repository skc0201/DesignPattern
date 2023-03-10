public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Design Pattern");
        PersonBuilder personBuilder1 = new PersonBuilder("Shubham","Choudhary", 23).setAddress("some address").setCity("Hyderabad");
        Person person1 = personBuilder1.build();
        System.out.println("Details of Person - 1");
        person1.printDetails();
        PersonBuilder personBuilder2 = new PersonBuilder("Aman","Kumar", 27).setCity("Chennai").setPhone("9876564528");
        Person person2 = personBuilder2.build();
        System.out.println("Details of Person - 2");
        person2.printDetails();
    }
}