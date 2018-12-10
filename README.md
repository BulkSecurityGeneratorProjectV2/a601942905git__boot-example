# Spring Boot版本
2.1.0.RELEASE
# Spring Boot目录结构
```
|- src
        |- main
            |- java
            |- resources
                |- mapper       存放mybatis的mapper
                |- static       存放静态资源
                |- templates    存放页面
        |- test
```
# Spring Boot邮件发送
```
spring.mail.host=smtp.163.com
spring.mail.username=用户名
spring.mail.password=密码
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.from=a601942905@163.com
```
示例代码配置文件账号密码已屏蔽，请填写自己的账号和密码

# 学习示例
- [启动一个Sping Boot应用](https://a601942905git.github.io/2018/11/21/%E5%90%AF%E5%8A%A8%E4%B8%80%E4%B8%AASpring-Boot%E5%BA%94%E7%94%A8/%E5%90%AF%E5%8A%A8%E4%B8%80%E4%B8%AASpring-Boot%E5%BA%94%E7%94%A8/)
- [Spring Boot启动方式](https://a601942905git.github.io/2018/11/21/Spring-Boot%E5%90%AF%E5%8A%A8%E6%96%B9%E5%BC%8F/Spring-Boot%E5%90%AF%E5%8A%A8%E6%96%B9%E5%BC%8F/)
- [Spring Boot读取配置文件中的值](https://a601942905git.github.io/2018/11/22/Spring-Boot%E8%AF%BB%E5%8F%96%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E4%B8%AD%E7%9A%84%E5%80%BC/Spring-Boot%E8%AF%BB%E5%8F%96%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E4%B8%AD%E7%9A%84%E5%80%BC/)
- [Spring Boot开发web应用](https://a601942905git.github.io/2018/11/22/Spring-Boot%E5%BC%80%E5%8F%91web%E5%BA%94%E7%94%A8/Spring-Boot%E5%BC%80%E5%8F%91web%E5%BA%94%E7%94%A8/)
- [Spring Boot自定义Filter](https://a601942905git.github.io/2018/11/22/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Filter/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Filter/)
- [Spring Boot自定义Interceptor](https://a601942905git.github.io/2018/11/22/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Interceptor/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Interceptor/)
- [Spring Boot集成Thymeleaf](https://a601942905git.github.io/2018/11/22/Spring-Boot%E9%9B%86%E6%88%90Thymeleaf/Spring-Boot%E9%9B%86%E6%88%90Thymeleaf/)
- [Spring Boot自定义Banner](https://a601942905git.github.io/2018/11/22/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Banner/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89Banner/)
- [Spring Boot集成Mybatis](https://a601942905git.github.io/2018/11/22/Spring-Boot%E9%9B%86%E6%88%90Mybatis/Spring-Boot%E9%9B%86%E6%88%90Mybatis/)
- [Spring Boot配置错误页面](https://a601942905git.github.io/2018/11/23/Spring-Boot%E9%85%8D%E7%BD%AE%E9%94%99%E8%AF%AF%E9%A1%B5%E9%9D%A2/Spring-Boot%E9%85%8D%E7%BD%AE%E9%94%99%E8%AF%AF%E9%A1%B5%E9%9D%A2/)
- [Spring Boot单元测试](https://a601942905git.github.io/2018/11/23/Spring-Boot%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95/Spring-Boot%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95/#more)
- [Spring Boot发送邮件](https://a601942905git.github.io/2018/11/23/Spring-Boot%E5%8F%91%E9%80%81%E9%82%AE%E4%BB%B6/Spring-Boot%E5%8F%91%E9%80%81%E9%82%AE%E4%BB%B6/)
- [Spring Boot集成Actuator](https://a601942905git.github.io/2018/11/23/Spring-Boot-%E9%9B%86%E6%88%90%E7%9B%91%E6%8E%A7/Spring-Boot-%E9%9B%86%E6%88%90%E7%9B%91%E6%8E%A7/)
- [Spring Boot多环境配置](https://a601942905git.github.io/2018/11/24/Spring-Boot%E5%A4%9A%E7%8E%AF%E5%A2%83%E9%85%8D%E7%BD%AE/Spring-Boot%E5%A4%9A%E7%8E%AF%E5%A2%83%E9%85%8D%E7%BD%AE/)
- [Spring Boot表单校验](https://a601942905git.github.io/2018/11/24/Spring-Boot%E8%A1%A8%E5%8D%95%E6%A0%A1%E9%AA%8C/Spring-Boot%E8%A1%A8%E5%8D%95%E6%A0%A1%E9%AA%8C/)
- [Spring Boot Admin Server监控](https://a601942905git.github.io/2018/11/28/Spring-Boot-Admin-Server%E7%9B%91%E6%8E%A7/Spring-Boot-Admin-Server%E7%9B%91%E6%8E%A7/)
- [Spring Boot自定义异常和异常处理器](https://a601942905git.github.io/2018/11/30/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89%E5%BC%82%E5%B8%B8%E5%92%8C%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E5%99%A8/Spring-Boot%E8%87%AA%E5%AE%9A%E4%B9%89%E5%BC%82%E5%B8%B8%E5%92%8C%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E5%99%A8/)
- [Spring Boot自定义监听器](http://note.youdao.com/noteshare?id=830c311914279b1cf66fb2c257b42285)