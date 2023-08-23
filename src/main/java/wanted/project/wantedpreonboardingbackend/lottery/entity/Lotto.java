package wanted.project.wantedpreonboardingbackend.lottery.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import wanted.project.wantedpreonboardingbackend.purchase.entity.Purchase;
import wanted.project.wantedpreonboardingbackend.winner.entity.Winner;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Builder
public class Lotto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lottoId;
    @Column(columnDefinition = "integer default 1")
    private int round;
    @Column
    private int ball1;
    @Column
    private int ball2;
    @Column
    private int ball3;
    @Column
    private int ball4;
    @Column
    private int ball5;
    @Column
    private int ball6;
    @Column
    private int price = PRICE_PER_TICKET;

    public static final int PRICE_PER_TICKET = 3000;

    @CreatedDate
    private LocalDateTime createDate = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "lotto_round_id")
    private Winner winner;
    @ManyToOne
    @JoinColumn(name = "lotto_purchase_id")
    private Purchase purchase;
}
