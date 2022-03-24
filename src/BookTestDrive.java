class Books {
    String title;
    String auther;
}


public class BookTestDrive {
    public static void main(String[] args) {
        
        Books [] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].auther = "bob";
        myBooks[1].auther = "sue";
        myBooks[2].auther = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].auther);
            x = x + 1;
        }
    }
    
}
