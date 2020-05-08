-- inicjalizacja ról w tabelce role
REPLACE INTO role(role_id, role_name) VALUES (1, "ROLE_USER");
REPLACE INTO role(role_id, role_name) VALUES (2, "ROLE_ADMIN");

-- inicjalizacja magazynów w tabelce warehouse
REPLACE INTO warehouse(warehouse_id, warehouse_name, warehouse_email) VALUES (20, "Bydgoszcz, Armii Krajowej 250", "sklep@opelmikolajczak.pl");
REPLACE INTO warehouse(warehouse_id, warehouse_name, warehouse_email) VALUES (30, "Bydgoszcz, Fordońska 59", "czesci@opelmikolajczak.pl");
REPLACE INTO warehouse(warehouse_id, warehouse_name, warehouse_email) VALUES (40, "Inowrocław, Staszica 69", "isklep@opelmikolajczak.pl");