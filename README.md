# JournalDev-PrimefacesWebApplication

These two examples are crammed into a single project on the “Prime” c9 instance:
- https://www.journaldev.com/2990/jsf-primefaces-tutorial
- https://www.logicbig.com/tutorials/misc/primefaces/basic-dialog.html

### Set up the instance and environment

[maven hello world war](https://github.com/craigwongva/gist/issues/466)

### Start a new day
```
sudo su -
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.242.b08-0.50.amzn1.x86_64
/opt/tomcat9/bin/startup.sh
exit
```

### Build it
```
cd ~/environment/JournalDev-PrimefacesWebApplication
mvn package
```

### Deploy it

`sudo cp target/JournalDev-PrimefacesWebApplication.war /opt/tomcat9/webapps/jd.war`

### Run it

`http://w.x.y.z:8080/jd/faces/dialog.xhtml`
