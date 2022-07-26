import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceImplTest {

    @Test
    void assignPasswordMustUpdatePasswordMd5() throws Exception {
        SecurityService securityService = mock(SecurityService.class);
        when(securityService.md5("naghi"))
                .thenReturn("4192f9a0609a1f5147d040fe8faabf63");
        UserServiceImpl userService = new UserServiceImpl(mock(UserDAO.class), securityService);
        User user= new User();
        user.setPassword("naghi");
        userService.assignPassword(user);
        assertThat(user.getPassword()).isEqualTo("4192f9a0609a1f5147d040fe8faabf63");
    }

}
