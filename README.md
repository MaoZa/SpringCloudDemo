# SpringCloudDemo  
  
启动顺序a-b-c-e  
  
8761 => Eureka服务器  
8762 => Eureka客户端(服务提供) 与8763负载均衡  
8763 => Eureka客户端(服务提供) 与8762负载均衡  
8764 => Ribbon(负载均衡)  
8765 => Feign(负载均衡,断路器)  
8769 => Zuul(路由)  
8888 => 远程配置服务器  
8881 => 远程配置客户端  
  
测试  
http://localhost:8769/api-a/hi 多次访问负载均衡  
  
http://localhost:8769/api-b/hi 多次访问负载均衡 关闭服务提供 出现断路提示  
  
http://localhost:8888/foo/dev 读取远程git仓库配置文件  
  
http://localhost:8881/hi 显示foo version 3  
  