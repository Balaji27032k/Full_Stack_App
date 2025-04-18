import javax.management.relation.Role;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "CompanyName")
    private String companyName;
    @Column(name = "password")
    private String password;
    @Column(name = "email",unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private RoleModel roleModel;

    public UserModel() {
    }
    public UserModel(int id,String username, String companyName, String password, String email, RoleModel roleModel) {
        this.id = id;
        this.username = username;
        this.companyName = companyName;
        this.password = password;
        this.email = email;
        this.roleModel = roleModel;
    }
    public UserModel(int id,String username, String password, String email,RoleModel roleModel) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleModel = roleModel;
    }
    public UserModel(String username, String password, String email, RoleModel roleModel) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleModel = roleModel;
    }
    public UserModel(String password, String email) {
        this.password = password;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public RoleModel getRoleModel() {
        return roleModel;
    }
    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }
    @Override
    public String toString() {
        return "UserModel [id=" + id + ", username=" + username + ", companyName=" + companyName + ", password="
                + password + ", email=" + email + ", roleModel=" + roleModel + "]";
    }
}
