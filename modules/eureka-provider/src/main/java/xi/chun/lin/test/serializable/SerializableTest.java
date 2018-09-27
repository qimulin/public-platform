package xi.chun.lin.test.serializable;

import xi.chun.lin.test.model.FlyPig;

import java.io.*;

/**
 * 序列化测试
 * Created by Lin.XiChun on 2018/4/13.
 */
public class SerializableTest {
    public static void main(String[] args) throws Exception {
        serializeFlyPig();  // 序列化
        FlyPig flyPig = deserializeFlyPig();    // 反序列化
        System.out.println(flyPig.toString());

    }

    /**
     * 序列化
     */
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("black");
        flyPig.setName("naruto");
        flyPig.setCar("0000");
        /**
         * ObjectOutputStream代表对象输出流：
         * 它的writeObject(Object obj)方法可对参数指定的obj对象进行序列化，把得到的字节序列写到一个目标输出流中。
         * */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/flyPig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();
    }

    /**
     * 反序列化
     */
    private static FlyPig deserializeFlyPig() throws Exception {
        /**
         * ObjectInputStream代表对象输入流：
         * 它的readObject()方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回
         * */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/flyPig.txt")));
        FlyPig person = (FlyPig) ois.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        return person;
    }
}
