CREATE TABLE dsu_management.management_member (
    employee_no INTEGER NOT NULL,
    name VARCHAR(30) NOT NULL,
    role VARCHAR(15) NOT NULL,
    is_disabled TINYINT(1) DEFAULT 0 NOT NULL ,
    register_datetime DATETIME NOT NULL,
    update_datetime DATETIME NOT NULL,
    PRIMARY KEY (employee_no)
);