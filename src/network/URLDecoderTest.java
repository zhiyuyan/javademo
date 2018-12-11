package network;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDecoderTest {

    public static void main(String[] args) throws Exception{
        // 将application/x-www-form-urlencoded字符串
        // 转换成普通字符串
        String keyWord = URLDecoder.decode("%E6%9D%8E%E5%88%9A+j2ee", "UTF-8");
        System.out.println(keyWord);
        // 将普通字符串转换为application/x-www-form-urlencoded字符串
        String urlStr = URLEncoder.encode("ROR敏捷开发最佳指南", "GBK");
        System.out.println(urlStr);
    }

}
