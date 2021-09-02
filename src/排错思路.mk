问题：bean不存在

步骤：
1.查看这个bean注入是否成功;
2.Junit单元测试，看我们的代码是否能够查询出结果；
3.问题，一定不在我们的底层，是spring除了问题；
4.SpringMvc，整合的时候没调用我们的service层的bean
    1.applicationContext.xml 没有注入bean
    2.web.xml中，我们也绑定过配置文件！
        发现问题：我们配置的是spring-mvc.xml,这里确实没有service bean，所以报空指针
