function check(aform) {
    var user_name=aform.tcn.value;//获取表单form1的用户名的值
    var user_sex=aform.tsex.value;//获取表单form1性别
    var user_title=aform.pst.value;//获取表单form1职称
    var user_partymem=aform.prt.value;//获取表单form1是否党员
    if((user_name=="")||(user_name==null)){//判断用户名是否为空，为空就弹出提示框"请输入用户名"，否则正常执行下面的代码。
        alert("请输入用户名！");
        aform.tcn.focus();//获取焦点，即：鼠标自动定位到用户名输入框，等待用户输入用户名。
        return;
    }
    else if((user_sex=="")||(user_sex==null)){//判断性别是否为空，为空就弹出提示框"请选择性别"，否则正常执行下面的代码。
        alert("请选择性别！");
        aform.tsex.focus();//获取焦点。
        return;
    }
    else if((user_title=="")||(user_title==null)){//判断职称是否为空，为空就弹出提示框"请选择职称"，否则正常执行下面的代码。
        alert("请选择职称！");
        aform.pst.focus();//获取焦点。
        return;
    }
    else if((user_partymem=="")||(user_partymem==null)){//判断是否党员是否为空，为空就弹出提示框"请选择是否党员"，否则正常执行下面的代码。
        alert("请选择是否党员！");
        aform.prt.focus();//获取焦点。
        return;
    }
    else {//如果用户名、性别、职称、是否党员都正常输入，则提交表单，浏览器经打开新的（主页）窗口。
        aform.submit();
    }
}