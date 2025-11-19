javac $(find . -name "*.java")
jar cfm sandbox.jar manifest.mf $(find . -name "*.class")
java -jar sandbox.jar