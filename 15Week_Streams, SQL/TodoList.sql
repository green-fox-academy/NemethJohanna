create database tododb;
USE tododb;

/*CREATE*/

CREATE TABLE IF NOT EXISTS todolist (
	id INT NOT NULL auto_increment primary key,
    todo VARCHARACTER (100)
    );
    
INSERT INTO todolist (todo) 
VALUES ("Walk the dog"),
		("Buy milk"),
        ("Do homework");
     
/* READ */
SELECT * FROM todolist;

/* UPDATE */
UPDATE todolist
SET todo = "Go home"
WHERE id = 3;

/* DELETE */
DELETE FROM todolist
WHERE id = 3;
