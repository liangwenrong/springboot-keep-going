## springboot 加载servlet和过滤器filter
-------
### 第一种方法：
* 直接运用servlet3.0特性，继承父类并使用注解@WebServlet和@WebFilter和@WebListener
* 在@SpringBootApplication同级别路径添加@ServletComponentScan，使得以上三个注解的bean被扫描加载到容器管理
* 如示例中的MyFilter，MyListener，MyServlet

### 第二种方法
* 通过@Bean，使用RegistrationBean来生成
* 如com.example.springboot.SpringbootApplication中写的所示

### 第三种方法
* 其实RegistrationBean继承于ServletContextInitializer
* 第三种方法，直接继承ServletContextInitializer，并注解自身为一个bean
* 重写onStartup,在方法中使用add*添加
