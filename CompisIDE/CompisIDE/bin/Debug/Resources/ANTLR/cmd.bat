set arg1=%1
set arg2=%2

java -jar .\Resources\ANTLR\antlr-4.9.2-complete.jar .\Resources\ANTLR\tiny.g4
javac -cp ".;%arg2%/antlr-4.9.2-complete.jar" .\Resources\ANTLR\tiny*.java
javac -cp ".;%arg2%/antlr-4.9.2-complete.jar" .\Resources\ANTLR\*.java
cd %arg2%
java -cp "./*;." ASTGenerator .\document.ty
cd ..
cd ..
