Sql Compiler in java & Antlr

#created by Abdelrahman Alhorani


#Code generation : 

##what we did till now :
the structure is map/shufle/reduce 

###map : 
we apply :

from query 

1 - getting data from all joined table
 
2 - on ( id and the condition between joined table)

3 - join the table ( inner, left, right, outer ) join with getting the result from it

4 - applying where condition on the result data 

5 - apply distinct on result data 
now we have till now joined data with filterd row as where and join condition 

6 - filter column by applying select ( like select col1, col2 .....)
so after this step (mapper step) we have filtered row and filtered column and data from joined table 

###shuffle :
1 - applying groupby so we will shufle (group) data

###Reduce :
now working on grouped data :

1 - apply and get result from functions like ( min, max, sum ....)

2 - apply and get result from functions like ( NVL )

3 - sort the data and return the result as final result 

the Result of mapper and shuffler and reducer will be printed in (MapResult.txt, shuffleResult.txt, ReduceResult.txt)

we create table and we can read data from csv file with any delemter and the data of any table will be inside directory that will contain more than one file of data

##Now :
###after building the map/Shuffle/Reduse structure the next sample will work correctly and return correct data :
 
select distinct sum(quantities.quantity) as summ, prices.product, max(prices.prices) as maxxx from prices
inner join quantities on prices.product = quantities.product
inner join other on other.prices = prices.prices
where quantities.quantity > 10 or ( prices.prices > 1 and quantities.quantity > prices.prices )
group by prices.product having ( prices.prices > 1 )
order by (quantities.quantity, prices.prices) DESC


select distinct quantities.quantity, prices.product, prices.prices from prices
inner join quantities on prices.product = quantities.product
inner join other on other.prices = prices.prices
where quantities.quantity > 10 or ( prices.prices > 1 and quantities.quantity > prices.prices )



select distinct quantities.quantity, prices.product, NVL(prices.prices, 0) from prices
left join quantities on prices.product = quantities.product
left join other on other.prices = prices.prices
where quantities.quantity > 10 or ( prices.prices > 1 and quantities.quantity > prices.prices )

###and our table has been created like : 

create table prices (product string, prices int) stored_as_textfile "," "/"

create table quantities (product string, quantity int) stored_as_textfile "|" "/"

create table other (item string, prices int) stored_as_textfile "," "/"

-----------------------------------------------------------------------------------------------

.

.

.

.

.

.

.




i have build till now :

1 - CSVFiles class

2 - queryData class

3 - tableList class

3 - developing in myVisitor class to exctract useful data that can be proccessed in (mapper/shuffler/reduser) in future

testing sample that worked and i am able to get usefull data from it is :

--------------------------------------------------------------------------------

####// yes

####// select multi column

####// select from multi table

####// inner join

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

####// yes

####// select one column

####// select from multi table 

####// inner join

select prices.* from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

####// no 

####// on statement must take '(', ')'

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on prices.product = quantities.product
inner join othertable on quantities.product = othertable.product
inner join osecondtable on othertable.product = osecondtable.product

--------------------------------------------------------------------------------

####// yes

####// sum ()

select sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

--------------------------------------------------------------------------------

####// yes

####// sum () with simple statement

select sum(quantities.quantity) from prices

--------------------------------------------------------------------------------

####// yes 

####// sum ()

####// order by

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by quantities.product

--------------------------------------------------------------------------------

####// yes 

####// sum ()

####// order by

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
group by (quantities.product)

--------------------------------------------------------------------------------

####// yes

####// order by on more than one column

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by (quantities.product, quantities.quantity)

--------------------------------------------------------------------------------

####// yes 

####// gruop by for more than one column

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
group by (quantities.product, quantities.quantity)

--------------------------------------------------------------------------------

####// yes 

####// where clause

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where quantities.quantity > 10

--------------------------------------------------------------------------------

####// yes 

####// where clause for more than one condition

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where quantities.quantity > 10 and quantities.price > 30

####// with '(', ')'

select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity > 10 and quantities.price > 30)

####// where clause with group by

####// where clause with more than one condition have 'and', 'or'

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity > 10 and quantities.price > 30 or quantities.quantity = 0)
group by (quantities.product)

--------------------------------------------------------------------------------

####// yes 

####// where clause with condition structure

select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where ((quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)

--------------------------------------------------------------------------------

####// yes

####// left join, right join, full outer join

select quantities.product, sum(quantities.quantity) from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or (quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)

--------------------------------------------------------------------------------

####// yes

####// order with ASC and DSCE

select quantities.product, max(quantities.quantity) from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or (quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------

####// yes

####// distinct

select distinct quantities.product, max(distinct quantities.quantity) from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or (quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------

####// yes

####// with alias name of selected table ( as alias )

select distinct quantities.product, max(distinct quantities.quantity) as aliasName from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or (quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------

####// yes

####// drop table

DROP TABLE tableName

--------------------------------------------------------------------------------

####// yes

####// truncate table

TRUNCATE TABLE tableName

--------------------------------------------------------------------------------

####// yes

####// nvl function 

select NVL(quantities.product, 'aboode'), NVL(quantities.quantity, 113) from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or (quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------

####// yes

####// having 

select NVL(quantities.product, 'aboode'), NVL(quantities.quantity, 113) from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or ( quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product) having (h_quantities.h_quantity1 = 1 or (h_quantities.h_quantity > 10 and h_quantities.h_price > 30) or h_quantities.h_quantity = 0)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------

####// yes

####// support round function and support two parameter function with alias

select distinct round(quantities.product, 2) as AliasName from prices
left join quantities on (prices.product = quantities.product)
right join othertable on (quantities.product = othertable.product)
full outer join osecondtable on (othertable.product = osecondtable.product)
where (quantities.quantity1 = 1 or ( quantities.quantity > 10 and quantities.price > 30) or quantities.quantity = 0)
group by (quantities.product) having (h_quantities.h_quantity1 = 1 or (h_quantities.h_quantity > 10 and h_quantities.h_price > 30) or h_quantities.h_quantity = 0)
order by (quantities.productsss) ASC

--------------------------------------------------------------------------------


