package mon.sinamon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Employee {

    @Id @GeneratedValue
    private Long EmpId;

    private String EmpRRN;
    private String EmpName;
    private String EmpTel;
    private String EmpAddr;
    private String EmpDep;


    @OneToMany(mappedBy = "EmpId")
    private List<Supervise> Supervises = new ArrayList<>();




    //@OneToMany(mappedBy = "member")
    //private List<Post> posts = new ArrayList<>();




}
