
/*
create DATABASE db_clase8;
use db_clase8;

CREATE TABLE IF NOT EXISTS `db_clase8`.`Facturacion` (
  `idFacturacion` INT NOT NULL AUTO_INCREMENT,
  `numero` INT NOT NULL,
  `fechaCompra` DATE NOT NULL,
  `Vendedor_idVendedor` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idFacturacion`),
  UNIQUE INDEX `numero_UNIQUE` (`numero` ASC) VISIBLE,
  INDEX `fk_Facturacion_Vendedor_idx` (`Vendedor_idVendedor` ASC) VISIBLE,
  INDEX `fk_Facturacion_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Facturacion_Vendedor`
    FOREIGN KEY (`Vendedor_idVendedor`)
    REFERENCES `db_clase8`.`Vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturacion_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `db_clase8`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `db_clase8`.`Productos` (
  `idProductos` INT NOT NULL AUTO_INCREMENT,
  `codigo` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  `cantidad` INT NULL,
  `stock` INT NULL,
  `Facturacion_idFacturacion` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idProductos`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC) VISIBLE,
  INDEX `fk_Productos_Facturacion1_idx` (`Facturacion_idFacturacion` ASC) VISIBLE,
  INDEX `fk_Productos_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_Facturacion1`
    FOREIGN KEY (`Facturacion_idFacturacion`)
    REFERENCES `db_clase8`.`Facturacion` (`idFacturacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Productos_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `db_clase8`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `db_clase8`.`Vendedor` (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NULL,
  `salario` DOUBLE NULL,
  `fechaNacimiento` DATE NULL,
  PRIMARY KEY (`idVendedor`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `db_clase8`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `fechaNacimiento` DATE NULL,
  `Vendedor_idVendedor` INT NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE,
  INDEX `fk_Cliente_Vendedor1_idx` (`Vendedor_idVendedor` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_Vendedor1`
    FOREIGN KEY (`Vendedor_idVendedor`)
    REFERENCES `db_clase8`.`Vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
*/
