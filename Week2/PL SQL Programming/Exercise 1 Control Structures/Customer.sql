CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Age NUMBER,
    InterestRate NUMBER(5,2),
    Balance NUMBER(10,2),
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    DueDate DATE
);

INSERT INTO Customers VALUES (1, 65, 10.5, 12000, 'FALSE');
INSERT INTO Customers VALUES (2, 45, 11.0, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 70, 9.5, 15000, 'FALSE');
COMMIT;

INSERT INTO Loans VALUES (101, 1, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, SYSDATE + 5);
COMMIT;
/

-- Scenario 1: Discount InterestRate for age > 60
BEGIN
    FOR rec IN (SELECT CustomerID, InterestRate, Age FROM Customers) LOOP
        IF rec.Age > 60 THEN
            UPDATE Customers
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 2: Set IsVIP to TRUE for balance > 10000
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 3: Reminders for loans due in next 30 days
BEGIN
    FOR rec IN (
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.LoanID ||
                             ' for Customer ID ' || rec.CustomerID ||
                             ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/


