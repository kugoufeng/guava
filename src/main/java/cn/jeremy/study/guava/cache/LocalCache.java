package cn.jeremy.study.guava.cache;

import com.google.common.cache.LoadingCache;

public abstract class LocalCache<K, V>
{
    private LoadingCache<K, V> loadingCache;


}
