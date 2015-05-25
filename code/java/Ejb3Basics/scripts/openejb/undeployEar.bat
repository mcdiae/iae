@ECHO OFF
CALL setenv.bat
ECHO Un-deploying EAR file from started server
%OPENEJB_HOME%\bin\openejb.bat undeploy %OPENEJB_HOME%\apps\countCharactersEAR