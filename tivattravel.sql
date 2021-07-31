/*
Navicat MySQL Data Transfer

Source Server         : fuxi-localhost
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : tivattravel

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-07-31 21:05:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `bid` int(11) NOT NULL,
  `bname` varchar(20) DEFAULT NULL,
  `telephone` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES ('1', '西风骑士团', '0759-3477777', '蒙德城蒙德大道109号');
INSERT INTO `business` VALUES ('2', '璃月七星店', '0759-3115333', '璃月港玉京台1号');
INSERT INTO `business` VALUES ('3', '望舒客栈', '0759-3301888', '石门路岩柱道3号');

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `tid` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  KEY `tid` (`tid`),
  KEY `id` (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of collection
-- ----------------------------
INSERT INTO `collection` VALUES ('1', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('1', '4', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('2', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('2', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('2', '3', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('2', '4', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('3', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('4', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('4', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('5', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('5', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('5', '3', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('6', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('6', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('6', '3', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('6', '4', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('7', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('8', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('8', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('9', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('9', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('9', '3', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('10', '1', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('10', '2', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('10', '3', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('10', '4', '0000-00-00 00:00:00');
INSERT INTO `collection` VALUES ('1', '1', null);
INSERT INTO `collection` VALUES ('1', '1', null);
INSERT INTO `collection` VALUES ('1', '1', null);
INSERT INTO `collection` VALUES ('2', '0', null);
INSERT INTO `collection` VALUES ('1', '1', null);
INSERT INTO `collection` VALUES ('1', '1', null);

-- ----------------------------
-- Table structure for scenery
-- ----------------------------
DROP TABLE IF EXISTS `scenery`;
CREATE TABLE `scenery` (
  `sid` int(11) NOT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `introduction` varchar(280) DEFAULT NULL,
  `subjection` varchar(20) DEFAULT NULL,
  `path` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of scenery
-- ----------------------------
INSERT INTO `scenery` VALUES ('1', '千风神殿', '地处蒙德东北部的神殿遗址群。据人们传言，千百年前这里曾是供奉古代风神的神庙，如今被漫长的时光侵蚀，只剩残存的建筑废墟。一些石质立柱上还依稀可辨认出曾经华丽雕刻的精妙曲线。所纪念的象征早已被遗忘的石雕上雕刻着一句古老的格言，「风带来故事的种子，时间使之发芽。」', '蒙德', './img/蒙德/千风神殿.jpg');
INSERT INTO `scenery` VALUES ('2', '晨曦酒庄', '位于蒙德城西南方的晨曦酒庄，代代传承着蒙德传统的酿酒工艺。这里种植着大面积的葡萄等作物，用它们酿造出的各类酒品风靡整个提瓦特大陆。每年晨曦酒庄产出的酒品，部分运往蒙德城内销售，另一部分则通过城南的商道销往各地。', '蒙德', './img/蒙德/晨曦酒庄.png');
INSERT INTO `scenery` VALUES ('3', '果酒湖', '环绕蒙德城的天然淡水湖泊。宽广的湖面和粼粼的波光历经千百年不变，水澈见底，入口清冽甘甜。正是这样的水源成就了蒙德美酒的盛名，也让果酒湖成为了蒙德的重要标志之一。', '蒙德', './img/蒙德/果酒湖.jpg');
INSERT INTO `scenery` VALUES ('4', '清泉镇', '蒙德地区南部的悠闲小镇，与蒙德主城隔湖相望。此地居民多以打猎为生，常年为蒙德城内的各大餐馆提供优质鲜肉。清泉镇以其小镇情调和乡间野趣，吸引着前来观光的游客。如果在旅途中有幸遇到某位擅长肉类料理的大厨，或许还能体验到一段别样的惊喜。', '蒙德', './img/蒙德/清泉镇.jpg');
INSERT INTO `scenery` VALUES ('5', '蒙德大教堂', '蒙德大教堂坐落于蒙德城的最高处，位于蒙德城内的西北部。是由风神的虔诚信徒经营的宏伟圣堂，过去曾是贵族炫耀权威的大殿。同时这里也最接近天和风的地方，能更好的与风神神交，聆听风神的教诲……', '蒙德', './img/蒙德/蒙德大教堂.png');
INSERT INTO `scenery` VALUES ('6', '誓言岬', '位于蒙德城东南角、风啸山坡边缘的海岬。传说曾有一对恋人在此许下誓言，并留下一个感人至深的故事。至今此地仍被认为是恋人的好去处。除了观看海上日出日落外，由于地势的落差，在这里也可以轻松望到海湾对面的风起地。', '蒙德', './img/蒙德/誓言岬.jpg');
INSERT INTO `scenery` VALUES ('7', '达达乌帕谷', '位于蒙德西南部的峡谷，这里有着人丁兴旺的三个丘丘人部落，部落之间守望相助，共同抵御外来者。在峡谷深处还有一处剑冢，剑冢中心封印着一把远古英雄留下的神剑，传说得到神剑认可的人将会获得堪比神魔的力量，这也引得无数冒险家前去探险。', '蒙德', './img/蒙德/达达乌帕谷.png');
INSERT INTO `scenery` VALUES ('8', '风龙废墟', '风龙废墟位于蒙德的西北部。这里曾是「旧蒙德」的都城，古城整体呈现环形。在内环和外环之间，似乎所有人民都被事先安排好了各自的位置。正中央坐落着过于高大的塔楼，那里就是烈风之王的宫城。经历战火的旧蒙德早已成为一片废墟，但依旧能看出它曾经的宏伟。', '蒙德', './img/蒙德/风龙废墟.png');
INSERT INTO `scenery` VALUES ('9', '鹰翔海滩', '从风起地往东延伸至海边，鹰翔海滩与誓言岬共同围成三面环海的陆地，环绕着蒙德东面的海湾。鉴于海岸线较长且地处浅海位置，经常有蒙德市民前来游玩。偶尔可见苍鹰翱翔于碧浪白沙之上。', '蒙德', './img/蒙德/鹰翔海滩.jpg');
INSERT INTO `scenery` VALUES ('10', '天衡山', '璃月港西边的山脉，也是抵御外敌的一道天然保护屏障。有记载以来，作为璃月的壁垒经历了数不清的大小战争，因此也可以看到不少古城墙、堡垒和防御工事的遗迹。传说中璃月人最早的采矿作业亦在此处进行。', '璃月', './img/璃月/天衡山.jpg');
INSERT INTO `scenery` VALUES ('11', '孤云阁', '这里是岩神曾经镇压海中魔神的地方。深插海底、早已折断的巨岩长枪高高矗立在海面上。岩元素聚合而形成的六棱柱状结构十分有趣,从空中俯视的话会给人一种幻觉,仿佛这些岩柱是事先精心排列而成的,在海上组成了特异的图案。', '璃月', './img/璃月/孤云阁.png');
INSERT INTO `scenery` VALUES ('12', '归离原', '曾经盛开着某种花卉的繁华城集。但美梦最终醒转，乐土终究毁于乱世，归人复离。', '璃月', './img/璃月/归离原.png');
INSERT INTO `scenery` VALUES ('13', '望舒客栈', '荻花洲的地标，修建在一座巨大岩柱上的客栈。来歇息的大多是途径此处的商贩，客栈也因此提供了直接贸易和摆摊的场所。高层位置视野极佳，天气晴朗时可以直接看到远处的轻策山和绝云间。坊间有传说道，在高耸的客栈中，传承着某种神秘的使命。但传言止步于此，从未有人能证实它的真伪。', '璃月', './img/璃月/望舒客栈.jpg');
INSERT INTO `scenery` VALUES ('14', '沐浴月光之树', '在南天门附近有一棵引人注目的「伏龙树」，这棵不同寻常的大树下镇伏着某个不可一世的魔龙。但魔龙只是被镇伏而不是击杀，其力量尚存，依然时刻威胁着人世间。千年的岁月已让「伏龙树」融入魔龙血肉，伏龙之树俨然已成为魔龙之躯的一部分。树的根须伸向地脉，汲取这地脉的力量，树体发光的蓝色部分可能就是来自地脉的力量，如同地脉之花净化后散发着蓝色光芒。上古的魔龙的力量加上神秘的地脉之力，恶龙再世的那一天终将到来。', '璃月', './img/璃月/沐浴月光之树.png');
INSERT INTO `scenery` VALUES ('15', '港口', '港口的建立为璃月的海上贸易打下了最初的基础。作为提瓦特大陆上最大的集贸港口，其货物吞吐量也绝非一般港口可比拟。每年海灯节时，在港口处可以看到海上万千宵灯飞入夜幕，是到访璃月不可错过的奇景。', '璃月', './img/璃月/港口.png');
INSERT INTO `scenery` VALUES ('16', '玉京台', '远离嚣闹的港口，依着天衡山高高升起。「七星」与诸商会的首脑，在此驱动着璃月驶向无止境的平稳与繁华。这亦是璃月最为著名的节日庆典——「七星请仙典仪」迎神仪式的迎神地。', '璃月', './img/璃月/玉京台.png');
INSERT INTO `scenery` VALUES ('18', '绝云间', '璃月西北部常年云雾缭绕、渺无人烟的峻岭。山间有奇景，但由于地势复杂、山路陡峭而鲜有人迹，传闻中是守护璃月的仙人们的隐居之处。也因此受到部分求仙祈福之人的追捧。鉴于其间的凶险不宜外人靠近，最好还是站在望舒客栈远观吧。', '璃月', './img/璃月/绝云间.jpg');
INSERT INTO `scenery` VALUES ('19', '绯云坡', '璃月港内的一处陡坡，是诸商行兴隆发达，居民富足无忧的繁华之所，灯火熙熙攘攘，长明不灭。', '璃月', './img/璃月/绯云坡.png');
INSERT INTO `scenery` VALUES ('20', '狄花洲', '荻花洲得名于浅滩中大面积生长的荻花，是璃月北部的一处天然浅滩湿地。水泽遍布、河网交错纵横，由多样的动植物群落组成了丰富的生态系统，也构成了来往旅客眼中绝佳的景观。同时，荻花洲也是陆路从蒙德通往璃月的必经要道，因此时常有商队在此歇脚。建在河滩深处的望舒客栈是这里的标志性建筑。', '璃月', './img/璃月/狄花洲.jpg');
INSERT INTO `scenery` VALUES ('21', '轻策庄', '坐落于璃月最北部，隐藏在山丘与竹林间的村落。白云缭绕的山谷间点缀着鳞次栉比的半月形梯田，山风吹拂时可以看见一层层多彩的波浪。在这个宛如世外桃源的地方，轻策庄的村民过着质朴而又充实的生活。', '璃月', './img/璃月/轻策庄.jpg');
INSERT INTO `scenery` VALUES ('22', '遁玉岭', '「美玉遁藏之地」。但昔日发生在此地的战争早已结束，因玉而辉的古陵早已毁灭。如今只有流水之声陌陌低语。', '璃月', './img/璃月/遁玉岭.png');
INSERT INTO `scenery` VALUES ('23', '青墟浦', '穿过天衡山的山口往西前进,一座名为「青墟浦」的遗迹就映入眼中。遗迹坐落在浅潭中央高耸的岩山上，四面围绕着陡峭的山壁。几座石造楼阙与岩之神成就的自然景物浑然一体。矗立在青潭之间的荒废城楼，如今依旧守护着早已化为土灰的高傲过往。', '璃月', './img/璃月/青墟浦.png');

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `tid` int(11) NOT NULL,
  `tname` varchar(20) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `routeIntroduction` varchar(250) DEFAULT NULL,
  `ssid` varchar(100) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  PRIMARY KEY (`tid`),
  KEY `bid` (`bid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO `ticket` VALUES ('1', '提瓦特豪华一日游', '369', '琴团长带队游览!甜甜花酿鸡无限供应。从蒙德到璃月。近距离接触铁甲小宝。给你一次近距离的冒险体验！', '1,5,7,15', '1');
INSERT INTO `ticket` VALUES ('2', '玉京台观赏岩神升仙', '100', '岩神摩拉克斯主演，璃月七星配合，万民堂大厨亲自招待，一年一次！不要错过', '16', '2');
INSERT INTO `ticket` VALUES ('3', '蒙德大教堂巴巴托斯演奏会', '100', '风神巴巴托斯倾情演出，四风守护巡逻保证你的安全，猎鹿人餐馆五折优惠', '5', '1');
INSERT INTO `ticket` VALUES ('4', '晨曦酒庄农家乐', '50', '贵族住宿，酒类任选，风晶蝶群飞舞表演', '2', '1');
INSERT INTO `ticket` VALUES ('5', '果酒湖钓鱼、划船、游泳套餐', '30', '提供免费钓具、船只、泳衣泳裤', '3', '1');
INSERT INTO `ticket` VALUES ('22', '清泉镇狩猎节', '70', '侦察骑士安柏手把手指导，浪花骑士优菈舞蹈援助', '4', '1');
INSERT INTO `ticket` VALUES ('6', '誓言岬夏日烟火大会', '300', '火花骑士可莉亲手制作，带上你的伴侣一起在夜晚享受这美丽的烟火在星空中绽放', '6', '1');
INSERT INTO `ticket` VALUES ('7', '争夺达达乌帕谷之王', '10', '带上你的武器，挑战达达乌帕谷所有丘丘人，赢得他们的认同和荣耀', '7', '1');
INSERT INTO `ticket` VALUES ('8', '风龙废墟考古环游', '30', '东风之龙特瓦林带队环游，考察”旧蒙德“的生活痕迹', '8', '1');
INSERT INTO `ticket` VALUES ('9', '鹰翔海滩夏日派对', '600', '琴团长、芭芭拉泳装首秀，沙滩排球、炸鱼、冲浪，等着你的到来', '9', '1');
INSERT INTO `ticket` VALUES ('10', '天衡山淘金组团', '5', '时间不限，不提供餐饮、住宿，淘出10000原石头并上交后自由活动，自由活动所得不用上交', '10', '2');
INSERT INTO `ticket` VALUES ('11', '孤云阁F4大乱斗', '5', '耕地机言承旭、朱孝天、周渝民、吴建豪期待与你相遇，感受身体碰撞的快乐！', '11', '2');
INSERT INTO `ticket` VALUES ('12', '归离原地脉镇守', '5', '保护璃月古迹，击退丘丘人，挑战自身极限！', '12', '2');
INSERT INTO `ticket` VALUES ('13', '望舒客栈', '5', '保护璃月古迹，击退丘丘人，挑战自身极限！', '13', '2');
INSERT INTO `ticket` VALUES ('14', '若陀龙王封印破裂！与摩拉克斯共同迎击', '5', '保护璃月古迹，击退丘丘人，挑战自身极限！', '14', '2');
INSERT INTO `ticket` VALUES ('15', '港口海盗游戏', '60', '扮演海盗，与三个小屁孩一起玩耍！', '15', '2');
INSERT INTO `ticket` VALUES ('16', '绝云间飞行大冒险', '200', '与侦察骑士安柏携手在云雾中遨游，途中可通过击杀小鸟获取食物', '16', '2');
INSERT INTO `ticket` VALUES ('17', '绯云坡商铺大促销', '200', '一年一度双11，绯云坡商铺帮你脱单，买到就是赚到', '18', '2');
INSERT INTO `ticket` VALUES ('18', '狄花洲相亲节', '200', '望舒客栈为你的脱单保驾护航，相亲不成功退全款！', '18', '3');
INSERT INTO `ticket` VALUES ('19', '轻策庄探望老人志愿活动', '500', '为轻策庄老人们送上一份温暖，温暖你我他，全都靠大家', '19', '2');
INSERT INTO `ticket` VALUES ('20', '遁玉岭摸金大冒险', '1000', '摸金校尉班尼特带你勇闯地陵，六星战神为你保驾护航！', '20', '2');
INSERT INTO `ticket` VALUES ('21', '青墟浦清扫募集', '1000', '爱护璃月古迹人人有责，为璃月贡献一份你的力量！', '21', '2');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `number` varchar(35) DEFAULT NULL,
  `opwd` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `mailbox` varchar(35) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'rinping', '123456', '唐大炮', '男', '598919125@qq.com', '17307621069', '1');
INSERT INTO `user` VALUES ('2', 'kirito', 'kirito', '桐人', '男', 'kirito@160.com', '17307621068', '1');
INSERT INTO `user` VALUES ('3', 'asina', 'asina', '亚斯娜', '女', 'asina@qq.com', '17307621021', '1');
INSERT INTO `user` VALUES ('4', '沈剑心', '9527', '沈剑心', '男', '沈剑心@qq.com', '16307621021', '0');
