CREATE TABLE employee (
id  INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

INSERT INTO employee (firstname,lastname,email) values ('MARIO','HIDALGO','mario@yahoo.com');