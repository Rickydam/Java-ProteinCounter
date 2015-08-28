#v1.6
- Added custom input which gives the user the possibility of entering a custom name and custom value
- The shortcut for clearing has been modified to Ctrl-N since the new addition of custom input uses text fields and if the type   cursor is on for either of the text boxes, Ctrl-C, which was originally used for clearing is intepreted by the operating        system as copy and thus, does not clear until the user opens the file menu to de-trigger the type cursor

--------------------------------------------------------------

->
symbol means what should be done

--------------------------------------------------------------

* Bug, empty spaces and numbers in the custom name text field and program still continues                                      
-> Update label feed and do nothing

* Bug, empty space in the custom value text field breaks the program                                          
-> Update label feed but be able to go on with program

* Bug, text in the custom value text field breaks the program                                  
-> Update label feed but be able to go on with program

![alt tag](https://github.com/Rickydam/Java-ProteinCounter/blob/master/v1.6.png)
