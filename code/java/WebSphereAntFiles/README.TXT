Related post: TODO

This project contains sample Ant build files for use with WebSphere Application Server 6.1
They have been tested on the WAS server installed with Rational Application Developer 7 on Linux Fedora 8
The server uses the install default configuration.

The provided build.xml does the following:

1. Assemble a simple EAR file (build.xml)
2. Add WAS binding info to EAR (wsDefaultBindings.xml)
3. Start WAS (wsStartServer.xml)
4. Install the EAR (wsInstallApp.xml)
5. List installed EARs (wsListApps.xml)
6. Start the EAR (wsStartApp.xml)
7. Stops the EAR (wsStopApp.xml)
8. Uninstall the EAR (wsStopApp.xml)
9. Stop WAS (wsStopServer.xml)

Paths/properties in build.properties will need to be modified for the local system.
The scripts must be run using the ws_ant.sh/ws_ant.bat script in the server's profile directory.

Run from: /opt/IBM/SDP70/runtimes/base_v61/profiles/AppSrv01/bin
Sample command: ./ws_ant.sh -buildfile ~/IBM/rationalsdp7.0/workspace/WebSphereAntFiles/scripts/test/build.xml -propertyfile ~/IBM/rationalsdp7.0/workspace/WebSphereAntFiles/scripts/test/build.properties


See:
http://publib.boulder.ibm.com/infocenter/wasinfo/v6r1/index.jsp?topic=/com.ibm.websphere.javadoc.doc/public_html/api/com/ibm/websphere/ant/tasks/package-summary.html
http://www-1.ibm.com/support/docview.wss?uid=swg1PK07628

Although many of the tasks used are common to WAS 6.0, it is installed with an older version of Ant and these scripts will not work.