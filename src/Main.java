import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.Assistant;
import data.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Assistant {
    public static void main (String[] args) {
        List<Animal> animal = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Выберете одну из команд:" + Commands.ADD + "," + Commands.LIST + "," + Commands.EXIT);

          Commands command = null;
            String cn = scan.next().toUpperCase().trim();

            for (Commands commands:Commands.values()){
                if (commands.name().equals(cn)){
                    command = commands.valueOf(cn);
                    break;
                }
                else{
                    command = Commands.OTHER;

                }

            }

            switch (command) {
                case ADD:
                    System.out.println("Какое животное ты хочешь создать создать? Кошку,Собаку,Утку?");
                    String choice = scan.next();
                    if(choice.equals("Кошку")){
                        Animal catOne = new Cat();
                        createAnimal(catOne,scan);
                        animal.add(catOne);
                        catOne.say();
                    }
                    else if (choice.equals("Собаку")){
                        Animal dogOne = new Dog();
                        createAnimal(dogOne,scan);
                        animal.add(dogOne);
                        dogOne.say();
                    }
                    else if (choice.equals("Утку")){
                        Animal duckOne = new Duck();
                        createAnimal(duckOne,scan);
                        animal.add(duckOne);
                        duckOne.say();
                    }
                    break;
                case LIST:
                   animal.forEach(animal1 ->  System.out.println(animal1.toString()));
                    break;
                case EXIT:
                    System.out.println("Выход из программы");
                    System.exit(1);
                    break;
                case OTHER:
                    System.out.println("Команда неизвестна");


            }
        }
    }



}



