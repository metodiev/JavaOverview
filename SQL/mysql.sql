create database test;

-- this is comment in sql language
-- with use keyword you define which database you will use
use test;


-- create new table
create table users
(
id int(11), -- id is an integer value this can only contains digits
username varchar(11), -- username, password is an string value, contains characters
password varchar(255)
);


insert into users values(1, 'Pesho', 'pesho123');
insert into users values(2, 'KiroSkalata', 'parolaRIbaMech');


select * from users;

-- TODO create Tables which are indeed in shop market
