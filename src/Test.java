import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("GitHub");
        System.out.println(sites);
        System.out.println(sites.get(1));
        sites.set( 1, "Wiki");
        System.out.println(sites.get(1));
        System.out.println(sites.get(3));
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
        for (String i: sites) {
            System.out.println(i);
        }
    }
}