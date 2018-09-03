 create database springdb; -- Create the new database
 create user 'springuser'@'localhost' identified by 'root'; -- Creates the user
 grant all on springdb.* to 'springuser'@'localhost'; -- Gives

 revoke all on springdb.* from 'springuser'@'localhost';

 grant select, insert, delete, update on springdb.* to 'springuser'@'localhost';






 use springdb;

grant select, insert, delete, update, create on springdb.* to 'springuser'@'localhost';

revoke all on springdb.* from 'springuser'@'localhost';

GRANT ALL ON *.* to springuser@'%' IDENTIFIED BY 'root';

 GRANT ALL PRIVILEGES ON springdb.* TO 'springuser'@'localhost';


 select * from user;