public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    // void 类型函数不返回任何内容
    String getTime() {
        return time;
    }
}


class ClockTestDrive {
    public static void main(String[] args) {
        
        Clock c = new Clock();

        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
