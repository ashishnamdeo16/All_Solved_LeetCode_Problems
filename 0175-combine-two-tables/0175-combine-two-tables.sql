# Write your MySQL query statement below
select c.firstName,c.lastName,s.city,s.state from Person c left join Address s on c.personId = s.personId;