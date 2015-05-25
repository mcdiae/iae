@ECHO OFF
CALL setenv.bat
ECHO Stopping OpenEJB
%OPENEJB_HOME%\bin\openejb.bat stop