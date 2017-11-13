import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String Home()
	{
		return "Home";
	}

	@RequestMapping("/")
	public String Wings()
	{
		return "Wings";
	}

	@RequestMapping("/")
	public String Injera()
	{
		return "Injera";
	}

	@RequestMapping("/")
	public String EggSouce()
	{
		return "EggSouce";
	}

	@RequestMapping("/")
	public String Crabcake()
	{
		return "Crabcake";
	}

	@RequestMapping("/")
	public String GulabJamun()
	{
		return "GulabJamun";
	}

	@RequestMapping("/")
	public String Makhrouds()
	{
		return "Makhrouds";
	}

	@RequestMapping("/")
	public String Menu()
	{
		return "Menu";
	}

}
