// initialize customers

INSERT INTO Customer(id, last_name, first_name) VALUES(42, 'Arthur', 'Dent')
INSERT INTO Customer(last_name, first_name) VALUES('Ford', 'Prefect')

// initialize orders

INSERT INTO Customer_Order(order_number, customer_id) VALUES('foo', 42)
INSERT INTO Customer_Order(order_number, customer_id) VALUES('bar', 42)
