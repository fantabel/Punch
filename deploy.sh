#!/bin/sh
cd PunchProject
mvn clean package
cd ..
asadmin --host debian --port 4848 --user admin deploy --force=true PunchEar/target/Punch.ear
