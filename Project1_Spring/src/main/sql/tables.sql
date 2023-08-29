create table person (
                        id integer AUTO_INCREMENT PRIMARY KEY,
                        full_name varchar(124) UNIQUE,
                        birthday_year integer NOT NULL
);

create table book (
                      id integer AUTO_INCREMENT PRIMARY KEY,
                      person_id integer REFERENCES person(id) ON DELETE SET NULL,
                      title varchar(100) NOT NULL,
                      author varchar(100) NOT NULL,
                      year integer NOT NULL
);