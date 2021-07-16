CREATE TABLE `training_db`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`, `email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));

  
 INSERT INTO `training_db`.`users` (`name`, `email`, `password`) VALUES ('Admin', 'Admin@gmail.com', 'Password');
