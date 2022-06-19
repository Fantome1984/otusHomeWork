import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        boolean isExit = true;
        while (isExit) {

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
                        catOne.Say();
                    }
                    else if (choice.equals("Собаку")){
                        Animal dogOne = new Dog();
                        createAnimal(dogOne,scan);
                        animal.add(dogOne);
                        dogOne.Say();
                    }
                    else if (choice.equals("Утку")){
                        Animal duckOne = new Duck();
                        createAnimal(duckOne,scan);
                        animal.add(duckOne);
                        duckOne.Say();
                    }
                    break;
                case LIST:
                   animal.forEach(animal1 ->  System.out.println(animal1.toString()));
                    break;
                case EXIT:
                    isExit = false;
                    break;
                case OTHER:
                    System.out.println("Команда неизвестна");



            }
        }
    }

    public static void createAnimal(Animal animal, Scanner scanner){
        System.out.println("Введи название животного");
        animal.setName(scanner.next());
        System.out.println("Введи возраст животного");
        animal.setAge(scanner.nextInt());
        System.out.println("Введи вес животного");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введи Цвет животного");
        animal.setColor(scanner.next());
    }
}



