create table Person(
                       id int generated by default as identity primary key,
                       name varchar(30) not null ,
                       email varchar(100) unique,
                       age int check ( age >0 )
);
