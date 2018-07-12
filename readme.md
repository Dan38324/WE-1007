# 二手商品交易平台说明：
    本平台用于1513012班张一石，刘旭，刘曼，李泽宇，王若愚，李帅，丁云鹏，柳园，郭磊，张振峰等10人组成web工程与系统1007小组大作业。
    本平台由我们个人开发，不做商业用途。联系：liuxver444@gmail.com
###### 二手商品交易平台初始化脚本：
    平台初始化脚本为twoshou.sql，部署到服务器上，需要在MySQL里面运行一遍 twoshou.sql
# 配置文件说明：
###### 二手商品交易平台配置开发环境：
    需求：win10电脑，IDEA，Java8，tomcat9.0，mysql5.7.20，IE浏览器
    操作：将以上软件安装到电脑上，并配置好环境变量，进行开发
###### 二手商品交易平台运行环境说明：
    任何一台带有浏览器的能连接上网络的智能设备
###### 二手商品交易平台打包安装说明：
    IDEA的target目录下面会生成liuxv.war包，将这个自动打的包部署到与服务器上面。
    云服务器的配置环境如下：tomcat9.0 ，java8，MySQL5.7.20。
    将以上软件安装到服务器，并配置好环境变量，MySQL账户：root，密码：1234
    修改tomcat下面的conf\server.xml文件 添加虚拟目录和主机域名映射（修改host这个菜单下面的context标签）
    修改tomcat下面的conf\web.xml文件 修改网站默认启动页面。

# 网站使用手册

#### 管理员部分：
###### 本网站支持管理员进行以下操作：
管理员登录：后台管理员在管理员登陆页面输入账号和密码，点击登录并进入管理员主页面。
用户管理：管理员在管理员主页面点击用户管理链接进入用户管理页面，可以查看并审核新用户注册，也可以增删旧用户。
审核商品（增删商品）：管理员在管理员主页面点击商品管理链接进入商品管理页面，并可以在本页面审核商品是否违禁、售空并可以对商品进行增删。
审核留言（增删留言）：管理员在管理员主页面点击留言管理链接进入留言管理页面，并可以在本页面审核留言是否存在黄、赌、毒以及邪教等违禁言辞并可以对留言进行整条增删。
处理订单功能：管理员在管理员主页面点击订单管理链接进入订单管理页面，并可以在本页面处理订单。

#### 用户部分：
###### 本网站支持用户进行以下操作：
用户注册/登录：用户在用户注册/登录界面点击注册/登录选项，注册时需输入自拟账户名和自拟密码以及相关个人信息并点击提交，等待管理员审核；登录是直接输入账户名和密码点击登录进入用户主页面。
发布出售商品：用户点击出售商品链接，在发布商品页面填写商品相关信息后点击提交并等待管理员审核。
浏览商品：用户点击商品链接，在商品页面浏览商品并可以点击具体商品查看商品详细信息。
提交订单（购买商品）：用户在商品页面点击商品详细信息并点击购买链接，在购买界面添加收获人姓名、地址等详细信息后点击提交。
发布留言功能：用户点击留言链接，在留言发布页面发布自己对有关商品的评价和吐槽，也可以查看具体商品，然后对具体商品发布留言和吐槽。


