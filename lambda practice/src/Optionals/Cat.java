package Optionals;

import java.util.Optional;

public class Cat {
    private  String name;
    private  int age;


    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public int getAge() {
        return age;
    }
}
