class Dog_Bark {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else  {
            System.out.println("Yip! Yip!");
        }
    }
}

public class DogTestDrive {
    public static void main(String[] args) {
        Dog_Bark one = new Dog_Bark();
        one.size = 70;
        Dog_Bark two = new Dog_Bark();
        two.size = 8;
        Dog_Bark three = new Dog_Bark();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
    
}
