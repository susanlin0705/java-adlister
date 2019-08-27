use adlister_db;
DROP Table if EXISTS ads;
DROP TABLE if EXISTS users;

create table users(
    id int unsigned not null auto_increment,
    username varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    primary key (id)
);

create table ads(
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(100),
    description text,
    primary key (id),
    FOREIGN KEY (user_id) REFERENCES users (id)

);