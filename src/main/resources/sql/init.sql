drop database exam;
create database exam;
 use exam;
 
drop table user;
create table exam.`user` (
  id bigint auto_increment not null comment 'ID'
  , user_name varchar(20) not null comment '用户名'
   , password varchar(20) not null comment '密码'
  , primary key (id)
)
  comment='用户表'
  engine InnoDB
  row_format DYNAMIC
  collate utf8mb4_0900_ai_ci
/

drop table exam;
create table exam.`exam` (
  id bigint auto_increment not null comment 'ID'
  , title text not null comment '标题'
  , description varchar(100) default null comment '详情'
    , examType varchar(20) default null comment '题库类型'
  , primary key (id)
)
  comment='题库表'
  engine InnoDB
  row_format DYNAMIC
  collate utf8mb4_0900_ai_ci
/
drop table question;
create table exam.`question` (
  id bigint auto_increment not null comment '题目ID'
  ,sort bigint not null comment '题号'
  , title text not null comment '题干内容'
  , question_type varchar(10) not null comment '题目类型：单选 ,多选'
  ,correct_options varchar(255) NOT NULL COMMENT '正确的选项，逗号分隔 例:A,C'
  , analysis text comment '答案解析'
  , exam_type varchar(20) comment '题库类型'
  , primary key (id)
)
  comment='题目表'
  engine InnoDB
  row_format DYNAMIC
  collate utf8mb4_0900_ai_ci
/
drop table question_option;
create table exam.`question_option` (
  id bigint auto_increment not null
  , question_id bigint not null comment '关联题目ID'
  , option_code char(1) not null comment '选项编码 A/B/C/D/E'
  , option_content text not null comment '选项内容'
  , sort int default 0 comment '选项展示顺序'
  , exam_type varchar(20) comment '题库类型'
  , primary key (id)
)
  comment='题目选项表'
  engine InnoDB
  row_format DYNAMIC
  collate utf8mb4_0900_ai_ci
/

drop table user_answer;
CREATE TABLE `user_answer` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL COMMENT '用户ID',
  `question_id` bigint NOT NULL COMMENT '题目ID',
  `select_options` varchar(255) NOT NULL COMMENT '用户选择的选项，逗号分隔 例:A,C',
  `is_correct` tinyint default NULL COMMENT '是否答对 0错1对',
  PRIMARY KEY (`id`),
  KEY `idx_user_question` (`user_id`,`question_id`),
  KEY `idx_user_correct` (`user_id`,`is_correct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户答题记录表';