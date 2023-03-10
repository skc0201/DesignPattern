public class Person {
    private final String fName;
    private final String lName;
    private final int age;
    private final String address;
    private final String city;
    private final String state;
    private final String phone;

    Person(PersonBuilder personBuilder){
        this.fName = personBuilder.fName;
        this.lName = personBuilder.lName;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
        this.city = personBuilder.city;
        this.state = personBuilder.state;
        this.phone = personBuilder.phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public void printDetails(){
        String personInfo = "";
        personInfo += "First Name: " + fName + "\n";
        personInfo += "Last Name: " + lName + "\n";
        personInfo += "Age: " + age + "\n";
        personInfo += "Address: " + address + "\n";
        personInfo += "City: " + city + "\n";
        personInfo += "State: " + state + "\n";
        personInfo += "Phone: " + phone;
        System.out.println(personInfo);
}

}
