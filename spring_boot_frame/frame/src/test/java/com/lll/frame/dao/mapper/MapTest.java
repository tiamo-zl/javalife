package com.lll.frame.dao.mapper;

import java.util.*;

/**
 * Description
 *
 * @Author zl
 * @Create 2019-09-03 11:09
 **/
public class MapTest {


	public static void main(String[] args) {

		String[] keyArray = new String[]
				{
						"万寿台",
						"万寿寺",
						"万寿山",
						"万寿无疆",
						"万寿桥",
						"万寿瓜",
						"万寿节",
						"万山",
						"万岁",
						"万岁爷",
						"万岭不思游",
						"万州",
						"万州区",
						"万巴赫",
						"万年历",
						"万年寺",
						"万年村",
						"万年青",
						"万明钢",
						"万庄镇",
						"万应锭",
						"万德莱",
						"万德镇",
						"万户侯",
						"万新村",
						"万幸",
						"万恶",
						"万斤",
						"万方",
						"万念俱灰",
						"万户千家",
						"万无一失"
				};

		if (checkKeywords(keyArray, "内容提要\n" +
				"　　抗战末期，一群溃败下来的国民党士兵聚集在西南小镇禅达的收容所里，他们被几年来国土渐次沦丧弄得毫无斗志，只想苟且偷生。而日本人此时已经逼近国界，打算切断中国与外界的联系。\n" +
				"　　收容所里聚集了各色人物：孟烦了、迷龙、不辣、郝兽医、阿译等等。他们混日子，他们不愿面对自己内心存有的梦，那就是再跟日本人打一仗，打败日本人。因为他们已经不抱有任何希望了。他们活得像人渣，活着跟死了也差不多。\n" +
				"　　师长虞啸卿出现了，他要重建川军团。但真正燃起这群人斗志的是嬉笑怒骂、不惜使用下三滥手段的龙文章。龙文章成了他们的团长，让这群人渣重燃斗志，变成勇于赴死之人。\n" +
				"　　这些人从一开始就知道，自己的命运就是炮灰的命运，他们面对的是一场几乎必死无疑的战争。\n" +
				"　　这是迄今为止，唯一一部对得起“中国远征军”这五个字的中国远征军题材的小说。\n" +
				"　　列宁在评价高尔基的《母亲》时说：“这是一本及时的书。”今时今日，在尤其需要我们对未来抱有信心的时候，本书也当得起这一评价。\n" +
				"\n" +
				"\n" +
				"第一章\n" +
				"　　我在长江之南的某个小平原上抖抖索索地划拉着一盒火柴，但总是因无力而过度用力，结果不仅弄断了火柴梗子，还让满盒的火柴干戈寥落撒了半地。我只好又从脚下去捡那一地的火柴梗。\n" +
				"　　我——孟烦了，二十四岁，今国军某支所谓新编师之一员，中尉副连长。\n" +
				"　　我无力又猛力地划着火柴，这次我让整个空火柴盒从手上弹出去了。于是我再用抢命般的速度抢回地上那个火柴盒。\n" +
				"　　“烦啦你个驴日的！连根火柴也日不着啊？！”\n" +
				"　　我想起了我屡被冒犯的官威。万寿台火柴，一手火柴盒，愠怒地盯着那个发话的对象——二排四班马驴儿，河北乡下佬，怒目金刚，倒抡着他那条离腰折已经差不远的汉阳造，我现在不想说他要砸谁。\n" +
				"　　“我是你们连长！”我维护我随着火柴梗子掉了一地的官威。\n" +
				"　　这种抗议有点儿文不对题，并且立刻被反驳回来，“副的！正的正烧着呢！”\n" +
				"　　我是文化人，我认为这种辩论有点儿无聊，于是我决定专心划火柴。我经常认为别人很无聊，而我自己更无聊——我又开始跟火柴较劲。\n" +
				"　　马驴儿在不管我之前又嚷嚷了一句：“你不会跟连长借个火啊？——哇呀呀，驴日的！”\n" +
				"　　后边那一句是对他要砸的对象喊的，很京剧腔。喊过去之后，马驴儿就抡圆了他那条打光子弹当锹抡的汉阳造扑过去了，现在我可以说他要砸什么啦，哈哈——一辆日本九七式中型坦克，辗转着，原地转向着，咆哮着，炮塔转动着，与主炮同轴的同步机枪轰鸣着，像是冲进蚂蚁群中的庞大甲虫。如其说它是困兽犹斗不如说是在玩耍，因为像蚂蚁一样附着在它身上的中国兵实在是太不得要领，拿铲子砍的、拿锹棍撬的、拿手榴弹敲打舱盖以为里边会打开的、对着装甲开枪崩到自己的、跳脚大骂的。我单膝跪在这团乱糟之外，连长在我身边燃烧。除了活人之外的整个连在他们马虎潦草抵挡，所以已经被日军炮兵化为焦土的阵地上燃烧着。我跪在火海和坦克之间，身边放着一个土造的燃烧瓶。我拿着火柴和火柴盒，似乎要划火柴，又似乎是在思考，而实际上只是最简单的三个字：吓傻了。\n" +
				"　　马驴儿成功地用枪托在装甲车体上制造出一声巨大的响动，代价是枪托不知道飞到哪里去了。这是个锲而不舍的人，他发现车头有个缝隙，于是猫了腰低了头去看，其情状酷似从门缝里窥视。\n" +
				"　　那是航向机枪的射击孔。在突发的轰鸣声中他安静而飘逸地飞出去了。\n" +
				"　　这实在是让我看得发怔，但我身上有这种素质——即使在上吊的时候也不忘打击一下别人，我扯嗓子为他送行，“白痴！最后一次！”\n" +
				"　　但我还记得马驴儿的提示，我看手上的火柴盒，扔了它，看手上的火柴，扔了它，我抓起燃烧瓶，爬向离我最近也烧得最炽烈的那个——实际上它已经完完全全是一团火焰。真是的，我为什么要跟一盒发了潮的火柴较劲？\n" +
				"　　“连长，借个火。”\n" +
				"　　连长没发表意见，我借火，借火的时候肚子里发出饥肠辘辘的轰鸣，我吸了吸鼻子，因我在焦香中所起的生理反应而觉得罪过。此时我听见来自身后的机枪连射，夹着主炮发射的轰鸣，这与方才日军坦克的点射迥异，我拿着已经燃点的燃烧瓶回身。\n" +
				"　　坦克上已经没有附着的人类了，它在尸骸中进行一个小半径的转向，刚发射过的主炮炮塔转向我。不知属于谁的半截枪杆自半空落下，砸掉了我的茫然。三八式的子弹自侧后方射来，我看了一下，那个好容易被我们和坦克分隔开的日军小队正拉了个散兵线，慢慢往这边近来。\n" +
				"　　我拉开了架势，扬起燃烧瓶，开始冲刺，那辆近在咫尺的九七坦克现在看起来真是庞大无比，它的炮口正对着我，像只毒眼。三八式步枪又响了一次，是个排枪，燃烧瓶从我手上落下，我摔倒。\n" +
				"　　坦克以一种人散步时的速度漫不经心地离开，日军小队虽仍拉着散兵线，却也和散步一样漫不经心，其中一个经过我身边时，用刺刀捅进我的大腿，绞动了一下。\n" +
				"　　我死了，我就不动。\n" +
				"　　他们走了，消失于焦炽的地平线上——既然这边焦土上已经没有站立的中国人。\n" +
				"　　整个阵地都在烧着，白磷和汽油在燃烧，武器和弹药在燃烧，尸体在燃烧，连泥土和弹坑都在燃烧，而我睁开眼时，只是看着在我身边燃烧的那个燃烧瓶。它已经碎了，燃液在土地上流淌，流过我身边，把我没能划燃的火柴一根根点燃。\n" +
				"　　我呆呆看着那些在火海中依次蓬然亮起的小小火光，它们不属于我，从来就没属于过。\n" +
				"　　永远是这样的。一群你看不上，也看不上你的粗人一再挫折你的希望，最后他们和你的希望一起成为泡影流沙。在经历四年败战和几千公里的溃退之后，我的连队终于全军尽墨。\n" +
				"　　我叫孟烦了，家父大概是烦恼很多的样子，以至要用我的名字把烦恼了却。烦恼从不了却，倒连累我从小心事重，心事多，而且像刚才死的这些大老粗们，总是“烦啦，烦啦”地叫着，有的是不认字，有的是图省事。\n" +
				"　　现在他们都死啦，人万巴赫要往好处看，我想我终于摆脱了“烦啦”这该死的名字。\n" +
				"　　一个多月后，我走在滇边一个叫禅达的小镇中，忽然听得一个山西佬儿在我身后鬼叫：“——烦啦！——烦啦！”\n" +
				"　　我站住，因为没能摆脱“烦啦”这个该死的名字受惊失望到狰狞。为了表示抗议我缓慢地顾盼，其实我知道叫我的人是谁。我现在给人一种迟钝和呆滞的假象。永不言信和杜绝热情，是我这种人为落拓人生掘就的散兵坑，其实我是这时代为数不多反应奇快甚至过快的人类之一。\n" +
				"　　我站在巷口，禅达的这整条巷子现在已被划为军事区，吓人名目下其实就是个溃兵集中地。溃散的各路诸候被集中于此以免对地方上造成困扰。巷口草率的沙袋工事和工事后的几个哨兵形同虚设，最多表示我们仍算是军人。我仍穿着装死时穿的那身衣服，这也是我唯一的衣服，它更加脏污和残破，显然在一月来的逃窜中又失落了某些部件。我手上玩着一盒火柴，但已经不是我扔在逃生之地的那盒。\n" +
				"　　叫我的人自身后重拍我的肩膀。山西佬儿康丫的军装扣子已经全部掉光了，以至始终得腾出一只手掩着衣衫下摆，这是为了身份而非风化——一个兵也就敞着算啦，但康丫是准尉，他是官儿。\n" +
				"　　康丫，有着还算清晰的外表和绝对粗糙的心灵，生活对他来说是理应心不在焉对待的东西，在这样的世界里他的甘为弱智是一种自保。他最大的特点是无论何时何地，永远在问任何人要任何东西，要不到无所谓，要到了便当财喜。他甚至上茅坑都不带厕纸，认可蹲在那儿找人要，他总是厚颜无耻地在这样做，因为他心里模糊地明白：生活不会让他这样人占到更大便宜。\n" +
				"　　康丫说什么，是我们睡着了也能猜到的，“有吃的没？”\n" +
				"　　我白眼向人，望了一望，慢慢把康丫的肘子抬到嘴边张口，康丫败不馁地拿开，“有烟的没？”\n" +
				"　　我开始摸身上，在康丫的期待中掏给了他一根火柴。康丫毫不在意地接过来开始掏耳朵，“有扣子的没？”\n" +
				"　　这是康丫的绝活儿，他会一直要下去，要到你不得不用什么来打发他。我只好看了下我衣服上所剩无几的扣子，康丫明白这算是默许，于是伸手拽走了一个。同时，他发现沙袋后的哨兵扔下了一个烟头，足足半根！他在那烟头刚落地时就打算捡起来了，但扔烟头的很不给面子，在他手指碰到前就一脚踩灭了。\n" +
				"　　我不吸烟，没有康丫的那种欲求，所以我看着。一个军装工整补给齐全的编制内士兵和一个无兵无枪无弹只有一颗扣子的溃兵排长，像雕像一样一躬一挺地对峙着，相当有趣。康丫很快觉得不那么有趣了，因为哨兵拉了下枪栓，我们清晰地听到子弹上膛，于是雕像们活了，康丫不屈不挠地捡起了烟头，并且聪明地转向了我，“有火的没？”\n" +
				"　　我手上就捏着一盒火柴，我犹豫了一下，康丫立刻拿走了它，可那玩意儿的磷面都快被我玩没了，也快被我的汗手浸透了，根本划不燃。康丫徒劳地划几次后放弃了，扔掉了我的火柴，“你的火柴从来划不着。——有针线的没？”\n" +
				"　　我立刻捡起了火柴，有点儿像瘸子捡回自己的拐杖——尽管我已是个瘸子，并且没有拐杖。我们早已不会为不被理解而愤怒了，所以我平实地回答他：“郝兽医有。”\n" +
				"　　“兽医死哪儿啦？”\n" +
				"　　我悻悻地打击他，“在问有吃的没。”\n" +
				"　　康丫对这种打击基本是免疫的，“一起去？”\n" +
				"　　反正今晨的逡巡除了个并无兴趣的烟头之外，并无其他发现——那就一起去。\n" +
				"　　我和康丫回身，进入收容站的大门，或者更该说被封闭的这整条陋巷的巷口。巷子很深，凋零破败，盛装我们这些凋零破败，散落于巷子任何角落、任何院落、危墙之下甚至危墙之上、扎堆或者不扎堆的溃兵。我和康丫穿过他们，我拖着我的整条左腿，走得恰似一名刚去过势的太监。\n" +
				"　　溃军不如寇，流兵即为贼。无衣无食，则立刻陷进求衣求食的怪圈。全军尽墨四周后，我和许许多多和我一样的我们，流落到这座滇边小县。惯例是把我们这样的溃兵交给地方，惯例又是地方把我们这样的流兵交给老天爷，所以我们求衣求食时也只能巴巴地望穿老天爷。\n" +
				"　　我们所经过的大部分人两眼漠然而茫然，把自己的伤肢架得横断整条巷子，用所有的生气给别人制造最后一点儿麻烦，在被人碰到时再呼痛和叫嚣——相比之下我的死样活气都可算生机盈然。少数是扎堆的，在虚无中振作起一种全无方向的努力。不辣便是这样的一位。\n" +
				"　　一摊人踞坐于巷子中心的路上，完全堵塞了交通，用摊来计算因为他们大多数坐都没得坐相。他们的激愤通常始于口水也终于口水，一口浓郁湘南腔的不辣是其中最大的一泡口水。他油滑时亦显得激愤，激愤时亦带着油滑，他浑浑噩噩但永远带种纯真的愤怒，他还有种来自乡野的原始的生命力，凭这个，虽然只是区区一个上等兵，他却时常在一群听天由命的兵油子里占到先机。\n" +
				"　　“……肚子饿了要跟我们喊，我们饿了跟哪个喊？老天爷？”那家伙对着巷子之上的苍穹庄严缓慢地比出一个蔑视的手势，“扯卵谈。他听不到，要是听得到看得到，刚刚这一下我就被雷劈死了。”他揭示了他的谜底，“要跟听得见的喊。”\n" +
				"　　我被阻滞，因而觉得有必要干预一下，“不辣？”\n" +
				"　　不辣回头，看着我用手指在颈下划过，这举动提醒的意思远多过警告，一摊人因此寂静下来，但寂静中来自我腹中的一声低鸣把所有提醒和警告全部出卖。\n" +
				"　　不辣油滑上脸，开始涎笑，“军官老爷也没得呷！跟他们喊有条卵用！要跟有呷的喊！跟县太爷喊！”\n" +
				"　　“随便。”我哼唧着，低着头从人群中刚腾出的过道中挤过，我身后的康丫在向不辣索要针线。\n" +
				"　　“有针线的没？”\n" +
				"　　不辣拔给他一根头发。\n" +
				"　　我和康丫进入了我们的地盘，一个比较开阔的天井，在这陋巷中它算一片不小的甚至是最大的空地，在这里扎堆和展览伤口的人远不如外边的人多，因为无所事事和愤怒都要求起码的观众。这里孤魂野鬼般游荡的人大部分与我没有直接关系，有关系的只是聚集在一堆废材和垃圾旁边的郝兽医、豆饼、要麻、蛇屁股几个，我和康丫本该是径直走向他们，但天井进口的迷龙则是我和康丫这两名尉官不得不正视的一个存在。\n" +
				"　　白山黑水之人迷龙，上等兵，他有一张竹躺椅，顺便守候着他身后的仓库和一个“童叟无欺，概不赊欠”的牌子。他正和他的亲信羊蛋子在躺椅边的一张小凳上掷骰赌博。赌注很好笑，谁输了谁就被对方在屁股上踢一记。迷龙占尽便宜，十有七八是他赢，而羊蛋子就算输了也只敢轻轻来一下，迷龙则不怎么喜欢节省自己的力气。从外表无法看出迷龙只是个上等兵，因为这货穿了件并不合体的校官服，为图凉快又撕去了袖子，下身是条轻纱纺绸裤子，加上裸露的虬结的肌肉，看起来像个刚干了一大票的土匪暴发户。他赢舒服了就给自己扇两扇子，顺便吃一片羊蛋子早给他切好的西瓜。少尉李乌拉在旁边怯怯地欲言，但总被迷龙例无虚发的向后一肘子捅回。\n" +
				"　　对同样身为军官的我来说，这场面叫人气结，但显然有更多事更值得人气结，于是我拖着腿径直瘸向属于我的那群。\n" +
				"　　上天有饥馑，我们有教育。我受过教育。不是吹牛，不辣那样咋呼只能分到一颗铁花生米，我们这些有教育又有军纪的，则成立了觅食小组，一群人觅食好过一个人觅食，反过来说，一群人挨饿总好过一个人挨饿。日军把我们打散了，食物把我们重新聚合在一起。我是这个组的副组长，他们是我的组员。\n" +
				"　　郝兽医在为蛇屁股检查他胳膊上的一块溃烂，他是望闻问切加摸心脏看舌头，主观加客观地乱用，可以说他用尽一切在无器械情况下能用的诊疗手段，但没有任何治疗手段。老头子五十六岁，或者说，才五十六岁，就被我们不客气地称为“老头子”和“老不死”。他是我们中唯一的医生。没人知道他算医官还是算医兵。做老百姓时匆匆赶往战场救助伤兵，然后被伤兵裹挟进溃军大潮，套件军装，便成军医。他的医术很怪，三分之一中医加三分之一西医，加三分之一久病成医。他从没治好过任何人，所以我们叫他兽医。\n" +
				"　　蛇屁股及旁边在等待的两位候诊者也只是聊胜于无地在打发时间。他们希望得到治疗的心愿是虔诚的，但对眼前这位医生他们是不信的。\n" +
				"　　蛇屁股横挎在后腰上的那把菜刀，脖子上挂了根绳子，绳子上串着蛇牙，牙的主人早进他肚子啦，而这玩意儿被他当驱邪留了下来。广东佬儿蛇屁股为人所知的事情只有三件：一、他打过淞沪之战，老兵；二、附近能找到的蛇已经被他吃光了；三、他把菜刀放在身上，因为他爱做饭，因为放别地儿就会被摸走，因为没饭可做的时候，菜刀可用于自卫。\n" +
				"　　豆饼瞪着眼睛被几个人围在中间，他在做实验小白鼠，他从要麻手上的一把草中间择出一些，一根根嚼，千万别以为他无聊，他真指望那能充饥，只是从表情上看他也在怀疑人能把这当成食物。这是个十九岁的河南佬儿，五年前他下地割麦子，被某连长征做马弁，开始生平第一次远足，至今没能结束。他所到的任何地方都是从没到过的地方。\n" +
				"　　要麻在观察，表情随着豆饼的表情变幻而变幻，尽管他仍坚挺着给豆饼以鼓励的表情，但如果不是那两位旁观者抱着一种“反正不是我吃”的心态，仍在给他手上加入新的草本植物，他可能早已中断了这的研究。川兵要麻和湘军不辣是磕头换贴的弟兄，但要麻远比不辣来得谨慎，所以不辣在外边叫嚣而他在这里吃草，所以不是他吃而是豆饼吃，所以他是下士而不辣是上等兵。\n" +
				"　　我屁股后的康丫开始他的又一轮索取，“有火的没？”\n" +
				"　　他问的是郝兽医，郝兽医掏出一个布包，里边妥帖地放着干燥的火柴和其他什物。康丫有了火，叼上了烟屁，开始在身上摸索从我衣服上拽走的扣子。康丫是这个山西佬儿的真名，我们热爱这个名字，因为它比绰号更难听。算命的说他若叫男儿名会活不过三十岁，但换了名后康丫坚信自己活不过二十五岁，他今年二十五岁。他这回问对了人，郝兽医治不了人，可总在收集别人也许用得上的什物。\n" +
				"　　康丫执着地继续着他二十五岁人生的没完没了，“有针线的没？”\n" +
				"　　郝兽医收好一个包，打开另一个包。这包里是针头线尾，甚至被老头儿细心地分了好几种型号和颜色。康丫属于那种没得给不会生气，有得给不会言谢的主。我擞开了他的屁股，打算挤在郝兽医和蛇屁股中间坐下。\n" +
				"　　迷龙在那边鬼叫：“我整死你！”\n" +
				"　　他那边发生了一件小事：迷龙终于不耐烦李乌拉的磨唧，在一声暴骂中转过身来，用肘弯夹住了李乌拉的脖子，在他后脑上狠捶了两下，并且还没忘了对羊蛋子下一步行动的分派：\n" +
				"　　“啥玩意儿嘛？苍蝇？——不玩了，你去搬货。”\n" +
				"　　羊蛋子屁都没得一个就去了，迷龙对他的统御力是拳头上的也是物质上的。迷龙放开了手，李乌拉直挺挺地躺下，迷龙回到自己的躺椅上，李乌拉扶着墙蹒跚出去。\n" +
				"　　这只是小事，我继续坐实我的屁股，而郝兽医帮康丫找到了他要的针线。\n" +
				"　　我们尽量不看迷龙，但我们又没法不看迷龙。东北佬迷龙和东北佬李乌拉是有着宿怨的，好像是李乌拉做排长时虐待过上等兵迷龙，后来又把整个东北排断送在日本人手里。现在迷龙今昔对比，他是此地三朝元老、黑市老大、赌棍、恶霸，有拳头和罐头、概不赊欠的衣服和食物。尉官和校官们很想恢复尊严，可如果他说校尉服可换罐头，我们立成赤身裸体，那只好免谈尊严。好吧，反正迷龙也当我们不存在了，我们确定他不会再起来揍谁时，也就不再关心他了，反正我们没有什么可以跟他换的东西。\n" +
				"　　康丫已经脱了衣服光着上身，但根本是连穿针引线的本事都欠奉，他开始跟我磨唧，“帮我缝吧？”\n" +
				"　　“缝你那嘴。”\n" +
				"　　但是自有人帮他缝。郝兽医把衣服拿了过去，熟练地穿上了针开始缝扣子。\n" +
				"　　“今天吃什么？”我向着我们中间最有数的人发问，郝兽医便从针线活上抬眼，豆饼仍在那里艰难地尝试百草，他几乎是台会听任何人话的机器。\n" +
				"　　“副组长是你。你不知道我会知道？”然后老头子忍无可忍，发他并不吓人的老威，“你们别玩儿豆饼啦！真当牲口吃的东西人就能吃啊？”\n" +
				"　　要麻呵呵地乐，“试试嘛，他不是没事嘛。”\n" +
				"　　豆饼忙不迭地点头，“没事，没事。”\n" +
				"　　但要麻几个总算拍着豆饼，让他吐出那些已经嚼烂了的草本纤维。\n" +
				"　　我不关心这些，尽管我在东张西望，但其实我什么都不关心，我只关心在我这副组长不承担太多的情况下我们能有吃的。“组长呢？问组长吃啥。”我问。\n" +
				"　　蛇屁股指了一个从我的角度不好看到的角落，“唔讲了，个无笱用的想煲木头汤给我们吃。”\n" +
				"　　我转过头看到了我们的组长阿译，他在那个角落里浇他养的一棵花树。在这样的境况中那样细微地浇一棵花树近乎有病，但阿译就在做这件事。阿译，我们中间军装最整洁的一个，如果我是落落寡和，他则干脆是自闭。他浇着那棵花树，甚至看着一只像他一样和这片灰头土脸格格不入的蝴蝶，似乎那是他全部的世界。忧伤在他身上并不让人同情，因为他的忧伤让人觉得抑郁——他看起来与这世界格格不入，这种格格不入并非说他是一种简单的娘娘腔，而是一种更致命的永远无法投入，却又永远飞蛾扑火般的投入。少校阿译，来自锦绣的江南之地，三青团员，某军官特训团成员。别被名牌吓到，他是这唯一的校官没错，可也是这里唯一连战场都没上过的青瓜蛋子。听着远远的炮声，一路从老家退到这里。现在他信奉和恪守的那些都已经碎散了，他试图用他并不存在的能力和个人魅力让我们重建信仰。\n" +
				"　　这就是全部了，大溃退之后我身边剩下的全部。\n" +
				"　　康丫的问话结束了我悻悻的张望，“有吃的没？”\n" +
				"　　破旧的军车从收容站外拖泥带水地驶过，喇叭声在做着鼓舞士气的宣读。禅达因为充斥了太多溃兵而正在成为一座混乱的军事化城镇。\n" +
				"　　“……倭军之三十三师团使用迂回穿插之战术，以两连队兵力攻占拼墙河南北，而我远征之军以寡击众，披肝沥胆，做浴血之战，解救同盟之英吉利军七千余众，夺回记者教士五百余众……。”\n" +
				"　　它所说是四二年四月中的仁安羌之战，第一次滇缅战役中难得的胜仗，但这与我们这些收容站里的弃兵有什么相干呢？\n" +
				"　　阿译终于开始履行他一个组长的职责，他刷刷地在一块木牌上写字，但用身子把写的字挡了，他写完了我们也看不见，因为他把木牌反着放了。\n" +
				"　　我们拉了个开小会的架势，看着。我们很不耐烦，大多数人脸上带着“我真是太给你面子了”的表情，这让阿译紧张，他喉头蠕动，眼神有些发散，他求助地看我，而我在眼观鼻，鼻观心。\n" +
				"　　杜绝热情和永不言信，是我这种人为落拓人生掘就的散兵坑。可阿译没打过仗，只会把自己扔在射界之内，永远神经质的紧张，生活没给他好事，他闭上了眼，偏还说一片光明，因此他的命运非常清晰，就是永远面对我们的否定。\n" +
				"　　在否定面前阿译几乎连控制语音高低的能力都要欠奉，经常在假声中带出一个失控的尖声，他边说话边用写字的那块白灰在地上做无意义的划拉，连他自己都在摧毁自己的自信。\n" +
				"　　“我军即将大捷！这是肯定的！——我在上边的朋友告诉我……。”\n" +
				"　　康丫连挠痒带哼哼，“谁在上边有朋友？”\n" +
				"　　蛇屁股很高兴地接话茬儿，“上边，上边。天上。死的。”\n" +
				"　　呵欠来自要麻，几乎看得见喉管，这样夸张的呵欠要表示的绝不是睡意。\n" +
				"　　阿译，不可否认，他有时很坚强，“")) {
			System.out.println("yes ... ");
		} else {
			System.out.println("no ... ");
		}


	}

	private static boolean checkKeywords(String[] keyWords, String content) {
		TreeMap<String, String> map = new TreeMap<>();
		for (String key : keyWords) {
			map.put(key, key);
		}
		AhoCorasickDoubleArrayTrie2<String> acdat = new AhoCorasickDoubleArrayTrie2();
		acdat.build(map);

		long start = System.currentTimeMillis();
		List<AhoCorasickDoubleArrayTrie2.Hit<String>> wordList = acdat.parseText(content);
		long end = System.currentTimeMillis();

		System.err.println("times: " + (end - start));


		long start2 = System.currentTimeMillis();
		boolean flag = acdat.checkText(content);
		long end2 = System.currentTimeMillis();

		System.err.println("times2: " + (end2 - start2));


		return flag;
	}


}