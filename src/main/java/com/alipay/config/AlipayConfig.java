package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id ="2016091400507136";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCY+9jRdsGiTrDuwB8JJ54UzM5uexJh3vt5NOOR+zjMVwOwoOAayRcDRS9VZmIV6vWbLbGPoN/3s8UFYmL3bPP/QQGmC5hlOt7GB7hCKcFBvDUSYJIe55w9mfVc9pH1/4vlGmFXbqZzmmz0Gc/s4hx2Gz8xJDsOBc5SY9B+H2F1WNr8aZYzyLVd2Fkfkp+rIl9JwqqR21/XJFY2MrWiTfPzT5/WLVbDMwazlxzhotCDt4Shd+smyYnkI+hXiLy6cPlPkMo2/7ruFPJwrT03ZoKU2/kk+fCjJLLQ2yaA/cCjW5tueczmP16Kn3T8qnlQiV7tCj3Y/Tr+P8NmFqQJJuwHAgMBAAECggEANQywRQKPZv8ur7wDhyMr2D6lHv6igznVrlQ+zfJ14bYS238N93vf9Qxau5yDSuJtROB1gD7jK3w1SAa0FuS7P7qFHdVLhV8CvV0T8i2UjHz9UmAWi4z5SwtGYHRIbSuukUWyl6URJ2lXetYwmg5WnEYahanwqI4u27ctJ28uVohti3AQOpr+1u/Z78t30n+lPPE+1SgsFhB7jNG3puT8h0eig8iY3rg0PXdyL6vB7pown/RBlxUTf/h6cM++d8OaOIYKBB1g/+eQ/CJBS+UubtCgaqpwoBYnTkw+tZTrUebW0Frg65YL+z9EK8Q6gk86dDMVT+IhGcPPwXZT2OKPEQKBgQDaeP8ZXgZhghcTzn37YcN1746f9zhCthMH00Pe6DomPGAL1/uOmGUXfwotq065thaYJz5o74CYwnJ81y2a+5dVLQ0xyW8Dl3LUHbIWG910gSdUGp91HAFG5zdi4q7RUhggXCc2QxhRmYya5U03vupZUodim3kgftLSc5eOB2S07QKBgQCzQxOp4s/xBfeOc2B6w/sh5OkWz3T7fYVy6gyYOUr79tO2MuxFkqEz9+H8fe1Wa/xEHVlewylfMqKi11ymPuIW/NHVXi9Due+WKSFYpdCJYTHCIjmNgBPzZgdgjyZ8Ei4MH8DmXPaHA2A5VVZ4wmwqLMyCk6bVIaA+6BwIVymaQwKBgAUwvLbIkhQ89/ljfYC8aN1jbJsGT5LeKoOUFFe2YrNH2exOHE7d9gDh5scA++TTm6PPwt7RWdfHPtsSbaXx9j1yzY5yP63xKiw57GI0FUXQT7Pi0gkBOlKJ6bnysr6MWcBjEBds7qX5pOqFKhl58q1elZLVKMKJ4M5ZKq+YI19dAoGASWo3K2RQdQ1UjWqDIMQSnZb6PvVHm5eUh7OC5PTR2M8FdaD1UqjyjC4Axz9ra/Fdpye96ilTUEGUicxZjVxDi9aOuSuRf9MuY/kERyHhfeHoVvFdUK4bfZtTeiAmSrnHUf/PKIj6DeE8Dz774wj882jVeMSvlqnmztyQXnoT97ECgYBpnINK/EZrZKdsYh5q7FO2gkQEGbTcFm5/mcLxnxPqQ+5/Y9UBIUmdahKJxEd3NbpdxZmKilDVHeL78JDaAuGTx202qopiz6FIgJdxHyXdaf8ZM4TtOsRUjwItsHJWQhKSAdMrWXMZFmsQ9DP8MmntWncByNVSVKt3qchU6835wA==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAplsY7tIjOcNFTtEiGhquLgSIRN8N9zLMeHDkeU+lAw+O0Rshtt8iHckC+elOHtnPS4T5B8GB2NTTiVrg2u6hlslEOkKw4GffPF9nKD1rkTGSHMQ66t6VWytGyc4j361AHY367N9pv7Ct6sPGqEokFMCwlYDc9wNwAeo8Z783KoY1b7LoA2u1vz3vqqCRhFmtHS7pfRqJ9mbjF1Nbt8NPSMC1OB4BrZ4xnWReW0hAh3BFj71XWJXN6X7+k4UhtRSz5OEDvEUTOe3bydYYksoRS3i7Fk3d57E6hM+4xWRoHrK042mCT5C8/SXXhYMZ4nm7QQVLABWB/PWxWCf5lRIisQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:7777/CBIS/Front/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:7777/CBIS/search-api/alipayReturnNotice.action";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

