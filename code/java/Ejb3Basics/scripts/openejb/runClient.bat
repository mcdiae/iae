@ECHO OFF
CALL setenv.bat

REM Classpath using Java 6 wild-card option
SET CP=%OPENEJB_HOME%\lib\*;..\..\build\bin\client\client.jar

java -cp %CP% illegalargument.demo.ejb3.client.CountApp jndi.properties