CREATE DATABASE IF NOT EXISTS Saniok_SiteShop collate utf8_general_ci;
USE Saniok_SiteShop;

CREATE TABLE IF NOT EXISTS users 
(
    idU INT NOT NULL AUTO_INCREMENT,
    login VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    firstname VARCHAR(45) NOT NULL,
    sourname VARCHAR(45),
    dateBirth DATE,
    dateReg DATE NOT NULL,
    countryId INT NOT NULL,
    postId INT,
    adress VARCHAR(45),
    FOREIGN KEY (countryId) REFERENCES countries(country_id) ON DELETE CASCADE,
    PRIMARY KEY (idU)
);

CREATE TABLE IF NOT EXISTS autent(
idU INT NOT NULL,
passw VARCHAR(45) NOT NULL,
PRIMARY KEY (idU),
FOREIGN KEY (idU) REFERENCES users(idU) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS products (
    idP INT NOT NULL AUTO_INCREMENT,
    nameP VARCHAR(45) NOT NULL,
    description VARCHAR(45) NOT NULL,
    price DECIMAL(10) NOT NULL,
    mainImg VARCHAR(45),
    category VARCHAR(45) NOT NULL,
    depot INT NOT NULL,
    quantity INT NOT NULL,
    PRIMARY KEY (idP)
);

CREATE TABLE IF NOT EXISTS productsImages (
    idP INT NOT NULL,
    imUrl VARCHAR(45) NOT NULL,
    INDEX imageOnPrIndex (idP),
    FOREIGN KEY (idP) REFERENCES products(idP) ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS productsFeatures (
    idF INT NOT NULL AUTO_INCREMENT,   
    idP INT NOT NULL,
    featName VARCHAR(45) NOT NULL,
    valueF VARCHAR(45) NOT NULL,
    INDEX featIndex (idP),
    PRIMARY KEY (idF),
    FOREIGN KEY (idP) REFERENCES products(idP) ON DELETE CASCADE
    );

 CREATE TABLE IF NOT EXISTS orders (
    idO INT NOT NULL AUTO_INCREMENT,
    userId INT NOT NULL,
    sumPrice DECIMAL NOT NULL DEFAULT 0,
    postId INT,        
    moveToAdress VARCHAR(255),
    phone VARCHAR(13),
    carrierId INT DEFAULT 0,
    note VARCHAR(45),
    dateOrder DATE NOT NULL,
    PRIMARY KEY (idO),
    FOREIGN KEY (carrierId) REFERENCES carriers(idC) ON DELETE SET NULL,
    FOREIGN KEY (userId) REFERENCES users(idU) ON DELETE CASCADE
    
);

CREATE TABLE IF NOT EXISTS productsOfOrders (
    idO INT NOT NULL,
    idP INT NOT NULL,
    countP DECIMAL NOT NULL,
    INDEX prInOrderIndex (idO),
    UNIQUE (idO,idP)
);

CREATE TABLE IF NOT EXISTS carriers (
    idC INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (idC)
);



