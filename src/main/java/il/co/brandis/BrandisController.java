package il.co.brandis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Brandis")
public class BrandisController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap map) {
		return "home2";
	}
}
