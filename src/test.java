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

        testDog []  pets;
        short c = 42;
        pets = new testDog[7];
        pets[0] = new testDog();
        pets[1] = new testDog();
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        System.out.println(x);


        // 使用equals() 判断两个对象是否意义上相等

       if (!pets[0].equals(pets[1])) {
           System.out.println("False" + c);
       }

       pets[1].getSize();
    }
    
}
