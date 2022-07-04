package data;

import Animals.Animal;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Assistant {
    public static int checkingWeightAndAge(Animal animal, Scanner scanner){
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
            number = scanner.nextInt();
            if(number<0){
                System.out.println("Вы ввели отрицательное число");
            }

        } while (number<0);

        animal.setAge(number);
        return number;
    }


    public static void createAnimal(Animal animal, Scanner scanner){
        System.out.println("Введи название животного");
        animal.setName(scanner.next());
        System.out.println("Введи возраст животного");
        animal.setAge(checkingWeightAndAge(animal,scanner));
        System.out.println("Введи вес животного");
        animal.setWeight(checkingWeightAndAge(animal,scanner));
        System.out.println("Введи Цвет животного");
        animal.setColor(scanner.next());
    }
}

