import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestDate 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println("总毫秒数:"+d1.getTime());
		System.out.println("日期显示:"+d1);
		Calendar c1=Calendar.getInstance();//getInstance函数返回值类型默认为GregorianCalendar型
		c1.setTime(d1);//将c1与d1相关联
		System.out.println("月份:"+(c1.get(c1.MONTH)+1));
		System.out.println("日:"+c1.get(c1.DAY_OF_MONTH));//1月为第0天
		System.out.println("星期:"+(c1.get(c1.DAY_OF_WEEK)-1));//星期日为第1天
		c1.set(c1.DAY_OF_MONTH,25);//修改日期为25日
		System.out.println(c1.getTime());
		SimpleDateFormat s1=new SimpleDateFormat("yyyy年MM月dd日\tE\tHH:mm:ss");
		String str1=s1.format(c1.getTime());
		System.out.println(str1);
	}
}
