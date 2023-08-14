package com.bummon.singleton;

/**
 * @author Bummon
 * @description 单例模式 博客地址：https://blog.bummon.com/blog/4049607742.html
 * @date 2023-08-14 10:49
 */
public class Singleton {

    /**
     * 懒汉式（线程不安全）
     */
    static class LazyThreadUnsafe {
        private static LazyThreadUnsafe instance = null;

        private LazyThreadUnsafe() {
        }

        public static LazyThreadUnsafe getInstance() {
            if (null == instance) {
                instance = new LazyThreadUnsafe();
            }
            return instance;
        }
    }

    /**
     * 懒汉式（线程安全-方法加锁）
     */
    static class LazyMethodLocking {
        private static LazyMethodLocking instance = null;

        private LazyMethodLocking() {
        }

        public static synchronized LazyMethodLocking getInstance() {
            if (null == instance) {
                instance = new LazyMethodLocking();
            }
            return instance;
        }
    }

    /**
     * 懒汉式（线程安全-代码块加锁）
     */
    static class LazyCodeBlockLocking {
        private static LazyCodeBlockLocking instance = null;

        private LazyCodeBlockLocking() {
        }

        public static LazyCodeBlockLocking getInstance() {
            if (null == instance) {
                synchronized (LazyCodeBlockLocking.class) {
                    instance = new LazyCodeBlockLocking();
                }
            }
            return instance;
        }
    }

    /**
     * 懒汉式（线程安全-双检锁）
     */
    static class LazyDoubleCheckLocking {
        private static LazyDoubleCheckLocking instance = null;

        private LazyDoubleCheckLocking() {
        }

        private static LazyDoubleCheckLocking getInstance() {
            if (null == instance) {
                synchronized (LazyDoubleCheckLocking.class) {
                    if (null == instance) {
                        instance = new LazyDoubleCheckLocking();
                    }
                }
            }
            return instance;
        }

        /**
         * 饿汉式
         */
        static class Eager {
            private static Eager instance = new Eager();

            private Eager() {
            }

            public static Eager getInstance() {
                return instance;
            }
        }

    }

}
