create table member(
	id int NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	passwd VARCHAR(50) NOT NULL,
	PRIMARY KEY(id)
);

SHOW TABLES;

DESC Student;

RENAME TABLE member TO Student;

INSERT INTO Student VALUES('1', '이재성', '1234' );

SELECT * FROM Student;

INSERT INTO Student VALUES('2', '홍길순', '1235');
INSERT INTO Student VALUES('3', '함혜지',  '1236');
INSERT INTO Student VALUES('4', '김영욱', '1237');


