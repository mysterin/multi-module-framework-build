# multi-module-framework-build

本项目使用 gradle 构建多模块方式, 目的是一个模块就是一个项目框架, 所以模块之间不会依赖.

---

### spring-boot-jpa-data
gradle 作为构建工具, 框架是 spring-boot + druid + spring-data-jpa + logback, 数据库使用 mysql

---

### spring-boot-mybatis-druid
gradle 作为构建工具, 框架是 spring-boot + druid + mybatis + logback, 数据库使用 mysql, 这里使用注解来对 mybatis 进行相关配置

---

### spring-boot-mybatis-xml-druid
gradle 作为构建工具, 框架是 spirng-boot + druid + mybatis + logback, 数据库使用 mysql, 这里使用 xml 文件对 mybatis 进行相关配置
