package models;

public class Persona implements Comparable<Persona> {
    
    private String name;
    private int age;
    private String gender;
    
    
    public Persona(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Persona [" + name + ", " + age + ", " + gender + "]";
    }


    @Override
    public int compareTo(Persona arg0) {
       
        
     int c = this.name.compareTo(arg0.getName());
     if (c!=0)
        return c;

     int c2 = Integer.compare(this.age, arg0.getAge());
        if (c2!=0)
            return c2;

       return this.gender.compareTo(arg0.getGender());


    }
}
