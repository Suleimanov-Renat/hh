package servlets;

import dao.UserDao;
import dao.impl.hibernate.UserDaoHibernateImpl;
import dao.impl.jdbc.UserDaoJDBCImpl;
import model.CV;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    
    private static final String GET_BY_ID = "get";
    private static final String GET_LIST = "list";
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String flag = req.getParameter("action");
        if (flag.equals(GET_BY_ID)) {
            getUserProfile(req,resp);
        }  else {
            resp.sendRedirect("/");
        }
    }

    private void getUserProfile(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        UserDao userDao = new UserDaoHibernateImpl();

        String id = req.getParameter("id");
        if(id == null) {
            resp.sendRedirect("/");
            return;
        }
        User user = userDao.getUserById(Long.valueOf(id));
        req.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/userProfile.ftl").forward(req,resp);
    }
}
