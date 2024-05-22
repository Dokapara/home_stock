-- logindataテーブルを削除する
DROP TABLE IF EXISTS logindata;

-- logindataテーブルを作成する（上書き保存する）
CREATE TABLE logindata (
	logindataid	INT	NOT NULL AUTO_INCREMENT,
	user_id		INT	NOT NULL,
	name		TEXT,
	logindate	TIMESTAMP	NOT NULL	DEFAULT CURRENT_TIMESTAMP(),
	PRIMARY KEY(logindataid)
);

-- logindataテーブルにデータをセット
INSERT INTO logindata (logindataid, user_id, name)
VALUES
(0, 1, "坂本"),
(0, 2, "田中"),
(0, 3, "佐藤"),
(0, 2, "田中"),
(0, 2, "田中"),
(0, 2, "田中"),
(0, 4, "竹内"),
(0, 5, "清水"),
(0, 6, "青木"),
(0, 3, "佐藤"),
(0, 4, "竹内"),
(0, 6, "青木"),
(0, 3, "佐藤");
