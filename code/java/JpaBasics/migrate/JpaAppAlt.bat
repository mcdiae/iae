@ECHO OFF
SET ORACLE_HOME=C:\dev\oraclexe
SET ORACLE_LIBS=%ORACLE_HOME%\app\oracle\product\10.2.0\server
SET HIBERNATE_HOME=C:\dev\Java\hibernate-entitymanager-3.4.0.GA

SET APPCP=..\build\classes;..\src;%ORACLE_LIBS%\jlib\orai18n.jar;%ORACLE_LIBS%\jdbc\lib\ojdbc14.jar

SETLOCAL enabledelayedexpansion
FOR %%F IN (%HIBERNATE_HOME%\lib\*.jar) DO (
  SET APPCP=!APPCP!;%%F%
)
FOR %%F IN (%HIBERNATE_HOME%\lib\test\*.jar) DO (
  SET APPCP=!APPCP!;%%F%
)
FOR %%F IN (%HIBERNATE_HOME%\*.jar) DO (
  SET APPCP=!APPCP!;%%F%
)

ECHO CLASSPATH=%APPCP%

java -cp %APPCP%  illegalargument.demo.jpa.application.JpaApp hibernate.properties
