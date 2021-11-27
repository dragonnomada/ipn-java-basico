package ipn.cic.ticketsproject;

import java.util.Date;

public abstract class Ticket implements TicketOperations {

    protected final String sessionId;
    protected String ticketId;
    protected String storeId;
    protected String terminalId;
    protected String userId;
    protected int productsCount;
    protected double subtotalAmount;
    protected double balanceAmount;
    protected double totalAmount;
    protected TicketStatus status;
    protected Date createAt;
    protected Date storeAt;
    protected Date terminalAt;
    protected Date userAt;
    protected Date productsCountAt;
    protected Date subtotalAmountAt;
    protected Date balanceAmountAt;
    protected Date totalAmountAt;
    protected Date certificateAt;
    protected Date publishAt;
    protected Date validAt;
    protected Date invalidAt;
    protected Date errorAt;
    protected String errorMessage;

    public Ticket(String sessionId) {
        this.sessionId = sessionId;
    }
    
    public boolean isValid() {
        return this.status == TicketStatus.VALID;
    }
    
    public boolean isInvalid() {
        return this.status == TicketStatus.INVALID;
    }
    
    public boolean isConsistent() {
        if (this.isValid()) {
            if (this.certificateAt == null) return false;
            if (this.publishAt == null) return false;
            if (this.validAt == null) return false;
        }
        
        return true;
    }

    public void copy(Ticket ticket) {
        this.ticketId = ticket.ticketId;
        this.storeId = ticket.storeId;
        this.terminalId = ticket.terminalId;
        this.userId = ticket.userId;
        this.productsCount = ticket.productsCount;
        this.subtotalAmount = ticket.subtotalAmount;
        this.balanceAmount = ticket.balanceAmount;
        this.totalAmount = ticket.totalAmount;
        this.status = ticket.status;
        this.createAt = ticket.createAt;
        this.storeAt = ticket.storeAt;
        this.terminalAt = ticket.terminalAt;
        this.userAt = ticket.userAt;
        this.subtotalAmountAt = ticket.subtotalAmountAt;
        this.balanceAmountAt = ticket.balanceAmountAt;
        this.totalAmountAt = ticket.totalAmountAt;
        this.certificateAt = ticket.certificateAt;
        this.publishAt = ticket.publishAt;
        this.validAt = ticket.validAt;
        this.invalidAt = ticket.invalidAt;
        this.errorAt = ticket.errorAt;
        this.errorMessage = ticket.errorMessage;
    }
    
    public String getMachineInfo() {
        return String.format(
                "[%s] #%s <%s>",
                this.getStoreId(),
                this.getTerminalId(),
                this.getUserId());
    }

    public String getDataInfo() {
        return String.format(
                "P [%d] S $%.2f B $%.2f T $.2f",
                this.getProductsCount(),
                this.getSubtotalAmount(),
                this.getBalanceAmount(),
                this.getTotalAmount());
    }
    
    public String getSecurityInfo() {
        return String.format(
                "CE %s ~ PU %s",
                this.getCertificationChain(),
                this.getPublishingChain());
    }

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @return the ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * @return the storeId
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * @return the terminalId
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return the productsCount
     */
    public int getProductsCount() {
        return productsCount;
    }

    /**
     * @return the subtotalAmount
     */
    public double getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * @return the balanceAmount
     */
    public double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * @return the totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @return the certificationChain
     */
    public abstract String getCertificationChain();

    /**
     * @return the publishingChain
     */
    public abstract String getPublishingChain();

    /**
     * @return the status
     */
    public TicketStatus getStatus() {
        return status;
    }

    /**
     * @return the createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * @return the storeAt
     */
    public Date getStoreAt() {
        return storeAt;
    }

    /**
     * @return the terminalAt
     */
    public Date getTerminalAt() {
        return terminalAt;
    }

    /**
     * @return the userAt
     */
    public Date getUserAt() {
        return userAt;
    }

    /**
     * @return the subtotalAmountAt
     */
    public Date getProductsCountAt() {
        return productsCountAt;
    }

    /**
     * @return the subtotalAmountAt
     */
    public Date getSubtotalAmountAt() {
        return subtotalAmountAt;
    }

    /**
     * @return the balanceAmountAt
     */
    public Date getBalanceAmountAt() {
        return balanceAmountAt;
    }

    /**
     * @return the totalAmountAt
     */
    public Date getTotalAmountAt() {
        return totalAmountAt;
    }

    /**
     * @return the certificateAt
     */
    public Date getCertificateAt() {
        return certificateAt;
    }

    /**
     * @return the publishAt
     */
    public Date getPublishAt() {
        return publishAt;
    }

    /**
     * @return the errorAt
     */
    public Date getErrorAt() {
        return errorAt;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @return the validAt
     */
    public Date getValidAt() {
        return validAt;
    }

    /**
     * @return the invalidAt
     */
    public Date getInvalidAt() {
        return invalidAt;
    }

}
