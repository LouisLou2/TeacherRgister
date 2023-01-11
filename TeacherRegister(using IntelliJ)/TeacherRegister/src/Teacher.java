//建模
/*
 类名：Teacher
 用途：学生类的设计，用于构造教师类，包括上课、打印教师信息等功能。
 作者：软工2201娄少昆
 时间：2022-12-16
 修改时间：2022-12-23
 修改原因：刚学完servelet,练习。
*/
class Teacher
{
  private String Name;               //姓名，如果删掉了private.就成公开的了。
  private String Age;                   //性别
  private String Sex;
  private String Title;
  private String IsPartyMember;
  private String College;
  private String Course;
  private String Phone;
  private String Email;
  private String Password;
  
  Reference Refer=new Reference();
   //访问access：读read、写write    
  /*----------------Name-----------------------*/
	  public void setName(String value){
		Name = value;
	  }
	  
	  public String getName(){
		return Name;
	  }
  /*-----------------Age----------------------*/
  public void setAge(String value){
  	 Age = value;
  }
  
  public String getAge(){
  	return Age;
  }
    /*-----------------Sex----------------------*/
  public void setSex(String value){
  	Sex = Refer.convertSex(value);
  }
  
  public String getSex(){return Sex;}
   /*-----------------Title----------------------*/
  public void setTitle(String value){
  	Title= Refer.convertTitle(value);
  }
  public String getTitle(){
  	return Title;
  }
    /*----------------Memparty-----------------------*/
  public void setMemparty(String value){
  	IsPartyMember = Refer.convertPartyMember(value);
  }
  
  public String getMemparty(){
  	return IsPartyMember;
  }
   /*----------------Phone-----------------------*/
    public void setPhone(String value){
  	Phone= value;
  }
  public String getPhone(){
  	return Phone;
  }
   /*----------------Email-----------------------*/
  public void setEmail(String value){
  	Email= value;
  }
  public String getEmail(){
  	return Email;
  }
   /*----------------Password-----------------------*/
  public void setPassword(String value){
  	Password= value;
  }
  public String getPassword(){
  	return Password;
  }
   /*----------------College-----------------------*/
  public void setCollege(String value){
  	College= Refer.convertCollege(value);
  }
  
  public String getCollege(){
  	return College;
  }
   /*----------------Course-----------------------*/
  public void setCourse(String value){Course=value;}
  
  public String getCourse(){
  	return Course;
  }
    /*----------------classbegin-----------------------*/
  public int classBegin(){
  	System.out.println("This class begins!");
	return 1;
  }

/*-----------------printStates-------------------*/
  /*public void printStates(){
    System.out.println(
                       "\nName:"+this.getName()+
					   "\nTitle:"+this.getTitle()+
                       "\nSex:"+this.getSex()+
					   "\nMembership of the party:"+this.getMemparty()+
					   "\nSchool:"+this.getSchool()+
					   "\nClasses you teach:"+this.getSclass()
                      );
	
    }*/
}

