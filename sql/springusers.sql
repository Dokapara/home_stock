-- userテーブルを削除する
DROP TABLE IF EXISTS user;

-- userテーブルを作成する（上書き保存する）
CREATE TABLE user (
	user_id		INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	email		TEXT,
	phone		TEXT,
	address		TEXT,
	updatetime	TIMESTAMP	DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(user_id)
);

-- usersver4テーブルにデータをセット
INSERT INTO user (user_id, name, email, phone)
VALUES
(0, "sakamoto", "sakamoto@classb.com", "090-0123-2213"),
(0, "tanaka", "tanaka@classb.com", "090-0123-9876"),
(0, "sato", "sato@classb.com", "090-0123-4567"),
(0, "takeuchi", "takeuchi@classb.com", "090-0123-1234"),
(0, "shimizu", "shimizu@classb.com", "090-0123-2345"),
(0, "aoki", "aoki@classb.com", "090-0123-0123");
