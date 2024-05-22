-- safeusersテーブルを削除する
DROP TABLE IF EXISTS fruits;

-- safeusersテーブルを作成する（上書き保存する）
CREATE TABLE fruits (
	id		INT		NOT NULL AUTO_INCREMENT,
	name		VARCHAR(255)	NOT NULL,
	price		INT				DEFAULT 100,
	stock		INT		NULL		DEFAULT 0,
	time		TIMESTAMP			DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(id)
);

-- safeusersテーブルにデータをセット
INSERT INTO fruits (id, name, price, stock, time)
VALUES
(0, "apple", 100, 3, NULL),
(0, "banana", 200, 5, NULL),
(0, "melon", 800, 4, NULL),
(0, "mango", 700, 2, NULL),
(0, "blueberry", 500, 1, NULL),
(0, "lemon", 200, 0, NULL);
