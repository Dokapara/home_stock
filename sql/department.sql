-- department�e�[�u�����폜����
DROP TABLE IF EXISTS department;

-- department�e�[�u�����쐬����i�㏑���ۑ�����j
CREATE TABLE department (
	department_id	INT	NOT NULL AUTO_INCREMENT,
	name		TEXT,
	location	TEXT,
	PRIMARY KEY(department_id)
);

-- department�e�[�u���Ƀf�[�^���Z�b�g
INSERT INTO department (department_id, name, location)
VALUES
(0, "HR", "HQ4F"),
(0, "planning", "HQ5F"),
(0, "technical", "KYOTO2F"),
(0, "development", "KYOTO3F");
