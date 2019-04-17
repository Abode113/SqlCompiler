Sql Compiler in java & Antlr

created by Abdelrahman Alhorani

i have build till now :

1 - CSVFiles class

2 - queryData class

3 - tableList class

3 - developing in myVisitor class to exctract useful data that can be proccessed in (mapper/shuffler/reduser) in future

testing sample that worked and i am able to get usefull data from it is :

--------------------------------------------------------------------------------

// yes

// select multi column

// select from multi table

// inner join

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

// yes

// select one column

// select from multi table 

// inner join

select prices.* from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

// no 

// on statement must take '(', ')'

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on prices.product = quantities.product
inner join othertable on quantities.product = othertable.product
inner join osecondtable on othertable.product = osecondtable.product

--------------------------------------------------------------------------------

// yes

// sum ()

select sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

// yes

// sum () with simple statement

select sum(quantities.quantity) from prices

--------------------------------------------------------------------------------

// yes 

// sum ()

// order by

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by quantities.product

--------------------------------------------------------------------------------

// yes 

// sum ()

// order by

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
group by (quantities.product)

--------------------------------------------------------------------------------

// yes

// order by on more than one column

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by (quantities.product, quantities.quantity)

--------------------------------------------------------------------------------

// yes 

// gruop by for more than one column

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
group by (quantities.product, quantities.quantity)

--------------------------------------------------------------------------------

// yes 

// where clause

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where quantities.quantity > 10

--------------------------------------------------------------------------------

// yes 

// where clause for more than one condition

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where quantities.quantity > 10 and quantities.price > 30

// with '(', ')'

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity > 10 and quantities.price > 30)

// where clause with group by

// where clause with more than one condition have 'and', 'or'

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity > 10 and quantities.price > 30 or quantities.quantity = 0)
group by (quantities.product)

--------------------------------------------------------------------------------

// yes 

// where clause with condition structure

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where ((quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)

--------------------------------------------------------------------------------