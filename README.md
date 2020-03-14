## 其乐蛋糕店后台管理系统
**技术：**  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**后端运用：spring+springmvc+mybatis（经典的ssm框架）**  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**前端运用：jsp/js**    
**博客地址**：https://my.oschina.net/u/4115134  

### 它主要分为三个模块
### 1 主页页面
&nbsp;&nbsp;&nbsp;&nbsp;是以left/right/top.jsp三页面组合而成  
![主页](https://github.com/XINGGou/qile/blob/master/image/745.png)

### 2  门店管理模块：  
&nbsp;&nbsp;&nbsp;&nbsp;其中包含了门店的id/门店名称/地址以及联系电话  
&nbsp;&nbsp;&nbsp;&nbsp;可以增加/删除或者修改门店信息  
![门店](https://github.com/XINGGou/qile/blob/master/image/00.png)  

### 3 订单管理模块：  
&nbsp;&nbsp;&nbsp;&nbsp;订单模块中包含了对订单中的  
&nbsp;&nbsp;&nbsp;&nbsp;序号/所属门店/订单号/类型（点心/奶茶/水果等）/用餐人数/你所对应的收营员等。。
![订单](https://github.com/XINGGou/qile/blob/master/image/726.png)  
  
### 优化404/500异常页面
假若报了404/500异常，它会弹出一段文字并且有一个返回主页面的按钮，点击可返回（这样会显得比较的亲切，而不至于尴尬）  

**报404错误**

![订单](https://github.com/XINGGou/qile/blob/master/image/404.png)

**报500异常**

![订单](https://github.com/XINGGou/qile/blob/master/image/500.png)

**虽说比较简单，不过适用于初学者对springmvc框架的掌握**
