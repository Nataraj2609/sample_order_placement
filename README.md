# sample_order_placement for GetCrookd
Simple CRUD using H2 DB and Spring Boot App - 

DB Table will look like 

<b>ID	OrderId		Name		Address		Amount_Paid		Pincode</b>

URLS will be

GET call to /orders will display all order objects available in H2 database.
GET call to /orders/{id} will display the order object with the given id.
POST call to /orders will insert a new order object in the database.
DELETE call to /orders/{id} will delete the order object with the given id from the database.


