import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class Spider {
    public static void main(String[] args) {
        System.out.println("粉絲數前十vtuber排行榜");
        System.out.println("https://virtual-youtuber.userlocal.jp/document/ranking");
        try {
        Document view = Jsoup.connect("https://virtual-youtuber.userlocal.jp/document/ranking").get();//爬蟲網址
        System.out.println(view.title());//輸出網頁標題
        for(int i = 1; i <= 10; i++){//抓取10位vtuber
            String name = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.col-name > div:nth-child(1) ").text();//vtuber姓名的元素  
            String watch = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > span.text-danger.font-weight-bold").text();//vtuber觀看次數的元素
            String sub = view.select("body > div.container.container-noamp.my-3.px-0 > table > tbody > tr:nth-child("+i+") > td.vertical.text-right.text-nowrap > div > span.text-success.font-weight-bold").text();//vtuber訂閱數的元素
            System.out.println("《" + name + "》" + "　→觀看次數：[" + watch + "]" + "； →訂閱數：[" + sub + "]");//3項元素輸出

             }
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
