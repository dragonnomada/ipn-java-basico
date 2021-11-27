package ipn.cic.ticketsproject;

import java.util.Date;

public class DemoTicket extends SecureTicket {

    private int ticketCounter = 1000;
    
    public DemoTicket(String sessionId) {
        super(sessionId);
    }

    @Override
    public String requestOperationId(TicketOperationType operationType, String sessionId, String previousOperationId) {
        return String.format("OPERATION-DEMO--%s", operationType);
    }

    @Override
    public String requestExistingTicketId(String operationId) {
        return String.format("TICKET-RAND-%6d", (int)(Math.random() * 1000));
    }
    
    public Ticket makeValidTicket(String ticketId) {
        Ticket ticket = new DemoTicket(sessionId);
        
        ticket.ticketId = ticketId;
        ticket.createAt = new Date();
        ticket.storeId = String.format("STORE-DEMO-%3d", (int)(Math.random() * 3));
        ticket.storeAt = new Date();
        ticket.terminalId = String.format("TERMINAL-DEMO-%3d", (int)(Math.random() * 10));
        ticket.terminalAt = new Date();
        ticket.userId = String.format("USER-DEMO-%3d", (int)(Math.random() * 5));
        ticket.userAt = new Date();
        ticket.productsCount = (int)(Math.random() * 100);
        ticket.productsCountAt = new Date();
        ticket.totalAmount = Math.random() * 10000;
        ticket.totalAmountAt = new Date();
        ticket.subtotalAmount = ticket.totalAmount - ticket.totalAmount * (Math.random() * 0.5);
        ticket.subtotalAmountAt = new Date();
        ticket.balanceAmount = ticket.totalAmount - this.subtotalAmount;
        ticket.balanceAmountAt = new Date();
        ticket.certificateAt = new Date();
        ticket.publishAt = new Date();
        ticket.validAt = new Date();
        ticket.status = TicketStatus.VALID;
        
        return ticket;
    }

    @Override
    public Ticket loadTicket(String operationId, String ticketId) {
        return this.makeValidTicket(ticketId);
    }

    @Override
    public String requestNextTicketId(String operationId) {
        return String.format("TICKET-DEMO-%6d", this.ticketCounter++);
    }

    @Override
    public Ticket createNewTicket(String operationId, String ticketId) {
        return this.makeValidTicket(ticketId);
    }

    @Override
    public String requestStoreId(String operationId) {
        return this.storeId;
    }

    @Override
    public boolean updateStoreId(String operationId, String storeId) {
        return true;
    }

    @Override
    public String requestTerminalId(String operationId) {
        return this.terminalId;
    }

    @Override
    public boolean updateTerminalId(String operationId, String terminalId) {
        return true;
    }

    @Override
    public String requestUserId(String operationId) {
        return this.userId;
    }

    @Override
    public boolean updateUserId(String operationId, String userId) {
        return true;
    }

    @Override
    public int requestProductsCount(String operationId) {
        return this.productsCount;
    }

    @Override
    public boolean updateProductsCount(String operationId, int productsCount) {
        return true;
    }

    @Override
    public double requestSubtotalAmount(String operationId) {
        return this.subtotalAmount;
    }

    @Override
    public boolean updateSubtotalAmount(String operationId, double subtotalAmount) {
        return true;
    }

    @Override
    public double requestBalanceAmount(String operationId) {
        return this.balanceAmount;
    }

    @Override
    public boolean updateBalanceAmount(String operationId, double balanceAmount) {
        return true;
    }

    @Override
    public double requestTotalAmount(String operationId) {
        return this.totalAmount;
    }

    @Override
    public boolean updateTotalAmount(String operationId, double totalAmount) {
        return true;
    }

    @Override
    public String requestCertificationChain(String operationId) {
        return this.getCertificationChain();
    }

    @Override
    public boolean generateCertificate(String operationId, String certificationChain) {
        return true;
    }

    @Override
    public String requestPublishingChain(String operationId) {
        return this.getPublishingChain();
    }

    @Override
    public boolean generatePublish(String operationId, String publishingChain) {
        return true;
    }

    @Override
    public boolean validateTicket(String operationId, String ticketId) {
        return true;
    }

    @Override
    public boolean invalidateTicket(String operationId, String ticketId) {
        return false;
    }

    @Override
    public void generateError(String operationId, String message) {
        //
    }

    @Override
    public String getCertificationChain() {
        return String.format("CERTIFICATE--%s---%s", this.sessionId, this.ticketId);
    }

    @Override
    public String getPublishingChain() {
        return String.format("PUBLISHING--%s---%s", this.sessionId, this.ticketId);
    }
    
}
