package Goat.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok hellolombok = new HelloLombok();
        hellolombok.setName("hi lombok");

        String name =hellolombok.getName();
        System.out.println("name = " + name);
    }
}
