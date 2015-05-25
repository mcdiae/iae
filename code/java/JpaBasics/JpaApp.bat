@ECHO OFF
SET DERBYCP=dependencies\db-derby-10.5.3.0-bin\lib\derby.jar
SET ELINKCP=dependencies\eclipselink\jlib\eclipselink.jar;dependencies\eclipselink\jlib\jpa\javax.persistence_1.99.0.v200906021518.jar
SET APPCP=build\classes;src;%DERBYCP%;%ELINKCP%
ECHO CLASSPATH=%APPCP%
java -cp %APPCP% illegalargument.demo.jpa.application.JpaApp scripts\eclipselink.properties
