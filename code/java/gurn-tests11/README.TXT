Gurning Faces Test Project
==========================

This is a Servlet 2.4, JSP 2.0, Java 5 WAR demonstrating Gurning Faces.
The project can be run as a Jetty web server. 


See also: http://docs.codehaus.org/display/JETTY/Maven+Jetty+Plugin

To start web server:
mvn jetty:run

To use project:
http://localhost:8080/gurn-tests11/ 

To run tests:
mvn verify

To build without bundling JSF libs:
mvn -DpackageJsf=false clean package
