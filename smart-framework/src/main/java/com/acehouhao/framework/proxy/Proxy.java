package com.acehouhao.framework.proxy;

/**
 * Created by Hao HOU on 2017/6/28.
 * 代理接口
 */
public interface Proxy {
    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
