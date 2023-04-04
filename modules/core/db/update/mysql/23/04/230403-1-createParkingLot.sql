create table DEMO_PARKING_LOT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    LOT_ID integer,
    LOT_NO varchar(255),
    VALID_FROM datetime(3),
    VALID_TO datetime(3),
    LEVEL_ID integer,
    --
    primary key (ID)
);