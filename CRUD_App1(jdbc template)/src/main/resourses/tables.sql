-- code for MySQL 

create table person (
    id integer AUTO_INCREMENT primary key ,
    name varchar(30) not null,
    age integer check ( age > 0),
    email varchar(64) unique,
    address varchar(64) not null
);
