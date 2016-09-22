#!/bin/bash
sudo asadmin create-jdbc-connection-pool --restype javax.sql.DataSource --datasourceclassname oracle.jdbc.pool.OracleDataSource --property "user=afefon02101:password=?: url=jdbc\\:oracle\\:thin\\:@uni0.intrameq\\:1521\\:uni0" AFECoreDS
asadmin create-jdbc-resource --connectionpoolid AFECoreDS jdbc/AFECoreDS
