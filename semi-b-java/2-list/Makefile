TARGET = List
TEST_TARGET = ListTest
TEST_JFLAGS = -classpath .:junit-4.12.jar:hamcrest-core-1.3.jar
JAVAS = $(wildcard *.java)

test: $(TEST_TARGET).class $(JAVAS)
	java $(TEST_JFLAGS) org.junit.runner.JUnitCore $(TEST_TARGET)

$(TEST_TARGET).class: $(JAVAS)

run: $(TARGET).class
	java $(TARGET)

$(TARGET).class: $(JAVAS)
	javac $(TARGET).java

$(TEST_TARGET).class:
	javac $(TEST_JFLAGS) $(TEST_TARGET).java
