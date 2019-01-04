CREATE TABLE dsu_management.management_task (
    task_id VARCHAR(6) NOT NULL,
    name VARCHAR(30) NOT NULL,
    is_disabled TINYINT(1) NOT NULL ,
    update_datetime DATETIME NOT NULL,
    PRIMARY KEY (task_id)
);