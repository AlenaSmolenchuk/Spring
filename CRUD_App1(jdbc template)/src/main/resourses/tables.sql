-- code for MySQL 

create table person (
    id integer AUTO_INCREMENT PRIMARY KEY,
    name varchar(30) NOT NULL,
    age integer CHECK (age > 0),
    email varchar(64) UNIQUE,
    address varchar(64) NOT NULL
);
