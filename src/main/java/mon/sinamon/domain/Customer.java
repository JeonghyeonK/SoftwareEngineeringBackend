package mon.sinamon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Customer {

    @Id @GeneratedValue
    private Long CusId;

    private String CusRRN;
    private String CusName;
    private String CusTel;
    private String CusAddr;


    @OneToMany(mappedBy = "member")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "CusId")
    private List<Customer> Customers = new ArrayList<>();

    @OneToMany(mappedBy = "OverdueId")
    private List<Overdue> Overdues = new ArrayList<>();



}
