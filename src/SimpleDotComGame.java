public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;   // 记录玩家猜测次数
        GameHelper helper = new GameHelper();   // 取得玩家的输入

        SimpleDotCom theDotCom = new SimpleDotCom();    // 创建dot com 对象
        int randomNum = (int) (Math.random() * 5);

        int [] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);  // 赋值位置
        boolean isAlive = true; // 创建游戏是否继续进行的boolean变量

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess); //检查玩家的猜测并将结果存储在String中
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }   // close if
        }   // close while
    }   // close main
    
}
