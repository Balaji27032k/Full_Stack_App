import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {
    /*
     * This class would be responsible for the login endpoints.
     * Add the required annotations to create the endpoints.
     */
    private AuthenticationManager authenticationManager;
    LoginService loginService;
    private JwtUtil jwtTokenUtil;

    @PostMapping("/login")
    public Object authenticateUser(LoginDTO authenticationRequest) throws Exception {
        
        return null;
    }
}
