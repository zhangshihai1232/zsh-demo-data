create table supplier_score (
    wrapper_id varchar(40) not null comment '供应商id',
    supplier_name varchar(40) not null default '_' comment '供应商名字',
    score float(3,2) not null default 0.00  comment '分数',
    UNIQUE (wrapper_id)
) engine=innodb default charset=utf8 comment='供应商评分表';