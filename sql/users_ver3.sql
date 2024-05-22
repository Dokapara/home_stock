-- usersver3テーブルを削除する
DROP TABLE IF EXISTS usersver3;

-- usersver3テーブルを作成する（上書き保存する）
CREATE TABLE usersver3 (
	user_id		INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	age		INT,
	email		TEXT,
	department_id	INT	NOT NULL	DEFAULT 1,
	PRIMARY KEY(user_id)
);

-- safeusersテーブルにデータをセット
INSERT INTO usersver3 (user_id, name, age, email)
VALUES
(1, "sakamoto", 22, "sakamoto@classb.com"),
(2, "tanaka", 25, "tanaka@classb.com"),
(3, "sato", 27, "sato@classb.com"),
(4, "takeuchi", 21, "takeuchi@classb.com"),
(5, "shimizu", 32, "shimizu@classb.com"),
(6, "aoki", 15, "aoki@classb.com");
