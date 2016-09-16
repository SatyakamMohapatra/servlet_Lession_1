CREATE SCHEMA `demodb` ;

//Create User Table
CREATE TABLE `demodb`.`demo_user` (
  `USER_ID` INT NOT NULL AUTO_INCREMENT,
  `USER_NAME` VARCHAR(45) NOT NULL,
  `USER_PASSWD` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`USER_ID`));
  
  //insert 1 row
  INSERT INTO `demodb`.`demo_user` (`USER_NAME`, `USER_PASSWD`) VALUES ('satya', 'satya');


  