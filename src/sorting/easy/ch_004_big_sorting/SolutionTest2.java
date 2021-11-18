package sorting.easy.ch_004_big_sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest2 {

    @Test
    public void test_at_first_position() {
        List<String> ordered = new ArrayList<>();
        ordered.add("20");
        ordered.add("30");
        assertEquals(Arrays.asList("10", "20", "30"), Solution2.findAPlace("10", ordered));
    }

    @Test
    public void test_at_middle_position() {
        List<String> ordered = new ArrayList<>();
        ordered.add("10");
        ordered.add("30");
        assertEquals(Arrays.asList("10", "20", "30"), Solution2.findAPlace("20", ordered));
    }

    @Test
    public void test_at_last_position() {
        List<String> ordered = new ArrayList<>();
        ordered.add("10");
        ordered.add("20");
        assertEquals(Arrays.asList("10", "20", "30"), Solution2.findAPlace("30", ordered));
    }

    @Test
    public void test_sort_numbers_diff_size() {
        assertEquals(false, Solution2.isSmallestOrEqual("10", "2"));
        assertEquals(true, Solution2.isSmallestOrEqual("10", "200"));
    }

    @Test
    public void test_sort_numbers_same_value() {
        assertEquals(true, Solution2.isSmallestOrEqual("10", "10"));
    }

    @Test
    public void test_sort_numbers_firstValueBigger() {
        assertEquals(false, Solution2.isSmallestOrEqual("11", "10"));
    }

    @Test
    public void test_sort_numbers_firstValueBigger2() {
        assertEquals(false, Solution2.isSmallestOrEqual("82", "44"));
    }

    @Test
    public void test_sort_numbers_firstValueBigger3() {
        assertEquals(true, Solution2.isSmallestOrEqual("44", "82"));
    }

    @Test
    public void test_sort_numbers_secondValueBigger() {
        assertEquals(true, Solution2.isSmallestOrEqual("10", "19"));
    }

    @Test
    public void test_simple() {
        List<String> result = Arrays.asList("31415926535897932384626433832795", "1", "3", "10", "3", "5");
        List<String> expect = Arrays.asList("1", "3", "3", "5", "10", "31415926535897932384626433832795");
        assertEquals(expect, Solution2.bigSorting(result));
    }

    @Test
    public void test_simple0() {
        List<String> result = Arrays.asList("10", "3", "7", "5");
        List<String> expect = Arrays.asList("3", "5", "7", "10");
        assertEquals(expect, Solution2.bigSorting(result));
    }


    @Test
    public void test_simple01() {
        List<String> input = Arrays.asList("8", "82", "44");
        List<String> expect = Arrays.asList("8", "44", "82");
        assertEquals(expect, Solution2.bigSorting(input));
    }

    @Test
    public void test_simple2() {
        List<String> input = Arrays.asList(
                "6046724675206781253805417697364063874537349942332939012160502967377173420319837265456476",
                "72091970412420810",
                "3746855980099062683149629584771",
                "3746855980099062683149629582771",
                "3746855980099062683149629583771",
                "4763506513"
        );
        List<String> expect = Arrays.asList(
                "4763506513",
                "72091970412420810",
                "3746855980099062683149629582771",
                "3746855980099062683149629583771",
                "3746855980099062683149629584771",
                "6046724675206781253805417697364063874537349942332939012160502967377173420319837265456476"
        );
        assertEquals(expect, Solution2.bigSorting(input));
    }

    @Test
    public void test_simple5() {
        List<String> input = Arrays.asList(
                "6046724675206781253805417697364063874537349942332939012160502967377173420319837265456476",
                "72091970412420810",
                "3746855980099062683149629582771",
                "4763506513",
                "4381858583387279277494367930538",
                "195294541694873319042720380485249001380825565396311663127260228626400961443707964165554187168383846",
                "57500297590012603652986133599394871645776460",
                "3443449340302668605052308",
                "799898013447209990576845913871859165418584121624031762316631",
                "3300953792",
                "8",
                "63593696",
                "24851084103",
                "407248179926838952899179921191873979655396776466610725637337844938107386865231",
                "347055068146981261045909920471491104435367358281493074132530787003286631891260",
                "84617645710",
                "79889616038675409793789137873748992624206633449485792697950955",
                "89010681446075323502110552896366",
                "56055923387811165695520181970960556995748385",
                "982252143663373494231929681150950636211",
                "689652207582048074063885557314598131439882640463089732166634627009727882839802329",
                "103760370650030890704420196453564751405138564548779976442730",
                "2568508222553899614989132",
                "595511428927857027243741014585070698077724714702592038259539625900191041",
                "2006589875623412145878326",
                "5346081954679885708665439539884162946087234174562850518034347368864646546761391881199484426332",
                "41417855736231689319726325108873908732322628",
                "82",
                "4513813970506423806366556964549587926118285563093984149180914445198582562248005532967426935363394",
                "189464003228859631246844678939878442100631407094488634370181145",
                "6766894084508701303181966954454442649",
                "617218738782517673738696836650709347",
                "138693350046179064920029198428",
                "69689336023779290",
                "3123578614526005010789440062175923385894745490067711730621296066747362",
                "6920677972668613791679",
                "98727463407922846430489331897187874972506399980149269216341792683934266326553372651336825100910502",
                "887419023647277091177508895423672748680390346760451960405476096892458561446000021772",
                "357047822507894621064882425810251495984339153706718863150434921883251916931938",
                "721655363593196254631465218524410129464006729720524491959093939538800477879025",
                "399461832935777584631551322242458863336488933972064475755775387970693429489605542902103453",
                "4879666158760447227244804904490661525075569972625784785166402241961211585507098",
                "424250809729923008382471798976997991102352666012166168135388490453419791993437348248692902",
                "96648",
                "3499362168023660581620889357853145012397063659728",
                "44",
                "75655297913491802872733439380949625942090642103288135379733240968108838187718699296561107131",
                "6730285737803282364443175816103191082917262371727029128242169800609774",
                "2226233916493298335782492406184",
                "702616993760099773277701",
                "6459413133895599543512093010172681584992295387756374602296715030084689407214761953434",
                "88151",
                "48048060500795311454501362396164002281",
                "13350830253644406272592098943542479448539695237424116030768219886",
                "8602096560157018758",
                "4285137293297191396703",
                "59064571843258418539809783946176028799168327197",
                "7352625455571982316988892359385804345281600126036030867648944342681034",
                "841914798700287274894330827423742367016300562418119497681768534733683171159",
                "966",
                "871937317295006166948610659392371453127620",
                "97717671655657189481516207050719062493363178584",
                "44466191365953341779604153931359991009249825932467038",
                "4900146572543628830293235422623540449026979",
                "663851293951736587506669665707856376236045468061542850096311090080985050730443008535949871380862",
                "3266084681485344181145502865406724087976265728762903576706273055985600897547821990716776855603",
                "3027671510958920867119822769967026975150513671872284364883316076664947814983178816236371615",
                "6075082871705572350813503266092842439231032244",
                "226308783007518652278892711651945969504116481446022861103004230456764884348840645054713740",
                "4827062832427344897934914852861881127816196306013748993413309020967615943118038713",
                "82226197486758707862569829863301345843404256425288167712035595632448134024",
                "6853035336068603185837379598609710965901821183057340152937719965",
                "96144167763113033526215836335259504732455722379148990370590444393",
                "497010206818067722087306230802257700034825862515267073569769100385728461314",
                "8029462867402623010267220669038328276828159277704969882249658925340931197482",
                "29961611875126871444847810377719588732057005401",
                "7140136715304755447794330632416535814668937888353462780963074",
                "86212388",
                "139324591",
                "2531882366050391355575974134566968043538613212060996149075948904530719392416580359757169745461988195",
                "2306089645405831114107370739922985090810725635160947600829254949567811391",
                "527417408764964324623612928827357473756502731555819746574832578277354817830480916093943535732",
                "166782206349090",
                "5039608483812",
                "22779394003240991729940635387402457235717080073",
                "23174884008941354054844994242306457670422886007267519294811553498520062981088",
                "9379888465970151122427941852081839147561125428377120361098516",
                "4851370931160622254599150919117874463729978188996483031702235879658066666",
                "263962446402901234512400757004778715587484543679574154252814321",
                "386080725531661023940341523726123830253452637178276277203272636730408946001853813544261847",
                "506026518112695319049401500113438880015883164168786587087613685577329244826505995",
                "853765766003041571727941982752375129846256362542268503538675723550767627646485",
                "64915691514101937300896922107778765032041587836421804752327362",
                "9235574571590973726389090392147619820135193089943052820464889147983825",
                "794262758048207670029386770065222950113126",
                "91478800",
                "32687310632916086625372418455638163341778982284204",
                "783034075100973917425178065924838816191619704361135719202582740172462892170122963273533820990331",
                "273617602525557769852631252187557240898061262540420559773149091644393300751865108665599596695445",
                "360949692042264211417548128414147307892643411000394876422352"
        );
        List<String> expect = Arrays.asList(
                "8",
                "44",
                "82",
                "966",
                "88151",
                "96648",
                "63593696",
                "86212388",
                "91478800",
                "139324591",
                "3300953792",
                "4763506513",
                "24851084103",
                "84617645710",
                "5039608483812",
                "166782206349090",
                "69689336023779290",
                "72091970412420810",
                "8602096560157018758",
                "4285137293297191396703",
                "6920677972668613791679",
                "702616993760099773277701",
                "2006589875623412145878326",
                "2568508222553899614989132",
                "3443449340302668605052308",
                "138693350046179064920029198428",
                "2226233916493298335782492406184",
                "3746855980099062683149629582771",
                "4381858583387279277494367930538",
                "89010681446075323502110552896366",
                "617218738782517673738696836650709347",
                "6766894084508701303181966954454442649",
                "48048060500795311454501362396164002281",
                "982252143663373494231929681150950636211",
                "794262758048207670029386770065222950113126",
                "871937317295006166948610659392371453127620",
                "4900146572543628830293235422623540449026979",
                "41417855736231689319726325108873908732322628",
                "56055923387811165695520181970960556995748385",
                "57500297590012603652986133599394871645776460",
                "6075082871705572350813503266092842439231032244",
                "22779394003240991729940635387402457235717080073",
                "29961611875126871444847810377719588732057005401",
                "59064571843258418539809783946176028799168327197",
                "97717671655657189481516207050719062493363178584",
                "3499362168023660581620889357853145012397063659728",
                "32687310632916086625372418455638163341778982284204",
                "44466191365953341779604153931359991009249825932467038",
                "103760370650030890704420196453564751405138564548779976442730",
                "360949692042264211417548128414147307892643411000394876422352",
                "799898013447209990576845913871859165418584121624031762316631",
                "7140136715304755447794330632416535814668937888353462780963074",
                "9379888465970151122427941852081839147561125428377120361098516",
                "64915691514101937300896922107778765032041587836421804752327362",
                "79889616038675409793789137873748992624206633449485792697950955",
                "189464003228859631246844678939878442100631407094488634370181145",
                "263962446402901234512400757004778715587484543679574154252814321",
                "6853035336068603185837379598609710965901821183057340152937719965",
                "13350830253644406272592098943542479448539695237424116030768219886",
                "96144167763113033526215836335259504732455722379148990370590444393",
                "3123578614526005010789440062175923385894745490067711730621296066747362",
                "6730285737803282364443175816103191082917262371727029128242169800609774",
                "7352625455571982316988892359385804345281600126036030867648944342681034",
                "9235574571590973726389090392147619820135193089943052820464889147983825",
                "595511428927857027243741014585070698077724714702592038259539625900191041",
                "2306089645405831114107370739922985090810725635160947600829254949567811391",
                "4851370931160622254599150919117874463729978188996483031702235879658066666",
                "82226197486758707862569829863301345843404256425288167712035595632448134024",
                "497010206818067722087306230802257700034825862515267073569769100385728461314",
                "841914798700287274894330827423742367016300562418119497681768534733683171159",
                "8029462867402623010267220669038328276828159277704969882249658925340931197482",
                "23174884008941354054844994242306457670422886007267519294811553498520062981088",
                "347055068146981261045909920471491104435367358281493074132530787003286631891260",
                "357047822507894621064882425810251495984339153706718863150434921883251916931938",
                "407248179926838952899179921191873979655396776466610725637337844938107386865231",
                "721655363593196254631465218524410129464006729720524491959093939538800477879025",
                "853765766003041571727941982752375129846256362542268503538675723550767627646485",
                "4879666158760447227244804904490661525075569972625784785166402241961211585507098",
                "506026518112695319049401500113438880015883164168786587087613685577329244826505995",
                "689652207582048074063885557314598131439882640463089732166634627009727882839802329",
                "4827062832427344897934914852861881127816196306013748993413309020967615943118038713",
                "887419023647277091177508895423672748680390346760451960405476096892458561446000021772",
                "6459413133895599543512093010172681584992295387756374602296715030084689407214761953434",
                "6046724675206781253805417697364063874537349942332939012160502967377173420319837265456476",
                "226308783007518652278892711651945969504116481446022861103004230456764884348840645054713740",
                "386080725531661023940341523726123830253452637178276277203272636730408946001853813544261847",
                "399461832935777584631551322242458863336488933972064475755775387970693429489605542902103453",
                "424250809729923008382471798976997991102352666012166168135388490453419791993437348248692902",
                "3027671510958920867119822769967026975150513671872284364883316076664947814983178816236371615",
                "75655297913491802872733439380949625942090642103288135379733240968108838187718699296561107131",
                "527417408764964324623612928827357473756502731555819746574832578277354817830480916093943535732",
                "3266084681485344181145502865406724087976265728762903576706273055985600897547821990716776855603",
                "5346081954679885708665439539884162946087234174562850518034347368864646546761391881199484426332",
                "273617602525557769852631252187557240898061262540420559773149091644393300751865108665599596695445",
                "663851293951736587506669665707856376236045468061542850096311090080985050730443008535949871380862",
                "783034075100973917425178065924838816191619704361135719202582740172462892170122963273533820990331",
                "4513813970506423806366556964549587926118285563093984149180914445198582562248005532967426935363394",
                "98727463407922846430489331897187874972506399980149269216341792683934266326553372651336825100910502",
                "195294541694873319042720380485249001380825565396311663127260228626400961443707964165554187168383846",
                "2531882366050391355575974134566968043538613212060996149075948904530719392416580359757169745461988195"
        );
        /*List<String> strings = Solution.bigSorting(input);
        for(int i = 0; i < strings.size(); i++) {
            if(strings.get(i) != expect.get(i)) {
                System.out.println("Esperado: " + expect.get(i));
                System.out.println("Real: " + strings.get(i));
            }
        }*/
        assertEquals(expect, Solution2.bigSorting(input));
    }

    @Test
    public void test_simple3() {
        List<String> input = Arrays.asList("82", "44");
        List<String> expect = Arrays.asList("44", "82");
        assertEquals(expect, Solution2.bigSorting(input));
    }


}