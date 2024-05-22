-- usersver4テーブルを削除する
DROP TABLE IF EXISTS usersver4;

-- usersver4テーブルを作成する（上書き保存する）
CREATE TABLE usersver4 (
	user_id		INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	age		INT,
	email		TEXT,
	department_id	INT	NOT NULL	DEFAULT 1,
	PRIMARY KEY(user_id)
);

-- usersver4テーブルにデータをセット
INSERT INTO usersver4 (user_id, name, age, email, department_id)
VALUES
(1, "坂本", 22, "sakamoto@classb.com", 1),
(2, "田中", 25, "tanaka@classb.com", 2),
(3, "佐藤", 27, "sato@classb.com", 1),
(4, "竹内", 21, "takeuchi@classb.com", 3),
(5, "清水", 32, "shimizu@classb.com", 4),
(6, "青木", 15, "aoki@classb.com", 4);
