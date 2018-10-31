package cn.jeremy.study.guava.cache;

public interface ICache<K, V>
{
    V get(K var1);

    void put(K var1, V var2);
}
