class Dogs {

    String name;

    void bark() {
        System.out.println(name + " says Ruff!");
    }

    void chaseCat() {
        System.out.println("chase cat");
    }
}


class Dog{
    public static void main(String[] args) {
        
        //创建Dog对象
        Dogs dog1 = new Dogs();
        dog1.bark();
        dog1.name = "Bart";

        //创建Dog数组
        Dogs[] myDogs = new Dogs[3];
        //关门放狗
        myDogs[0] = new Dogs(); 
        myDogs[1] = new Dogs();
        myDogs[2] = dog1;

        //通过数组引用存取Dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //myog[2] 的名字是？
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        //对Dog执行bark()
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
