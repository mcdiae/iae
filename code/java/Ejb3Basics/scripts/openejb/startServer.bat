@ECHO OFF
CALL setenv.bat
ECHO Starting OpenEJB in new console
START /MIN CMD.EXE /C %OPENEJB_HOME%\bin\openejb.bat start