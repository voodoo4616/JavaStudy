import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NetworkMain2 {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://dhlottery.co.kr/gameResult.do?method=byWin&drwNo=857").get();
		Elements newsHeadlines = doc.select("span.ball_645");
		for (Element headline : newsHeadlines) {
			System.out.println(headline.text());
		}
	}
}
