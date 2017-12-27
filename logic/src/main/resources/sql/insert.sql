insert into Saniok_SiteShop.users(login,email,firstname,sourname,dateBirth,dateReg,countryId,postId,adress) 
values('saniok','saniok@sa','Саша','Танюк','1994-05-04','2017-05-04',820,22540,'adres');

insert into autent(idU,passw)
values((select max(idU) from users ),'passw');

insert into products(nameP,description,price,mainImg,category,depot,quantity)
values('product1','product desc',10,'/img1.img','/category',1,10);

insert into productsFeatures(idP,featName,valueF)
values(1,'nameF1','descriptionFeature');

insert into productsImages(idP,imUrl)
values(1,'/img2.img');

insert into carriers(name,description)
values('name1','description');

insert into orders(userId,sumPrice,postId,moveToAdress,phone,carrierId,note,dateOrder)
values(1,5555,225528,'adress','+38099999000',1,'note','2017-05-04');

insert into productsOfOrders(idO,idP,countP)
values(1,1,10);
