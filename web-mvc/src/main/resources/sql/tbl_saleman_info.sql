DROP TABLE `bee_saleman_info`;

CREATE TABLE `bee_saleman_info` (
`id` bigint(20) NULL COMMENT '更新时间',
`saleman_num` varchar(32) NOT NULL COMMENT '业务员编码',
`merchant_num` varchar(32) NULL DEFAULT NULL COMMENT '商户编码',
`parent_merchant_num` varchar(32) NULL DEFAULT NULL COMMENT '代理商编码',
`saleman_name` varchar(64) NULL DEFAULT NULL COMMENT '业务员姓名',
`saleman_phone` varchar(20) NULL DEFAULT NULL COMMENT '业务员手机',
`status` int(4) NULL COMMENT '业务员状态',
`invite_code` varchar(20) NULL DEFAULT NULL COMMENT '邀请码',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL,
`active_time` datetime NULL COMMENT '激活时间',
`resign_time` datetime NULL COMMENT '离职时间'
)
COMMENT = '业务员表';

