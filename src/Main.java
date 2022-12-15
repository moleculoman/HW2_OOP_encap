public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Human maxim = new Human(1987, "Максим", "", "бренд-менеджер");
        Human anna = new Human(1994, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(1993, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", "безработный");

        System.out.println("Привет! Меня зовут "+ maxim.name +". Я из города "+ maxim.getCity() +". Я родился в "+ maxim.getAge() +" году. Я работаю на должности "+ maxim.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ kate.name +". Я из города "+ kate.getCity() +". Я родился в "+ kate.getAge() +" году. Я работаю на должности "+ kate.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ anna.name +". Я из города "+ anna.getCity() +". Я родился в "+ anna.getAge() +" году. Я работаю на должности "+ anna.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ artem.name +". Я из города "+ artem.getCity() +". Я родился в "+ artem.getAge() +" году. Я работаю на должности "+ artem.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ vladimir.name +". Я из города "+ vladimir.getCity() +". Я родился в "+ vladimir.getAge() +" году. Я "+ vladimir.jobTitle + ". Будем знакомы!" );

        System.out.println("Задание №2");
        Flower rose = new Flower("Роза обыкновенная", 35.59F,  "Голландия");
        Flower chrysanthemum = new Flower("Хризантема", 15, 5, "");
        Flower peony = new Flower("Пион", 69.9F, 1, "Англия");
        Flower gypsophila = new Flower("Гипсофила", 19.5F, 10, "Турция");
        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());

    }
}
