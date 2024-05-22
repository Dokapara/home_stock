-- zip_dbテーブルを削除する
DROP TABLE IF EXISTS zip_db;

-- zip_dbテーブルを作成する（上書き保存する）
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

-- データインポートの為にはSQLサーバの設定(my.iniを変更し，MYSQLサーバ再起動）クライアント起動時のオプション設定の確認が必要です
-- my.ini
--  [client]セクションに下記追加
--    loose-local-infile=1
--  [mysqld]セクションに下記調整
--    #secure-file-priv="C:/ProgramData/MySQL/MySQL Server 8.3/Uploads" #コメントアウト
--    secure-file-priv=""						#追加
-- 変更したらMYSQLサーバを再起動
-- クライアント起動方法 mysql --enable-local-infile -u root -p