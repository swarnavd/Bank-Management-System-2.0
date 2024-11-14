create table book_registration(
id int primary key AUTO_INCREMENT,
bookname varchar(30),
bookedition varchar(30),
price int(10)
);

insert into book_registration(bookname,bookedition,price) values(?,?,?)

update book_registration set bookname=?,bookedition=?,price=? where id=?

delete from book_registration where id=?

select * from book_registration where id=?