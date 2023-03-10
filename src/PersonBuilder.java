public class PersonBuilder {
    String fName;
    String lName;
    int age;
    String address;
      String city;
      String state;
      String phone;

      public PersonBuilder(String fName, String lName ,int age){
          this.fName=fName;
          this.lName = lName;
          this.age = age;
      }

      public PersonBuilder setAddress(String address){
          this.address = address;
          return this;
      }
    public PersonBuilder setCity(String city){
        this.city = city;
        return this;
    }
    public PersonBuilder setState(String state){
        this.state = state;
        return this;
    }
    public PersonBuilder setPhone(String phone){
        this.phone = phone;
        return this;
    }

    public  Person build(){
          return new Person(this);
    }
}
