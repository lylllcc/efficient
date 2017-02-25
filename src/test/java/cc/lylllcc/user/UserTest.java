package cc.lylllcc.user;

import cc.lylllcc.controller.UserController;
import cc.lylllcc.domain.User;
import cc.lylllcc.domain.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by lylllcc on 2017/2/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    private MockMvc mvc;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/hello"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

    }



}
