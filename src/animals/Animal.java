package animals;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public static String convertAge(int age){
        int a = age % 10;
        if (a == 1) {
            return " год";
        } else if (a == 0 || a >= 5) {
            return " лет";
        } else if (a >= 2) {
            return " года";
        } else {
            return " лет"; // для остальных случаев
        }
           }


    public String toString() {
        return "Привет!Меня зовут "+name+","+ "мне "+age+convertAge(age)+","+"я вешу - "+ weight+" Кг"+
              ","  + "мой цвет - " + color;
    }

    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я Иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
