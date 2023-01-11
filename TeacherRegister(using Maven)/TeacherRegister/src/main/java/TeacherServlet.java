import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TeacherServlet extends HttpServlet
{

    public TeacherServlet()
    {
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
    	//声明从客户端传回的信息是以"utf-8"方式编码的
    	httpservletrequest.setCharacterEncoding("utf-8");
    	
    	//声明以网页形式把信息传到客户端，编码方式为"utf-8"
        httpservletresponse.setContentType("text/html;charset=utf-8");
        PrintWriter printwriter = httpservletresponse.getWriter();
        
        //接受从客户端传回的信息
        String Name     	    = httpservletrequest.getParameter("tcn");
        String Age 	            = httpservletrequest.getParameter("tage");
        String Sex 	            = httpservletrequest.getParameter("tsex");
        String Title            = httpservletrequest.getParameter("pst");
        String College          = httpservletrequest.getParameter("clg");
        String IsPartyMember    = httpservletrequest.getParameter("prt");
		String Password         = httpservletrequest.getParameter("tpsw");
		String Email            = httpservletrequest.getParameter("teml");
		String Phone            = httpservletrequest.getParameter("tph");
		Teacher Someone = new Teacher();
		Reference Refer=new Reference();

		String TeacherCourse = "";   //保存复选框的内容
		String CourseRefer="";
		for(int i=1;i<=5;i++)
		{
			String Course = "Course" + i;
			if(httpservletrequest.getParameter(Course)!=null)
			{
				CourseRefer=httpservletrequest.getParameter(Course);
				TeacherCourse += "["+Refer.convertCourse(CourseRefer) + "]";
			}

		}       /*将所有课程信息连缀成TeacherCourse这一个字符串*/
		//新建一个Teacher类的对象

        Someone.setName(Name);
        Someone.setAge(Age);
        Someone.setSex(Sex);
        Someone.setTitle(Title);
        Someone.setCollege(College);
        Someone.setMemparty(IsPartyMember);
		Someone.setPhone(Phone);
		Someone.setEmail(Email);
		Someone.setPassword(Password);
		

		Someone.setCourse(TeacherCourse);

        printwriter.println("<html lang=\"zh\">");
		printwriter.println("<head>");
		printwriter.println("   <meta charset=\"UTF-8\">");
		printwriter.println("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		printwriter.println("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		printwriter.println("   <title>PageForRechecking</title>");
		printwriter.println("</head>");
		printwriter.println("<body style=\"background-color:#f0ffff\">");
		printwriter.println("    <center>");
		printwriter.println("       <table border=\"0\"> ");
		printwriter.println("           <h1><font color=\"#0000CD\">已提交，请核实注册信息</font><h1>");
		printwriter.println("           <h4><font color=\"#0000CD\">Check Your Information</font></h4>");
		printwriter.println("               <tr>");
		printwriter.println("                  <td align=\"right\"><b><font color=\"#0000CD\">姓名：</font></b></td> ");
		printwriter.println("                  <td> "+ Someone.getName()+"</td> ");
		printwriter.println("               </tr>");
		printwriter.println("               <tr>");
		printwriter.println("                   <td align=\"right\"><b><font color=\"#0000CD\">性别：</font></b></td>");
		printwriter.println("                   <td>"+Someone.getSex()+"</td>");
		printwriter.println("               </tr>");
		printwriter.println("           <tr>");
		printwriter.println("              <td align=\"right\"><b><font color=\"#0000CD\">年龄：</font></b></td>");
		printwriter.println("              <td>"+Someone.getAge()+"</td>");
		printwriter.println("           </tr>");
		
		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">职称：</font></b></td>");
		printwriter.println("               <td>"+Someone.getTitle()+"</td>");
		printwriter.println("           </tr>");
		
		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">是否党员：</font></b></td>");
		printwriter.println("               <td>"+Someone.getMemparty()+"</td>");
		printwriter.println("           </tr>");

		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">所在院系：</font></b></td>");
		printwriter.println("               <td>"+Someone.getCollege()+"</td>");
        printwriter.println("           </tr>");
		
		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">所授课程：</font></b></td>");
		printwriter.println("               <td>"+Someone.getCourse()+"</td>");
		printwriter.println("           </tr>");

		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">密码:</font></b></td>");
		printwriter.println("               <td>"+Someone.getPassword()+"</td>");
		printwriter.println("           </tr>");
		
		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">email:</font></b></td>");
		printwriter.println("               <td>"+Someone.getEmail()+"</td>");
		
		printwriter.println("           <tr>");
		printwriter.println("               <td align=\"right\"><b><font color=\"#0000CD\">手机号码:</font></b></td>");
		printwriter.println("               <td>"+Someone.getPhone()+"</td>");
		printwriter.println("           </tr>");
		
		printwriter.println("       </table>");
		printwriter.println("   </center>");
		printwriter.println("</body>");
		printwriter.println("</html>");
    }
}