-- Create Table
DROP TABLE item IF EXISTS;
CREATE TABLE item(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    price INTEGER,
    type INTEGER
);