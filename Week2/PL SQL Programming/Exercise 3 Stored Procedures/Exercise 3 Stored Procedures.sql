-- Create Accounts table
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER(15,2)
);

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER(10,2)
);

-- Insert sample savings and current accounts
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (101, 1, 'Savings', 10000);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (102, 2, 'Savings', 5000);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (103, 3, 'Current', 15000);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (104, 4, 'Savings', 2500);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (105, 5, 'Current', 8000);

COMMIT;

-- Insert sample employees from various departments
INSERT INTO Employees (EmployeeID, Name, Department, Salary)
VALUES (201, 'Alice', 'HR', 40000);

INSERT INTO Employees (EmployeeID, Name, Department, Salary)
VALUES (202, 'Bob', 'Finance', 50000);

INSERT INTO Employees (EmployeeID, Name, Department, Salary)
VALUES (203, 'Charlie', 'HR', 45000);

INSERT INTO Employees (EmployeeID, Name, Department, Salary)
VALUES (204, 'David', 'IT', 55000);

INSERT INTO Employees (EmployeeID, Name, Department, Salary)
VALUES (205, 'Eve', 'Finance', 60000);

COMMIT;

-- Scenario 1: ProcessMonthlyInterest
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error in processing interest: ' || SQLERRM);
END;
/

-- Scenario 2: UpdateEmployeeBonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    DBMS_OUTPUT.PUT_LINE('Bonuses updated for department: ' || p_department);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error updating bonus: ' || SQLERRM);
END;
/

-- Scenario 3: TransferFunds
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_fromAccountID IN NUMBER,
    p_toAccountID IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_fromAccountID;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_fromAccountID;

    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_toAccountID;

    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
        ROLLBACK;
END;
/

-- Execute monthly interest
BEGIN
    ProcessMonthlyInterest;
END;
/

-- Apply 10% bonus to 'HR' department
BEGIN
    UpdateEmployeeBonus('HR', 10);
END;
/

-- Transfer 5000 from Account 101 to 102
BEGIN
    TransferFunds(101, 102, 5000);
END;
/
