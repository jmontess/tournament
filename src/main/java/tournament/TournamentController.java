package tournament;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jmontes on 4/3/16.
 */

@Controller
public class TournamentController {

    @RequestMapping("/")
    public ModelAndView root() {
        ModelAndView mv = new ModelAndView("root");
        return mv;
    }
}
