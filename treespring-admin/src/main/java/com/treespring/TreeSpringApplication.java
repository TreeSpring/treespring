package com.treespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TreeSpringApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(TreeSpringApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  treespring启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "                          \n" +
                "                                                 .::::.\n" +
                "                                               .::::::::.\n" +
                "                                              :::::::::::\n" +
                "                                           ..:::::::::::'\n" +
                "                                        '::::::::::::'\n" +
                "                                          .::::::::::\n" +
                "                                     '::::::::::::::..\n" +
                "                                          ..::::::::::::.\n" +
                "                                        ``::::::::::::::::\n" +
                "                                         ::::``:::::::::'        .:::.\n" +
                "                                        ::::'   ':::::'       .::::::::.\n" +
                "                                      .::::'      ::::     .:::::::'::::.\n" +
                "                                     .:::'       :::::  .:::::::::' ':::::.\n" +
                "                                    .::'        :::::.:::::::::'      ':::::.\n" +
                "                                   .::'         ::::::::::::::'         ``::::.\n" +
                "                               ...:::           ::::::::::::'              ``::.\n" +
                "                              ```` ':.          ':::::::::'                  ::::..\n" +
                "                                                 '.:::::'                    ':'````..\n" +
                "                          ");
    }
}