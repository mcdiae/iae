@ECHO OFF

IF NOT EXIST build\bin\kernel32.jar GOTO :NOBUILD
IF NOT EXIST dependencies\jna.jar GOTO :NODEP

SET CLASSPATH=build\bin\kernel32.jar;dependencies\jna.jar

REM Test setting code page

ECHO INFO: showing code page
java console.win32.tests.SetCodePage
ECHO INFO: trying to set invalid CP
java console.win32.tests.SetCodePage -1
ECHO INFO: setting code page to 1252
java console.win32.tests.SetCodePage 1252
PAUSE

REM Test console mode

ECHO INFO: testing console mode
java console.win32.tests.ConsoleMode
ECHO INFO: redirecting stdout and testing mode
java console.win32.tests.ConsoleMode > NUL
PAUSE

REM Print Unicode

ECHO INFO: printing Unicode
java console.win32.tests.PrintUnicode
ECHO INFO: printing Unicode; redirecting stderr to NUL
java console.win32.tests.PrintUnicode 2> NUL
PAUSE

REM Read Unicode

ECHO INFO: reading Unicode
java console.win32.tests.ReadUnicode
ECHO INFO: reading from file
java console.win32.tests.ReadUnicode < runtests.bat
PAUSE

REM Print UTF-8

ECHO INFO: printing UTF-8
java console.win32.tests.PrintUtf8
PAUSE

GOTO :END

:NOBUILD
ECHO Missing file: build\bin\kernel32.jar
ECHO Use Ant to build the project with build.xml
GOTO :END

:NODEP

GOTO :END
ECHO Missing file: dependencies\jna.jar
ECHO Use Ant to download the dependency with build.xml
:END