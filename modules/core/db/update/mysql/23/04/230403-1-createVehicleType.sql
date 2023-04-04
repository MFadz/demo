create table DEMO_VEHICLE_TYPE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    VEHICLE_TYPE_ID integer,
    VEHICLE_DESCRIPTION varchar(255),
    --
    primary key (ID)
);