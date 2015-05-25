#!/bin/bash
set -e
if [[ -z "$1" ]] || [[ -z "$1" ]] ; then
  echo usage: ./was_net_install.sh ibmid@example.com yourpassword
  exit 1
fi

#install IBMIM
mkdir /tmp/ibmim
echo Extracting install manager
unzip -q -u agent.installer.linux.gtk.x86_1.6.2000.20130301_2248 -d /tmp/ibmim
echo Installing IBM Installation Manager
/tmp/ibmim/userinstc -acceptLicense
#rm -Rf /tmp/ibmim

#install WAS
TOOLS=~/IBM/InstallationManager/eclipse/tools
REPO=http://www.ibm.com/software/repositorymanager/V85WASDeveloperILANL/repository.xml
echo Setting $HOME in response file
sed -e "s#USERHOMEDIR#$HOME#g" install_was.xml > /tmp/install_was.xml
echo Generating credentials
$TOOLS/imutilsc saveCredential -url $REPO -userName $1 -userPassword $2 -masterPasswordFile masterpw.txt -secureStorageFile ~/secure_repo.dat
echo Installing WAS from internet...     may take some time
$TOOLS/imcl input /tmp/install_was.xml -log ~/wasinstall.log -acceptLicense -masterPasswordFile masterpw.txt -secureStorageFile ~/secure_repo.dat
rm ~/secure_repo.dat

#install Eclipse
JUNO=~/juno
JRE=~/IBM/WebSphere/AppServer/java
JUNOREPO=http://download.eclipse.org/releases/juno
WDTREPO=http://public.dhe.ibm.com/ibmdl/export/pub/software/websphere/wasdev/updates/wdt/V8.5.5
ETAR=eclipse-jee-juno-SR2-linux-gtk.tar.gz
echo Downloading $ETAR
wget -O /tmp/$ETAR http://www.mirrorservice.org/sites/download.eclipse.org/eclipseMirror/technology/epp/downloads/release/juno/SR2/$ETAR
mkdir $JUNO
tar xzf /tmp/$ETAR -C $JUNO
#rm -Rf /tmp/$ETAR
echo Setting Eclipse JRE to WAS JDK
ln -s $JRE $JUNO/eclipse/jre
echo Installing WDT plugins from internet...  may take some time
FEATURES=com.ibm.osgi.wdt.feature.feature.group,com.ibm.wdt.webtools.top.feature.feature.group,com.ibm.websphere.wdt.st.v85.feature.group
FEATURES=$FEATURES,com.ibm.wdt.ast.ws.tools.feature.feature.group,com.ibm.websphere.wdt.server.tools.feature.group
$JUNO/eclipse/eclipse -nosplash -application org.eclipse.equinox.p2.director -repository $WDTREPO,$JUNOREPO -installIU $FEATURES
ln -s $JUNO/eclipse/eclipse ~/Desktop/eclipse

