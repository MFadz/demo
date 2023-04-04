-- begin DEMO_PARKING_LOT
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
    LOT_NUMBER varchar(255),
    VALID_FROM datetime(3),
    VALID_TO datetime(3),
    LEVEL_DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end DEMO_PARKING_LOT
-- begin DEMO_VEHICLE_TYPE
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
)^
-- end DEMO_VEHICLE_TYPE
-- begin DEMO_APPLICANT
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
    FULL_NAME varchar(255),
    IDENTIFICATION_NO varchar(255),
    PLATE_NUMBER varchar(255),
    UNIT_NUMBER varchar(255),
    VEHICLE_TYPE_ID varchar(32),
    LOT_ID_ID varchar(32),
    --
    primary key (ID)
)^
-- end DEMO_APPLICANT
