#!/bin/bash

asadmin --host raspberrypi --port 4848 --user admin --passwordfile password delete-jdbc-resource jdbc/PunchDS
asadmin --host raspberrypi --port 4848 --user admin --passwordfile password delete-jdbc-connection-pool PunchDev
asadmin --host raspberrypi --port 4848 --user admin --passwordfile password create-jdbc-connection-pool --restype javax.sql.DataSource --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlDataSource --property user=punchdev:password=punchdev:DatabaseName=punchDev:ServerName=localhost:port=3306 PunchDev
asadmin --host raspberrypi --port 4848 --user admin --passwordfile password ping-connection-pool PunchDev
asadmin --host raspberrypi --port 4848 --user admin --passwordfile password create-jdbc-resource --connectionpoolid PunchDev jdbc/PunchDS
