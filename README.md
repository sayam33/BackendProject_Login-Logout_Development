# BackendProject_Login-Logout_Development

This Project Features:
Register New Users :– Users can enter their details and register.

List All Registrations :– Display a table with registered users.

Edit/Delete Users :– Update or remove registered users.

Registration Completion :– Show a confirmation message after successful registration.

Logout Option :– Create a logout functionality after registration.


SQL CODE :-
create database projectdb
use projectdb
create table login
(
 email varchar (128),
 password varchar (15)
);
insert into login (email,password)value('ssdmmishra456@gamil.com','gugulsayam')
select * from login;

use projectdb;
create table registration
(
name varchar (15),
email varchar (128),
course varchar (15),
mobile varchar (10)
);
select * from registration; .
