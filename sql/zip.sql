-- zip_db�e�[�u�����폜����
DROP TABLE IF EXISTS zip_db;

-- zip_db�e�[�u�����쐬����i�㏑���ۑ�����j
CREATE TABLE zip_db (
	id		INT,
	oldzipcode	INT,
	zipcode		INT,
	prefkana	TEXT,
	citykana	TEXT,
	townkana	TEXT,
	pref		TEXT,
	city		TEXT,
	town		TEXT,
	multiflag	INT,
	azaflag		INT,
	chomeflag	INT,
	multitownflag	INT,
	updateflag	INT,
	reason		INT
);

-- �f�[�^�C���|�[�g�ׂ̈ɂ�SQL�T�[�o�̐ݒ�(my.ini��ύX���CMYSQL�T�[�o�ċN���j�N���C�A���g�N�����̃I�v�V�����ݒ�̊m�F���K�v�ł�
-- my.ini
--  [client]�Z�N�V�����ɉ��L�ǉ�
--    loose-local-infile=1
--  [mysqld]�Z�N�V�����ɉ��L����
--    #secure-file-priv="C:/ProgramData/MySQL/MySQL Server 8.3/Uploads" #�R�����g�A�E�g
--    secure-file-priv=""						#�ǉ�
-- �ύX������MYSQL�T�[�o���ċN��
-- �N���C�A���g�N�����@ mysql --enable-local-infile -u root -p