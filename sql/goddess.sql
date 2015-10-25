
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `goddess`;
CREATE TABLE `goddess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `create_user` varchar(30) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `update_user` varchar(30) DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `isdel` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

