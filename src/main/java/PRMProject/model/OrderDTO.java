package PRMProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class OrderDTO {

    private long orderId;
    private String nameDevice;
    private String description;
    private BigDecimal price;
    private Long customerId;
    private String address;
    private String addressDetail;
    private Coords coords;
    private String deviceId;
    private String notificationType;

}
