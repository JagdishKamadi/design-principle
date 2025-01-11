package org.epam.problem;

/**
 * As discussed earlier if you want to introduce send OTP via mobile Phone or WhatsApp number
 * then you need to modify source code in Notification Service right ?
 * Here What OCP says, Its open for Extension but close for modification
 * hence it's not recommended to modify Notification Service for each OTP Feature , it will violate OCP
 */

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}