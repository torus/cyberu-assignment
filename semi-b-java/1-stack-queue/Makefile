TARGET = StackQueue
TEST_TARGET = StackQueueTest
TEST_JFLAGS = -classpath .:/usr/share/java/junit4-4.11.jar
JAVAS = $(wildcard *.java)

test: $(TEST_TARGET).class $(JAVAS)
	java $(TEST_JFLAGS) org.junit.runner.JUnitCore $(TEST_TARGET)

run: $(TARGET).class $(JAVAS)
	java $(TARGET)

$(TARGET).class:
	javac $(TARGET).java

$(TEST_TARGET).class:
	javac $(TEST_JFLAGS) $(TEST_TARGET).java
