# 声明变量
**DECLARE** and instantiate the GameHelper instance variable, named helper.  
声明并实例化GameHelper实例变量，命名为helper  
**DECLARE** and instantiate an ArrayList to hold the list of DotComs (initially three) Call it dotComList.  
声明并实例化一个ArrayList来保存DotComs的列表(最初是三个)，称之为dotComList  
**DECLARE** an int variable to hold the number of user guesses (so the we can give the user a score at the end of the game). Name it numOfGuesses and set it to 0.  
声明一个int变量来保存用户猜测的次数(这样我们就可以在游戏结束时给用户一个分数)。将其命名为numof，并将其设置为0  
# 声明方法
**DECLARE** a setUpGame() method to create and initialize the DotCom objects with names and locations.  
**DECLARE** declare a startPlaying() method the asks the player for guesses and calls the checkUserGuess() method until all the DotCom objects are removed    from play.  
**DECLARE** a checkUserGuess() method that loops through all remaining DotCom objects and calls each DotCom object’s checkYourself() method.  
**DECLARE** a finishGame() method that prints a message about the user’s perFormance, basesd on how many guesses it took to sink all of the DotCom objects.  
# 实现方法
**METHOD: void setUpGame()**  
> make three DotCom objects and name them  
**CREATE** three DotCom objects.  
**SET** a name for each DotCom.  
**ADD** the DotComs to the dotComsList (the ArrayList).  
**REPEAT** with each of the DotCom objects in the dotComsList array  
**CALL** the placeDotCom() method on the helper object, to get a randomly-selected location for this DotCom (three cells, vertically or horizontally aligned, on a 7 X 7 grid).  
**SET** the location for each DotCom based on  the result of the placeDotCom() call.  
**END REPEAT**  
**END METHOD**  
**METHOD: void startPlaying()**  
**REPEAT** while any Dot Coms exist  
**GET** user input by calling the helper getUserInput() method  
**EVALUATE** the user’s guess by checkUserGuess() method  
**END REPEAT**  
**END METHOD**  
**METHOD: void checkUserGuess(String userGuess)**  
> find out if there’s a hit (and kill) on ant DotCom  
**INCREMENT** the number of user guesses in the numOfGuesses variable  
**SET** the local result variable (a String) to “miss”, assuming the the user’s guess will be a miss.  
**REPEAT** with each of the DotObjects in the dotComList array  
**EVALUATE** the user’s guess by calling the DotCom object’s checkYourself() method  
**SET** the result variable to “hit” or “kill” if appropriate  
**IF** the result if “kill”, REMOVE the DocCom from the dotComsList  
**END REPEAT**  
**DISPLAY** the result value to the user  
**END METHOD** 
**METHOD: void finsihGame()**  
**DISPLAY** a generic “game over” message, then:  
**IF** number of user guess is small,  
**DISPLAY** a congratulations message  
**ELSE**  
**DISPLAY** an insulting one  
**END IF**  
**END METHOD**  