package design_pattern.adaptee.adaptee;

import java.util.Map;

/**
 * @author
 * ��OuterUser��װ��UserInfo
 */

public class OuterUserInfoAdaptee extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo(); //Ա���Ļ�����Ϣ
    private Map homeInfo = super.getUserHomeInfo(); //Ա���ļ�ͥ ��Ϣ
    private Map officeInfo = super.getUserOfficeInfo(); //������Ϣ

    /*
     * ��ͥ��ַ
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /*
     * ��ͥ�绰����
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /*
     *ְλ��Ϣ
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /*
     * �ֻ�����
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /*
     * �칫�绰
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /*
     * Ա��������
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }
}