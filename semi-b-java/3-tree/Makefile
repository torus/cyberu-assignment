TARGET = BinaryTree
TEST_TARGET = BinaryTreeTest
TEST_JFLAGS = -classpath .:/usr/share/java/junit4.jar
JAVAS = $(wildcard *.java)

test: $(TEST_TARGET).class $(JAVAS)
	java $(TEST_JFLAGS) org.junit.runner.JUnitCore $(TEST_TARGET)

$(TEST_TARGET).class: $(JAVAS)
	javac $(TEST_TARGET).java

run: $(TARGET).class
	java $(TARGET)

$(TARGET).class: $(JAVAS)
	javac $(TARGET).java

$(TEST_TARGET).class:
	javac $(TEST_JFLAGS) $(TEST_TARGET).java
