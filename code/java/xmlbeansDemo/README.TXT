Associated Post:
http://illegalargumentexception.blogspot.com/2008/08/java-using-xmlbeans-to-edit-webxml.html

Eclipse 3.3.1 project [http://www.eclipse.org]
Depends on xmlbeans implementation
On check-out, will complain about missing user library "xmlbeans"
Developer must add this library to environment or alter build path as appropriate
Dependencies excluded due to license clash

XMLBeans [http://xmlbeans.apache.org/]
Windows command used to generate beans: 
%XMLBEANS_HOME%\bin\scomp -src .\src_webapp_2_5 -d .\bin_webapp_2_5 -out .\webapp_2_5.jar -javasource 1.5 -compiler %JDK_HOME%\bin\javac.exe -dl http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd
