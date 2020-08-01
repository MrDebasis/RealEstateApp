 INSERT INTO Users(username,password,enabled,email,houseno,areaname,pincode,city)
VALUES ('subhashree','$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'dmaharana@2101997@gmail.com','1234','navlur','75000','chennai');
INSERT INTO Roles (Name)
VALUES ('ADMIN');
INSERT INTO Roles (Name)
VALUES ('USER');

INSERT INTO user_roles (userid , roleid)
VALUES (1,1);
INSERT INTO user_roles (userid , roleid)
VALUES (1,2);



INSERT INTO user_roles (userid , roleid)
VALUES (2,2);

INSERT INTO business_property(address,ownername,price,type,size)
VALUES ('1100 navlur','Debasis','12345','Storeroom','500ft');
INSERT INTO business_property(address,ownername,price,type,size)
VALUES ('1200 navlur','pallavi','1235','house','500ft');
INSERT INTO business_property(address,ownername,price,type,size)
VALUES ('1500 chennai','swagatika','12345','shoproom','500ft');



