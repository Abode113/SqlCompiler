# SqlCompiler
Sql Compiler in java &amp; Antlr
created by Abdelrahman Alhorani 

i have build till now : 
1 - CSVFiles class
2 - queryData class
3 - tableList class
3 - developing in myVisitor class to exctract useful data that can be proccessed in (mapper/shuffler/reduser) in future

testing sample that worked and i am able to get usefull data from it is : 


// yes
select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)




// yes
select prices.* from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)





// no 
select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on prices.product = quantities.product
inner join othertable on quantities.product = othertable.product
inner join osecondtable on othertable.product = osecondtable.product



// yes
select sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)

// yes
select sum(quantities.quantity) from prices


// yes 
select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by quantities.product


// yes
select quantities.product, sum(quantities.quantity) from prices
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
order by (quantities.product, quantities.quantity)





// yes 
select prices.*, quantities.quantity, quantities.product, prices.quantity from pries
inner join quantities on (prices.product = quantities.product)
inner join othertable on (quantities.product = othertable.product)
inner join osecondtable on (othertable.product = osecondtable.product)
where quantities.quantity > 10











