create  database library ;

use library;

create table books(
id int(11),
book_name varchar(255),
book_author varchar(255)
);

select * from books;

insert into books values(2, 'Harry Potter', 'Goshkata');

create  table log_book_table
(
id int(11),
changer varchar(255)
);

DROP TRIGGER log_book;

       select * from log_book_table;
       
       
       
       CREATE TABLE `blog` (
	`id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`title` text,
	`content` text,
	`deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	KEY `ix_deleted` (`deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='Blog posts';


CREATE TABLE `audit` (
	`id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`blog_id` mediumint(8) unsigned NOT NULL,
	`changetype` enum('NEW','EDIT','DELETE') NOT NULL,
	`changetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	KEY `ix_blog_id` (`blog_id`),
	KEY `ix_changetype` (`changetype`),
	KEY `ix_changetime` (`changetime`),
	CONSTRAINT `FK_audit_blog_id` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


DELIMITER |
CREATE TRIGGER log_book BEFORE INSERT ON books
       FOR EACH ROW
       BEGIN
       insert into books values(1, 'asd', NEW.book_author);
       
       END;
       |
       DELIMITER |;

DELIMITER $$

CREATE
	TRIGGER `blog_after_insert` AFTER INSERT 
	ON `blog` 
	FOR EACH ROW BEGIN
	
		IF NEW.deleted THEN
			SET @changetype = 'DELETE';
		ELSE
			SET @changetype = 'NEW';
		END IF;
    
		INSERT INTO audit (blog_id, changetype) VALUES (NEW.id, @changetype);
		
    END$$

DELIMITER ;


DELIMITER $$

CREATE
	TRIGGER `blog_after_update` AFTER UPDATE 
	ON `blog` 
	FOR EACH ROW BEGIN
	
		IF NEW.deleted THEN
			SET @changetype = 'DELETE';
		ELSE
			SET @changetype = 'EDIT';
		END IF;
    
		INSERT INTO audit (blog_id, changetype) VALUES (NEW.id, @changetype);
		
    END$$

DELIMITER ;
       
       
       INSERT INTO blog (title, content) VALUES ('Article One', 'Initial text.');
       
       select * from audit;
       
       
       DROP PROCEDURE IF EXISTS country_audit_blogs;
 DELIMITER //
  CREATE PROCEDURE country_audit_blogs
(IN chan CHAR(20))
BEGIN
  SELECT count(*) FROM audit
  WHERE changetype = chan;
END //
DELIMITER ;

call country_audit_blogs('NEW');

