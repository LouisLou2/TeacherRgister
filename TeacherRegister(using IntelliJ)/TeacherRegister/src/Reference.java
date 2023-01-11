/*Reference
*/
class Reference
{
    
	//性别
    public String convertSex(String Sex)
	{
		if(Sex.equals("M")==true) 
		    return "男";
		else
	        return "女";
	}
		
	//是否党员
	public String convertPartyMember(String IsPartyMember)
	{
		if(IsPartyMember.equals("true")==true)
		    return "是";
		else
	        return "否";
	}
	
	//ְ职称
	public String convertTitle(String Title)
	{
		if(Title.equals("101")==true)
			return "教授";
		if(Title.equals("102")==true)
			return "副教授";
		if(Title.equals("103")==true)
			return "讲师";
		else 
			return "助教";
		
    }
	//所属院系
	public String convertCollege(String College)
	{
		if(College.equals("201")==true)
			return "自动化学院";
		if(College.equals("202")==true)
			return "计算机学院";
		if(College.equals("203")==true)
			return "软件学院";
		if(College.equals("204")==true)
			return "信息科学与工程学院";
		if(College.equals("205")==true)
			return "物理与电子学院";
		if(College.equals("206")==true)
			return "航空航天学院";
		if(College.equals("207")==true)
			return "交通运输工程学院";
		if(College.equals("208")==true)
			return "机电工程学院";
		else
			return "地球科学与信息物理学院";
	}
	//所授课程
	public String convertCourse(String Course)
	{
		if(Course.equals("301")==true)
			return "信息系统基础";
		if(Course.equals("302")==true)
			return "计算机程序设计基础";
		if(Course.equals("303")==true)
			return "计算机原理与结构";
		if(Course.equals("304")==true)
			return "软件度量与应用";
		if(Course.equals("305")==true)
			return "数据库原理与应用";
	    else return"No";
	}
}