-- departmentテーブルを削除する
DROP TABLE IF EXISTS department;

-- departmentテーブルを作成する（上書き保存する）
CREATE TABLE department (
	department_id	INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	location	TEXT,
	PRIMARY KEY(department_id)
);

-- departmentテーブルにデータをセット
INSERT INTO department (department_id, name, location)
VALUES
(0, "HR", "HQ4F"),
(0, "planning", "HQ5F"),
(0, "technical", "KYOTO2F"),
(0, "development", "KYOTO3F");
