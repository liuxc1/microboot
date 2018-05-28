spring-boot 标准的单元测试。
1.在pom.xml中移入boot的测试包

核心spring-boot注解详解
 1.@Controller 进行控制器配置注解
 2.@EnableAutoConfiguration 开启自动配置处理 配置在启动程序类中
 3.@RequestMapping("/") web访问的映射地址
 4.@ResponseBody 在restFul 架构中，该注解表示将返回值以json或者字符格式返回
 5.@ComponentScan("com.lxc.intro.microboot") 表示扫描该路径下的controller（用于spring-boot的原生写法）
 6.@SpringBootApplication 为复合注解等价于@EnableAutoConfiguration+@ComponentScan+其他配置。该注解会将标注的类作为spring-boot的启动类，并且会自动扫描该包下面的子包
 7.@RestController为复合注解当控制器类里面返回的全是restful的数据是可以使用该注解。等价于@Controller+@ResponseBody(使用该注解时默认方法返回的是join字符串)
 8.当修改的类型内容每次都需要重新启动。增加spring-boot的两个依赖库则不需要重新启动也会自动加载。springloaded +spring-boot-devtools
 9.使用springBoot的内置对象。
 