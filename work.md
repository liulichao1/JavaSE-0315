#### 1.18.Java源文件中是否可以包含多个累，有什么限制？
一个Java源文件可以包含多个类，每个源文件至多有一个public类，源文件的名字还得相同。
如果源文件中没有public类，源文件用什么名字都可以，但最好还是具有特定意义，一般建议一个源文件中只写一个Java类
#### 1.19.列出自己常用的JDK包？
1. Java.lang包：这个包中提供了JDK提供的基础类，如String，这个包是唯一一个不用导入就可以使用的包；
2. Java.io包:包含了输入与输出的相关类，如文件操作；
3. java.net包：包含了与网络有关的类，如URL,URLConnection等；
4. Java.util包：系统辅助类，特别是集合类Collection,List,Map等
5. java.sql包：数据库操作类，Connection，Statement，resultSet等
#### 1.20.简单说明什么是递归？什么情况会使用？并使用Java实现一个简单的递归程序？
1. 递归指函数、过程、子程序在运行过程中直接或间接的调用自身而产生重入现象；
2. 解决三类问题：
 * 数据的定义是按递归定义的
 * 问题的解法按递归算法实现
 * 数据的结构形式是按递归定义的

`public static int getBinary（int num）{

if（num == 1）

return 1；

if（0 == num%2）{;

return getBinary（num/2）;

}else{

return getBinary(num/2)+1;
}
}
`
#### 1.21.请写出求n!的算法？
`   public class Factorial{

public static void main(String[] args){

long n = 5;

System.out.println(doFactorial(n))

}

public static long doFactorial (long n) 
{
`
#### 2.1什么是OOAD？OOAD怎么实现？
面向对象的分析与设计，是现在软件企业广为采用的的一项有效技术。OOAD方法要求在设计中要映射现实世界中指定问题域中的对象和实体，