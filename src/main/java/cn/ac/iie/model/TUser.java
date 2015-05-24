package cn.ac.iie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user", catalog = "test"
)
public class TUser implements java.io.Serializable {

	private Integer uid;
	private String upassword;
	private boolean usex;
	private String uname;

	public TUser() {
	}

	public TUser(String upassword, boolean usex, String uname) {
		this.upassword = upassword;
		this.usex = usex;
		this.uname = uname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "UID", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "UPASSWORD", nullable = false, length = 32)
	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Column(name = "USEX", nullable = false)
	public boolean isUsex() {
		return this.usex;
	}

	public void setUsex(boolean usex) {
		this.usex = usex;
	}

	@Column(name = "UNAME", nullable = false, length = 20)
	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "TUser{" + "uid=" + uid + ", upassword=" + upassword + ", usex=" + usex + ", uname=" + uname + '}';
	}

}
