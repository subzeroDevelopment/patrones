package mx.edu.itoaxaca.productoenterprise.modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.itoaxaca.productoenterprise.modelo.Product;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-09T12:46:36")
@StaticMetamodel(PurchaseOrder.class)
public class PurchaseOrder_ { 

    public static volatile SingularAttribute<PurchaseOrder, Short> quantity;
    public static volatile SingularAttribute<PurchaseOrder, BigDecimal> shippingCost;
    public static volatile SingularAttribute<PurchaseOrder, Date> shippingDate;
    public static volatile SingularAttribute<PurchaseOrder, Product> productId;
    public static volatile SingularAttribute<PurchaseOrder, Date> salesDate;
    public static volatile SingularAttribute<PurchaseOrder, String> freightCompany;
    public static volatile SingularAttribute<PurchaseOrder, Integer> orderNum;

}