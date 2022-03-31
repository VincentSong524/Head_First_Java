package sinkADotCom;
import java.util.ArrayList;
public class DotCom {

    private ArrayList<String> locationCells;
    // private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {

        // int guess = Integer.parseInt(stringGuess);  // 把字符串转换成int
        String result = "miss"; // 创建出保存返回结果的变量。以miss作为默认值
        int index = locationCells.indexOf(userInput);
            if (index >= 0) { // 如果索引值大于或等于 0， 命中！
                locationCells.remove(index);

                if (locationCells.isEmpty()) {
                    result = "kill";
                } else {
                    result = "hit";
                } // close if
            } // close outer if
        return result;  // 将结果返回给调用方
    } // close method
}   // close class
