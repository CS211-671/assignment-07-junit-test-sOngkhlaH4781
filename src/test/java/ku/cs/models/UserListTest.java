package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList ls1 = new UserList();
        ls1.addUser("A", "unica67");
        ls1.addUser("B", "eufa68");
        ls1.addUser("C", "roxygame69");
        // TODO: find one of them
        User user = ls1.findUserByUsername("B");
        // TODO: assert that UserList found User
        String expected = "B";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList ls1 = new UserList();
        ls1.addUser("A", "unica67");
        ls1.addUser("B", "eufa68");
        ls1.addUser("C", "roxygame69");
        // TODO: change password of one user
        boolean actual = ls1.changePassword("B", "eufa68", "tamma5");
        // TODO: assert that user can change password
        assertTrue(actual);
    }//

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList ls1 = new UserList();
        ls1.addUser("A", "unica67");
        ls1.addUser("B", "eufa68");
        ls1.addUser("C", "roxygame69");
        // TODO: call login() with correct username and password
        User sampleLoginUser = ls1.login("B", "eufa68");
        // TODO: assert that User object is found
        String expected = "B";
        String actual = sampleLoginUser.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList ls1 = new UserList();
        ls1.addUser("A", "unica67");
        ls1.addUser("B", "eufa68");
        ls1.addUser("C", "roxygame69");
        // TODO: call login() with incorrect username or incorrect password
        User sampleLoginUser = ls1.login("B", "asian24");
        // TODO: assert that the method return null
        User actual   = sampleLoginUser;
        assertNull(actual);
    }

}