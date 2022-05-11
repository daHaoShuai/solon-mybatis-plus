package com.da;

import org.noear.solon.Solon;

/**
 * Author Da
 * Description: <br/>
 * 三十年生死两茫茫，写程序，到天亮。
 * 千行代码，Bug何处藏。
 * 纵使上线又怎样，朝令改，夕断肠。
 * 领导每天新想法，天天改，日日忙。
 * 相顾无言，惟有泪千行。
 * 每晚灯火阑珊处，夜难寐，又加班。
 * Date: 2022-05-11
 * Time: 14:18
 */
public class App {
    public static void main(String[] args) {
        Solon.start(App.class, args, solonApp -> {
            solonApp.get("/", ctx -> ctx.output("hello solon"));
        });
    }
}
