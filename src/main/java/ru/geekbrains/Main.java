package ru.geekbrains;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

     person.setFirstName("Andrey");
     person.setLastName("Ivanov");
     person.setAge(30);

        // сериализация в JSON

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Сериализованный объект в JSON:\n" + json);
        // десериализация из JSON

        Person deserealizedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект:\n" + deserealizedPerson);
    }
}