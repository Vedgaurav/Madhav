import java.util.ArrayList;

import com.madhav.bean.MerchantBean;
import com.madhav.bean.PackageBean;
import com.madhav.dao.MerchantDao;
import com.madhav.dao.MerchantDaoImpl;
import com.madhav.dao.PackageDao;
import com.madhav.dao.PackageDaoImpl;
import com.madhav.dao.RecordDao;
import com.madhav.dao.RecordDaoImpl;

public class Test {

	
	public static void main(String[] args) {
		
		
	/*	MerchantBean mb = new MerchantBean();
		MerchantDao dao = new MerchantDaoImpl();
		ArrayList<MerchantBean> alist = null;
		
	alist=	dao.merchantRetrieve();
	if(alist!=null)
	{
	
	for(MerchantBean mbean:alist)
	{
		System.out.println(mbean.getId()+mbean.getEmail()+mbean.getDate());
	}
		
	}
	else 
		System.out.println("alist is null");
	
	*/
		
		/*ArrayList alist = new ArrayList();
		RecordDao rd = new RecordDaoImpl();
		
		alist=rd.getPack(1);
		
		for(Object o:alist) {
			
			
			int id= (Integer)o;
			System.out.println(id);*/
	
		int id=0;
		ArrayList<PackageBean> apbean = new ArrayList<PackageBean>();
		
		ArrayList alist = new ArrayList();
		
		for(int i=1;i<=2;i++)
		{
			alist.add(i);
		}
		
		System.out.println(alist);
			System.out.println();
		
			
		
		
		PackageDao pdao =  new PackageDaoImpl();
		
		for(Object al:alist)
		{
			id=(Integer)al;
			
		System.out.println(id);
	apbean.add(pdao.packageRetrieve(id));
	
		}
	
	System.out.println(apbean);
	
	for(PackageBean pb:apbean)
	{
		
		System.out.println(pb.getPid()+"\n"+pb.getPname());
	}
		
			
		}
	
	
		

}
