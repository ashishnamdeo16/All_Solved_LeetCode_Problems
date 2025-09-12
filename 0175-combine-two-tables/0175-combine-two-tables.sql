# Write your MySQL query statement below
select c.firstName,c.lastName,s.city,s.state from Person as c left join Address as s on c.personId = s.personId;