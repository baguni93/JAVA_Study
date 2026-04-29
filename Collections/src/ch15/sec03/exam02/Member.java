package ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Member target ){
            return target.name.equals(this.name) && target.age == this.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
