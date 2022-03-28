public class SimpleDotCom {

    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int [] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);  // 把字符串转换成int
        String result = "miss"; // 创建出保存返回结果的变量。以miss作为默认值
        for (int cell : locationCells) { // 以循环对每个格子重复执行
            if (guess == cell) { // 比较格子与猜测值
                result = "hit"; // 命中
                numOfHits++;
                break;  // 已经离开循环，但需要判断是否击沉
            } // end if
        } // end for

        if (numOfHits == locationCells.length) {
            result = "kill";    // 返回击沉信息
        } // end if

        System.out.println(result); // 显示结果
        return result;  // 将结果返回给调用方
    } // close method
}   // close class
