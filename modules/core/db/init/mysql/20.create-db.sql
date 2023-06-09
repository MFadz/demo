-- begin DEMO_APPLICANT
alter table DEMO_APPLICANT add constraint FK_DEMO_APPLICANT_ON_VEHICLE_TYPE foreign key (VEHICLE_TYPE_ID) references DEMO_VEHICLE_TYPE(ID)^
alter table DEMO_APPLICANT add constraint FK_DEMO_APPLICANT_ON_LOT_ID foreign key (LOT_ID_ID) references DEMO_PARKING_LOT(ID)^
create index IDX_DEMO_APPLICANT_ON_VEHICLE_TYPE on DEMO_APPLICANT (VEHICLE_TYPE_ID)^
create index IDX_DEMO_APPLICANT_ON_LOT_ID on DEMO_APPLICANT (LOT_ID_ID)^
-- end DEMO_APPLICANT
-- begin DEMO_PARKING_LOT
create unique index IDX_DEMO_PARKING_LOT_UNIQ_LOT_ID on DEMO_PARKING_LOT (LOT_ID) ^
-- end DEMO_PARKING_LOT
