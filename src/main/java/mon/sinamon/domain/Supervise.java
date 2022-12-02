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
public class Supervise {

    @Id @GeneratedValue
    private Long SuperviseId;



    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EmpId")   //1대다 관계에서 연관관계의 주인은 다가 가진다
    @NonNull
    private Employee EmpId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MoneyId")   //1대다 관계에서 연관관계의 주인은 다가 가진다
    @NonNull
    private Money MoneyId;

    private Date From_;
    private Date To_;
    private String SuperviseTag;


















    //@OneToMany(mappedBy = "member")
    //private List<Post> posts = new ArrayList<>();




}
