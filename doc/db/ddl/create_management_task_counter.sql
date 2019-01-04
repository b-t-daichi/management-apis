CREATE TABLE dsu_management.management_task_counter (
    task_id VARCHAR(6) NOT NULL,
    employee_no INTEGER NOT NULL,
    execution_count INTEGER DEFAULT 0 NOT NULL,
    passes_count INTEGER DEFAULT 0 NOT NULL,
    update_datetime DATETIME NOT NULL,
    PRIMARY KEY (task_id, employee_no)
);