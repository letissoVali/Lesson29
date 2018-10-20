package ru.valiullin;

import java.util.Objects;

public class Person {
    //TODO Создать хешмап для класса Person (поля - имя, возраст, пол)
    // переопределить equals, hashcode для объектов класса Person.
    // В режиме отладки посмотреть как элементы будут попадать внуть бакетов хешмапы

    private final String name;
    private final int age;
    private final char sex;

    public Person(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {

        //return false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return sex == person.sex &&
                Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        int hash = age;
        hash = hash * 63 + sex;
        hash = hash * 63 + (name == null ? 0 : name.hashCode());
        return hash;
        //return Objects.hash(name, age, sex);
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Name " + name + " age " + age + " sex " + sex;
    }
}
