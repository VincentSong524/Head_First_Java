class Dogs {

    String name;

    void bark() {
        System.out.println("wang wang");
    }

    void chaseCat() {
        System.out.println("chase cat");
    }
}


class Dog{
    public static void main(String[] args) {
        
        Dogs fido = new Dogs();
        fido.name = "Fido";
        fido.bark();
        fido.chaseCat();
    }
}
