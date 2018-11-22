# SpringCloudDemo  
  
启动顺序a-b-c-e  
  
8761 => Eureka服务器  
8762 => Eureka客户端(服务提供)  
8763 => Eureka客户端(服务提供)  
8764 => Ribbon(负载均衡)  
8765 => Feign(负载均衡,断路器)  
8769 => Zuul(路由)  
