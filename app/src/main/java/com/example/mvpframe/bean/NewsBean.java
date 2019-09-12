package com.example.mvpframe.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/4/11 0011.
 */

public class NewsBean implements Serializable {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"283e7d584b788c7848559750063a2071","title":"为什么年轻人也会患上尿毒症？或是大多数人的通病，告诉你原因","date":"2019-09-11 14:26","category":"头条","author_name":"民福康养生堂","url":"http://mini.eastday.com/mobile/190911142613136.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_1_mwpm_03200403.jpg"},{"uniquekey":"141eb59677c0efddd3b9be659ec160c1","title":"为何李盈莹弹跳力一般，扣球却很少有人能拦住？原因有这三点！","date":"2019-09-11 14:15","category":"头条","author_name":"蜗牛侃排球","url":"http://mini.eastday.com/mobile/190911141547240.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/2019091114_dc75c6ee15ea4de99362f7d6721a1f05_3382_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/2019091114_54f807acc7744595ae4d2dec3bdef7c8_0975_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/2019091114_5adeecffc0e941538c746b119351a31a_4768_mwpm_03200403.jpg"},{"uniquekey":"189d532e7bf75eb87230f7f7c9abe66d","title":"翻脸无情 美国向重要盟友发出威胁 俄：已准备进行合作","date":"2019-09-11 14:14","category":"头条","author_name":"东方头条  张殿成军情观察","url":"http://mini.eastday.com/mobile/190911141412400.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/2019091114_652aac62dde7411a9ad3639d272a4ca7_8248_cover_mwpm_03200403.jpg"},{"uniquekey":"bcf5e7fdadf326a5b716bc695bced895","title":"战斗在凌晨打响 美大使馆附近发生激烈交火 俄：失去最后机会","date":"2019-09-11 14:13","category":"头条","author_name":"东方头条  张殿成军情观察","url":"http://mini.eastday.com/mobile/190911141353147.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/2019091114_2a0dff03478e4f7cb97f04cfa5d17b50_2221_cover_mwpm_03200403.jpg"},{"uniquekey":"c783bb42dc42fef5e5f19ec6bbef0084","title":"美国和日本都不禁枪，为什么很少听到日本发生枪击案？","date":"2019-09-11 14:13","category":"头条","author_name":"东方头条 兵说","url":"http://mini.eastday.com/mobile/190911141340451.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190911/2019091114_32ac53fd1cdf40a1b17c1912e148a722_5101_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190911/2019091114_aa2759c67bf44667bfb1f79efdf3c9ac_3318_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190911/2019091114_9e2bf995fc5d465787caa581e2967c87_8009_cover_mwpm_03200403.jpg"},{"uniquekey":"93a38d4b299b8cd939eb6d070957834e","title":"至明年，上海0-18岁儿童青少年将全覆盖\u201c全程视觉健康服务\u201d","date":"2019-09-11 14:13","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/190911141309125.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911141309_f918de5bfcc9e5a1e27c87d10b06c26c_1_mwpm_03200403.jpg"},{"uniquekey":"9857fec7f73fd8bb99031aaabf14658f","title":"原创 开心一刻：夫妻两人晚饭后，习惯去散步，可是丈夫总是低着头走路","date":"2019-09-11 14:12","category":"头条","author_name":"君叔笑话","url":"http://mini.eastday.com/mobile/190911141255527.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_2_mwpm_03200403.jpg"},{"uniquekey":"901a232f3fecca9100f6685132e0de48","title":"他一生节俭，却因喜爱\u201c斗蟋蟀\u201d而给后代留下了隐患","date":"2019-09-11 14:09","category":"头条","author_name":"小妖讲历史","url":"http://mini.eastday.com/mobile/190911140909980.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_1_mwpm_03200403.jpg"},{"uniquekey":"42db616a4476858f6eeaa1b161cd354c","title":"马云近照曝光！台风强劲超明星","date":"2019-09-11 14:05","category":"头条","author_name":"映象网","url":"http://mini.eastday.com/mobile/190911140521404.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_3_mwpm_03200403.jpg"},{"uniquekey":"a003ffbd2b1feb0d800bed8dbdb62a6c","title":"baby专访谈与小海绵日常称其喜欢角色扮演","date":"2019-09-11 14:05","category":"头条","author_name":"人民网本地站","url":"http://mini.eastday.com/mobile/190911140509132.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911140509_54382e3927538aa07ed4881718e66c5a_1_mwpm_03200403.jpg"},{"uniquekey":"0c0050f0d093736bf077d82d0141785c","title":"守得云开见日出！扛过葡萄牙最艰苦时代的C罗，迎来了最好时代","date":"2019-09-11 14:02","category":"头条","author_name":"陌上527花开","url":"http://mini.eastday.com/mobile/190911140210710.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_4_mwpm_03200403.jpg"},{"uniquekey":"30890b72d31307ef5300e88428056fcf","title":"原创 同是39岁 斯科拉20分轰倒塞尔维亚 若姚明不参加北京奥运 能否还带领男篮前行","date":"2019-09-11 14:01","category":"头条","author_name":"狍子说体坛","url":"http://mini.eastday.com/mobile/190911140151427.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_4_mwpm_03200403.jpg"},{"uniquekey":"fadc09524ad1b98b6fd0eea8dd01bb1b","title":"国际化开启新征程，WEY将于两年后登陆欧盟市场","date":"2019-09-11 14:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/190911140124303.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_4_mwpm_03200403.jpg"},{"uniquekey":"eaea10944e37e35c31ec3a2680d2192a","title":"关于iPhone 11系列、A13芯片 知乎网友是这么说的","date":"2019-09-11 14:01","category":"头条","author_name":"TechWeb.com.cn","url":"http://mini.eastday.com/mobile/190911140112879.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911140112_6aba0e62c772f78bcd82adcba622b5fe_1_mwpm_03200403.jpg"},{"uniquekey":"c9afdcad9b30245d508584e8c556e993","title":"\u201c顾未易\u201d新剧来袭，看到女主竟是林妙妙，这是什么神仙电视剧？","date":"2019-09-11 14:00","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190911140046913.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_3_mwpm_03200403.jpg"},{"uniquekey":"a265d60848ad49e26fb9f3c0697dff29","title":"生活不易，凭什么贷款还要多付利息？","date":"2019-09-11 14:00","category":"头条","author_name":"房产高参会","url":"http://mini.eastday.com/mobile/190911140020972.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911140020_cb5ddd70eba73a28676784501b071937_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911140020_cb5ddd70eba73a28676784501b071937_3_mwpm_03200403.jpg"},{"uniquekey":"d4ecb964baba2cdfa557d5c81ae61ae5","title":"北京国际设计周系列活动之一 \u201c艺术共创\u201c入选项目之\u201c骑时停好\u201d论坛剧场在京上演","date":"2019-09-11 13:59","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190911135942702.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_2_mwpm_03200403.jpg"},{"uniquekey":"650fce1079a19bd1030930cd2b957efb","title":"170平米不够住？那就买两套，中间直接打通，土豪的世界我们不懂","date":"2019-09-11 13:58","category":"头条","author_name":"家乐说家居","url":"http://mini.eastday.com/mobile/190911135838176.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_31_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_23_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_18_mwpm_03200403.jpg"},{"uniquekey":"ea2858cd25ee3912e0d039fc50b2adab","title":"运动款背心搭配醒目的休闲短裤，走的就是时尚运动风！","date":"2019-09-11 13:58","category":"头条","author_name":"男得糊涂了","url":"http://mini.eastday.com/mobile/190911135811754.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/2019091113_092a801f595d457cbca38f3f571b3dc6_5798_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/2019091113_80bfcf84e1be4e088ca356936714dfc2_6909_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/2019091113_13c0ceb9417b4cc3aa30f17e6d87d12b_3449_cover_mwpm_03200403.jpg"},{"uniquekey":"f03bcee2d50c602e44e67a5c940c4d7f","title":"5:0首战告捷，里皮一席话道出国足大胜真正原因，盛赞两大悍将","date":"2019-09-11 13:57","category":"头条","author_name":"萧郎看球","url":"http://mini.eastday.com/mobile/190911135732286.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190911/2019091113_6d98a56796504906ae2a6acbf04c9d91_4644_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190911/2019091113_565a6afedc1e42208a30ea17e596b6e5_2547_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190911/2019091113_0d97c43cb46940299c82f7cd6c9f433a_0622_mwpm_03200403.jpg"},{"uniquekey":"247e3c8e3b7c8b1b6257fa213943ab41","title":"九部口碑电影来袭，那些关于老师的记忆，都在这些杰作里了","date":"2019-09-11 13:57","category":"头条","author_name":"婧辰晚晴","url":"http://mini.eastday.com/mobile/190911135700133.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_4_mwpm_03200403.jpg"},{"uniquekey":"3fa1bf1a95dfd0e59345dc897678806e","title":"杨洋最近好事不断！新剧完结再迎好消息，网友纷纷祝福要开心","date":"2019-09-11 13:55","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190911135501741.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_5_mwpm_03200403.jpg"},{"uniquekey":"9bb8437bac29c72bbe9417cd05278889","title":"宁桓宇《茫洋》新歌首播 唱出新派潮流音乐","date":"2019-09-11 13:52","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190911135200434.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911135200_e5ad3fe0803c56f20644cc1993702f76_1_mwpm_03200403.jpg"},{"uniquekey":"26ed3fc11f03701ad8e97cbfa2ad8d79","title":"晚年讨子女喜欢的三个生肖，人越老越有福，子女也越孝顺","date":"2019-09-11 13:48","category":"头条","author_name":"星座祯祯君","url":"http://mini.eastday.com/mobile/190911134838403.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/2019091113_43df7180b89243679c9c0954438e3d6b_2177_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/2019091113_567bc57e727d44c29358289bcb002784_9128_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/2019091113_fec2fc069e684ced8b43e9637af3c92c_3833_mwpm_03200403.jpg"},{"uniquekey":"b9d1509ab3cf4e021e8694dd85219b1b","title":"韩国伊朗都吃瘪，国足5球大胜创纪录！球迷：艾克森比周琦拼多了","date":"2019-09-11 13:48","category":"头条","author_name":"篮郭先生","url":"http://mini.eastday.com/mobile/190911134824526.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190911/2019091113_a782cdf30b5d4392ae3f6e133e7acecf_7227_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190911/2019091113_d7500b9df6274b5dbe5ee97bbe9fa4a5_8605_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190911/2019091113_e7157d721ce54b4a957fdcb88822b02c_5841_mwpm_03200403.jpg"},{"uniquekey":"4c091741ed5df0191bf97282d16cd05d","title":"第十九届中国职业模特大赛总决赛在威海举行","date":"2019-09-11 13:47","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190911134714528.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_f0a21bad7da831b7d019b3fbbadd5cf7_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_bf59e6a67ab2755841eeb1339bdfbe2b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_0558e33ca6e3b169babbdb62a560883a_2_mwpm_03200403.jpg"},{"uniquekey":"f5b9362757976816b6bd121a4e6d5130","title":"太阳死亡后木星可能替代太阳？每颗行星都将有环，但地球再无机会","date":"2019-09-11 13:43","category":"头条","author_name":"星辰大海路上的种花家","url":"http://mini.eastday.com/mobile/190911134327528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_7_mwpm_03200403.jpg"},{"uniquekey":"45799b7b594946475d26d904af4559a0","title":"iPhone 11发布，价格确实不错，但这些缺点不容忽视","date":"2019-09-11 13:43","category":"头条","author_name":"科技时辰","url":"http://mini.eastday.com/mobile/190911134323018.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_1_mwpm_03200403.jpg"},{"uniquekey":"eb046fce78b98a8daf2b488685b89d56","title":"豪门阔太谁更美45岁晴格格王艳一袭粉裙太仙女，气质不输李嘉欣","date":"2019-09-11 13:42","category":"头条","author_name":"时尚美丽派","url":"http://mini.eastday.com/mobile/190911134242901.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/2019091113_99395f2f25ce42f8bd1b70e512e60ced_1734_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/2019091113_f3412cfbf9a0475bbab91519207b1069_7060_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/2019091113_6518bbe3e5e74cbbbb7704949183cdf4_5909_mwpm_03200403.jpg"},{"uniquekey":"d65e2ae4e2dc14fd4256cecf6ec36b80","title":"湖北排查出520处燃气安全隐患 本月底前将整改消除","date":"2019-09-11 13:39","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190911133934146.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"283e7d584b788c7848559750063a2071","title":"为什么年轻人也会患上尿毒症？或是大多数人的通病，告诉你原因","date":"2019-09-11 14:26","category":"头条","author_name":"民福康养生堂","url":"http://mini.eastday.com/mobile/190911142613136.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_1_mwpm_03200403.jpg"},{"uniquekey":"141eb59677c0efddd3b9be659ec160c1","title":"为何李盈莹弹跳力一般，扣球却很少有人能拦住？原因有这三点！","date":"2019-09-11 14:15","category":"头条","author_name":"蜗牛侃排球","url":"http://mini.eastday.com/mobile/190911141547240.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/2019091114_dc75c6ee15ea4de99362f7d6721a1f05_3382_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/2019091114_54f807acc7744595ae4d2dec3bdef7c8_0975_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/2019091114_5adeecffc0e941538c746b119351a31a_4768_mwpm_03200403.jpg"},{"uniquekey":"189d532e7bf75eb87230f7f7c9abe66d","title":"翻脸无情 美国向重要盟友发出威胁 俄：已准备进行合作","date":"2019-09-11 14:14","category":"头条","author_name":"东方头条  张殿成军情观察","url":"http://mini.eastday.com/mobile/190911141412400.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/2019091114_652aac62dde7411a9ad3639d272a4ca7_8248_cover_mwpm_03200403.jpg"},{"uniquekey":"bcf5e7fdadf326a5b716bc695bced895","title":"战斗在凌晨打响 美大使馆附近发生激烈交火 俄：失去最后机会","date":"2019-09-11 14:13","category":"头条","author_name":"东方头条  张殿成军情观察","url":"http://mini.eastday.com/mobile/190911141353147.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/2019091114_2a0dff03478e4f7cb97f04cfa5d17b50_2221_cover_mwpm_03200403.jpg"},{"uniquekey":"c783bb42dc42fef5e5f19ec6bbef0084","title":"美国和日本都不禁枪，为什么很少听到日本发生枪击案？","date":"2019-09-11 14:13","category":"头条","author_name":"东方头条 兵说","url":"http://mini.eastday.com/mobile/190911141340451.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190911/2019091114_32ac53fd1cdf40a1b17c1912e148a722_5101_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190911/2019091114_aa2759c67bf44667bfb1f79efdf3c9ac_3318_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190911/2019091114_9e2bf995fc5d465787caa581e2967c87_8009_cover_mwpm_03200403.jpg"},{"uniquekey":"93a38d4b299b8cd939eb6d070957834e","title":"至明年，上海0-18岁儿童青少年将全覆盖\u201c全程视觉健康服务\u201d","date":"2019-09-11 14:13","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/190911141309125.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911141309_f918de5bfcc9e5a1e27c87d10b06c26c_1_mwpm_03200403.jpg"},{"uniquekey":"9857fec7f73fd8bb99031aaabf14658f","title":"原创 开心一刻：夫妻两人晚饭后，习惯去散步，可是丈夫总是低着头走路","date":"2019-09-11 14:12","category":"头条","author_name":"君叔笑话","url":"http://mini.eastday.com/mobile/190911141255527.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/20190911141255_1a7476664b34c5a7b66b4da4cb77b4e0_2_mwpm_03200403.jpg"},{"uniquekey":"901a232f3fecca9100f6685132e0de48","title":"他一生节俭，却因喜爱\u201c斗蟋蟀\u201d而给后代留下了隐患","date":"2019-09-11 14:09","category":"头条","author_name":"小妖讲历史","url":"http://mini.eastday.com/mobile/190911140909980.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190911/20190911140909_1c9412f47451310e19a2f67f54bf9240_1_mwpm_03200403.jpg"},{"uniquekey":"42db616a4476858f6eeaa1b161cd354c","title":"马云近照曝光！台风强劲超明星","date":"2019-09-11 14:05","category":"头条","author_name":"映象网","url":"http://mini.eastday.com/mobile/190911140521404.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/20190911140521_ebe60564fb5397bf0f7c4be6bff8da9d_3_mwpm_03200403.jpg"},{"uniquekey":"a003ffbd2b1feb0d800bed8dbdb62a6c","title":"baby专访谈与小海绵日常称其喜欢角色扮演","date":"2019-09-11 14:05","category":"头条","author_name":"人民网本地站","url":"http://mini.eastday.com/mobile/190911140509132.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911140509_54382e3927538aa07ed4881718e66c5a_1_mwpm_03200403.jpg"},{"uniquekey":"0c0050f0d093736bf077d82d0141785c","title":"守得云开见日出！扛过葡萄牙最艰苦时代的C罗，迎来了最好时代","date":"2019-09-11 14:02","category":"头条","author_name":"陌上527花开","url":"http://mini.eastday.com/mobile/190911140210710.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/20190911140210_5d19ed7c32734b58056a564e2317a3ab_4_mwpm_03200403.jpg"},{"uniquekey":"30890b72d31307ef5300e88428056fcf","title":"原创 同是39岁 斯科拉20分轰倒塞尔维亚 若姚明不参加北京奥运 能否还带领男篮前行","date":"2019-09-11 14:01","category":"头条","author_name":"狍子说体坛","url":"http://mini.eastday.com/mobile/190911140151427.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190911/20190911140151_2c1907adf9c9c6f001abf97c7a924e91_4_mwpm_03200403.jpg"},{"uniquekey":"fadc09524ad1b98b6fd0eea8dd01bb1b","title":"国际化开启新征程，WEY将于两年后登陆欧盟市场","date":"2019-09-11 14:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/190911140124303.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/20190911140124_cf157811d97c6b3e8ab1547eda09cd65_4_mwpm_03200403.jpg"},{"uniquekey":"eaea10944e37e35c31ec3a2680d2192a","title":"关于iPhone 11系列、A13芯片 知乎网友是这么说的","date":"2019-09-11 14:01","category":"头条","author_name":"TechWeb.com.cn","url":"http://mini.eastday.com/mobile/190911140112879.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911140112_6aba0e62c772f78bcd82adcba622b5fe_1_mwpm_03200403.jpg"},{"uniquekey":"c9afdcad9b30245d508584e8c556e993","title":"\u201c顾未易\u201d新剧来袭，看到女主竟是林妙妙，这是什么神仙电视剧？","date":"2019-09-11 14:00","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190911140046913.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190911/20190911140046_5970f7ab27523e47a4c5e9412a9f5592_3_mwpm_03200403.jpg"},{"uniquekey":"a265d60848ad49e26fb9f3c0697dff29","title":"生活不易，凭什么贷款还要多付利息？","date":"2019-09-11 14:00","category":"头条","author_name":"房产高参会","url":"http://mini.eastday.com/mobile/190911140020972.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911140020_cb5ddd70eba73a28676784501b071937_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911140020_cb5ddd70eba73a28676784501b071937_3_mwpm_03200403.jpg"},{"uniquekey":"d4ecb964baba2cdfa557d5c81ae61ae5","title":"北京国际设计周系列活动之一 \u201c艺术共创\u201c入选项目之\u201c骑时停好\u201d论坛剧场在京上演","date":"2019-09-11 13:59","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190911135942702.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/20190911135942_330673a6907e60e92091120c84f93e4b_2_mwpm_03200403.jpg"},{"uniquekey":"650fce1079a19bd1030930cd2b957efb","title":"170平米不够住？那就买两套，中间直接打通，土豪的世界我们不懂","date":"2019-09-11 13:58","category":"头条","author_name":"家乐说家居","url":"http://mini.eastday.com/mobile/190911135838176.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_31_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_23_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/20190911135838_4b8ab46c77275731c627f33938e61979_18_mwpm_03200403.jpg"},{"uniquekey":"ea2858cd25ee3912e0d039fc50b2adab","title":"运动款背心搭配醒目的休闲短裤，走的就是时尚运动风！","date":"2019-09-11 13:58","category":"头条","author_name":"男得糊涂了","url":"http://mini.eastday.com/mobile/190911135811754.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190911/2019091113_092a801f595d457cbca38f3f571b3dc6_5798_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190911/2019091113_80bfcf84e1be4e088ca356936714dfc2_6909_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190911/2019091113_13c0ceb9417b4cc3aa30f17e6d87d12b_3449_cover_mwpm_03200403.jpg"},{"uniquekey":"f03bcee2d50c602e44e67a5c940c4d7f","title":"5:0首战告捷，里皮一席话道出国足大胜真正原因，盛赞两大悍将","date":"2019-09-11 13:57","category":"头条","author_name":"萧郎看球","url":"http://mini.eastday.com/mobile/190911135732286.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190911/2019091113_6d98a56796504906ae2a6acbf04c9d91_4644_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190911/2019091113_565a6afedc1e42208a30ea17e596b6e5_2547_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190911/2019091113_0d97c43cb46940299c82f7cd6c9f433a_0622_mwpm_03200403.jpg"},{"uniquekey":"247e3c8e3b7c8b1b6257fa213943ab41","title":"九部口碑电影来袭，那些关于老师的记忆，都在这些杰作里了","date":"2019-09-11 13:57","category":"头条","author_name":"婧辰晚晴","url":"http://mini.eastday.com/mobile/190911135700133.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911135700_04bc1adcb6e9263a6d232225f4846301_4_mwpm_03200403.jpg"},{"uniquekey":"3fa1bf1a95dfd0e59345dc897678806e","title":"杨洋最近好事不断！新剧完结再迎好消息，网友纷纷祝福要开心","date":"2019-09-11 13:55","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/190911135501741.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190911/20190911135501_c77918a449f448821cbe2cede6cbf8ac_5_mwpm_03200403.jpg"},{"uniquekey":"9bb8437bac29c72bbe9417cd05278889","title":"宁桓宇《茫洋》新歌首播 唱出新派潮流音乐","date":"2019-09-11 13:52","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190911135200434.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/20190911135200_e5ad3fe0803c56f20644cc1993702f76_1_mwpm_03200403.jpg"},{"uniquekey":"26ed3fc11f03701ad8e97cbfa2ad8d79","title":"晚年讨子女喜欢的三个生肖，人越老越有福，子女也越孝顺","date":"2019-09-11 13:48","category":"头条","author_name":"星座祯祯君","url":"http://mini.eastday.com/mobile/190911134838403.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190911/2019091113_43df7180b89243679c9c0954438e3d6b_2177_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190911/2019091113_567bc57e727d44c29358289bcb002784_9128_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190911/2019091113_fec2fc069e684ced8b43e9637af3c92c_3833_mwpm_03200403.jpg"},{"uniquekey":"b9d1509ab3cf4e021e8694dd85219b1b","title":"韩国伊朗都吃瘪，国足5球大胜创纪录！球迷：艾克森比周琦拼多了","date":"2019-09-11 13:48","category":"头条","author_name":"篮郭先生","url":"http://mini.eastday.com/mobile/190911134824526.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190911/2019091113_a782cdf30b5d4392ae3f6e133e7acecf_7227_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190911/2019091113_d7500b9df6274b5dbe5ee97bbe9fa4a5_8605_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190911/2019091113_e7157d721ce54b4a957fdcb88822b02c_5841_mwpm_03200403.jpg"},{"uniquekey":"4c091741ed5df0191bf97282d16cd05d","title":"第十九届中国职业模特大赛总决赛在威海举行","date":"2019-09-11 13:47","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190911134714528.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_f0a21bad7da831b7d019b3fbbadd5cf7_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_bf59e6a67ab2755841eeb1339bdfbe2b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190911/20190911134714_0558e33ca6e3b169babbdb62a560883a_2_mwpm_03200403.jpg"},{"uniquekey":"f5b9362757976816b6bd121a4e6d5130","title":"太阳死亡后木星可能替代太阳？每颗行星都将有环，但地球再无机会","date":"2019-09-11 13:43","category":"头条","author_name":"星辰大海路上的种花家","url":"http://mini.eastday.com/mobile/190911134327528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911134327_c1730aff1bf792b5c6dcb743cee7a798_7_mwpm_03200403.jpg"},{"uniquekey":"45799b7b594946475d26d904af4559a0","title":"iPhone 11发布，价格确实不错，但这些缺点不容忽视","date":"2019-09-11 13:43","category":"头条","author_name":"科技时辰","url":"http://mini.eastday.com/mobile/190911134323018.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190911/20190911134323_e9a67226a2ed7ffc378a79532d87d3ed_1_mwpm_03200403.jpg"},{"uniquekey":"eb046fce78b98a8daf2b488685b89d56","title":"豪门阔太谁更美45岁晴格格王艳一袭粉裙太仙女，气质不输李嘉欣","date":"2019-09-11 13:42","category":"头条","author_name":"时尚美丽派","url":"http://mini.eastday.com/mobile/190911134242901.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190911/2019091113_99395f2f25ce42f8bd1b70e512e60ced_1734_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190911/2019091113_f3412cfbf9a0475bbab91519207b1069_7060_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190911/2019091113_6518bbe3e5e74cbbbb7704949183cdf4_5909_mwpm_03200403.jpg"},{"uniquekey":"d65e2ae4e2dc14fd4256cecf6ec36b80","title":"湖北排查出520处燃气安全隐患 本月底前将整改消除","date":"2019-09-11 13:39","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190911133934146.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190911/20190911133934_5307c4c7ca10d9cb4304538430824a6f_2_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 283e7d584b788c7848559750063a2071
             * title : 为什么年轻人也会患上尿毒症？或是大多数人的通病，告诉你原因
             * date : 2019-09-11 14:26
             * category : 头条
             * author_name : 民福康养生堂
             * url : http://mini.eastday.com/mobile/190911142613136.html
             * thumbnail_pic_s : http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_3_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://05imgmini.eastday.com/mobile/20190911/20190911142613_d151f7099a41ce2c5910dc086b2dc828_1_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }


            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
