-- usersテーブルを削除する
DROP TABLE IF EXISTS users;

-- usersテーブルを作成する（上書き保存する）
CREATE TABLE users (
	user_id		INT,
	name		TEXT,
	age		INT,
	email		TEXT
);

-- usersテーブルにデータをセット
INSERT INTO users (user_id, name, age, email)
VALUES
(1, "sakamoto", 22, "sakamoto@classb.com"),
(2, "tanaka", 25, "tanaka@classb.com"),
(3, "sato", 27, "sato@classb.com"),
(4, "takeuchi", 21, "takeuchi@classb.com"),
(5, "shimizu", 32, "shimizu@classb.com"),
(6, "aoki", 15, "aoki@classb.com");
