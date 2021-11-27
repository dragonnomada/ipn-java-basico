package ipn.cic.ticketsproject;

import java.util.Date;

public abstract class SecureTicket extends Ticket {
    
    private String requestNextTicketOperationId;
    private String createNewTicketOperationId;

    private String requestExistingTicketOperationId;
    private String loadTicketOperationId;
    
    private String requestStoreIdOperationId;
    private String updateStoreIdOperationId;
    private String requestTerminalIdOperationId;
    private String updateTerminalIdOperationId;
    private String requestUserIdOperationId;
    private String updateUserIdOperationId;

    private String requestProductsCountOperationId;
    private String updateProductsCountOperationId;
    private String requestSubtotalAmountOperationId;
    private String updateSubtotalAmountOperationId;
    private String requestBalanceAmountOperationId;
    private String updateBalanceAmountOperationId;
    private String requestTotalAmountOperationId;
    private String updateTotalAmountOperationId;
    
    private String requestCertificationChainOperationId;
    private String generateCertificateOperationId;
    private String requestPublishingChainOperationId;
    private String generatePublishOperationId;
    
    private String validateTicketOperationId;
    private String invalidateTicketOperationId;

    private String errorOperationId;
    
    public SecureTicket(String sessionId) {
        super(sessionId);
    }
    
    public String requestNextTicketId() {
        requestNextTicketOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_NEXT_TICKET_ID,
                this.sessionId,
                null);

