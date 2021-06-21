set arg1=%1

java -jar antlr-4.9.2-complete.jar tiny.g4
javac -cp ".;C:/ANTLR/antlr-4.9.2-complete.jar" tiny*.java
javac -cp ".;C:/ANTLR/antlr-4.9.2-complete.jar" *.java
java -cp ".;C:/ANTLR/antlr-4.9.2-complete.jar" ASTGenerator %arg1%
