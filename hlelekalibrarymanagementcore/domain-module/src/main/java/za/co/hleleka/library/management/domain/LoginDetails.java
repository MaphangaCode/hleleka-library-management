package za.co.hleleka.library.management.domain;

import javax.persistence.*;

@Entity
@Table(name = "login_details")
public class LoginDetails {

    @Id
    @Column(name = "login_details_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loginDetailsId;

    @Basic
    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserTable userTable;

    public Integer getLoginDetailsId() {
        return loginDetailsId;
    }

    public void setLoginDetailsId(Integer loginDetailsId) {
        this.loginDetailsId = loginDetailsId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }
}
