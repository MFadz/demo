alter table DEMO_PARKING_LOT change column LOT_ID_ID LOT_ID_ID__U38629 varchar(32)^
alter table DEMO_PARKING_LOT drop foreign key FK_DEMO_PARKING_LOT_ON_LOT_ID;
drop index IDX_DEMO_PARKING_LOT_ON_LOT_ID on DEMO_PARKING_LOT ;
alter table DEMO_PARKING_LOT add column LOT_ID integer ;
