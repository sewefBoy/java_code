package design_pattern.adaptee;

import java.util.Map;

/**
 * @author
 * ��ϵͳ����Ա��Ϣ
 */
@SuppressWarnings("all")
public interface IOuterUser {

    //������Ϣ���������ƣ��Ա��ֻ������˵�
    public Map getUserBaseInfo();

    //����������Ϣ
    public Map getUserOfficeInfo();

    //�û��ļ�ͥ��Ϣ
    public Map getUserHomeInfo();

}