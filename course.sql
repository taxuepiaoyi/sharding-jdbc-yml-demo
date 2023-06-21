CREATE TABLE `course_1` (
                            `cid` bigint NOT NULL AUTO_INCREMENT COMMENT '课程主键ID',
                            `cname` varchar(50) NOT NULL DEFAULT '' COMMENT '课程名称',
                            `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户ID',
                            `start_month` int NOT NULL DEFAULT '0' COMMENT '课程开始月份',
                            `created_time` datetime NOT NULL DEFAULT '2021-12-13 00:00:00' COMMENT '创建时间',
                            `cstatus` varchar(10) NOT NULL DEFAULT '0' COMMENT '课程状态',
                            PRIMARY KEY (`cid`),
                            KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=878366473830006799 DEFAULT CHARSET=utf8mb3 COMMENT='课程表1';

CREATE TABLE `course_2` (
                            `cid` bigint NOT NULL AUTO_INCREMENT COMMENT '课程主键ID',
                            `cname` varchar(50) NOT NULL DEFAULT '' COMMENT '课程名称',
                            `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户ID',
                            `start_month` int NOT NULL DEFAULT '0' COMMENT '课程开始月份',
                            `created_time` datetime NOT NULL DEFAULT '2021-12-13 00:00:00' COMMENT '创建时间',
                            `cstatus` varchar(10) NOT NULL DEFAULT '' COMMENT '课程状态',
                            PRIMARY KEY (`cid`),
                            KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=878366473830006804 DEFAULT CHARSET=utf8mb3 COMMENT='课程表2';