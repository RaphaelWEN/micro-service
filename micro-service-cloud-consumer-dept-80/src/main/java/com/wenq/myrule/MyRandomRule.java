package com.wenq.myrule;

//import com.netflix.client.config.IClientConfig;
//import com.netflix.loadbalancer.AbstractLoadBalancer;
//import com.netflix.loadbalancer.AbstractLoadBalancerRule;
//import com.netflix.loadbalancer.ILoadBalancer;
//import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.myrule
 * @Author: WenQiang
 * @CreateTime: 2022-05-27 13:39
 * @Description:
 */
//public class MyRandomRule extends AbstractLoadBalancerRule {
//    //总共被调用的次数，目前要求每台被调用5次
//    private int total = 0 ;
//    //当前提供服务的机器号
//    private int currentIndex = 0 ;
//
//    public Server choose(ILoadBalancer lb,Object key){
//        //如果没有获取到负载均衡器LoadBalancer，则返回null
//        if(lb == null){
//            return null;
//        }
//        //初始化返回的server为null
//        Server server = null;
//
//        //当server为null的时候
//        while (server == null){
//
//            //判断当前线程是否被阻断了，如果阻断了则返回null
//            if(Thread.interrupted()){
//                return null;
//            }
//
//            //获取所有有效的服务实例列表
//            List<Server> upList = lb.getReachableServers();
//
//            //获取所有的服务实例的列表
//            List<Server> allList = lb.getAllServers();
//
//            //如果没有任何的服务实例则返回null
//            int serverCount = allList.size();
//            if(serverCount == 0){
//                return null;
//            }
//
//            //与随机策略相似，但每个服务实例只有在调用3次之后，才会调用其他服务实例
//            if(total<5){
//                server = upList.get(currentIndex);
//                total++;
//            }else {
//                total = 0;
//                currentIndex++;
//                if(currentIndex>=upList.size()){
//                    currentIndex = 0;
//                }
//            }
//            //在获取到server之后，判断server是否为空
//            //如果为空，则让当前线程从 运行状态 转为 就绪状态，以允许具有相同优先级的其他线程获得运行机会，并继续循环该程序结构
//            if(server == null){
//                Thread.yield();
//                continue;
//            }
//            //如果该server不为空，则判断它的存活状态，如果存活，则返回该server
//            if (server.isAlive()){
//                return (server);
//            }
//            //如果该server不存活，则将server置为null，则让当前线程从 运行状态 转为 就绪状态，以允许具有相同优先级的其他线程获得运行机会，继续循环
//            server = null;
//            Thread.yield();
//        }
//        return server;
//    }
//
//    @Override
//    public Server choose(Object key) {
//        return choose(getLoadBalancer(),key);
//    }
//
//
//
//    @Override
//    public void initWithNiwsConfig(IClientConfig iClientConfig) {
//        //TODO Auto-generated method stub
//    }
//
//}
