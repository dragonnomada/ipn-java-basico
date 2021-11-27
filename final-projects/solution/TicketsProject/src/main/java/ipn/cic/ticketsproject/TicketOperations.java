package ipn.cic.ticketsproject;

public interface TicketOperations {

    public String requestOperationId(TicketOperationType operationType, String sessionId, String previousOperationId);
    
    public String requestExistingTicketId(String operationId);
    public Ticket loadTicket(String operationId, String ticketId);
    
    public String requestNextTicketId(String operationId);
    public Ticket createNewTicket(String operationId, String ticketId);
    
    public String requestStoreId(String operationId);
    public boolean updateStoreId(String operationId, String storeId);
    
    public String requestTerminalId(String operationId);
    public boolean updateTerminalId(String operationId, String terminalId);
    
    public String requestUserId(String operationId);
    public boolean updateUserId(String operationId, String userId);
    
    public int requestProductsCount(String operationId);
    public boolean updateProductsCount(String operationId, int productsCount);
    
    public double requestSubtotalAmount(String operationId);
    public boolean updateSubtotalAmount(String operationId, double subtotalAmount);
    
    public double requestBalanceAmount(String operationId);
    public boolean updateBalanceAmount(String operationId, double balanceAmount);
    
    public double requestTotalAmount(String operationId);
    public boolean updateTotalAmount(String operationId, double totalAmount);
    
    public String requestCertificationChain(String operationId);
    public boolean generateCertificate(String operationId, String certificationChain);
    
    public String requestPublishingChain(String operationId);
    public boolean generatePublish(String operationId, String publishingChain);
    
    public boolean validateTicket(String operationId, String ticketId);
    public boolean invalidateTicket(String operationId, String ticketId);
    
    public void generateError(String operationId, String message);
    
}
