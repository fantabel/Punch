create database punchDev;
create user 'punchdev'@'localhost' identified by 'punchdev';
create user 'punchdev'@'%' identified by 'punchdev';

grant all on punchDev.* to 'punchdev'@'localhost';
grant all on punchDev.* to 'punchdev'@'%';

