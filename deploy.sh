#!/bin/sh
cd PunchProject
mvn clean package
cd ..
asadmin --host raspberrypi.local --port 4848 --user admin --passwordfile password deploy --force=true PunchEar/target/Punch.ear
