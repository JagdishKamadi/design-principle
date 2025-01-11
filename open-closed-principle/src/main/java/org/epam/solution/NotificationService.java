package org.epam.solution;

public interface NotificationService {
    public void sendOTP(String medium);

    public void sendTransactionNotification(String medium);
}