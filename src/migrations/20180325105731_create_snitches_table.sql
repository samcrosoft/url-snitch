CREATE TABLE snitches (
  id         INT(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
  snitch_key VARCHAR(128) NOT NULL UNIQUE,
  ip_address VARCHAR(20)  NOT NULL,
  user_agent TINYTEXT     NOT NULL,
  created_at DATETIME,
  updated_at DATETIME
)
  ENGINE = InnoDB;
;

