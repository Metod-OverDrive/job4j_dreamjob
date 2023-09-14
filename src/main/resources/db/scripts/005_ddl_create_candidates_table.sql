create table candidates(
    id serial primary key,
    name varchar not null,
    description varchar not null,
    city_id int references cities(id),
    creation_date  timestamp,
    file_id int references files(id)
);