        return this.requestNextTicketId(requestNextTicketOperationId);
    }
    
    public Ticket createNewTicket(String localTicketId) {
        createNewTicketOperationId = this.requestOperationId(
                TicketOperationType.CREATE_NEW_TICKET,
                this.sessionId,
                requestNextTicketOperationId);

        this.createAt = new Date();

        return this.createNewTicket(createNewTicketOperationId, localTicketId);
    }

    public boolean fromNewTicket() {
        String localTicketId = this.requestNextTicketId();

        Ticket ticket = this.createNewTicket(localTicketId);

        if (ticket != null) {
            this.copy(ticket);
            return true;
        } else {
            return false;
        }
    }
    
    public String requestExistingTicketId() {
        requestExistingTicketOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_EXISTING_TICKET_ID,
                this.sessionId,
                null);

        return this.requestExistingTicketId(requestExistingTicketOperationId);
    }
    
    public Ticket loadTicket(String localExistingTicketId) {
        loadTicketOperationId = this.requestOperationId(
                TicketOperationType.LOAD_TICKET,
                this.sessionId,
                requestExistingTicketOperationId);

        return this.loadTicket(loadTicketOperationId, localExistingTicketId);
    }

    public boolean fromExistingTicket(String existingTicketId) {
        String localExistingTicketId = this.requestExistingTicketId();

        Ticket ticket = this.loadTicket(localExistingTicketId);

        if (ticket != null) {
            this.copy(ticket);
            return true;
        } else {
            return false;
        }
    }

    public String requestStoreId() {
        requestStoreIdOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_STORE_ID,
                sessionId,
                null);

        return this.requestStoreId(requestStoreIdOperationId);
    }

    public boolean updateStoreId(String localStoreId) {
        updateStoreIdOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_STORE_ID,
                sessionId,
                requestStoreIdOperationId);

        this.storeAt = new Date();

        return this.updateStoreId(updateStoreIdOperationId, localStoreId);
    }

    public String requestTerminalId() {
        requestTerminalIdOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_TERMINAL_ID,
                sessionId,
                updateStoreIdOperationId);

        return this.requestTerminalId(requestTerminalIdOperationId);
    }

    public boolean updateTerminalId(String localTerminalId) {
        updateTerminalIdOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_TERMINAL_ID,
                sessionId,
                requestTerminalIdOperationId);

        this.terminalAt = new Date();

        return this.updateTerminalId(updateTerminalIdOperationId, localTerminalId);
    }

    public String requestUserId() {
        requestUserIdOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_USER_ID,
                sessionId,
                updateTerminalIdOperationId);

        return this.requestUserId(requestUserIdOperationId);
    }

    public boolean updateUserId(String localUserId) {
        updateUserIdOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_USER_ID,
                sessionId,
                requestUserIdOperationId);

        this.userAt = new Date();

        return this.updateUserId(updateUserIdOperationId, localUserId);
    }

    public void generateErrorUpdateStoreId() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateStoreIdOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketMachine | UPDATE STORE ID",
                this.getMachineInfo());

        this.generateError(errorOperationId, "ERROR UPDATING STORE ID");
    }

    public void generateErrorUpdateTerminalId() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateTerminalIdOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketMachine | UPDATE TERMINAL ID",
                this.getMachineInfo());

        this.generateError(errorOperationId, "ERROR UPDATING TERMINAL ID");
    }

    public void generateErrorUpdateUserId() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateUserIdOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketMachine | UPDATE USER ID",
                this.getMachineInfo());

        this.generateError(errorOperationId, "ERROR UPDATING USER ID");
    }

    public boolean writeMachine() {
        String localStoreId = requestStoreId();

        if (this.updateStoreId(localStoreId)) {
            String localTerminalId = this.requestTerminalId();

            if (this.updateTerminalId(localTerminalId)) {
                String localUserId = this.requestUserId();

                if (this.updateUserId(localUserId)) {
                    return true;
                } else {
                    this.generateErrorUpdateUserId();
                }
            } else {
                this.generateErrorUpdateTerminalId();
            }
        } else {
            this.generateErrorUpdateStoreId();
        }

        return false;
    }

    public int requestProductsCount() {
        requestProductsCountOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_PRODUCTS_COUNT,
                sessionId,
                null);

        return this.requestProductsCount(requestProductsCountOperationId);
    }

    public boolean updateProductsCount(int localProductsCount) {
        updateProductsCountOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_PRODUCTS_COUNT,
                sessionId,
                requestProductsCountOperationId);

        productsCountAt = new Date();

        return this.updateProductsCount(updateProductsCountOperationId, localProductsCount);
    }

    public void generateErrorUpdateProductsCount() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateProductsCountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketData | UPDATE PRODUCTS COUNT",
                this.getDataInfo());

        this.generateError(errorOperationId, "ERROR UPDATING PRODUCTS COUNT");
    }

    public double requestSubtotalAmount() {
        requestSubtotalAmountOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_SUBTOTAL_AMOUNT,
                sessionId,
                updateProductsCountOperationId);

        return this.requestSubtotalAmount(requestSubtotalAmountOperationId);
    }

    public boolean updateSubtotalAmount(double localSubtotalAmount) {
        updateSubtotalAmountOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_SUBTOTAL_AMOUNT,
                sessionId,
                requestSubtotalAmountOperationId);

        subtotalAmountAt = new Date();

        return this.updateSubtotalAmount(updateSubtotalAmountOperationId, localSubtotalAmount);
    }

    public void generateErrorUpdateSubtotalAmount() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateSubtotalAmountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketData | UPDATE SUBTOTAL AMOUNT",
                this.getDataInfo());

        this.generateError(errorOperationId, "ERROR UPDATING SUBTOTAL AMOUNT");
    }

    public double requestBalanceAmount() {
        requestBalanceAmountOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_BALANCE_AMOUNT,
                sessionId,
                updateSubtotalAmountOperationId);

        return this.requestBalanceAmount(requestBalanceAmountOperationId);
    }

    public boolean updateBalanceAmount(double localBalanceAmount) {
        updateBalanceAmountOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_BALANCE_AMOUNT,
                sessionId,
                requestBalanceAmountOperationId);

        balanceAmountAt = new Date();

        return this.updateSubtotalAmount(updateBalanceAmountOperationId, localBalanceAmount);
    }

    public void generateErrorUpdateBalanceAmount() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateBalanceAmountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketData | UPDATE BALANCE AMOUNT",
                this.getDataInfo());

        this.generateError(errorOperationId, "ERROR UPDATING BALANCE AMOUNT");
    }

    public double requestTotalAmount() {
        requestTotalAmountOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_TOTAL_AMOUNT,
                sessionId,
                updateBalanceAmountOperationId);

        return this.requestSubtotalAmount(requestTotalAmountOperationId);
    }

    public boolean updateTotalAmount(double localTotalAmount) {
        updateTotalAmountOperationId = this.requestOperationId(
                TicketOperationType.UPDATE_SUBTOTAL_AMOUNT,
                sessionId,
                requestTotalAmountOperationId);

        totalAmountAt = new Date();

        return this.updateSubtotalAmount(updateTotalAmountOperationId, localTotalAmount);
    }

    public void generateErrorUpdateTotalAmount() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateTotalAmountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketData | UPDATE TOTAL AMOUNT",
                this.getDataInfo());

        this.generateError(errorOperationId, "ERROR UPDATING TOTAL AMOUNT");
    }

    public boolean writeData() {
        int localProductsCount = this.requestProductsCount();

        if (this.updateProductsCount(localProductsCount)) {
            double localSubtotalAmount = this.requestSubtotalAmount();

            if (this.updateSubtotalAmount(localSubtotalAmount)) {
                double localBalanceAmount = this.requestBalanceAmount();

                if (this.updateBalanceAmount(localBalanceAmount)) {
                    double localTotalAmount = this.requestTotalAmount();

                    if (this.updateTotalAmount(localTotalAmount)) {
                        return true;
                    } else {
                        this.generateErrorUpdateTotalAmount();
                    }
                } else {
                    this.generateErrorUpdateBalanceAmount();
                }
            } else {
                this.generateErrorUpdateSubtotalAmount();
            }
        } else {
            this.generateErrorUpdateProductsCount();
        }

        return false;
    }
    
    public String requestCertificationChain() {
        requestCertificationChainOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_CERTIFICATION_CHAIN,
                sessionId,
                null);

        return this.requestCertificationChain(requestCertificationChainOperationId);
    }
    
    public boolean generateCertificate(String localCertificationChain) {
        generateCertificateOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_CERTIFICATE,
                sessionId,
                requestCertificationChainOperationId);

        certificateAt = new Date();
        
        return this.generateCertificate(generateCertificateOperationId, localCertificationChain);
    }
    
    public void generateErrorGenerateCertificate() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                generateCertificateOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketSecurity | GENERATE CERTIFICATE",
                this.getSecurityInfo());

        this.generateError(errorOperationId, "ERROR GENERATING CERTIFICATE");
    }
    
    public String requestPublishingChain() {
        requestPublishingChainOperationId = this.requestOperationId(
                TicketOperationType.REQUEST_PUBLISHING_CHAIN,
                sessionId,
                generateCertificateOperationId);

        return this.requestPublishingChain(requestPublishingChainOperationId);
    }
    
    public boolean generatePublish(String localPublishingChain) {
        generatePublishOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_PUBLISH,
                sessionId,
                requestPublishingChainOperationId);

        publishAt = new Date();
        
        return this.generatePublish(generatePublishOperationId, localPublishingChain);
    }
    
    public void generateErrorGeneratePublish() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateTotalAmountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeTicketSecurity | GENERATE PUBLISH",
                this.getSecurityInfo());

        this.generateError(errorOperationId, "ERROR GENERATING PUBLISH");
    }
    
    public boolean writeSecurity() {
        String localCertificationChain = this.requestCertificationChain();
        
        if (this.generateCertificate(localCertificationChain)) {
            String localPublishingChain = this.requestPublishingChain();
            
            if (this.generatePublish(localPublishingChain)) {
                return true;
            } else {
                this.generateErrorGenerateCertificate();
            }
        } else {
            this.generateErrorGeneratePublish();
        }
        
        return false;
    }
    
    public boolean validateTicket() {
        validateTicketOperationId = this.requestOperationId(
                TicketOperationType.VALIDATE_TICKET,
                sessionId,
                null);

        validAt = new Date();
        
        return this.validateTicket(validateTicketOperationId, ticketId);
    }
    
    public void generateErrorValidateTicket() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                updateTotalAmountOperationId);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeValid | VALIDATE TICKET",
                this.getTicketId());

        this.generateError(errorOperationId, "ERROR VALIDATING TICKET");
    }
    
    public boolean writeValid() {
        if (this.validateTicket()) {
            return true;
        } else {
            this.generateErrorValidateTicket();
        }
        
        return false;
    }
    
    public boolean invalidateTicket() {
        invalidateTicketOperationId = this.requestOperationId(
                TicketOperationType.INVALIDATE_TICKET,
                sessionId,
                null);

        validAt = new Date();
        
        return this.invalidateTicket(invalidateTicketOperationId, ticketId);
    }

    public void generateErrorInvalidateTicket() {
        errorOperationId = this.requestOperationId(
                TicketOperationType.GENERATE_ERROR,
                sessionId,
                null);

        errorAt = new Date();
        errorMessage = String.format(
                "%s >>> Ticket.writeInvalid | INVALIDATE TICKET",
                this.getTicketId());

        this.generateError(errorOperationId, "ERROR INVALIDATING TICKET");
    }
    
    public boolean writeInvalid() {
        if (this.invalidateTicket()) {
            return true;
        } else {
            this.generateErrorInvalidateTicket();
        }
        
        return false;
    }
    
}
