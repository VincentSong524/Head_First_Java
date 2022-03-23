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
        
        //
        Dogs[] myDogs = new Dogs[3];
        myDogs[0] = new Dogs();
        myDogs[0].name = "Fido";
        myDogs[0].bark();
        myDogs[0].chaseCat();

        myDogs[1] = new Dogs();
        myDogs[1].name = "Marge";
    }
}
