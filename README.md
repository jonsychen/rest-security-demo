# 基于Spring Boot/Spring Security/JWT的REST服务安全认证
## 项目介绍
### 预备知识
+ <a href="http://blog.leapoahead.com/2015/09/06/understanding-jwt/" target="_blank">JSON Web Token（JWT)是什么鬼</a>
+ <a href="http://blog.leapoahead.com/2015/09/07/user-authentication-with-jwt/" target="_blank">八幅漫画理解使用JSON Web Token设计单点登录系统</a>

### 认证流程
![image](https://github.com/jonsychen/rest-security-demo/raw/master/etc/authflow.png)

## RUN DEMO
### 获取token
测试账号：user/123456
接口地址：http://localhost:8080/auth/
![image](https://github.com/jonsychen/rest-security-demo/raw/master/etc/gettoken.png)
### 访问需要认证的接口
接口地址：http://localhost:8080/persons
![image](https://github.com/jonsychen/rest-security-demo/raw/master/etc/protected.png)
### 访问限制访问的接口
接口地址：http://localhost:8080/protected
![image](https://github.com/jonsychen/rest-security-demo/raw/master/etc/protectedadmin.png)
### 重新使用拥有API访问权限的用户获取token并访问接口
测试账号：admin/123456
接口地址：http://localhost:8080/protected
![image](https://github.com/jonsychen/rest-security-demo/raw/master/etc/protectedadmin2.png)
## 联系我
* Email: jonsychen@hotmail.com/i@jonsy.me
* OICQ: 903352005
* WeChat: Jonsychen_2013 
