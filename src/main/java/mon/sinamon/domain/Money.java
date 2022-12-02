package mon.sinamon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Money {

    @Id @GeneratedValue
    private Long MoneyId;

    private Integer MoneyAmount;
    private String MoneyType;

    @OneToMany(mappedBy = "MoneyId")
    private List<Deal> Deals = new ArrayList<>();

    @OneToMany(mappedBy = "MoneyId")
    private List<Supervise> Supervises = new ArrayList<>();







    //@OneToMany(mappedBy = "member")
    //private List<Post> posts = new ArrayList<>();




}
