package xi.chun.lin.threadPool;

/**
 * Created by Lin.XiChun on 2018/7/16.
 * 然后创建一个实现Runnable接口的类，并向外提供一个抽象方法供我们实现自定义功能，
 * 并实现Comparable接口，实现这个接口主要就是进行优先级的比较
 */
public abstract class PriorityRunnable implements Runnable, Comparable<PriorityRunnable> {
    private int priority;

    public PriorityRunnable(int priority) {
        if (priority < 0)
            throw new IllegalArgumentException();
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityRunnable another) {
        int my = this.getPriority();
        int other = another.getPriority();
        return my < other ? 1 : my > other ? -1 : 0;
    }

    @Override
    public void run() {
        doSth();
    }

    public abstract void doSth();

    public int getPriority() {
        return priority;
    }
}
