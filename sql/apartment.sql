-- apartmentテーブルを削除する
DROP TABLE IF EXISTS apartment;

-- apartmentテーブルを作成する（上書き保存する）
CREATE TABLE apartment (
	id		INT NOT NULL AUTO_INCREMENT, -- ID
	name		TEXT NOT NULL,		 -- 物件名
	address		TEXT NOT NULL,		 -- 住所
	salesrep	TEXT,				 -- 物件担当者
	floorarea	FLOAT,				 -- 床面積
	registerdate	TIMESTAMP DEFAULT CURRENT_TIMESTAMP,	 -- 登録日
	PRIMARY KEY(id)
);

-- apartmentテーブルにデータをセット
INSERT INTO apartment (name, address, salesrep, floorarea)
VALUES
("sancha apartment A","Sangenchaya", "Minami", 32.5),
("sancha apartment B","Sangenchaya", "Minami", 40.5),
("sancha apartment C","Sangenchaya", "Minami", 36.5),
("yokohama apartment A","Yokohama", "Tokuno", 55.2),
("yokohama apartment B","Yokohama", "Tokuno", 60.2),
("yokohama apartment C","Yokohama", "Tokuno", 54.5);
