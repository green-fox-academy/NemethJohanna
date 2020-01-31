CREATE DATABASE moviedb;
USE moviedb;

CREATE TABLE IF NOT EXISTS movie (
	Id INT NOT NULL auto_increment primary key,
    Title VARCHAR (150),
    Director VARCHAR (100),
    Year YEAR,
    Length_minutes smallint);

INSERT INTO movie (title, director, year, length_minutes) 
	VALUES ("Toy Story", "John Lasseter", 1995, 81),
			("Toy Story 2", "John Lasseter", 1999, 93),
            ("A Bug's Life", "John Lasseter", 1998, 85),
            ("Monsters, Inc.", "Pete Docter", 2001, 92);
            
SET SQL_SAFE_UPDATES = 0;
DELETE FROM movie
WHERE Title = "Toy Story 2";

UPDATE movie
SET title = "The Incredibles"
WHERE title = "A Bug's Life";