@ECHO OFF
CALL setenv.bat
ECHO Deploying EAR file to started server
%OPENEJB_HOME%\bin\openejb.bat deploy ..\..\build\countCharactersEAR.ear