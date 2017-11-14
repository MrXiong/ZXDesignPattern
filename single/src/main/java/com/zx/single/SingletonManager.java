package com.zx.single;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2017/10/24.
 * 使用容器实现单例模式
 * <p>
 * <p>
 * 将多种单例类型注入到一个统一的管理类中，在使用时根据key获取对象对应类型的对象。
 * 这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度。
 */

public class SingletonManager {

    private static Map<String, Object> map = new HashMap<>();

    private SingletonManager() {
    }

    public void registerInstance(String key, Object obj) {
        if (map.containsKey(key)) {
            map.put(key, obj);
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }
}
