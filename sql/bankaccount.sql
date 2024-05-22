-- bankaccountテーブルを削除する
DROP TABLE IF EXISTS bankaccount;

-- bankaccountテーブルを作成する（上書き保存する）
CREATE TABLE bankaccount (
	user_id		INT	NOT NULL AUTO_INCREMENT,
	name		TEXT	NOT NULL,
	email		TEXT,
	branchcode	INT	NOT NULL,
	balance		INT	NOT NULL DEFAULT 0,
	PRIMARY KEY(user_id)
);

-- bankaccountテーブルにデータをセット
INSERT INTO bankaccount (user_id, name, email, branchcode, balance)
VALUES
(0, "sakamoto", "sakamoto@classb.com", 123, 100000),
(0, "tanaka", "tanaka@classb.com", 123, 10000),
(0, "sato", "sato@classb.com", 222, 5000),
(0, "takeuchi", "takeuchi@classb.com", 222, 500000),
(0, "shimizu", "shimizu@classb.com", 234, 2000),
(0, "aoki", "aoki@classb.com", 234, 30000);