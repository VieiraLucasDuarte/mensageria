@RestController
@RequestMapping("/")
public class HomeControllerAPI{

    @Autowired
    private Map<String,DefaultService> services;


    @GetMapping
    public ResponseEntity<String> index() {
        String servicesList = null;
        if(services != null){
            Arrays.toString(services.keySet().ToArray())
        }
        return new ResponseEntity<String>(servicesList, HttpStatus.OK))
    }
}