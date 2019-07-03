package com.phh;

import java.lang.instrument.Instrumentation;

/**
 * @author phh
 * @version V1.0
 * @date 2019/7/3
 */
public class MyAgent {

    public static void premain(String args, Instrumentation inst) {
        System.out.println("premain :      Hi, I'm agent!");
        inst.addTransformer(new MyTransformer());
    }

}
