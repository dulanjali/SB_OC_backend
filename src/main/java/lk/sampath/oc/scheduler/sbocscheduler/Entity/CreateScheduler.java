package lk.sampath.oc.scheduler.sbocscheduler.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dulanjali on 12/8/2018.
 */
@Entity
public class CreateScheduler {
    public int getUnique_id() {
        return unique_id;
    }

    @Id
    private int unique_id;
    private String biller_id;
    private String cust_id;
    private Date trans_date;
    private String field1_value;
    private String verify_user;
    private Date verify_date;
    private String amount;
    private BigDecimal transaction_amt_lkr;
    private String dr_ac;
    private String payment_mode;
    private Date schedule_payment_date;
    private String schedule_payment_frequency;
    private String dr_currancy;
    private String dr_currancy_rate;
    private String schedule_payment_count;
    private String common_status;
    private String manual_process;
    private String cr_ac;
    private String pmt_type;
    private String reference;

    public String getBiller_id() {
        return biller_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public Date getTrans_date() {
        return trans_date;
    }

    public String getField1_value() {
        return field1_value;
    }

    public String getVerify_user() {
        return verify_user;
    }

    public Date getVerify_date() {
        return verify_date;
    }

    public String getAmount() {
        return amount;
    }

    public BigDecimal getTransaction_amt_lkr() {
        return transaction_amt_lkr;
    }

    public String getDr_ac() {
        return dr_ac;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public Date getSchedule_payment_date() {
        return schedule_payment_date;
    }

    public String getSchedule_payment_frequency() {
        return schedule_payment_frequency;
    }

    public String getDr_currancy() {
        return dr_currancy;
    }

    public String getDr_currancy_rate() {
        return dr_currancy_rate;
    }

    public String getSchedule_payment_count() {
        return schedule_payment_count;
    }

    public String getCommon_status() {
        return common_status;
    }

    public String getManual_process() {
        return manual_process;
    }

    public String getCr_ac() {
        return cr_ac;
    }

    public String getPmt_type() {
        return pmt_type;
    }

    public String getReference() {
        return reference;
    }



    public CreateScheduler(int unique_id,String biller_id, String cust_id, Date trans_date, String field1_value, String verify_user, Date verify_date, String amount, BigDecimal transaction_amt_lkr, String dr_ac, String payment_mode, Date schedule_payment_date, String schedule_payment_frequency, String dr_currancy, String dr_currancy_rate, String schedule_payment_count, String common_status, String manual_process, String cr_ac, String pmt_type, String reference) {
        this.unique_id =unique_id;
        this.biller_id = biller_id;
        this.cust_id = cust_id;
        this.trans_date = trans_date;
        this.field1_value = field1_value;
        this.verify_user = verify_user;
        this.verify_date = verify_date;
        this.amount = amount;
        this.transaction_amt_lkr = transaction_amt_lkr;
        this.dr_ac = dr_ac;
        this.payment_mode = payment_mode;
        this.schedule_payment_date = schedule_payment_date;
        this.schedule_payment_frequency = schedule_payment_frequency;
        this.dr_currancy = dr_currancy;
        this.dr_currancy_rate = dr_currancy_rate;
        this.schedule_payment_count = schedule_payment_count;
        this.common_status = common_status;
        this.manual_process = manual_process;
        this.cr_ac = cr_ac;
        this.pmt_type = pmt_type;
        this.reference = reference;
        System.out.println("This is Entity : CreateScheduler ");
    }
    public CreateScheduler(){}

    @Override
    public String toString() {
        return "CreateScheduler{" +
                "unique_id='" + unique_id +'\''+
                "biller_id='" + biller_id + '\'' +
                ", cust_id='" + cust_id + '\'' +
                ", trans_date=" + trans_date +
                ", field1_value='" + field1_value + '\'' +
                ", verify_user='" + verify_user + '\'' +
                ", verify_date=" + verify_date +
                ", amount='" + amount + '\'' +
                ", transaction_amt_lkr=" + transaction_amt_lkr +
                ", dr_ac='" + dr_ac + '\'' +
                ", payment_mode='" + payment_mode + '\'' +
                ", schedule_payment_date=" + schedule_payment_date +
                ", schedule_payment_frequency='" + schedule_payment_frequency + '\'' +
                ", dr_currancy='" + dr_currancy + '\'' +
                ", dr_currancy_rate='" + dr_currancy_rate + '\'' +
                ", schedule_payment_count='" + schedule_payment_count + '\'' +
                ", common_status='" + common_status + '\'' +
                ", manual_process='" + manual_process + '\'' +
                ", cr_ac='" + cr_ac + '\'' +
                ", pmt_type='" + pmt_type + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }

}
