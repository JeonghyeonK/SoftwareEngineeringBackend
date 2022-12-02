package mon.sinamon.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Overdue {

    @Id @GeneratedValue
    private Long OverdueId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DealId")   //1대다 관계에서 연관관계의 주인은 다가 가진다
    @NonNull
    private Deal DealId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CusId")   //1대다 관계에서 연관관계의 주인은 다가 가진다
    @NonNull
    private Customer CusID;
    private Integer OverdueAmount;
    private Integer OverdueDate;


















    //@OneToMany(mappedBy = "member")
    //private List<Post> posts = new ArrayList<>();




}
