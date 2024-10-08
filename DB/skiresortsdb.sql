-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema skiresortsdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `skiresortsdb` ;

-- -----------------------------------------------------
-- Schema skiresortsdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skiresortsdb` DEFAULT CHARACTER SET utf8 ;
USE `skiresortsdb` ;

-- -----------------------------------------------------
-- Table `ski_resort`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ski_resort` ;

CREATE TABLE IF NOT EXISTS `ski_resort` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` TEXT NULL,
  `image_url` VARCHAR(2000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS skiresortsuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'skiresortsuser'@'localhost' IDENTIFIED BY 'skiresortsuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'skiresortsuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `ski_resort`
-- -----------------------------------------------------
START TRANSACTION;
USE `skiresortsdb`;
INSERT INTO `ski_resort` (`id`, `name`, `description`, `image_url`) VALUES (1, 'Keystone', NULL, NULL);

COMMIT;

