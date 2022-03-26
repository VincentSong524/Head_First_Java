class testDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }
}
class test {
    public static void main(String[] args) {

        testDog[]  pets;
        pets = new testDog[7];
        pets[0] = new testDog();
        pets[1] = new testDog();
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        //System.out.println(x);
    }
    
}
