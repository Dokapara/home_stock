-- users�e�[�u�����폜����
DROP TABLE IF EXISTS users;

-- users�e�[�u�����쐬����i�㏑���ۑ�����j
CREATE TABLE users (
	user_id		INT,
	name		TEXT,
	age		INT,
	email		TEXT
);

-- users�e�[�u���Ƀf�[�^���Z�b�g
INSERT INTO users (user_id, name, age, email)
VALUES
(1, "sakamoto", 22, "sakamoto@classb.com"),
(2, "tanaka", 25, "tanaka@classb.com"),
(3, "sato", 27, "sato@classb.com"),
(4, "takeuchi", 21, "takeuchi@classb.com"),
(5, "shimizu", 32, "shimizu@classb.com"),
(6, "aoki", 15, "aoki@classb.com");
