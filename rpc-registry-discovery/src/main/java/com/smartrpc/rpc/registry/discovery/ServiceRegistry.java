package com.smartrpc.rpc.registry.discovery;

/**
 * 服务注册接口
 *
 * @author gao shan
 * @since 1.0.0
 */
public interface ServiceRegistry {

    /**
     * 注册服务名称与服务地址
     *
     * @param serviceName    服务名称
     * @param serviceAddress 服务地址
     */
    void register(String serviceName, String serviceAddress);
}