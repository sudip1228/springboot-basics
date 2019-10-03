package cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class somecdibusiness {
	@Inject
	somecdidao dao;

	public somecdidao getDao() {
		return dao;
	}

	public void setDao(somecdidao dao) {
		this.dao = dao;
	}
	public int findgreatest()
	{
		int  greatest=Integer.MIN_VALUE;
		int [] data=dao.getdata();
		for(int d:data) {
			if(d>greatest)
			{
				greatest=d;
			}
		}
		return greatest;
	}
	

}
