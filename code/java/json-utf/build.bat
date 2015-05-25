@ECHO OFF
CALL mvn clean install source:jar javadoc:javadoc
CALL ant