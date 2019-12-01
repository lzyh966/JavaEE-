package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import model.User;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import service.UserService;
import service.serviceImpl.UserServiceImpl;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UserAction extends ActionSupport {
    private User user;

    private File photo;

    private String photoFileName;

    /**
     * 登录
     *
     * @return
     */
    public String login() {
        String name = user.getUserName();
        String pswd = user.getPassword();

        UserService userService = new UserServiceImpl();

        User u = userService.findByNameAndPswd(name, pswd);

        if (u == null) {
            addFieldError("errMsg", "用户名或密码不正确");
            return INPUT;
        } else {
            return SUCCESS;
        }
    }

    /**
     * 注册
     *
     * @return
     */
    public String register() {
        String username = user.getUserName();
        String password = user.getPassword();
        String trueName = user.getTrueName();
        //String photoFileName=user.getPhotoFileName();
        UserService userService = new UserServiceImpl();

        int i = userService.insertUser(new User(username, trueName, password));
        if (i > 0) {
            return SUCCESS;
        } else {
            addFieldError("errMsg", "注册用户失败");
            return INPUT;
        }
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//        if (photo==null){
//            addFieldError("photoErrMsg","必须上传照片文件");
//           // return INPUT;
//        }else
//        {
//            //待上传文件的保存路径字符串
//            String pathStr= ServletActionContext.getServletContext().getRealPath("/upload");
//            //上传后的文件destFile。文件名=pathStr+待上传的文件的名字
//            File destFile=new File(pathStr,photoFileName);
//            try{
//                FileUtils.copyFile(photo,destFile);
//               user.setPhotoFileName(photoFileName);
//               UserService userService=new UserServiceImpl();
//               userService.insertUser(user);
//
//               Map session= ActionContext.getContext().getSession();
//               session.put("user",user);
//            }catch (IOException e){
//                System.out.print("上传文件失败");
//            }
//        }
//        //return SUCCESS;

    }
