create table DEMO_APPLICANT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    USER_ID varchar(32) not null,
    FULL_NAME varchar(255),
    IDENTIFICATION_NO integer,
    PLATE_NUMBER varchar(255),
    UNIT_NUMBER integer,
    VEHICLE_TYPE integer,
    LOT_ID integer,
    --
    primary key (ID)
);