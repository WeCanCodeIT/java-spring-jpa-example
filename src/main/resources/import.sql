// initialize customers

INSERT INTO Customer(id, first_name, last_name) VALUES(42, 'Arthur', 'Dent')
INSERT INTO Customer(first_name, last_name) VALUES('Ford', 'Prefect')

// initialize orders

INSERT INTO Customer_Order(purchase_order_number, customer_id) VALUES('foo', 42)
INSERT INTO Customer_Order(purchase_order_number, customer_id) VALUES('bar', 42)
