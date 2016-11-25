package servlets;

import dao.CVDao;
import dao.impl.jdbc.CVDaoJDBCImpl;
import model.CV;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/cv")
public class CVServlet extends HttpServlet {

    private static final String GET_BY_ID = "get";
    private static final String GET_LIST = "list";
    private static final String CREATE = "create";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String flag = req.getParameter("action");
        if (flag.equals(GET_BY_ID)) {
            getCVById(req,resp);
        } else if (flag.equals(GET_LIST)) {
            getCVList(req,resp);
        } else if(flag.equals(CREATE)){
            redirectCvCreatePage(req, resp);
        }
        else {
            resp.sendRedirect("/");
        }
    }

    private void redirectCvCreatePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/cv/create.ftl").forward(req,resp);
    }

    private CV mapRequestToCV(HttpServletRequest req) {
        Long userId = (Long.valueOf(req.getParameter("user")));
        User user = new User();
        user.setId(userId);

        CV cv = new CV();
        cv.setTitle(req.getParameter("title"));
        cv.setExperience(req.getParameter("experience"));
        cv.setText(req.getParameter("text"));
        cv.setEducation(req.getParameter("education"));

        return cv;

    }

    private void getCVList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CVDao cvDao = new CVDaoJDBCImpl();
        List<CV> cvList = cvDao.cvList();

        req.setAttribute("cvList", cvList);
        getServletContext().getRequestDispatcher("/cv/list.ftl").forward(req,resp);
    }

    private void getCVById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CVDao cvDao = new CVDaoJDBCImpl();

        String id = req.getParameter("id");
        if(id == null) {
            resp.sendRedirect("/");
            return;
        }
        CV cv = cvDao.getCvById(Long.valueOf(id));
        req.setAttribute("cv", cv);
        getServletContext().getRequestDispatcher("/cv/page.ftl").forward(req,resp);
    }

    //TODO: 11. add method to create new CV
}
