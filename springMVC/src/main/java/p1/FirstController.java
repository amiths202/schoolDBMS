package p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/student")
@Controller
public class FirstController {

    @RequestMapping("/")
    public String getURL(){
        return "index";
    }

    @RequestMapping("/menu")
    public String getURLMenu(){
        return "menu";
    }

    @RequestMapping(value = "/display/{name}", method = RequestMethod.GET)
    public String display(@PathVariable String name, Model model) throws Exception{
        SDetailsDTO dto = dao.getAnyStudent(name);
        model.addAttribute("name", dto);
        return "displayName";
    }
}
