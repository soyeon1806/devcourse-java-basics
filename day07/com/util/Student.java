package day07.com.util;

import java.util.Objects;

public class Student {
    private String hakbun;
    private String name;

    public Student(String hakbun, String name){
        this.hakbun = hakbun;
        this.name = name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{" +
                "hakbun = '" + hakbun + '\'' +
                ", name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(hakbun, student.hakbun) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(hakbun, name);
    }
}
