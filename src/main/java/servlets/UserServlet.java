package servlets;

import dao.UserDao;
import dao.impl.jdbc.UserDaoJDBCImpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Misha on 29.11.2016.
 */
@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
    public static final String METHOD_CREATE = "create";
    public static final String METHOD_LIST = "list";
    UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDaoJDBCImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getPathInfo().substring(1);

        if(METHOD_CREATE.equals(action)){

        } else if(METHOD_LIST.equals(action)){

        } else {
            getUserById(req, resp, action);
        }
    }

    public void getUserById(HttpServletRequest req, HttpServletResponse resp, String action) throws ServletException, IOException {
        Long id=null;
        try {
            id = Long.valueOf(action);
        } catch (NumberFormatException e){
            id=1l;
        }

        User user = userDao.getUserById(id);
        req.setAttribute("user", user);

        req.getRequestDispatcher("/userProfile.ftl").forward(req, resp);
    }
}
