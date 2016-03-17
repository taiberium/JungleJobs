create table record (
id serial not null PRIMARY KEY,
title text not null,
content text not null,
creation_date date not null
);