package client_api.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull @NotEmpty
	private String name;
	
	@JoinColumn(name = "LAST_NAME")
	@NotNull @NotEmpty
	private String lastName;
	
	@Email
	private String email;
	
	private String phone;
	
	@JoinColumn(name = "DATE_CREATE")
	@NotNull
	private LocalDateTime dateCreate = LocalDateTime.now();
	
	@ManyToOne
	@JoinColumn(name = "ADRESS_ID")
	private Adress adress;
	
	public Client() {
	}

	public Client(Long id, String name, String sobrenome, String email, String phone, LocalDateTime dateCreate,
			Adress adress) {
		this.id = id;
		this.name = name;
		this.lastName = sobrenome;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String sobrenome) {
		this.lastName = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adr) {
		this.adress = adr;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + ", dateCreate=" + dateCreate + ", adress=" + adress + "]";
	}
}
