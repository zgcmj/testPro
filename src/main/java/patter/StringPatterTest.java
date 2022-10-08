package patter;

import org.junit.Test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatterTest {

    public static void main(String[] args) {


    }

    @Test
    public void test1() {
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?)");
        String pattern1 = pattern.pattern();
        Matcher matcher = pattern.matcher("$7.217.58");
        boolean b = matcher.find();
        System.out.println(b);
        String group = matcher.group(1);
        int i = matcher.groupCount();
        System.out.println(i);
        System.out.println(group);

    }

    @Test
    public void test2() {

        //https://www.amazon.com/SONGMICS-Organizer-Stackable-Bathroom-UKCS017A02/dp/B08YQGNFMN/ref=sr_1_1?
        // brr=1&pd_rd_r=91091fce-401a-49d1-99b7-bd0bec2e0308&pd_rd_w=hyTHx&pd_rd_wg
        // =tMdNA&pf_rd_p=eca5c6c5-8f7a-49d9-8ff4-b407897b25c1&pf_rd_r=NJX4GMZZAEN08WEGZW0A&qid=
        // 1656638206&rd=1&s=home-garden&sr=1-1&th=1

        String link = "https://www.amazon.com/dp/B09VT14GF4/ref=sspa_dk_detail_3?psc=1&pd_rd_i=B09VT14GF4&pd_rd_w=b0bXR&content-id=amzn1.sym.3481f441-61ac-4028-9c1a-7f9ce8ec50c5&pf_rd_p=3481f441-61ac-4028-9c1a-7f9ce8ec50c5&pf_rd_r=BQ5W3H41RZTKXY3D24DY&pd_rd_wg=IKqA6&pd_rd_r=5557492f-1004-4835-aabb-c6ed4ae02e18&s=hi&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzREtHNkVWNDI3VzQwJmVuY3J5cHRlZElkPUEwMjM5MzA5MVhLVjg2VEs4NUQ4OSZlbmNyeXB0ZWRBZElkPUEwMTM2MjQwM0ZIWTBIVFhQQU9VVyZ3aWRnZXROYW1lPXNwX2RldGFpbF90aGVtYXRpYyZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=";

        //link = "https://www.amazon.com/SONGMICS-Organizer-Stackable-Bathroom-UKCS017A02/dp/B08YQGNFMN/ref=sr_1_1?brr=1&pd_rd_r=91091fce-401a-49d1-99b7-bd0bec2e0308&pd_rd_w=hyTHx&pd_rd_wg=tMdNA&pf_rd_p=eca5c6c5-8f7a-49d9-8ff4-b407897b25c1&pf_rd_r=NJX4GMZZAEN08WEGZW0A&qid=1656638206&rd=1&s=home-garden&sr=1-1&th=1";
        //  link ="https://www.amazon.com/Socks-Ankle-Casual-Black-Liners/dp/B07W7HNSCX?th=1&psc=1";
        Pattern compile = Pattern.compile("([/dp/])(\\w{10})(/|/?)");
        // 以什么什么打头，以什么什么结尾
        Matcher matcher = compile.matcher(link);
        //System.out.println("找到了吗:"+matcher.find());
        //System.out.println("找到了吗:"+matcher.find());
        if (matcher.find()) {
            String group = matcher.group(0);
            System.out.println(group);
            String group1 = matcher.group(1);
            System.out.println(group1);
            String group2 = matcher.group(2);
            System.out.println(group2);

        }
        //Pattern compile = Pattern.compile("([/dp/])(\\w{10})/");

    }


    @Test
    public void test3() {
        String imageString = "\n" +
                "P.when('A').register(\"ImageBlockATF\", function(A){\n" +
                "    var data = {\n" +
                "                'colorImages': { 'initial':" +
                " [{\"hiRes\":\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SL1500_.jpg\"," +
                "\"thumb\":\"https://m.media-amazon.com/images/I/41QmnwoIQAL._AC_US40_.jpg\"," +
                "\"large\":\"https://m.media-amazon.com/images/I/41QmnwoIQAL._AC_.jpg\"," +
                "\"main\":{\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY355_.jpg\":[355,355]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY450_.jpg\":[450,450]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX425_.jpg\":[425,425]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX466_.jpg\":[466,466]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX522_.jpg\":[522,522]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX569_.jpg\":[569,569]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX679_.jpg\":[679,679]}," +
                "\"variant\":\"MAIN\",\"lowRes\":null,\"shoppableScene\":null}," +
                "{\"hiRes\":\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SL1500_.jpg\"," +
                "\"thumb\":\"https://m.media-amazon.com/images/I/31GpyQgzw4L._AC_US40_.jpg\"," +
                "\"large\":\"https://m.media-amazon.com/images/I/31GpyQgzw4L._AC_.jpg\"," +
                "\"main\":{\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SY355_.jpg\":[355,355]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SY450_.jpg\":[450,450]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX425_.jpg\":[425,425]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX466_.jpg\":[466,466]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX522_.jpg\":[522,522]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX569_.jpg\":[569,569]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX679_.jpg\":[679,679]}," +
                "\"variant\":\"PT01\",\"lowRes\":null,\"shoppableScene\":null}," +
                "{\"hiRes\":\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/514cONZwtwL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/514cONZwtwL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT02\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/516GRYLOIvL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/516GRYLOIvL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT03\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/41CEyGEIpsL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/41CEyGEIpsL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT04\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/418K8gPL5PL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/418K8gPL5PL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT05\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/41kGnme44+L._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/41kGnme44+L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT06\",\"lowRes\":null,\"shoppableScene\":null}]},\n" +
                "                'colorToAsin': {'initial': {}},\n" +
                "                'holderRatio': 1.3,\n" +
                "                'holderMaxHeight': 700,\n" +
                "                'heroImage': {'initial': []},\n" +
                "                'heroVideo': {'initial': []},\n" +
                "                'spin360ColorData': {'initial': {}},\n" +
                "                'spin360ColorEnabled': {'initial': 0},\n" +
                "                'spin360ConfigEnabled': true,\n" +
                "                'spin360LazyLoadEnabled': false,\n" +
                "                'showroomEnabled': false,\n" +
                "                'asinShowroomEnabled' : false,\n" +
                "                'showroomViewModel': {'initial': {}},\n" +
                "                'playVideoInImmersiveView':true,\n" +
                "                'useTabbedImmersiveView':true,\n" +
                "                'totalVideoCount':'1',\n" +
                "                'videoIngressATFSlateThumbURL':'https://m.media-amazon.com/images/I/91iSU+SLx7L.SS40_BG85,85,85_BR-120_PKdp-play-icon-overlay__.png',\n" +
                "                'mediaTypeCount':'2',\n" +
                "                'atfEnhancedHoverOverlay' : true,\n" +
                "                'winningAsin': '',\n" +
                "                'weblabs' : {},\n" +
                "                'aibExp3Layout' : 0,\n" +
                "                'aibRuleName' : 'frank-powered',\n" +
                "                'acEnabled' : true,\n" +
                "                'dp60VideoPosition': 0,\n" +
                "                'dp60VariantList': '',\n" +
                "                'dp60VideoThumb': '',\n" +
                "                'dp60MainImage': 'https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY355_.jpg',\n" +
                "                'imageBlockRenderingStartTime': Date.now(),\n" +
                "                'shoppableSceneWeblabEnabled': false,\n" +
                "                \n" +
                "                'airyConfig' :A.$.parseJSON('{\"jsUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/js/airy.skin._CB485981857_.js\",\"cssUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/css/beacon._CB485971591_.css\",\"swfUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/flash/AiryBasicRenderer._CB485925577_.swf\",\"foresterMetadataParams\":{\"marketplaceId\":\"ATVPDKIKX0DER\",\"method\":\"HomeImprovement.ImageBlock\",\"requestId\":\"QDVXGGRVVP148SKZZVF3\",\"session\":\"130-6365300-3318505\",\"client\":\"Dpx\"}}')\n" +
                "                \n" +
                "                };\n" +
                "    A.trigger('P.AboveTheFold'); // trigger ATF event.\n" +
                "    return data;\n" +
                "});\n";
    }

    @Test
    public void test4() {
        String imageString = "\n" +
                "P.when('A').register(\"ImageBlockATF\", function(A){\n" +
                "    var data = {\n" +
                "                'colorImages': { 'initial':" +
                " [{\"hiRes\":\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SL1500_.jpg\"," +
                "\"thumb\":\"https://m.media-amazon.com/images/I/41QmnwoIQAL._AC_US40_.jpg\"," +
                "\"large\":\"https://m.media-amazon.com/images/I/41QmnwoIQAL._AC_.jpg\"," +
                "\"main\":{\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY355_.jpg\":[355,355]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY450_.jpg\":[450,450]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX425_.jpg\":[425,425]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX466_.jpg\":[466,466]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX522_.jpg\":[522,522]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX569_.jpg\":[569,569]," +
                "\"https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SX679_.jpg\":[679,679]}," +
                "\"variant\":\"MAIN\",\"lowRes\":null,\"shoppableScene\":null}," +
                "{\"hiRes\":\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SL1500_.jpg\"," +
                "\"thumb\":\"https://m.media-amazon.com/images/I/31GpyQgzw4L._AC_US40_.jpg\"," +
                "\"large\":\"https://m.media-amazon.com/images/I/31GpyQgzw4L._AC_.jpg\"," +
                "\"main\":{\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SY355_.jpg\":[355,355]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SY450_.jpg\":[450,450]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX425_.jpg\":[425,425]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX466_.jpg\":[466,466]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX522_.jpg\":[522,522]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX569_.jpg\":[569,569]," +
                "\"https://m.media-amazon.com/images/I/5191RxtzhjL._AC_SX679_.jpg\":[679,679]}," +
                "\"variant\":\"PT01\",\"lowRes\":null,\"shoppableScene\":null}," +
                "{\"hiRes\":\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/514cONZwtwL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/514cONZwtwL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/712pUDdM52L._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT02\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/516GRYLOIvL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/516GRYLOIvL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71GFAEY30rL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT03\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/41CEyGEIpsL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/41CEyGEIpsL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71yvFKPd9uL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT04\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/418K8gPL5PL._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/418K8gPL5PL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/61SnSw8oMEL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT05\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/41kGnme44+L._AC_US40_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/41kGnme44+L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX522_.jpg\":[522,522],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX569_.jpg\":[569,569],\"https://m.media-amazon.com/images/I/71n0T0LtqgL._AC_SX679_.jpg\":[679,679]},\"variant\":\"PT06\",\"lowRes\":null,\"shoppableScene\":null}]},\n" +
                "                'colorToAsin': {'initial': {}},\n" +
                "                'holderRatio': 1.3,\n" +
                "                'holderMaxHeight': 700,\n" +
                "                'heroImage': {'initial': []},\n" +
                "                'heroVideo': {'initial': []},\n" +
                "                'spin360ColorData': {'initial': {}},\n" +
                "                'spin360ColorEnabled': {'initial': 0},\n" +
                "                'spin360ConfigEnabled': true,\n" +
                "                'spin360LazyLoadEnabled': false,\n" +
                "                'showroomEnabled': false,\n" +
                "                'asinShowroomEnabled' : false,\n" +
                "                'showroomViewModel': {'initial': {}},\n" +
                "                'playVideoInImmersiveView':true,\n" +
                "                'useTabbedImmersiveView':true,\n" +
                "                'totalVideoCount':'1',\n" +
                "                'videoIngressATFSlateThumbURL':'https://m.media-amazon.com/images/I/91iSU+SLx7L.SS40_BG85,85,85_BR-120_PKdp-play-icon-overlay__.png',\n" +
                "                'mediaTypeCount':'2',\n" +
                "                'atfEnhancedHoverOverlay' : true,\n" +
                "                'winningAsin': '',\n" +
                "                'weblabs' : {},\n" +
                "                'aibExp3Layout' : 0,\n" +
                "                'aibRuleName' : 'frank-powered',\n" +
                "                'acEnabled' : true,\n" +
                "                'dp60VideoPosition': 0,\n" +
                "                'dp60VariantList': '',\n" +
                "                'dp60VideoThumb': '',\n" +
                "                'dp60MainImage': 'https://m.media-amazon.com/images/I/71AkHW5Y4XL._AC_SY355_.jpg',\n" +
                "                'imageBlockRenderingStartTime': Date.now(),\n" +
                "                'shoppableSceneWeblabEnabled': false,\n" +
                "                \n" +
                "                'airyConfig' :A.$.parseJSON('{\"jsUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/js/airy.skin._CB485981857_.js\",\"cssUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/css/beacon._CB485971591_.css\",\"swfUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/flash/AiryBasicRenderer._CB485925577_.swf\",\"foresterMetadataParams\":{\"marketplaceId\":\"ATVPDKIKX0DER\",\"method\":\"HomeImprovement.ImageBlock\",\"requestId\":\"QDVXGGRVVP148SKZZVF3\",\"session\":\"130-6365300-3318505\",\"client\":\"Dpx\"}}')\n" +
                "                \n" +
                "                };\n" +
                "    A.trigger('P.AboveTheFold'); // trigger ATF event.\n" +
                "    return data;\n" +
                "});\n";


        String startString = "P.when('A').register(\"ImageBlockATF\"";
        int startIndex = imageString.indexOf(startString);
        int endIndex = imageString.indexOf("A.trigger('P.AboveTheFold')");

        // "large":"https://m.media-amazon.com/images/I/41QmnwoIQAL._AC_.jpg"
        String imageJavascriptString = imageString.substring(startIndex, endIndex);

        Pattern compile = Pattern.compile("(hiRes\":\")+(([-:/.\\\\A-Za-z0-9_])*)");
        //(jpg)+
        Matcher matcher = compile.matcher(imageJavascriptString);
        while (matcher.find()) {
            System.out.println("group0:" + matcher.group(0));
            System.out.println("----------------------");
            System.out.println("group1:" + matcher.group(1));
            System.out.println("----------------------");
            System.out.println("group2:" + matcher.group(2));
            System.out.println("----------------------");
        }


    }


    @Test
    public void test5() {
        //Pattern compile = Pattern.compile("[\\w]{10}");
        Pattern compile = Pattern.compile("([/dp/])(\\w{10})(/|/?)");
        Matcher b09195NZPF = compile.matcher(" https://www.amazon.com/dp/B09195NZPF/ref=twister_B08QZFRMB3?_encoding=UTF8&th=1 ");
        while (b09195NZPF.find()) {
            System.out.println(b09195NZPF.group(0));
            System.out.println(b09195NZPF.group(1));
            System.out.println(b09195NZPF.group(2));
        }
    }

    @Test
    public void test6() {
        Pattern SKUPattern = Pattern.compile("(([/dp/]+)(\\w{10})(/|/?))");

        Matcher matcher = SKUPattern.matcher("https://www.amazon.com/PlayStation-5-Console/dp/B09DFCB66S?ref_=Oct_d_omwf_d_468642&pd_rd_w=LkQ7R&content-id=amzn1.sym.930be8dd-97e5-4e05-b36b-ce7259eebc0a&pf_rd_p=930be8dd-97e5-4e05-b36b-ce7259eebc0a&pf_rd_r=3B50DSJ5NHSTAD6RV0F7&pd_rd_wg=WqMKF&pd_rd_r=04b28af0-65c6-4df1-948f-9647e38714e5&pd_rd_i=B09DFCB66S");
        Matcher matcher1 = SKUPattern.matcher("https://www.amazon.com/dp/B09LLR4Z7N");

        int i = 0;
        while (matcher.find()) {
            String group0 = matcher.group(i);
            System.out.println(i + "== " + group0);
            i++;
        }
    }

    @Test
    public void test7() {
        String html = "\n" +
                "P.when('A').register(\"ImageBlockATF\", function(A){\n" +
                "    var data = {\n" +
                "                'colorImages': { 'initial': [{\"hiRes\":null,\"thumb\":\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/516rGGDFL9L._AC_.jpg\":[500,500]},\"variant\":\"MAIN\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/61pznWMuNsL._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/61pznWMuNsL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/81xgYjvn-FL._AC_SX522_.jpg\":[522,522]},\"variant\":\"PT01\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/61kDc5CTiBL._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/61kDc5CTiBL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/81l4I8ZDG4L._AC_SX522_.jpg\":[522,522]},\"variant\":\"PT02\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/61rF0i4XoFL._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/61rF0i4XoFL._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/81RVzV+0cjL._AC_SX522_.jpg\":[522,522]},\"variant\":\"PT03\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SL1500_.jpg\",\"thumb\":\"https://m.media-amazon.com/images/I/61Xz6jdK41L._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/61Xz6jdK41L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/81CeX6QDXsL._AC_SX522_.jpg\":[522,522]},\"variant\":\"PT04\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":null,\"thumb\":\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/61pp8nyYq6L._AC_.jpg\":[500,500]},\"variant\":\"PT05\",\"lowRes\":null,\"shoppableScene\":null},{\"hiRes\":null,\"thumb\":\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_US200_.jpg\",\"large\":\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_.jpg\",\"main\":{\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_SY355_.jpg\":[355,355],\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_SY450_.jpg\":[450,450],\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_SX425_.jpg\":[425,425],\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_SX466_.jpg\":[466,466],\"https://m.media-amazon.com/images/I/51JoWrIg74L._AC_.jpg\":[500,500]},\"variant\":\"PT06\",\"lowRes\":null,\"shoppableScene\":null}]},\n" +
                "                'colorToAsin': {'initial': {}},\n" +
                "                'holderRatio': 1.3,\n" +
                "                'holderMaxHeight': 700,\n" +
                "                'heroImage': {'initial': []},\n" +
                "                'heroVideo': {'initial': []},\n" +
                "                'spin360ColorData': {'initial': {}},\n" +
                "                'spin360ColorEnabled': {'initial': 0},\n" +
                "                'spin360ConfigEnabled': true,\n" +
                "                'spin360LazyLoadEnabled': false,\n" +
                "                'showroomEnabled': false,\n" +
                "                'asinShowroomEnabled' : false,\n" +
                "                'showroomViewModel': {'initial': {}},\n" +
                "                'playVideoInImmersiveView':true,\n" +
                "                'useTabbedImmersiveView':true,\n" +
                "                'totalVideoCount':'1',\n" +
                "                'videoIngressATFSlateThumbURL':'https://m.media-amazon.com/images/I/51QnRgrZlCL.SS200_PKplay-button-mb-100px_.jpg',\n" +
                "                'mediaTypeCount':'2',\n" +
                "                'atfEnhancedHoverOverlay' : false,\n" +
                "                'winningAsin': '',\n" +
                "                'weblabs' : {},\n" +
                "                'aibExp3Layout' : 0,\n" +
                "                'aibRuleName' : '',\n" +
                "                'acEnabled' : true,\n" +
                "                'dp60VideoPosition': 0,\n" +
                "                'dp60VariantList': '',\n" +
                "                'dp60VideoThumb': '',\n" +
                "                'dp60MainImage': 'https://m.media-amazon.com/images/I/516rGGDFL9L._AC_SY355_.jpg',\n" +
                "                'imageBlockRenderingStartTime': Date.now(),\n" +
                "                'shoppableSceneWeblabEnabled': false,\n" +
                "                \n" +
                "                'airyConfig' :A.$.parseJSON('{\"jsUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/js/airy.skin._CB485981857_.js\",\"cssUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/css/beacon._CB485971591_.css\",\"swfUrl\":\"https://images-na.ssl-images-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/flash/AiryBasicRenderer._CB485925577_.swf\",\"foresterMetadataParams\":{\"marketplaceId\":\"ATVPDKIKX0DER\",\"method\":\"Sports.ImageBlock\",\"requestId\":\"N5AZETQEFC1EXP8YDHF6\",\"session\":\"143-4275013-3606950\",\"client\":\"Dpx\"}}')\n" +
                "                \n" +
                "                };\n" +
                "    A.trigger('P.AboveTheFold'); // trigger ATF event.\n" +
                "    return data;\n" +
                "});";
        String startString = "P.when('A').register(\"ImageBlockATF\"";
        int startIndex = html.indexOf(startString);
        int endIndex = html.indexOf("A.$.parseJSON");
        // todo 有可能出错
        String imageJavascriptString = html.substring(startIndex, endIndex);

        Pattern compile = Pattern.compile("(hiRes\":\")+(([+-:/.\\\\A-Za-z0-9_])*)");
        Matcher matcher = compile.matcher(imageJavascriptString);
        while (matcher.find()) {
            String group = matcher.group(0);
            System.out.println(group);
            String group2 = matcher.group(2);
            System.out.println(group2);
        }

        ////判断是否含有高质量图片
        //Pattern hiResNull = Pattern.compile("(hiRes\":\")+([\\s,，]*([null]+))");
        //Matcher hiResNullMatcher = hiResNull.matcher(imageJavascriptString);
        //while (hiResNullMatcher.find()) {
        //    String group = hiResNullMatcher.group(0);
        //    System.out.println(group);
        //    String group2 = hiResNullMatcher.group(2);
        //    System.out.println(group2);
        //}
        //Pattern large = Pattern.compile("(large\":\")+(([+-:/.\\\\A-Za-z0-9_])*)");
        ////当高质量图片没有时。转而获取低质量图片
        //Matcher largeMatcher = large.matcher(imageJavascriptString);
        //while (largeMatcher.find()) {
        //    String group = largeMatcher.group(0);
        //    System.out.println(group);
        //    String group2 = largeMatcher.group(2);
        //    System.out.println(group2);
        //}

    }


    @Test
    public void test8() {

        // 5% coupon applied at checkout. Terms
        // $10 coupon applied at checkout. Terms
        // Save an extra $8.50 when you apply this coupon. Terms
        // Save an extra 35% when you apply this coupon. Terms

        String type1 = "5% coupon applied at checkout. Terms";
        String type2 = "$10 coupon applied at checkout. Terms";
        String type3 = "Save an extra $8.50 when you apply this coupon. Terms";
        String type4 = "Save an extra 35% when you apply this coupon. Terms";

        Pattern pattern = Pattern.compile("((\\d+(\\.\\d+)?)%)|((\\d+(\\.\\d+)?) )");
        Matcher matcher1 = pattern.matcher(type1);
        Matcher matcher2 = pattern.matcher(type2);
        Matcher matcher3 = pattern.matcher(type3);
        Matcher matcher4 = pattern.matcher(type4);

        while (matcher1.find()) {
            String group = matcher1.group(2);
            System.out.println(group);
        }

        while (matcher2.find()) {
            String group = matcher2.group(2);
            System.out.println(group);
        }
        while (matcher3.find()) {
            String group = matcher3.group(2);
            System.out.println(group);
        }
        while (matcher4.find()) {
            String group = matcher4.group(2);
            System.out.println(group);
        }


    }

    @Test
    public void test9() {
        Pattern compile = Pattern.compile("([/dp/]{4})(\\w{10})(/|/?)");
        String str = "/dp/B07DNQD5XX/ref=twister_B09XKNG1TV";
        Matcher matcher = compile.matcher("/dp/B07DNQD5XX/ref=twister_B09XKNG1TV");
        if (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
            String group1 = matcher.group(1);
            System.out.println(group1);
            String group2 = matcher.group(2);
            System.out.println(group2);
            String group3 = matcher.group(3);
            System.out.println(group3);
        }
    }

    @Test
    public void test10() {
        String text = "$9.99";
        Pattern pattern = Pattern.compile("([^\\d]*)(\\d+\\.?\\d*)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            String group = matcher.group(2);
            System.out.println(group + System.lineSeparator() + "123");
            System.out.println();
        }
    }

    @Test
    public void test11() {
        String src = "static/resource" + "/productCrawl/" + "7777" + "/" + "700" + "_" + ".";
        File file = new File(src);
        System.out.println(file.getPath());
    }

    @Test
    public void test12() {
        Pattern SKUPattern = Pattern.compile("(([/dp/]{4})(\\w{10}))(/|/?)");

        String link = " https://www.amazon.com/Cancelling-Headphones-Bluetooth-Microphone-Comfortable/dp/B0B4B2KY1M?ref=dlx_deals_gd_dcl_img_52_6dc4adb0_dt_sl15_6b&th=1";
        Matcher matcher = SKUPattern.matcher(link);
        if (matcher.find()) {
            //System.out.println("-" + matcher.group());
            //System.out.println("0" + matcher.group(0));
            //System.out.println("1" + matcher.group(1));
            //System.out.println("2" + matcher.group(2));
            System.out.println(matcher.group(3));
        }
        String link2 = " https://www.amazon.com/dp/B0B4B2KY1M?ref=dlx_deals_gd_dcl_img_52_6dc4adb0_dt_sl15_6b&th=1";
        Matcher matcher2 = SKUPattern.matcher(link2);
        if (matcher2.find()) {
            System.out.println(matcher2.group(3));
        }

        String link3 = " https://www.amazon.com/dp/B0B4B2KY1M";
        Matcher matcher3 = SKUPattern.matcher(link3);
        if (matcher3.find()) {
            System.out.println(matcher3.group(3));
        }

        String link4 = " https://www.amazon.com/dp/B0B4B2KY1M?ref=dlx_deals_gd_dcl_img_52_6dc4adb0_dt_sl15_6b&th=1";
        Matcher matcher4 = SKUPattern.matcher(link4);
        if (matcher4.find()) {
            System.out.println(matcher4.group(3));
        }

        String link5 = " https://www.amazon.com/dp/B0B4B2KY1M?";
        Matcher matcher5 = SKUPattern.matcher(link5);
        if (matcher5.find()) {
            System.out.println(matcher5.group(3));
        }

        String link6 = "https://www.amazon.com/gp/product/B08F5BYRFS?th=1&psc=1&language=en_US";

    }


    @Test
    public void test13() {
        Pattern SKUPattern = Pattern.compile("((([/dp/]{4})|([gp/product/]{11}))(\\w{10}))(/|/?)");

        //String link = "https://www.amazon.com/gp/product/B08LKFPLN7?th=1&psc=1&language=en_US%EF%BC%8C";
        //Matcher matcher = SKUPattern.matcher(link);
        //if (matcher.find()) {
        //    System.out.println("5:" +matcher.group(5));
        //}
        //String link2 = " https://www.amazon.com/dp/B0B4B2KY1M?ref=dlx_deals_gd_dcl_img_52_6dc4adb0_dt_sl15_6b&th=1";
        //Matcher matcher2 = SKUPattern.matcher(link2);
        //if (matcher2.find()) {
        //    System.out.println(matcher2.group(5));
        //}
        //
        //String link3 = " https://www.amazon.com/dp/B0B4B2KY1M";
        //Matcher matcher3 = SKUPattern.matcher(link3);
        //if (matcher3.find()) {
        //    System.out.println(matcher3.group(5));
        //}
        //
        //String link4 = " https://www.amazon.com/dp/B0B4B2KY1M?ref=dlx_deals_gd_dcl_img_52_6dc4adb0_dt_sl15_6b&th=1";
        //Matcher matcher4 = SKUPattern.matcher(link4);
        //if (matcher4.find()) {
        //    System.out.println(matcher4.group(5));
        //}
        //
        //String link5 = " https://www.amazon.com/dp/B0B4B2KY1M?";
        //Matcher matcher5 = SKUPattern.matcher(link5);
        //if (matcher5.find()) {
        //    System.out.println(matcher5.group(5));
        //}

        String link6
                ="https://www.amazon.com/gp/product/B08LKFPLN7?th=1&psc=1&language=en_US，";
        Matcher matcher6 = SKUPattern.matcher(link6);
        if (matcher6.find()) {
            System.out.println(matcher6.group(5));
        }


    }

}
