import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestDate 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println("�ܺ�����:"+d1.getTime());
		System.out.println("������ʾ:"+d1);
		Calendar c1=Calendar.getInstance();//getInstance��������ֵ����Ĭ��ΪGregorianCalendar��
		c1.setTime(d1);//��c1��d1�����
		System.out.println("�·�:"+(c1.get(c1.MONTH)+1));
		System.out.println("��:"+c1.get(c1.DAY_OF_MONTH));//1��Ϊ��0��
		System.out.println("����:"+(c1.get(c1.DAY_OF_WEEK)-1));//������Ϊ��1��
		c1.set(c1.DAY_OF_MONTH,25);//�޸�����Ϊ25��
		System.out.println(c1.getTime());
		SimpleDateFormat s1=new SimpleDateFormat("yyyy��MM��dd��\tE\tHH:mm:ss");
		String str1=s1.format(c1.getTime());
		System.out.println(str1);
	}
}
