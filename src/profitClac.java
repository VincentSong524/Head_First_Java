import java.util.Scanner;

class clac {
    
    /*
    盲盒售价：  boxOutPrice
    车费：      fare
    盲盒购价：  boxInPrice
    非本号佣金：commission
    利润：      profit
    账号数量：  numberOfAccounts
    非本号数量：OtherNumberAccounts
    碎片价格：  400
    碎片回收价格：reclaim
    */

    //float boxOutPrice, fare, boxInPrice, commission, profit, numberOfAccounts, OtherNumberAccounts;

    static float sigleProfit (float boxOutPrice,float fare, float boxInPrice,
        float commission, float numberOfAccounts,
        float OtherNumberAccounts, float reclaim) {
            
        // 返回单号利润
        return  boxOutPrice - fare - boxInPrice - 400 + reclaim;
    }

    static float allProfit (float boxOutPrice,float fare, float boxInPrice,
        float commission, float numberOfAccounts,
        float OtherNumberAccounts, float reclaim) {
            
        // 返回全部利润
        return  numberOfAccounts*(boxOutPrice - fare - boxInPrice) - OtherNumberAccounts*commission +
            numberOfAccounts*(3*reclaim - 360);
    }

    static float lossAccounts(float boxOutPrice, float fare, float boxInPrice, float commission) {
        return fare + boxInPrice + commission - boxOutPrice;
    }
}


public class profitClac {
    public static void main(String[] args) {

        //float fare = 88, boxInPrice = 100, commission = 100, profit, numberOfAccounts = 0, OtherNumberAccounts = 0;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("输入参数\n盲盒出售价格: ");
            float boxOutPrice = sc.nextFloat(); 
            
            //System.out.println("车费：");
            //float fare = sc.nextFloat(); 
            float fare = 88;

            //System.out.println("盲盒购入价格: ");
            //float boxInPrice = sc.nextFloat(); 
            float boxInPrice = 100;

            //System.out.println("非本号佣金: ");
            //float commission = sc.nextFloat(); 
            float commission = 100;

            System.out.println("账号数量: ");
            float numberOfAccounts = sc.nextFloat(); 
            
            System.out.println("非本号数量: ");
            float OtherNumberAccounts = sc.nextFloat(); 
            
            System.out.println("碎片回收价格/个");
            float reclaim = sc.nextFloat(); 

            // clac.allProfit(boxOutPrice, fare, boxInPrice, commission, profit, numberOfAccounts, OtherNumberAccounts)
            System.out.println("本人单号利润 =" + clac.sigleProfit(boxOutPrice, fare, boxInPrice, commission, numberOfAccounts, OtherNumberAccounts, reclaim) + 
                " 非本人单号利润 =" +(clac.sigleProfit(boxOutPrice, fare, boxInPrice, commission, numberOfAccounts, OtherNumberAccounts, reclaim) - 100));

            System.out.println("最终利润 =" + clac.allProfit(boxOutPrice, fare, boxInPrice, commission, numberOfAccounts, OtherNumberAccounts, reclaim));

            System.out.println("丢失一个账号减少收入为: " + clac.lossAccounts(boxOutPrice, fare, boxInPrice, commission));
        }
    }
    
}
