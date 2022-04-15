package com.xingxing.mybatisdemo.pojo;

import java.util.Objects;

/**
 * @author star
 * @date 2022/3/3 18:07
 * @since 1.0.0
 */


public class Person {
    private Integer id;
    private String usn;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", usn='" + usn + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(Integer id, String usn, Integer age) {
        this.id = id;
        this.usn = usn;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) && usn.equals(person.usn) && age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usn, age);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
