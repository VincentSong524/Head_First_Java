# 声明变量
**DECLARE** and instantiate the GameHelper instance variable, named helper.  
声明并实例化GameHelper实例变量，命名为helper  

**DECLARE** and instantiate an ArrayList to hold the list of DotComs (initially three) Call it dotComList.  
声明并实例化一个ArrayList来保存DotComs的列表(最初是三个)，称之为dotComList  
**DECLARE** an int variable to hold the number of user guesses (so the we can give the user a score at the end of the game). Name it numOfGuesses and set it to 0.  
声明一个int变量来保存用户猜测的次数(这样我们就可以在游戏结束时给用户一个分数)。将其命名为numof，并将其设置为0  

# 声明方法
**DECLARE** a setUpGame() method to create and initialize the DotCom objects with names and locations.  
声明 setUpGame()方法创建并初始化带有名称和位置的DotCom对象  

**DECLARE** declare a startPlaying() method the asks the player for guesses and calls the checkUserGuess() method until all the DotCom objects are removed from play.  
声明startPlaying()方法，请求玩家猜测并调用checkUserGuess()方法，直到所有的DotCom对象从play中移除  

**DECLARE** a checkUserGuess() method that loops through all remaining DotCom objects and calls each DotCom object’s checkYourself() method.  
声明一个checkUserGuess()方法，循环遍历所有剩余的DotCom对象，并调用每个DotCom对象的checkYourself()方法  

**DECLARE** a finishGame() method that prints a message about the user’s perFormance, basesd on how many guesses it took to sink all of the DotCom objects.  
声明一个finishGame()方法，它打印一条关于用户性能的消息，这是基于接收所有DotCom对象的猜测次数  

# 实现方法
**METHOD: void setUpGame()**  
&emsp;&emsp;> make three DotCom objects and name them  
&emsp;&emsp;> 创建三个DotCom对象并命名它们  

&emsp;&emsp;**CREATE** three DotCom objects.  
&emsp;&emsp;创建三个DotCom对象  

&emsp;&emsp;**SET** a name for each DotCom.  
&emsp;&emsp;为每个DotCom设置一个名称  

&emsp;&emsp;**ADD** the DotComs to the dotComsList (the ArrayList).  
&emsp;&emsp;将DotComs添加dotComsList(数组列表)  

&emsp;&emsp;**REPEAT** with each of the DotCom objects in the dotComsList array  
&emsp;&emsp;重复使用dotComsList数组中的每个DotCom对象  
&emsp;&emsp;&emsp;&emsp;**CALL** the placeDotCom() method on the helper object, to get a randomly-selected location for this DotCom (three cells, vertically or horizontally aligned, on a 7 X 7 grid).  
&emsp;&emsp;&emsp;&emsp;调用帮助器对象上的placeDotCom()方法，为这个DotCom获得一个随机选择的位置(3个单元格，垂直或水平对齐，在7 X 7的网格上)  

&emsp;&emsp;&emsp;&emsp;**SET** the location for each DotCom based on  the result of the placeDotCom() call.  
&emsp;&emsp;&emsp;&emsp;根据placeDotCom()调用的结果设置每个DotCom的位置  

&emsp;&emsp;**END REPEAT**  
**END METHOD**

**METHOD: *void startPlaying()***  
&emsp;&emsp;**REPEAT** while any Dot Coms exist  
&emsp;&emsp;当任何 Dot Coms 存在时重复  

&emsp;&emsp;&emsp;&emsp;**GET** user input by calling the helper getUserInput() method  
&emsp;&emsp;通过调用getUserInput()方法获取用户输入  

&emsp;&emsp;&emsp;&emsp;**EVALUATE** the user’s guess by checkUserGuess() method  
&emsp;&emsp;通过checkUserGuess()方法计算用户的猜测  

&emsp;&emsp;**END REPEAT**  
**END METHOD**  

**METHOD: void checkUserGuess(String userGuess)**  
&emsp;&emsp;> find out if there’s a hit (and kill) on ant DotCom  
&emsp;&emsp;查看 DotCom 是否有一个命中(和杀死)  

&emsp;&emsp;**INCREMENT** the number of user guesses in the numOfGuesses variable  
&emsp;&emsp;增加 numOfGuesses 变量中用户猜测的次数  

&emsp;&emsp;**SET** the local result variable (a String) to “miss”, assuming the the user’s guess will be a miss.  
&emsp;&emsp;将本地结果变量(一个String)设置为miss，假设用户的猜测是miss  

&emsp;&emsp;**REPEAT** with each of the DotObjects in the dotComList array  
&emsp;&emsp;重复dotComList数组中的每个dotobject  

&emsp;&emsp;&emsp;&emsp;**EVALUATE** the user’s guess by calling the DotCom object’s checkYourself() method  
&emsp;&emsp;&emsp;&emsp;通过调用DotCom对象的checkYourself()方法来评估用户的猜测  

&emsp;&emsp;&emsp;&emsp;**SET** the result variable to “hit” or “kill” if appropriate  
&emsp;&emsp;&emsp;&emsp;如果合适的话，将结果变量设置为击中或杀死  

&emsp;&emsp;&emsp;&emsp;**IF** the result if “kill”, **REMOVE** the DocCom from the dotComsList  
&emsp;&emsp;&emsp;&emsp;如果结果是kill，则从dotComsList中删除DocCom  

&emsp;&emsp;**END REPEAT**  
&emsp;&emsp;**DISPLAY** the result value to the user  
&emsp;&emsp;向用户显示结果值  

**END METHOD** 

**METHOD: *void finsihGame()***  
&emsp;&emsp;**DISPLAY** a generic “game over” message, then:  
&emsp;&emsp;在消息上显示一个通用的游戏，然后  

&emsp;&emsp;&emsp;&emsp;**IF** number of user guess is small,  
&emsp;&emsp;&emsp;&emsp;如果用户猜测的数量很小  

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;**DISPLAY** a congratulations message  
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;显示祝贺信息  

&emsp;&emsp;&emsp;&emsp;**ELSE**  
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;**DISPLAY** an insulting one  
&emsp;&emsp;**END IF**  
**END METHOD**  
