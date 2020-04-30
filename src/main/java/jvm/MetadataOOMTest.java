package jvm;

import java.io.File;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * ģ��PermGenOOM
 *
 * @authorbenhail
 */
public class MetadataOOMTest {
    public static void main(String[] args) {
        try {
            //׼��url 
            URL url = new File("D:/classes").toURI().toURL();

            URL[] urls = {url};
            //��ȡ�й����ͼ��ص�JMX�ӿ�
            ClassLoadingMXBean loadingBean = ManagementFactory.getClassLoadingMXBean();
            //���ڻ����������
            List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();
            while (true) {
//                //�������Ͳ������������ʵ��
//                ClassLoader classLoader = new URLClassLoader(urls);
//                classLoaders.add(classLoader);
//                classLoader.loadClass("ClassA");
//                //��ʾ������Ϣ�������ع���������Ŀ����ǰ����Ч��������Ŀ���Ѿ���ж�ص�������Ŀ��
//                System.out.println("total:" + loadingBean.getTotalLoadedClassCount());
//                System.out.println("active:" + loadingBean.getLoadedClassCount());
//                System.out.println("unloaded:" + loadingBean.getUnloadedClassCount());
                System.in.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}