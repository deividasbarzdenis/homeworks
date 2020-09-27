create table ADDRESS
(
    ADDRESS_ID   INT auto_increment
        primary key,
    STREET       VARCHAR(255),
    HOUSE_NUMBER VARCHAR(255),
    ZIP_CODE     VARCHAR(255),
    CITY         VARCHAR(255),
    REGISTERED   BIT
);

create table RECIPIENT
(
    RECIPIENT_ID       VARCHAR not null
        primary key,
    RECIPIENT_NAME     VARCHAR(255),
    RECIPIENT_LASTNAME VARCHAR(255)
);

create table CUSTOMER
(
    CUSTOMER_ID   INT not null
        primary key,
    CUST_NAME     VARCHAR(255),
    CUST_LASTNAME VARCHAR(255),
    BIRTHDATE     VARCHAR,
    GENDER        VARCHAR,
    NATIONALITY   VARCHAR
);

create table CARD_CUSTOMER
(
    CARD_CUSTOMER_ID INT auto_increment
        primary key,
    TYPE             VARCHAR(255),
    EXPIRY_DATE      DATE,
    "LIMIT"          INT,
    CUSTOMER_ID      INT
        references CUSTOMER (CUSTOMER_ID),
    ISDEBIT          BIT
);

create table ADDRESS_CUSTOMER
(
    ADDRESS_CUSTOMER_ID INT auto_increment
        primary key,
    CUSTOMER_ID         INT
        references CUSTOMER (CUSTOMER_ID),
    ADDRESS_ID          INT
        references ADDRESS (ADDRESS_ID)
);

create table CONTACT
(
    CONTACT_ID   INT auto_increment
        primary key,
    EMAIL        VARCHAR(255),
    PHONE_NUMBER INT,
    PASSWORD     VARCHAR(255),
    CUSTOMER_ID  INT
        references CUSTOMER (CUSTOMER_ID)
);

create table ACCOUNT
(
    ACCOUNT_ID   CHAR not null
        primary key,
    CURRENCY     VARCHAR(255),
    BALANCE      INT,
    OTHER_DETAIL VARCHAR(255),
    CUSTOMER_ID  INT
        references CUSTOMER (CUSTOMER_ID),
    PIN          CHAR not null
);

create table TRANSACTIONS
(
    TRANSACTIONS_ID    INT auto_increment
        primary key,
    AMOUNT_TRANSACTION INT,
    DATE_TRANSACTION   VARCHAR,
    ACCOUNT_ID         VARCHAR
        references ACCOUNT (ACCOUNT_ID),
    RECIPIENT_ID       INT,
    OTHER_DETAIL       VARCHAR(255)
);

create table BALANCE_HISTORY
(
    BALANCE_DATE DATE not null
        primary key,
    ACCOUNT_ID   INT
        references ACCOUNT (ACCOUNT_ID)
);

create table TRANSACTIONS_HISTORY
(
    TRANSACTIONS_HISTORY_ID INT auto_increment
        primary key,
    TRANSACTIONS_DATE       DATE,
    TRANSACTIONS_ID         INT
        references TRANSACTIONS (TRANSACTIONS_ID)
);

create table TRANSACTION_TYPE
(
    TRANSACTION_TYPE_ID INT auto_increment
        primary key,
    TRANS_DESCRIPTION   VARCHAR(255)
);


