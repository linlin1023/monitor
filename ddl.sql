DROP TABLE IF EXISTS `vote`;
CREATE  TABLE `vote`(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `ranking` varchar(20) DEFAULT NULL  ,
    `name` varchar(50) DEFAULT NULL ,
    `nowVotes` varchar(20) DEFAULT NULL ,
    `createDate` datetime DEFAULT  NULL,
    PRIMARY KEY (`id`) USING BTREE
    ENGINE=InnoDB AUTO_INCREMENT=555967 DEFAULT CHARSET=utf8mb4;
)

SET FOREIGN_KEY_CHECKS =1 ;