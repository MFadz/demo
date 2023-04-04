create table DEMO_PARKING_LEVEL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    LEVEL_ID integer,
    LEVEL_DESCRIPTION varchar(255),
    LOT_ID integer,
    --
    primary key (ID)
);