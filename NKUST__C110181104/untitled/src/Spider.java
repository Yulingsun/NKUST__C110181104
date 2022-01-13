import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class finalwork {
    public static void main(String[] args) {
        System.out.println("粉絲數前十vtuber排行榜");
        System.out.println("https://virtual-youtuber.userlocal.jp/document/ranking");

        try {

            Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking").get();//爬蟲網址
            System.out.println(view.title());//輸出網頁標題

            for (int i = 1; i <= 10; i++) {//抓取10位vtuber
                String name = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child(" + i + ") > td.col-name > div:nth-child(1) ").text();//vtuber姓名的元素
                String watch = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child(" + i + ") > td.vertical.text-right.text-nowrap > span.text-danger.font-weight-bold").text();//vtuber觀看次數的元素
                String sub = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child(" + i + ") > td.vertical.text-right.text-nowrap > div > span.text-success.font-weight-bold").text();//vtuber訂閱數的元素

                System.out.println("《" + name + "》" + "　→觀看次數：[" + watch + "]" + "； →訂閱數：[" + sub + "]");//3項元素輸出
            }
            System.out.println("===================================================================================================================================");

            Document two1 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/0DCB37A5BB880687_c8ea33").get();
            System.out.println("1."+two1.title());
            String intro1= two1.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro1);
            Document two2 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/D780B63C2DEBA9A2_fa95ae").get();
            System.out.println("2."+two2.title());
            String intro2= two2.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro2);
            Document two3 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/CE32A8A748265090_585651").get();
            System.out.println("3."+two3.title());
            String intro3= two3.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro3);
            Document two4 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/B466882322D45E43_e936ad").get();
            System.out.println("4."+two4.title());
            String intro4= two4.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro4);
            Document two5 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/F5E89D62D0351960_af58bc").get();
            System.out.println("5."+two5.title());
            String intro5= two5.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro5);
            Document two6 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/E1E245372EE48E27_080ee6").get();
            System.out.println("6."+two6.title());
            String intro6= two6.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro6);
            Document two7 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/C53F478C4DA57792_1a27db").get();
            System.out.println("7."+two7.title());
            String intro7= two7.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro7);
            Document two8 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/DA8BBC317C78EF27_e1ae4e").get();
            System.out.println("8."+two8.title());
            String intro8= two8.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro8);
            Document two9 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/D7F6D0F715D6CC5F_8673b3").get();
            System.out.println("9."+two9.title());
            String intro9= two9.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro9);
            Document two10 = Jsoup.connect("https://virtual-youtuber.userlocal.jp/user/7926D484E782BB46_42d9e0").get();
            System.out.println("10."+two10.title());
            String intro10= two10.select("body > div.container.container-noamp.my-3.px-0 > div.box-channel > div:nth-child(1) > div > div.col-12.col-lg-6.box-channel-info.vertical > div.channel-body").text();
            System.out.println("個人簡介："+intro10);
        }


        catch (Exception e) {
            System.out.println("error" + e);
        }
        System.out.println("===================================================================================================================================");
        System.out.println("升粉絲速度前十vtuber排行榜");
        System.out.println("https://virtual-youtuber.userlocal.jp/document/ranking?order=fav_cnt_diff");
        try {
            Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking?order=fav_cnt_diff").get();//爬蟲網址
            System.out.println(view.title());//輸出網頁標題
            for(int n = 1; n <= 10; n++){//抓取10位vtuber
                String name1 = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+n+") > td.col-name > div:nth-child(1) ").text();//vtuber姓名的元素
                String sub1 = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+n+") > td.vertical.text-right.text-nowrap > div > span.text-success.font-weight-bold").text();//vtuber現在的訂閱數
                String subup = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+n+") > td.vertical.text-right.text-nowrap > div > span:nth-child(2) > span").text();//vtuber訂閱數上升的數量
                String watch1 = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+n+") > td.vertical.text-right.text-nowrap > span.text-danger.font-weight-bold").text();//vtuber現今的觀看數
                String watchup= view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+n+") > td.vertical.text-right.text-nowrap > span:nth-child(3) > span").text();//vtuber觀看數上升的數量
                System.out.println("《"+name1+"》"+"　→現今訂閱數：[" +sub1+ "]"+"； →訂閱數上升：["+subup+"]"+" →總觀看數:["+watch1+"]"+"→觀看數上升:["+watchup+"]");//3項元素輸出
            }
        }
        catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}
}
