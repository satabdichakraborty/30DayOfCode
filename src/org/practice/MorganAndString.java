package org.practice;

import java.util.Scanner;

public class MorganAndString {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String a1 = "JACK";
		String b1 = "DANIEL"; //DAJACKNIEL
		
		String a2 = "ABACABAY";
		String b2 = "ABACABAZ";//AABABACABACABA
		
		String a3 = "ABA";
		String b3 = "ABA";//AABABA
		
		String a4 = "ABAY";
		String b4 = "ABAZ";//AABABACA
		
		String a5 = "YYFEYGJNGPSHBGMMWWFZSULIIRNRVWEKMHVGHCYJLDQZYWQZHIKQUNVMRJLIJRBBFUTYUXWUJUUAOBMMYKAGEVAIENBOFOYMIIGDDYCGTRMPNBHPBMOZZIZLIGGGLXKELIMIHLBWOSCAHSLATNMFRRGSFOLHLESGELGPKNEEBCDNYOVDHRRWUEUTCZMLJJLBMQYYWGTDLEXGSTGGIPDPYKCWCSMTBCDHYSMAAQPEUNCFERXEXYCESJPCHGBDLFLYHNSNGSFZMNWIBZDIUHWJTAIQDKLRLACBEWKTISQRIINCFJUJMFXNEDRQIOMQIGGELBLKTDZFXRNXCIRLNVUTDWNAZHIYYVCOTTJMDYOVSTCFSULYKYXTSRLHIMUAVMIEGMMREJOZEURJHCPFCDOJVPZQMQOIIWZKZRUTDOLMVEGVIKSCPRXTPVMFZZSQHFJTHDTESPXFDITHROAGNEKCOBEDSURBUQOPUFOINOQCVBXDWYIEGXGHYJOHSNKZSQHDASNRAVMSFCFBWRXWQGVUYIQXZBRNVDOWHNUVQOGXBFTZBNYTGQNXERUVEBXERPMOFZZTTQIBTHEAERULZHQLGORCWUGQTAZJVRMJFWZMKMKIHTJQGUKNXVBHWBMHBYWSYMTTLYUSXSBRAAQRTRWDDGLCKITLVVUOVRYKNXENDGQGWKKZHLYJEMNACIMZQLZHSLIHEGPVKEHFDIIDZSCNTRQSOPHYONIVCJZGITEQFORUDANFZTKCMQJIZSGMTYOJCIRLVBPWBNLMWGWXEFGRTTACLGXHJWSYNKZHFEQQGIASKGWTJHGMGDIVUKQYVUZLHGXSSUDIXSLQCRZHDIFRYWASPGCZFUUCYGFCDNRJNYKCOTUJMZVZJMTLCPBWNXDBASPEGXCWEPGRYRQKQREGDBQTBIEKSLXUUVNTGKUVLMVCJAFSNUDQFJBWEAUKQHXPWPRPRAEYDBRXOAMIYRTOFUZFIFEWONOUYUNYZVDQVVGAPWWZPKSPPWGXEVPAWXZGNXETNVDALQJSVDAVEGTPAJMCLBHNSJIDAVEUPUWGNPAZTVTVWDWGIZZRZYBCYPEKPRBAXSULHEFNUYYDIMBNJUXIVRXVOJQSDSVVJPMCGMALYEETPNEZWCHJJVDSJJXDPBGHKTLBQLXCJXZXRXKGJUVRWKGUXRKNARNZSYHIJSXWDJMJNWBOEOULZGBJPRIZXOUZTJMASBVFLYOFWVFQTDTVAAWNDPRMODZWEYHSEFHJFHCIURESNNRYDRWRHTAZMAONHQSKKDSDPZVRQXYIDBRPYEPHYYEMZMVGQMBNWINMWOFBZCEZSJFSBFKTQAKXOFTBGWASXPQWUPPSCXSIEPKEIZHXPKVNYOAQDXGPSHYLDOKKTLKPSXJNTVFRJMPBDVMYPODEDRCKDXFMIBWUXSGLJILLBRTBINFIPXCSZVSOZJFIAUUZJJCGZKLENRWLSMPEXUEMVNEZOMUVBFCRGQVMFLPWZQBHAHHATPEOEYKTEXTUJFIDBVYPYAYRSUTTMPDTNGQOWGAKRIVBUKXHLSNAMRDEMMQPBRVPQXLFMXNPDXBLOPVPFXAAOCSHZXRSASTGCYPENAXJEWQWTWUKWLIVRNAUWLPZJBBPFCOKXZAIWZGWRLZFZZPXBCSLDQDCDJXLISBXOTKKIIIYUDAABNEUNWCAOBSNHTDMDUNDNHOIXHJLWOSBKAXSUVRNUBOPJAWSQPODQGCYNQMKXIFKSIHLXHLETQGPQILSQBJKLFZUQOSLBYDCUYFATLBAZSYQZUXMXJJVAZADOBXMCPSCCCVQIEQGIZYQAYIJFPHGDJBQHOOROEBSDTCVQLFHNYELEBDKLCQTYKSBMLBEZKWMFBNRQSIOMJIYCLWQBWZDDTGIIXYZNQCLOEPFRUAMDKLIOLPSTRICAHRANSFXZDPJVKTQESTHZOHFJJKBQFCNRLJURJSOQONKPVXNIDLZOZVQMTLASYQBROSQGLQTMYZXJPQORQIZCWODOIMUDQZSZLGSGQXXARRRAQMTYMYOGFAIQHQSQDIPDYIHKOESEYDWJWPNQZOGOYEDCHTSRVZSMSEPOFIFJRJGFRRZJFGJIXYASJRRUUHWUPRMAYKIUFNASBGLTQIKDQMFFCYOTWRXQKKRLGJLGUDCYCPZLCGLNJTRYBOGZGUOZHMNDQNQQBNTWVGMTUSWOSUDQQAAGEDIIRSSCFBZSDMEJEGTHVNOEBLGVLCBOZCPFDQWNDOWEFMBDQKLNUVACITWAVKIMNCMLEHDQMKEFABQXRZMTNMEXKDPIPOMWJSDZNLCHSUSWJOTSSMODOQCABEATEWKKLZUZNEMPYKJSDYXRXXSVMNHFOZKOOJKDUCUSNTPOURPUDJWSLTPRZBDELNDIMFHDXYERIGXYDXYIWUANHZGFSRLBTGTOMGBUUNVWVSDSNIVZFDBCTYXVURRNQVNAMUIHZMPSVSKYFRIIFADCPBYDZBBVFVSZLJVAKMCMFKEIJGQZRCEPJSZYHNIULHWIDMAHJRYEUCLRPKAQSNPZNEXYTJJQGCAZCVAEIVBBTZZZDNKIOIQJDSLLEKONKOVOLSAKHTTYOFZOPXDRQULLJHQSNQZDNALEPTIBMTPGSGYKBMPBQWPTEYXCJBDSNWURLGKTNKXRKAMIFRGSJVSCXVUXRHYPQQFNIBOVNFUIDVTGFWZCTVEWQFXEKCHYOGLESHFPYRFKVBGALGFPNDDBKPGIKESRDQAMUWATFZOLHBFRBAPHCVLCFOWAZKHHNXQVAWXEANYUXJOLBBLQLPUBMDCXKIVHNLWSVZOMGALMMLHGSXBURHQMRWVVLUUPKVLMIVRZRXXJZTQVOVJPRAONJYTYVRPUKYIHVRJSHACWZNHMOSHBCUPFOMAREYTJAADWTFPPKEGAZIWLQJFBNYOOAJCRNBWNKMIDMXZMBZFJRQVTDVKTFJSSFETVQPQUKJXRIZBGWPKGHBGUNVWNPAASJKXCGEPETASRUFENWHYKORHQJUIASCGAMNFGWQIBZCPTJZLXBAFTEUWHASHLWPFAOEHQLQADNEJUUSEDNGZCBKAQYEBUMIZVREUIMCJXVDKVKUHBVDACEIXNDZTEAJCRXAVVULFIVLHHCRWVFBSCDGDIBXFUVOPCYZYAKWEKXRRDRVKNGRVGJCTCSHPRTCIJOJKPBUNXRSQTCKYCSEUXCNOZYTVMXVCUUJCCCSJXXSYRABKYPWEIUSOATNRTLIQFWYANOQMKLMYUSWODYZJDKVXJSSNIDWBEZJSQKVKPMYPNBZNQPSLVIVLUKZSMQLMETFVVSDEOIFORNYJHPVUKSCBLXMXYNVQKNLRSBONRSNNZVQISSFMXZMYCUXNLNPNBJVPBDKFLIGQRTLIKNDXFMFCYYAEQXTXVYOIUVXCSOJQEAGFZQLQVAOUWFIKHYNYRDTKBLIMTFIWGSYNJLYKGIJYQMWSLPJSGABWOQDMYVZOGIRCRITBEMIOBDKEZCFTWRZMVYELXDBIDXFFLTJPWVTNCUYNDDRNDIBRQBUNIMXSLIJJJCRFNDSVIHIKEHQFWPIETCUQFQZGWPRHXFUKPBCMTCHHHUCRSMTHOIOXLPVCYCTWQYWHELVVJHGXYHFRJXRMUQPBFJUPLXHRIZSMNSNPCMNINEDOTNHENFXCXEYCIOJMDFNXIEIWVPCIFSKSKDHUNGIUTCLHCWNPITQNVIISCGECMVLTCBOEVAORRPJSGYOTZLYJKOHEPDFJQCWIBKJNOPOMREBGSPQFGMJFEBQJDOOMPAHIVTXWFRQAEUBCX";
		String b5 = "PTOOCXUIRJCFOTDKIMTSBFEFEJEFSJEEFJBWCARWUSRQHYZUBRLUXKCXERGCRZOZUYTYEFFYHKSFIXFQWDSDIMIEWJKKPUBSXCVLLIDHMEUPGKROCIKJVMYQLRCFYRHLMNTRKKMOKRUEOLMYBWDAPSNMJZIOPJMRVGJWFCDKFZPXHXHLVFZKHQAERSMLEGDIOSQQTWGYBOXFSMYUISWXGVUHWFGKJNOFJBOJRJDBEWUGLVMIIFDFGSZKPQACAELZIVRJWTEYSSZBJNYOIGTIKWRMDNNZFHJJUZYOVEBFPHUBOWHTOISMBPJCCREINKFWRZRWCKDDQJVUMDNDSMQBGPNTNADXERHPLWSLGZFOPZBATKZPIIHTYHNMYXEWHUKTRKFLOHXLYHJFOPSAWGJSDATOZRUZFYHNKJBKZVCAHZGJUMGHPDRYODMUFOUNFEHSAAYTCCAICELBKXAENDQWOKVPFUUCIRNESGIGPGECWEPIVOVATECEEDVMNBRJCPJMABIOPXVZREHKUAJHADYPRFINCUUAAOPAIRIGVAAYTCYOEGVOZBZQGHZLIBCTPDQNRDCMQWUEWGCXRDEQAMENLTNOUSDESZKSLZJRFQXAQTBJWVUWKKJZTRYJONNYUQNZLLTIDYJXUOVZKUATPSEDJKZEPGCBZGXXCIIXRKPSELAHUZHLYGRFYRNSYZXSKGVOIDNYLBIGCUNHRMWDEXLDTALQTBSWKRKATCOXHKFSAOYSRSLLZEUBOSFRCMLLWFFSKNLSXLHKETNOTCDCMMSJOOVLSETXFHYRJVAVEFMVNWJOQKHNQIADMMRGQNCAVIOYMIKOYYZHZJAUBFXFZNYTVWAXKOOPNKYOZIPHQIDVKKRUBLSQVAAOKVUBFKIVGBYIUOBSJFSFUUAGFABRUGHVRADIIFWPXYLTXZFIQPTGBRNIFXEXICJWRTAUTYUYDGQAPRRMYMFGTOIAYFEBAEMSFJQAZLJAWJXYQQHEMOQHMCNJZFGDAHNSULCRWMPLRGLTGNWPCDXKXXHBKDGJINQIHLOODEIXRRRUBZGTPTDXIZNLPPTUNCDBSJNDDGOJFSFRVAFKIZEEFWVZFLUZNJANQSQHRQELUTAJLEATBXXHHNPNCNBBJDQASXPSRSCMTORWJSRGXITKIVPIHJHNKIHMBYDPQPUQZRUFDWMGQBYUPWHMVYLVOGZFIGZWIFTUWAMETGSBDUZLAYGECMTHLEXNMCAEPCZEDVOVNRPLQRFFXXYPRYYEGWNUNYASBLMMHWPRGVXULXKBASODEFTNWAJYIKLXYJTCAQHMMWPAXHDKISGUXNJTLPSBGROIREICFLZUCKRZAPPVTTAUANHKKMUDYEXEQKDYSAYQTHLADSAMOYTFLRJHKPTIJHASJULMBOYBKZRPWTNCCDXRZWNMLOOGVSHZOSWOMXERATOXPQPMYYUKUXEMMYNXHCPSRUMQPFRCPXSOHTDTMSGGHVXRCZUOISHEHRAIFZXVEBNEYDAPTZABXPJURDJPNIUAOMQQEOHUJVSEXHCSZUEYFPPCZPDRPLCIYHOIJXMTEATGYXPXQPUUUXNUSOQBXWMPJMTYHCQNSLGHMIMPYWRBWFFFMKKPJRHFBEHHDDOUDQMESBIRXETQWCUASNWKSFNRUPETIZVDSYTDMQUOBYALDOHMYSAFVQVNZIIRUBUYKLVCJXJPNICXMQJGOPXCBUGEQLVWMTLTOPXZGBRBPYOGIAZZCVJVRZUPXSSEJHHXRZJSGJYYBLJNNVFTWOOCZNYJKUWGGFZKLYZDKVVQSJQMCGYLFMAJKOTQTCPXQBXIPCVWJFYSRLLDORVPTYDMBPWCDYHBTTDSNNYXEWTAGTEOKTMKEREHJDXIGOSSAEAHNGEUBZKXAZXZTEYEWVAPTCTHWRYEOLSCNNNNJDWJRQPWZNOUDUNFXUZXBPWVMAHCXUIIZQGXMHHXPIOSEZXDEZTEBGPNZBXVEODOJWTBDCGYYLBQRUOMJDYRQBNSKRAMWWGBECTCRBADLCEZOSSZHUKNZTWVXRIJNMGQNXDFDFFSHUFVVTOEJXERYCSBJOPVLUFNVIUZJGDAVUFQMBWGNXVNFYBWLYPNUYBBPHAZFAKFQLPZFVDFSUAMJGFFKNBQBTBYIGCEAQZOWSVFHXPBPMGANOBXZONMSGZINYPVNRDTSZEAICIAXWLENAYUICDINLZPWPDDKTDFVDDIADGEBRCMCYGPYZQFOIOBQAXDMYGWRIFOTENRQSTJOMVIOWHILQMICICLBXTJTXWYNHOPDVPQZCNNFBWGPSHCXRXVCSPPSDOULEMQSYVWSKJQSUOMSYOZASWKZBXGJOPVPQRQWYHENELZHPUNWOLVJLZWLXVCXFKJTGPBAMONZEBAXGPKJYIWDHWJFZFDPCZPRYWLUWPYJMKXSHWMVTXYFEGXTNQJUCIJDEUANHTSCOYSIYFGJSLRALJDDLKUKOYWGWIKGDKYPRHXLZIPSJWCNXXRUOLWALEUKTGQSYLBGHXAMYEAIEGHWKXVOSSWFQXKLYZWKGLCEUBDRWGCYSEHSLSEBSRVYZKJPFRJTHSTRZYGOVXNPIUALOZJNHEDKGJUUVUFSLZTJZDQWGISPWEZHNUDOKCPZRAEBONTPFLYKGAZKWBFNWREEHGLCERMQXIQSQQNVSGXVKKOWRUXWMTXEHAYTWZCOCVRZSVPDZRIONWVKJGUYBGWYYGFERLMMBXYAUMTKADMQGYBURFLLMXUGQXTTGXWFWQWHXUPBDWYCKGEHURLZBWUHPMJCIZOVMXHAPXLKYHNVBRDMOEXMSZSKBSTQXMABGJCHEJNMSNQWRIDPQFRJTEURMPCEQUMAIVVDZZJSELMTFKEOVJLCFWDBUSSQRPYXLRBIBJDHVJYRRKGJTFQZZFYLIQGJWTCJFIKWGFDYUVRCDJVVETLKVPTGADYHIREUDFVSUZRJVZCKPMTZROEOYNZNRNPMKNGTLKOVGWIXICWJTNLTRNJJOHLLWHGJWHCLTCAHMBYHLWWUHGOFUQDETTHTXPYKMQQLPIDBGKWMLDXLKOGGBKXOKCERJNDAHCSYUAAFZXKDFOSOGPHACUUKFEGEMPLURRKAPVOSWEJUMUBBHQJQRGQTFNLPMTTHIYTGTIGKFVHOEWXMPVTLMJKXYWQZFPOWBNDMPXVWQQKARTKGBYNVBWEPCHZWPXNLRYRALHQFMSILDTNBUMENMCRFCMPZMTZHKYZYKPQNSQXKGCARAFKGJXTZRQMKXXWSIPMQQUHOUAZACZEIIJQJWUDLJJKJBMMWWZOZAURDYQCMWIGQSIGDJMSOAXZOHHEJOCJVLALOIWSGUTBPKAORTJHQNTPKDUUMMLZBTDLFPRNHTYUJBWGASONFQRYVFQXTYGRSRDXGKHBQUMOBNVICTZDNSTAEFFBWKROFVHUDHMOXFSOBNPQGNRCCPDANQSTPTPNFKXEKGDEPBZRZRAANUNFNVVWEZYZSEKTEDIEXJOLNHHUWFUCQGCVNDKTBROECEJUVLXLZNRCEDZYRGVAAQXEGADHXMYROCEEFVPCEVUTFXUASVQABRIQVEEDQGXPQWDHWDFSKRELBYQUIQFDEEXKTRVFVPOKHCQMBVXOHVFYHAOLBVIFMHHSSQAMTNVWYZBQOZINPCPTFONPMZYXTGESRPVDNUVMRVHFKGJAJLXYCFBTZQJBMCKQFMJIFXXHNMIWDGAWJUBRXLXRLBGMXWZRWYHMMXHNXTVLLSFKLFMOVJECZDHKJUOXAGDERSWQPAGGPELZLYYXTLYTXNGAYGMEZMJIXOTLLVTMDTISQIJIDUYZTFDLEOOPRSNWJUQFRDZROYIUGEVVWDHPCJYFSQCFXVXOSHCHZBIQMVNJCEUSFECEJLSCUENHJAWMNGUXEUOPHJYSXQZFXXHXIPSGTVISREMNWTNIWXJOCMMXETRGVPKVMAADBIPZVUTKGUDMLTMDBLQXKCABLTXHOEBTPHLNGZEZKWBVTBRCRMOQPDWBYRJUIAKEIKLBMRBBKEIITYCSOHHZMURSVCKZLIYGEMDYCIUKNAQHBNAVNOGNPRTVTFOVNGTPKOCMTGEXFIKYERNSHSLXEPDKLAMFFZLQHLFMKXRCKLZYNWZBSEJCPZVWBXTTQLEYCPSQALXCGCTITHBQTFXNVJIXONSITFTFIKGBHGNBBVNFJKZXBSGXENGFBDCCMIVSKHODIPPREZSETTVLVDYTVCHODDLNMQZNQBMFLWTCFRSEKRMUEXJCZYFKPPVSDVVATMRLKHMUVXYIWEIVHIBJTJUHSWHNRLKYKRCRVVWLXWNETVPPDZRPMNLDVPCYSVLPCQQENKBVCAPXRLFIQNLGCSRCENPKYOWYOLNUOECOBNVPXFDQLGFNOWEKKSHOGQDDWGQTOBFKGFODZKOZJRUASPQVCQUDWTMOPZCOPBMZGOVRCRHLOKZEARNXSZXWCZTLAWXKPSBPAKMSHMIYXYZJDGXARLZSIPJMMNIRXBCONYYATTJMEQIKVGXIGCQWOMYHCIAXLWOCCHWKTOKVXJFYPHBDSRTAJEDORRTZJJEILFSIJZYVTOZMCIGMIUJORDKQFXADPPOEDAFBKCINFHOUIVCZPSSPCGZLRQITDQMRCPRKWDXQPODAPQTBIYLHQMJKWLHUJUGCWNBGJXKCPTJRSSWLRYJOFJUVTTMEDYITVFICGORWHNFWDUFHLCCXZXIIPUUAGBXNXPVZFGEOPEFFYGQDTFFWVIJSMIUCQTWPHLREXGHHRJWYFMBBUCHAXFIJBEAIZOJBZIUHRYYNUMGWKULAPDOMHPNGHZDHCVMRQRZOUQVLHWKYFZUBUHVNXIYYHRDNSLBHFITOTSKZYGZTZAKRQXJCBCQXSTHKXOIJKGIXGUODMWDPWPCVGTSECYFXYUYPYEAOMJWFMGJPKBUBZYAVNLBWAHXWUSMRBSRNKQYTJHGXGDETFAKTKQFBLZXETFBXKIPYPIQTBFNFMJXGZSYHZTBCZOXFKKLYMKRZESUKOUILLFDMTAPGVAGCMYFJUKWOZPVQUROHUUFNXHEIFMQPXAOUIMCPHXMKZWHWIXRDMWWZMBGJPEDQSEFSYDMWGMXAOBKDUQMNQXIQQKZATBYWTKUEKVXEDDBRUCMRJOKMWNUOKDRWLKBFIAAZIMDYUIAEFLTZQCJRAXUCIFMWNNWPETKRFVTFPJJEVLMJSMMFGRMYFFITYEZWVURPYYFDEEANNHDEWRQXPXCOWVPWEWZAVVJYJRNNCDHAZFYGCOMWXUYVSACUDBLWYTQCTXSFPERGNMALNTIVOSPVCOAAHNLSOZDMSZIJUZRMCGNLMUITOEXCAQPDWZBRYVZEYLLYWAFHYXDSLUWHZBFUJXATXOZOSXXZEHGMHIOMGSDOXYAFLXNAEHJZACSBDOICOAFGQTNDNNHJUCRUTAJNWLHFDVOBYTYMJNQKDWBOFKLFRLUMPQUBETXKUMHGNUASIYUEOOKZCMJTAENEBQKOUISALYSEPDBHSBREMHHEFWVHKNJWMEVQRHFSMNHNCDJUYZXREQJYGUQCOGOVHQNJCFSQGNQFMJBNOEPDONOQNETOKQBKWSWOUPRGXFTJPNUPDGRPDKZDWZKZLKHEQWBCGTLVJTHHTGCOXAFZGPRFJQPMEQXUTSBXPPZQFXOWVVGHMAUBSALJIXSHUZAVLPEUDVIKSASTRWVGSAMZCVRVRERZMMKYQZWFXGFEMXKQEWTOOIVSTPNCRJRVSVJUBWPJUECXWMSWNXNPOULARTYWCPFXBKUUOVDEJESCYLRCVPWGPMUKLBIGWHLNYWCJPXBNRQYJHSZWVUKRKPNTULBDCTZJIWKSCSPQKHOYFEIIFAELCBXNVRDSDNFFWULOZWHZNKWIRQQQIJNVKSUJNVRFXGTPZCVSLXAITJLGGOPCXIFSOLQSDTEENYQFGLZOEKUDPDBXQKKFBYFRBAPMFUXCZVYCNSAPSOAEMQKHPDWEDJGPFXZRQPGKSMDZTUWQJHOXAZELTDNRVDVNKFVYDYEQCCWGLVOILBEKIKTCCQAZYUUGCLEWSNEOUXDULRZBAFPJENHDTMERVQQHUKPPXGSZTBUSADJOPHFUOKIWWDEFHLWWULCHDHRCVJYYSKPZQBQPOUWDBZIOLOUKWSBGMAWUQBNNJJUFFSIUECDXCDYGREFJOVYXLYJJFKZFAKKZYHHUBDKLOBGBEDEYAOYJFJPMJLLGKTESLCGHJESARHXBSVZJNHUUYKXZEDLMLTDZFNWCHLBZJZCDNLLBLXJHLOUJPVHJGMTKIDURYNWUQMSVHQXWYATILDYGCUIJGLRNMLARWQXTKBXSAHPFMOIJXADRIVIQELIPJPQUCBZZEKOEVQEWFKKUUVPRZTBOTMSWTXSGULHBHGOLMZJCFFOTBYPPMJGTIZUYSIFJIMJCNDDSSHFKUHESLXXCYXFHXUNITQGDODMYVJHTCFOBVQWZMIJBLOYSXCHEOJYWSSHIKFINQPHCWZDERRKTJNDQHUFVFGTMZELEKFIQLGXUDERLDQHHJPWRUAGZSSVDFOPMSOSYRKIWRJCYOXPMVGITFMVENVQVFDDLMXWXUZJELNEJHGTINMIPXBZNDPDOOWPNJKDYABADZBYUGGBXRFAROYGUMSOYRHYEUTXVDKCLKNWTAFPONTMANZKNONHUDIUZCEERCOSRGFEMHSAZNTEXZPQLDTPVSHRNRGBHBGELGKHSRMTAHBSYYWVZBUGZDHFBKFOHVFUUAERPXPDYMWFWIECOHKEZZSNKJHTCNITONMTAFNRXCUSISBMJNOYZDHAOMGCXSTLGUQROEXTMXRTAQZLAHDKVAOBPNCSKXAQIRKTLUKCGAKWIHETUNJWLSSCESTHDKONDQXDGHMXODTVQQWDNVALQCWOFSGFMQJPSWQXYMEMZDVAATXVCGALAPOIIBLHJQOCMITKDJRCYCTCMJBVDCUOQIPYQFANBJWPKWGPVDREQLXRUWBDBDHSIOLLZGGPZQJVBTSWMMIEYZJLNOTCMTRTWBVAGYVRRJQVOSRRYPBPTCHPADIXZCUMPCDXKMTQSJLVYXWWZRFAIXQVBLLVCODIJGPLYKCZJDKHOHBNPOEFUNSXDXSEAPWFXEDLYGEVWQQPCGQLHJVJLQXIADAXSOFPHTIHAQLMUJYYJRQAORCHEWDETYTDPLQWTCFANKNEBORKRZJLQLPBJYQPGZLYSITAHPTJXOTHFSCHPVQSSCCCBZOGMZILGICQMPDIMLACNJQULPMLRQPVKFAFTVQFABDVYJDMADTEVPKZKSZBDOEOBJSIFTJEJOKRCOEYLMZYYMTGYQLXXYPOYGAUKIETIRDITVGCAOBIWQJPIVUCNKCKMOHLIFOJMKWKVQOLFNJQBSJNCZDNXMTNJOKRBJEREJDPNMFEMWUADIEBLAGPREDBEKHLJREVSNREGCTEOZCQQNEMMTDHJLWTEBMSWFKNTGKLYDHNBIPFHOFSOWEENZROOERJOWEXLHCUTESKCVUIAZSAEXVBTLVEVSRRZTHWLHWODSOWJUFXIRUGCMGKZOIIDNZJSRYALBXRYLDHPOXSNYGVEPMZRXDMGITSNJAXGPVFYGRMIPGLHGWIVRRAHLCTNPXRDFWYVMKZHQNANLEKFVKBPOTBHCXMSCQCIATGVSIJCKRLHKLGJVHICQHIBJGWXRCJVPAEPBMDAKLEZELFETDXXRONEVHONGJAYHGCGLLIRZNGGMPTLZFYEPQRMVQAOAFJCHRTHWHMGXUDBXGZSGKDGQZYWAETFVILMRQIPSWNZOQSJDPHIBMOXTLYUAGUKAUZEESRFQVKIQKYJYIGQNOXQMFARYQNBEZSGENTKWXVQCQASOSSYLUKPRMUNBUGNCZPOTBTDICMPYHYEOSJOTVKLUWYTIIISWGBEZHQOXQSMPIDGSFXMMWTDTJDEEEDWTCBKKYGGNRZJDVYYLCMQZHXCHYVYBAZAZRHWPVYJREXWHLRRNWXJRGFJCUWTUJEHSOMIKWZMDKOVSQZLGWPATMIJQXXPQOMKMRZOEXVTYJHIAJDTJNSZZYETFZQKSZBYWGEXMFETLBMPOWRRDSRFEWYEZUZYRAHDQYXPCTRYOVZYPTWCAZVBPFHFOLDDDNOVNUKJHVIYAWJLYAZIXBJBBMOMRHGSTCKVJKGDVDTKGVUFGKUACQZYNLAOWAKAKPLNWGZQQWSKIXEYLTEFQCLWQKRZRUPHFXXTZVZQNVDQQZUVSZIYBMBHYGLEDTSKVCGEAFDBHIOSJNQCZSCEOPEOUYDZROJHPPBWAKLNASBUYQWOQJBMWVWFPGOPNSGPQDFWSXXNYEWRLMNDNHUNZOHFTTTUUNQOCACZLDZZBMNZLZJUEGHZPVECETTQIQNRGXRGCOIKABJGGHIQKXXXXKVEXOQCVDEKPMSPBOJIWJVJRXCPTPTJHDPJIWHUWQLPJZICLGPYVKXJWGOCWACCPLONIVVYNCGUFYKEESSARIMZKWBIMTBSJJADUHKVHRPPXJVQCXKDMPMNIHSNUDEEJFHDIQWMBGMUBQNQLFLLNBGGEADFSSREFLRSXICBEWGNTHVQDCSOHFLJSKVJLCJXJIXMHVKMVQNCJMEFFHWWKEMLVHPUTNXLOUHNUGYMENOBYJGYDZQGWAHKPZDKUAIXOBYGRBITQOXOMDQARUIMLBTQCTBVODNATSAXTHQRFMEMCORPJYYTKOTGMTHNCSCRZYPLKZCRXSWPXZWEXWQPOGTPTVDZUDBXUREDXXWROTLGYVXDOYADLUMIPQMHOZFVJXHRLNWSBLZLOUKLIQLTDIBECVRIFCAYAVICXOIYQDWLJOCAFNABBYOQDCOQADIVRBHZQDGESILIAEFHFAEBFPCBSZIEHGRLMOSWNKIYIJWPOZTYWXPLKAQJJROESEATKMEBUEZBHDXRUTIZXKJPRFCKFSLCGUUMPFCSE";
		
        String result = morganAndString(a5, b5);

	}
	
	static String morganAndString(String a, String b) {
		StringBuffer result = new StringBuffer();
		
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		while (i< a.length() && j < b.length()) {
			if(a.charAt(i) < b.charAt(j)){
				result.append(a.charAt(i++));
			}
			else if (a.charAt(i) > b.charAt(j)){
				result.append(b.charAt(j++));
			}
			else {
				m = i; n = j;
				for(; m < a.length() && n < b.length(); m++, n++){
					if(a.charAt(m) != b.charAt(n)){
						//System.out.println(a.charAt(m));
						break;
					}
				}
				//System.out.println("Eveny character same till the end");
				result.append(a.charAt(i++));
				
				m = i;
				n=j;
				if(m == a.length() || n == b.length()){
					break;
				}	
			}
		}		
		
		
		result.append(a.substring(i)).append(b.substring(j));
		
		System.out.println(result);
		
		return result.toString();
    }

}
