package com.example.demo.util;

import java.io.*;

/**
 * @ClassName SerializeUtil
 * @Description 对对象进行序列化和反序列化
 * @Author Administrator
 * @Date 2018/10/24 18:25
 **/
public class SerializeUtil {

    public static byte[] serialize(Object obj) {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            //序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object unserialize(byte[] bytes) {
        ByteArrayInputStream bais = null;
        try {
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
