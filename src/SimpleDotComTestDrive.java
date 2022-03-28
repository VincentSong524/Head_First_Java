public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();  // 初始化一个Simpleotom对象

        int [] locations = {2, 3, 4};   // 创建带有dot com 位置的数组
        dot.setLocationCells(locations); // 调用dot com的setter
        String userGuess = "2"; // 提供假的猜测
        String result = dot.checkYourself(userGuess);   // 调用测试方法并传入假的数据
        //String testResult = "failed";
        System.out.println(result);
        
    }
    
}
