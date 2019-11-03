package com.example.royal.service;

import com.example.royal.model.Person;

/**
 * @author by yze on 2019/11/2
 * @see
 * @since 20191128
 */
public interface Notify {
    /**
     * 在接口返回信息时调用
     *
     * @param msg
     * @param id
     */
    public void onreturn(Person msg, Integer id);

    /**
     * 在接口抛异常时调用
     *
     * @param ex
     * @param id
     */
    public void onthrow(Throwable ex, Integer id);
}