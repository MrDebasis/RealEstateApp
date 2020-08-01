CREATE  TABLE Users (
userid int AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  enabled boolean NOT NULL,
  email VARCHAR(255) NOT NULL,
  houseno VARCHAR(255) NOT NULL ,
  areaname VARCHAR(255) NOT NULL ,
  pincode VARCHAR(255) NOT NULL ,
  city VARCHAR(255) NOT NULL );
  
CREATE  TABLE Roles (
roleid int AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(65) NOT NULL );
  
CREATE TABLE user_roles (
    userid int ,
    roleid int ,
    FOREIGN KEY (userid) REFERENCES Users(userid),
	FOREIGN KEY (roleid) REFERENCES Roles(roleid)
);
CREATE  TABLE business_property (
address VARCHAR(255) PRIMARY KEY,
  ownername VARCHAR(45) NOT NULL ,
  price VARCHAR(255) NOT NULL ,
  type  VARCHAR(255) NOT NULL,
  size VARCHAR(255) NOT NULL
 );

CREATE TABLE user_visited(
slno int AUTO_INCREMENT PRIMARY KEY,
   vname VARCHAR(255),
   date date,
   which_side_visited VARCHAR(255));
   
   
  

