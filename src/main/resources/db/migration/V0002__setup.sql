create table stocks(
  id int,
  symbol varchar(256),
  name varchar(256),
  price DOUBLE PRECISION,
  primary key (id)
);

create table history(
  int bigint,
  symbol varchar(256),
  open_price DOUBLE PRECISION,
  close_price DOUBLE PRECISION,
  date date,
  primary key (symbol)
);