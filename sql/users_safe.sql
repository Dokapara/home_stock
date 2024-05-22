-- safeusersテーブルを削除する
DROP TABLE IF EXISTS safeusers;

-- safeusersテーブルを作成する（上書き保存する）
CREATE TABLE safeusers (
	user_id		INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	age		INT,
	email		TEXT,
	PRIMARY KEY(user_id)
);

-- safeusersテーブルにデータをセット
INSERT INTO safeusers (user_id, name, age, email)
VALUES
(1, "sakamoto", 22, "sakamoto@classb.com"),
(2, "tanaka", 25, "tanaka@classb.com"),
(3, "sato", 27, "sato@classb.com"),
(4, "takeuchi", 21, "takeuchi@classb.com"),
(5, "shimizu", 32, "shimizu@classb.com"),
(6, "aoki", 15, "aoki@classb.com");
