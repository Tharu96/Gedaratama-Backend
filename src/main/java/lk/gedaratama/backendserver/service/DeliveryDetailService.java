package lk.gedaratama.backendserver.service;
import lk.gedaratama.backendserver.config.JwtAuthenticationConfig;
import lk.gedaratama.backendserver.model.User;
import lk.gedaratama.backendserver.model.DelpersonDetail;
import lk.gedaratama.backendserver.repository.DeliveryDao;
import lk.gedaratama.backendserver.jwt.JwtDeliveryDetailsService;
import lk.gedaratama.backendserver.resource.DeliveryResource;
import lk.gedaratama.backendserver.util.GedaratamaParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *  @author Kavindya Sewwandi on 6/22/2020.
 */

@Service

public class DeliveryDetailService {
    private final DeliveryDao userDao;
    private final JwtDeliveryDetailsService jwtDeliveryDetailsService;
    @Autowired
    public DeliveryDetailService(DeliveryDao userDao, PasswordEncoder bcryptEncoder, JwtAuthenticationConfig jwtAuthenticationConfig, AuthenticationManager authenticationManager, JwtDeliveryDetailsService jwtDeliveryDetailsService) {
        this.userDao = userDao;
        this.jwtDeliveryDetailsService = jwtDeliveryDetailsService;

    }

    @Autowired
    private UserDetailsService userDetailservice;



    public DelpersonDetail userRegister(DeliveryResource user) {
        User user1= userDetailservice.userReg(user);

        DelpersonDetail newUser = new DelpersonDetail();
        newUser.setUsername(user.getFirstname());
        newUser.setEmail(user.getEmail());
        newUser.setFirstname(user.getFirstname());
        newUser.setContact(user.getContact());
        newUser.setRole(GedaratamaParam.DEL_PER);
        newUser.setUuid(user1.getUuid());
        return userDao.save(newUser);
    }




   /* public void userRegister(DeliveryResource user) {
    }*/

}
